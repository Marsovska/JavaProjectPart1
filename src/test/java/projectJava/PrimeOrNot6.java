package projectJava;

import java.util.Scanner;

public class PrimeOrNot6 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter a number: ");
        
        int number= input.nextInt();

        if (isPrime(number)){
            System.out.println(number+" is prime number");
        }else {
            System.out.println(number+" is not prime number");
        }
        input.close();
    }

    private static boolean isPrime(int num) {
        if (num<=1){
            return false;
        }
        for (int i=2; i<=Math.sqrt(num);i++){
            if (num%i==0){
                return false;
            }
        }return true;
    }


}
