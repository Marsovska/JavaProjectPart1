package projectJava;

public class SumEvenSumOdd4 {
    public static void main(String[] args) {


        int[][] numbers= {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int sumEven=0;
        int sumOdd=0;
        for (int i=0; i< numbers.length;i++){
            for (int j=0; j< numbers.length; j++){
                if (numbers[i][j]%2==0){
                    sumEven+=numbers[i][j];
                }else {
                    sumOdd+=numbers[i][j];
                }
            }
        }
        System.out.println("Sum value of Even numbers in this 2D array is: "+ sumEven);
        System.out.println("Sum value of Odd numbers in this 2D array is: "+ sumOdd);

    }
}
