package projectJava;

public class TemperatureComparison1 {
    public static void main(String[] args) {
        int[] temp={73, 75, 78, 81, 84, 87, 96};
        int maxTemp=temp[0];
        int minTemp=temp[0];

        for (int i=0; i<temp.length; i++){
            if (temp[i]>maxTemp){
                maxTemp=temp[i];
            }
            if (temp[i]< minTemp){
                minTemp=temp[i];
            }


        }System.out.println("Max temp is "+ maxTemp);
        System.out.println("Min temp is "+minTemp);
    }
}


