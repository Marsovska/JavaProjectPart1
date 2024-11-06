package projectJava;

public class MaxMin8 {
    public static void main(String[] args) {
        int[]numbers={10,20,45,84,93,102,81,52};
        int max=numbers[0];
        int min=numbers[0];
        for (int i:numbers){
            if (i>max){
            max=i;}
        if (i<min) {
            min=i;
        }
        }
        System.out.println("The max number is: "+max);
        System.out.println("The min mumber is "+min);
    }
}
