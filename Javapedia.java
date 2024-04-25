
import java.util.Scanner;

public class Javapedia {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("How many historical figures will you register?");
        int totNumber = scan.nextInt();
        scan.nextLine();

        String[][] database = new String[totNumber][3];

        
        for(int i=0; i<database.length; i++){
            System.out.println("\n\tFigure " + (i+1));
            System.out.print("\tName: ");
            database[i][0] = scan.nextLine();
            
            System.out.print("\tDate of birth: ");
            database[i][1] = scan.nextLine();

            System.out.print("\tOccupation: ");
            database[i][2] = scan.nextLine();
            
            System.out.print("\n");

        }

        print2DArray(database);

        System.out.print("\nWho do you want information on?\n");
        String searchedName = scan.nextLine();

        for(int i=0; i<database.length; i++){
            if(database[i][0].equalsIgnoreCase(searchedName)){
                System.err.println("\tName: " + database[i][0]);
                System.err.println("\tDate of birth:: " + database[i][1]);
                System.err.println("\tOccupation: " + database[i][2]);
            }
        }

        scan.close();
    }
    
    public static void print2DArray(String [][] array){
        System.err.println("These are the values you stored:");
        for(int i=0; i<array.length; i++){
            System.out.print("\t");
           for(int j=0; j<array[i].length; j++){
               System.out.print(array[i][j] + " ");
           }
           System.out.println("");
       }

    }
    
}
