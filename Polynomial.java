
public class Polynomial{

    double [] coeff;


    public Polynomial() {

        coeff = new double[]{0.0};
    }


    public Polynomial(double [] arr){
        coeff = arr.clone();
        
    }

    public Polynomial add(Polynomial poly){
        int max_len = Math.max(poly.coeff.length, coeff.length);
        double first, second;
        double [] arr_final = new double[max_len];
        for (int i=0; i < max_len; i++){
            first = 0;
            second = 0;
            if (poly.coeff.length > i){
                first = poly.coeff[i];
            }
            if (coeff.length > i){
                second = coeff[i];
            }
            arr_final[i] = first + second;

        }
        Polynomial new_poly = new Polynomial(arr_final);

        return new_poly;
    }

    public double evaluate(double x){
        double res = 0;

        for (int i = 0; i < coeff.length; i++){
            res += coeff[i]* Math.pow(x,i);
        }

        return res;

    }

    public boolean hasRoot(double x){
        return 0.0 == evaluate(x);


    }








    




}
