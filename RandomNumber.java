public class RandomNumber {

    public static void main(String[] args) {

        int[][] array = new int[100][10];

        for(int i=0; i<array.length; i++){
            for(int j=0; j<array[i].length; j++){
                array[i][j] = randomNumber();
            }
        }

        print2DArray(array);
        
    }

    public static int randomNumber(){
        int RandomNumber = (int)(Math.random()*100);
        return RandomNumber;
    }

    public static void print2DArray(int[][] array){
        for(int i=0; i<array.length; i++){
            for(int j=0; j<array[i].length; j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
    
}
