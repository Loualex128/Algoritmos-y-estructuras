package Project;

public class operaciones {

    public static boolean numeroPrimo(int num, int divisor){
        if(num/2 < divisor){
            return true;
        } else {
            if(num%divisor==0){
                return false;
            } else {
                return numeroPrimo(num, divisor+1);
            }
        }
    }
    public static int funcionFibonacci(int num){
        int fib;
        if (num<2){
            if(num==0){
                fib=0;
            }
            else{
                fib=1;
            }
        }
        else{
            fib=funcionFibonacci(num-1)+funcionFibonacci(num-2);
        }
        return fib;
    }
    public static String mostrarFib(int num, int i){
        String cadena = "";
        if(num>funcionFibonacci(i)){
            cadena+=funcionFibonacci(i)+" ";
            cadena+=mostrarFib(num,i+1);
        }
        return cadena;
    }

        /*
        public static void funcionFibonacci(int mult1, int mult2, int sum1, int sum2){
            int mult = mult1 * mult2;
            if(sum1 + sum2 < mult) {
                System.out.println(sum1 + sum2);
                funcionFibonacci(mult1, mult2, sum1+1, sum2+2);
            }
                  */

    /*if(num >= res)
       return num;
  else
       return funcionFibonacci(num-1) + funcionFibonacci(num-2);
}*/
    public static double potencia(int base, int exponente){
        if(exponente==0){
            return 1;
        } else if (exponente<0) {
            return potencia(base, exponente+1) / base;
        } else {
            return base * potencia(base, exponente-1);
        }
    }
    public static int sumaDigitos(int num){
        if(num==0){
            return 0;
        } else {
            return sumaDigitos(num/10) + num%10;
        }
    }
    public static int factorial(int num){
        if(num == 0){
            return 1;
        }
        else
            return num * factorial(num-1);
    }
}