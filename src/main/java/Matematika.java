public class Matematika {
    public static long faktorijel(int n) throws IllegalArgumentException{
        long faktorijel = 1;
        if(n<0) {
           throw new IllegalArgumentException("Neispravan unos - argument negativan");   //ispis greske u slucaju da je n negativan broj
        }

        else if(n == 0){
            return 1;
        }

        else{
            for(int i = 2; i<=n; i++)    //racunanje faktorijela
                faktorijel = faktorijel * i;
        }
        return faktorijel;
    }

    public static double sinus(double x) throws IllegalArgumentException{
        double sin = 0;
        for(int i = 0; i <= 100 ; i++){
            sin = (Math.pow(-1,i)*Math.pow(x,(2*i+1))) / (Matematika.faktorijel(2*i+1));
        }
        return sin;
    }
}
