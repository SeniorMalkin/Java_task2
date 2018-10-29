import complex.num.MyComplex;
import polynom.MyPolynomial;
import ball.*;
public class Main {
    public static void main(String[] args) {
        /*
        MyComplex a = new MyComplex();
        MyComplex b = new MyComplex(2 ,-3);
        MyComplex c = new MyComplex(1,3);
        MyComplex res = new MyComplex();

        res = a.addNew(b);
        System.out.println(a + " + " + b + "=" + res);
        System.out.println("a =" + a);
        a.substract(c);
        System.out.println("a =" + a);
        res = a.substractNew(b);
        System.out.println(a + " - " + b + "=" + res);
        res = b.multiply(c);
        System.out.println("b =" + b);
        System.out.println("c =" + c);
        System.out.println(b + " * " + c + "=" + res);
        b = b.conjugate();
        System.out.println("b =" + b);

        MyPolynomial polynomial = new MyPolynomial(2.0,2.0,3.0);
        System.out.println(polynomial.toString());
        MyPolynomial a =new MyPolynomial(1.0, 2.0,2.0);
        System.out.println( a.evaluate(2));
        a = a.add(polynomial);
        System.out.println(a.toString());
        polynomial = polynomial.multiply(a);
        System.out.println(polynomial.toString());
        */
        Ball ball1 =new Ball(12,10,1,4,3);
        Container cont = new Container(1,1,20,20);
        System.out.println(ball1.toString());
        System.out.println(cont.toString());
        System.out.println(cont.collides(ball1));
        for(int i=0 ; i<5;i++) {
            ball1.move();
            System.out.println(ball1.toString());
            System.out.println(cont.collides(ball1));
        }




    }
}
