public class Main {
    public static void main(String args[]){
        Fraction a = new Fraction(1, 2);
        Fraction b = new Fraction(2, 1);
        Fraction a2 = new Fraction(2,4);

        if (a.equals(b))
            System.out.println(a + " equals " + b);
        else
            System.out.println(a + " not equals to " + b);

        if (a.equals(a2))
            System.out.println(a + " equals " + a2);
        else
            System.out.println(a + " not equals to " + a2);

        Fraction c = a.multiply(b);
        System.out.println(a + " * " + b + " = " + c);

        Fraction g = a.divide(b);
        System.out.println(a + " / " + b + " = " + g);

        Fraction d = a.add(b);
        System.out.println(a + " + " + b + " = " + d);

        Fraction e = a.subtract(b);
        System.out.println(a + " - " + b + " = " + e);

        //Fraction f = e.reciprocal();
        //System.out.println(f);
    }
}
