
import java.util.Arrays;

public class ReferenceTrap {

    public static void main(String[] args) {

        String[] staffLastYear = {"Tommy", "Joel", "Ellie"};
        // Reference trap
        // String[] staffThisYear = staffLastYear;
        // staffThisYear[1] = "Abby";

        //Solution 1 - for loop
        // String[] staffThisYear = new String[3];

        // for(int i=0; i<staffLastYear.length; i++){
        //     staffThisYear[i] = staffLastYear[i];
        // }

        //Solution 2 - Arrays.copyOf
        String[] staffThisYear = Arrays.copyOf(staffLastYear, 3);

        staffThisYear[1] = "Abby";

        System.out.println(Arrays.toString(staffLastYear));
        System.out.println(Arrays.toString(staffThisYear));
     
    }
    
}
