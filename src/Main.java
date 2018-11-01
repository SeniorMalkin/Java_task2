import complex.num.MyComplex;
import polynom.MyPolynomial;
import ball.*;
public class Main {
    public static void throwBall(int steps, Ball ball, Container box)
    {
        if(!box.collides(ball)){
            System.out.println("Ball outside");
            return;
        }
        for(int i=0 ; i<steps;i++) {
            float x = ball.getX();
            float y = ball.getY();
            float dx =ball.getxDelta();
            float dy =ball.getyDelta();
            if(x+dx > (box.getX() + box.getWidth()) || (x+dx < box.getX())){
                ball.reflectHorizontal();
            }
            if(y+dy > (box.getY() + box.getHeight()) || (y+dy < box.getY())){
                ball.reflectVertical();
            }
            ball.move();
            System.out.println(ball.toString());
            System.out.println(box.toString());
            System.out.println(box.collides(ball));
        }

    }
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
        polynomial.equals(a);
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
        throwBall(7,ball1,cont);




    }
}
