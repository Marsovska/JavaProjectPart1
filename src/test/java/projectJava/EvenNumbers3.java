package projectJava;

public class EvenNumbers3 {
    public static void main(String[] args) {

        int[][] numbers={
            {1,2,3},
                {4,5,6,7},
                {8,9,10,12}
        };
        System.out.print("The even number in this 2D array are: ");
        for (int i=0;i< numbers.length;i++){
            for (int j=0;j< numbers.length;j++){
                if (numbers[i][j]%2==0){
                    System.out.print(numbers[i][j]+" ");
                }
            }
        }
    }
}
