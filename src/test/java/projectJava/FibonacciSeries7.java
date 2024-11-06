package projectJava;

public class FibonacciSeries7 {
    public static void main(String[] args) {

int broj=10;
int prv =0, vtor =1;
        System.out.print("First "+broj+" numbers of the Fibonacci series: " );
        for (int i = 0; i<broj; i++){
            System.out.print(prv + " ");
            int tret = prv + vtor;
           prv = vtor;
           vtor = tret;
        }
    }
    }

