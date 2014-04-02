package fr.inria.diversify.transformation.mutation;

import spoon.reflect.code.BinaryOperatorKind;
import spoon.reflect.code.CtBinaryOperator;
import spoon.reflect.factory.Factory;

/**
 * User: Simon
 * Date: 13/02/14
 * Time: 14:46
 */
public class MathMutation extends BinaryOperatorMutation {

    public MathMutation() {
        name = "math";
        type = "mutation";
    }

    @Override
    protected CtBinaryOperator getMutantOperator() {
        Factory factory = transformationPoint.getFactory();
        CtBinaryOperator mutant = factory.Code().createBinaryOperator(transformationPoint.getLeftHandOperand(), transformationPoint.getRightHandOperand(), transformationPoint.getKind());

        mutant.setParent(transformationPoint.getParent());

        BinaryOperatorKind kind = transformationPoint.getKind();
        if(kind.equals(BinaryOperatorKind.PLUS))
            mutant.setKind(BinaryOperatorKind.MINUS);
        if(kind.equals(BinaryOperatorKind.MINUS))
            mutant.setKind(BinaryOperatorKind.PLUS);

        if(kind.equals(BinaryOperatorKind.MUL))
            mutant.setKind(BinaryOperatorKind.DIV);
        if(kind.equals(BinaryOperatorKind.DIV))
            mutant.setKind(BinaryOperatorKind.MUL);

        if(kind.equals(BinaryOperatorKind.MOD))
            mutant.setKind(BinaryOperatorKind.MUL);

        if(kind.equals(BinaryOperatorKind.BITAND))
            mutant.setKind(BinaryOperatorKind.BITOR);
        if(kind.equals(BinaryOperatorKind.BITOR))
            mutant.setKind(BinaryOperatorKind.BITAND);

        if(kind.equals(BinaryOperatorKind.SL))
            mutant.setKind(BinaryOperatorKind.SR);
        if(kind.equals(BinaryOperatorKind.SR))
            mutant.setKind(BinaryOperatorKind.SL);

        if(kind.equals(BinaryOperatorKind.USR))
            mutant.setKind(BinaryOperatorKind.SL);

        return mutant;
    }
}
