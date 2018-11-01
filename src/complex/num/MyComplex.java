package complex.num;

import static java.lang.Math.*;

public class MyComplex {

    private double real = 0.0;
    private double imag = 0.0;

    public MyComplex() {

    }

    public MyComplex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImag() {
        return imag;
    }

    public void setImag(double imag) {
        this.imag = imag;
    }

    public void setValue(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    @Override
    public String toString() {
        return "( " + real + " + " + imag + "i )";
    }

    public boolean isReal() {
        if (real != 0.0)
            return true;
        return false;
    }

    public boolean isImaginary() {
        if (imag != 0.0)
            return true;
        return false;
    }

    public boolean equals(double real, double imag) {
        return (this.real == real) && (this.imag == imag);
    }

    public boolean equals(MyComplex obj) {
        return (this.real == obj.real) && (this.imag == obj.imag);
    }

    public double magnitude() {
        return sqrt(pow(real, 2) + pow(imag, 2));
    }

    public double argument() {
        var arg = asin(1);
        if (real != 0)
            arg = atan(imag / real);
        return arg;
    }

    public MyComplex add(MyComplex rigth) {
        this.real += rigth.real;
        this.imag += rigth.imag;
        return this;
    }

    public MyComplex addNew(MyComplex right) {
        MyComplex result = new MyComplex();
        result.setReal(this.real + right.real);
        result.setImag(this.imag + right.imag);
        return result;
    }

    public MyComplex substract(MyComplex right) {
        this.real -= right.real;
        this.imag -= right.imag;
        return this;
    }

    public MyComplex substractNew(MyComplex right) {
        MyComplex result = new MyComplex();
        result.setReal(this.real - right.real);
        result.setImag(this.imag - right.imag);
        return result;
    }

    public MyComplex multiply(MyComplex right) {
        MyComplex result = new MyComplex();
        result.setReal((this.real * right.real) - (this.imag * right.imag));
        result.setImag((this.imag * right.real) + (right.imag * this.real));
        return result;
    }

    public MyComplex divide(MyComplex right) {
        MyComplex result = new MyComplex();
        double numerat;
        double denominat;
        denominat = pow(right.real, 2) + pow(right.imag, 2);
        numerat = (this.real * right.real) + (this.imag * right.imag);
        result.setReal(numerat / denominat);
        numerat = (this.imag * right.real) - (right.imag * this.real);
        result.setImag(numerat / denominat);
        return result;
    }

    public MyComplex conjugate() {
        MyComplex result = new MyComplex();
        result.setImag(-this.imag);
        result.setReal(this.real);
        return result;
    }

    @Override
    public boolean equals(Object obj){
        if(this ==  obj) return true;
        if(obj == null) return false;
        if(getClass() != obj.getClass()) return false;
        MyComplex number = (MyComplex)obj;
        return real == number.real && imag == number.imag;
    }

    @Override
    public int hashCode(){
        int result = 0;
        long f = Double.doubleToLongBits(real);
        result += (int)(f^(f >>> 32));
         f = Double.doubleToLongBits(imag);
        result += (int)(f^(f >>> 32));
        return result;

    }


}
