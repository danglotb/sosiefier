package fr.inria.diversify.sosie.stackTraceCompare.stackElement;

/**
 * Created by Simon on 24/04/14.
 */
public class StackTraceCatch extends StackTraceElement {

    public StackTraceCatch(String value, int deep) {
        originalDeep = deep;
    }
}
