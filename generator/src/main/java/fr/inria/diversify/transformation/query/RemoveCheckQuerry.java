package fr.inria.diversify.transformation.query;

import fr.inria.diversify.runner.InputProgram;
import fr.inria.diversify.transformation.RemoveCheck;
import fr.inria.diversify.transformation.Transformation;
import spoon.reflect.code.CtIf;
import spoon.reflect.code.CtInvocation;
import spoon.reflect.declaration.CtMethod;
import spoon.reflect.declaration.CtParameter;
import spoon.reflect.reference.CtExecutableReference;
import spoon.reflect.reference.CtTypeReference;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by nharrand on 19/12/16.
 */
public class RemoveCheckQuerry extends TransformationQuery  {
    List<CtIf> candidates;
    Set<String> patterns;

    public RemoveCheckQuerry(InputProgram inputProgram) {
        super(inputProgram);
        initPatterns();
        findCandidates();
        System.out.println(" -- found(" + candidates.size() + ") --");
    }

    private void initPatterns() {
        patterns = new HashSet<>();
        patterns.add("is.*");
        patterns.add("not.*");
        //patterns.add("no.*");
        patterns.add("matches.*");
        patterns.add("valid.*");
        patterns.add("check.*");
    }

    private boolean matchesPattern(String str) {
        for(String p : patterns) {
            if(str.matches(p)) return true;
        }
        return false;
    }

    private boolean isTypeChecking(CtExecutableReference exe) {
        List<CtTypeReference> params = exe.getParameters();
        for(CtTypeReference p : params) {
            if (p.getSimpleName().equals("Type")) return true;
        }
        return false;
    }

    private boolean isTypeChecking(CtMethod exe) {
        List<CtParameter> params = exe.getParameters();
        for(CtParameter p : params) {
            if (p.getType().getSimpleName().equals("Type")) return true;
        }
        return false;
    }

    private void findCandidates() {
        Collection<CtIf> ifs = getInputProgram().getAllElement(CtIf.class);
        candidates = new LinkedList<CtIf>(ifs.stream().filter(
                i -> (
                        (i.getCondition() instanceof CtInvocation)
                                //&& (matchesPattern(((CtInvocation) i.getCondition()).getExecutable().getSimpleName()))
                                && (isTypeChecking(((CtInvocation) i.getCondition()).getExecutable()))

                )
        ).collect(Collectors.toList()));

        Collection<CtMethod> ms = getInputProgram().getAllElement(CtMethod.class);
        List<CtMethod> cm = new LinkedList<CtMethod>(ms.stream().filter(
                m -> (
                        isTypeChecking(m) && m.getType().getSimpleName().equals("Type")

                )
        ).collect(Collectors.toList()));



        Collections.shuffle(candidates);

    }

    @Override
    public Transformation query() throws QueryException {
        if(!candidates.isEmpty()) {
            RemoveCheck t = new RemoveCheck(candidates.get(0), null, "");
            candidates.remove(0);
            return t;
        } else {
            throw new QueryException("No candidate found.");
        }
    }

    @Override
    public boolean hasNextTransformation() {
        return (!candidates.isEmpty());
    }
}
