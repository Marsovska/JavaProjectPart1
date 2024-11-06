package projectJava;

public class Swap2Numbers5 {
    public static void main(String[] args) {

        int num1=20;
        int num2=40;
        num1=num1+num2;
        num2=num1-num2;
        num1=num1-num2;

        System.out.println("Now swap value of num1 is: "+num1+" and swap value of num2 is "+num2);
    }
}
