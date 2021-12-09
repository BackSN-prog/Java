public class Fraction {

    private int num;    // numerator (upstairs)
    private int denom;  // denominator (downstairs)

    public Fraction() {

    }

    public Fraction(int num, int denom) {
        this.num = num;
        this.denom = denom;
    }

    public Fraction(Fraction other) {
        this.num = other.num;
        this.denom = other.denom;
    }

    private void reduce() {
        int i = Math.min(Math.abs(num), Math.abs(denom));
        if(i == 0)
            return;

        while ((num % i != 0) || (denom % i != 0))
            i--;

        num = num / i;
        denom = denom / i;
    }

    private void check() {
        try {
            //TODO РАЗОБРАТЬ
            if (num / denom == 0);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public Fraction multiply(Fraction other) {
        Fraction result = new Fraction(num * other.num,
                                       denom * other.denom);
        result.reduce();
        result.check();

        return result;
    }

    public Fraction divide(Fraction other) {
        Fraction result = new Fraction(num * other.denom,
                                        denom * other.num);
        result.reduce();
        result.check();

        return result;
    }

    public String toString() {
        return "" + num + "/" + denom;
    }

    public boolean equals(Fraction other) {
        Fraction f1 = new Fraction(this);
        f1.reduce();

        Fraction f2 = new Fraction(other);
        f2.reduce();

        return ((f1.num == f2.num) && (f1.denom == f2.denom));
    }

   /* public  Fraction reciprocal() {
        return  new Fraction(denom, num);
    } */

    public Fraction add(Fraction other) {
        int d = denom * other.denom;
        int n1 = num  * other.denom;
        int n2 = other.num * denom;

        Fraction f = new Fraction(n1 + n2, d);
        f.reduce();

        return f;
    }

    public Fraction subtract(Fraction other) {
        int d = denom * other.denom;
        int n1 = num  * other.denom;
        int n2 = other.num * denom;


        Fraction f = new Fraction(n1 - n2, d);
        f.reduce();

        return f;
    }

}


