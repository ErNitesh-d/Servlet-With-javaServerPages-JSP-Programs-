package ex;

public class SimpleInterest {
    private float p;
    private float r;
    private float n;
    private float interest;

    public float getP() {
        return p;
    }

    public void setP(float p) {
        this.p = p;
    }

    public float getR() {
        return (r);
    }

    public void setR(float r) {
        this.r = r;
    }

    public float getN() {
        return (n);
    }

    public void setN(float n) {
        this.n = n;
    }

    public float getInterest() {
        return interest;
    }

    public void calculateInterest() {
        this.interest = (p * r * n) / 100;
    }
}
