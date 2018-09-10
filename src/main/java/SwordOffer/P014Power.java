package SwordOffer;

public class P014Power {
    public static void main(String[] args) {
        P014Power main = new P014Power();
        double base = 2.4;
        int exponent = -1;
        try {
            System.out.println(main.Power(base, exponent));
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public double Power(double base,int exponent) throws Exception{
        double result = 0.0;
        if(isEqual(base,0) && exponent < 0){
            throw new Exception("0的负数词幂无意义");
        }

        if(isEqual(base,0) && exponent == 0){
            return 1.0;
        }

        if(exponent < 0){
            return powerWithExponent(1.0/base,-exponent);
        }else{
            return powerWithExponent(base,exponent);
        }


    }

    private double powerWithExponent(double base,int exponent){
        double result = 1.0;
        for(int i=1;i<=exponent;i++){
            result = result * base;
        }

        return result;
    }

    private boolean isEqual(double a,double b){
        return Math.abs((a-b))<=0.0000001 ? true : false;
    }

}
