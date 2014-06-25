package fr.inria.diversify.sosie.compare.stackTraceOperation;

import fr.inria.diversify.sosie.compare.stackElement.StackTraceCall;
import fr.inria.diversify.sosie.compare.stackElement.StackTraceElement;

/**
 * Created by Simon on 17/04/14.
 */
public class StackTracePush implements StackTraceOperation {
    protected StackTraceElement elem;


    public StackTracePush(StackTraceElement elem) {
        this.elem = elem;
    }

    @Override
    public void apply(StackTrace stackTrace) {
        stackTrace.deep++;
        stackTrace.stackTraceCalls.push((StackTraceCall) elem);
    }

    @Override
    public void restore(StackTrace stackTrace) {
        stackTrace.deep--;
        stackTrace.stackTraceCalls.pop();
    }
}