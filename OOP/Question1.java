import java.util.*;
class Complex{
    int real;
    int imag;
    public Complex(int r, int i){
        real = r;
        imag = i;
    } 
    public static Complex add(Complex a , complex b){
        return new Complex((a.real+b.real),(a.image+b.image));
    }

    public static Comple diff(Complex a, Complex b){
        return new Complex((a.real=b.real),(a.imag-b.imag));
    }
    public static Complex product(Complex a, Complex b){
        return new Complex(())
    }
}