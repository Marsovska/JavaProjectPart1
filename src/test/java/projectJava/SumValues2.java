package projectJava;

public class SumValues2 {
    public static void main(String[] args) {

        int[] numbers={1,2,3,4,5,6,7,8,9};
        int sum=0;

        for (int i:numbers){

            sum+=numbers[i];
        } System.out.println("The sum value of all numbers in the array is "+sum);
    }
}
