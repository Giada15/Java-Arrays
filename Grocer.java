import java.util.Scanner;

public class Grocer {

    public static void main(String[] args) {

        
        Scanner scan = new Scanner(System.in);
        String[] aisles = {"apples", "bananas", "candy", "chocolate", "coffee", "tea"};
    

        System.out.println("Welcome to Java Grocers.");
        System.out.println("What can I help you find?");
        String aisle = scan.nextLine();

        for(int i=0; i<aisles.length; i++){
            if(aisles[i].equals(aisle)){
                System.out.println("\nWe have that in aisle: " + i);
            }
        }
        
    }


}
