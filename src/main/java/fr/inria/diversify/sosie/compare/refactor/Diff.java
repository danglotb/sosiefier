package fr.inria.diversify.sosie.compare.refactor;


public class Diff {
    protected String className;
    protected String methodSignature;
    protected String name;
    protected int positionInOriginal;
    protected int positionInSosie;
    private Point pointSosie;
    private int[][] divergence;

    public void setPositionInOriginal(int positionInOriginal) {
        this.positionInOriginal = positionInOriginal;
    }
    public int getPositionInOriginal() {
        return positionInOriginal;
    }


    public void setPositionInSosie(int positionInSosie) {
        this.positionInSosie = positionInSosie;
    }

    public void setPointSosie(Point pointSosie) {
        this.pointSosie = pointSosie;
    }
    public Point getConditionalPointSosie() {
        return  this.pointSosie;
    }

    public String toString() {
        return className+":"+methodSignature+":"+name;
    }


    public void setDivergence(int[][] divergence) {
        this.divergence = divergence;
    }
}