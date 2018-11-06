package polynom;
import java.util.Arrays;

public class MyPolynomial {
    private double[] coeffs;

    public MyPolynomial(double ... coeffs) {
        this.coeffs = coeffs;
    }

    public int getDegree(){
        return coeffs.length - 1;
    }

    @Override
    public String toString() {
        String result = " ";
       for(int i= coeffs.length - 1 ;i >= 0; i--)
       {
           if(coeffs[i] != 0) {
               if (i != (coeffs.length - 1) && coeffs[i] > 0)
                   result += " +";
               result += " " + coeffs[i];
               if (i != 0)
                   result += "x^" + i;
           }

       }
        return result;
    }
    public double evaluate(double x){
        double result =0.0;
        for(int i= coeffs.length - 1 ;i >= 0; i--) {

            if(coeffs[i]!=0)
            {
                result+= coeffs[i]*Math.pow(x,i);
            }
        }
        return result;

    }
    public MyPolynomial add(MyPolynomial right){
        double[] new_coeffs;
        if( this.coeffs.length > right.coeffs.length)
        {
            new_coeffs = Arrays.copyOf(this.coeffs,this.coeffs.length);
            for(int i=0;i<right.coeffs.length;i++) {
             new_coeffs[i] += right.coeffs[i];
            }
        }
        else
        {
            new_coeffs =Arrays.copyOf(right.coeffs,right.coeffs.length);
            for(int i=0;i<this.coeffs.length;i++) {
                new_coeffs[i] += this.coeffs[i];
            }
        }
        MyPolynomial result = new MyPolynomial(new_coeffs);
        return  result;
    }
    public MyPolynomial multiply(MyPolynomial right){
        double[] new_coeff = new double[this.getDegree()+right.getDegree() + 1];
        for(int i=0; i<this.coeffs.length;i++){
            for(int j=0;j<right.coeffs.length;j++) {
                new_coeff[i+j]+=this.coeffs[i]*right.coeffs[j];
            }
        }

        int size=1;

        for(int i=new_coeff.length-1;i >= 0 ;i++){
           if(new_coeff[i]!= 0) {
               size = i+1;
               break;
           }
        }
        double[] arr = new double[size];
        for(int i=0;i<arr.length;i++)
        {
            arr[i] = new_coeff[i];
        }
        MyPolynomial result = new MyPolynomial(arr);
        return result;
    }

    @Override
    public  boolean equals(Object obj){
        if(this ==  obj) return true;
        if(obj == null) return false;
        if(getClass() != obj.getClass()) return false;
        MyPolynomial poly =  (MyPolynomial)obj;
        for(int i=0; i< coeffs.length ; i++){
            if(coeffs[i] != poly.coeffs[i]){
                return false;
            }
        }
        return true;
    }
    @Override
    public int hashCode(){
        return coeffs.hashCode();
    }

}
