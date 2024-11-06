package projectJava;

public class DuplicateElements10 {
    public static void main(String[] args) {

        String[] brand={"Toyota", "Mazda", "Lincoln", "Buick","BMW","Mazda", "Audi","Audi","Opel", "Lincoln"};

        for (int i=0;i< brand.length;i++){
            for (int j=i+1;j< brand.length;j++){
                if (brand[i].equals(brand[j])){
                System.out.println(brand[i]);
                break;}
                }
        }
    }
}
