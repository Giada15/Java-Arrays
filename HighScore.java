public class HighScore {

    public static void main(String[] args) {

        int[] randomNumbers = {randomNumber(), randomNumber(), randomNumber(), randomNumber(), randomNumber(), randomNumber(), randomNumber(), randomNumber(), randomNumber(), randomNumber()};
        int highScore = 0;

        System.out.print("Here are the scores: ");

        for(int i=0; i<randomNumbers.length; i++){
            System.out.print(randomNumbers[i] + " ");
        }

        for(int i=0; i<randomNumbers.length; i++){
            if(randomNumbers[i] > highScore){
                highScore = randomNumbers[i];
            }
        }

        System.out.println("\nThe highest score is " +highScore+ ". Give that man a cookie!");
        
    }

    public static int randomNumber(){
        int randomNumber = (int)(Math.random()*49999 + 1);
        return randomNumber;
    }

    
}
