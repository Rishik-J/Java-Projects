/**
* 
* @Author Rishik Janaswamy
* @version 1.0
*/


public class FishFlushFuss {

   /**
   * Fish, Flush, and Fuss are integer values that is assined by the user
   * The String variable ReturnStatement holds the string that needs to be retunrend depending on the current round
   */
    private int flush;
    private int fish;
    private int fuss;
    private String returnStatement;
    private String finalReturnStatement = "";


   //TODOc complete comments
   /**
   * This is the constructor method that initalizes the fish, flush, fuss to the values inputted by the user
   * @param [Fish] [Represtns the value that the user entered for fish]
   * @param [Flush] [Represtns the value that the user entered for flush]
   * @param [Fuss] [Represtns the value that the user entered for fuss]
   */

    public FishFlushFuss(int fish, int flush, int fuss) {
        this.fish = fish;
        this.flush = flush;
        this.fuss = fuss;  
    }
    
   /**
   * This is the playRound Method, it checks if the current round number is 
   * divisible by either the fish, flush or fuss value. IT then assigns the string return statemnt
   * to value it is divisible by
   *
   * @param [currentRound] [this represents the current round that is being checked asgint fish, flush and fuss]
   * @return [The Method returns a string depening on weather it is fish, fuss, or flush]
   */ 

    public String playRound(int currentRound) {

        if (currentRound % flush == 0 && currentRound % fuss == 0 && currentRound % fish == 0 ){
            return "Flamingo";
        }
         else if (currentRound % fish == 0 && currentRound % flush == 0) {
            if (fish > flush) {
                returnStatement = "Fish";
            } else {
                returnStatement = "Flush";
            }
        } else if (currentRound % fish == 0 && currentRound % fuss == 0) {

            if (fish > fuss) {
               returnStatement ="Fish";
            } else {
                returnStatement ="Fuss";
            }
        } else if (currentRound % flush == 0 && currentRound % fuss == 0) {
            if (flush > fuss) {
                returnStatement ="Flush";
            } else {
                returnStatement = "Fuss";
            }

        } else if (currentRound % fish == 0) {
            returnStatement = "Fish";
        } else if (currentRound % flush == 0) {
            returnStatement = "Flush";
        } else if (currentRound % fuss == 0) {
            returnStatement = "fuss";
        }
        else if (currentRound % flush != 0 && currentRound % fuss != 0 && currentRound % fish != 0) {
            returnStatement = String.valueOf(currentRound);
        }
         return returnStatement;
    }
    
    
     /**
   * This is the playGame method that take in the ammount of times the user wants to play
   * uses a for loop to call the playRound method for the number of rounds
   * @param [numberOfRounds] [This parameter takes in number of rounds user wants to play]
   * @return [The method retuns the round number and the value of that round in terms of fish, flush, or fuss]
   */ 

    public String playGame(int numberOfRounds) {
        for (int currentRound = 1; currentRound <= numberOfRounds; currentRound++) {
            returnStatement = playRound(currentRound);
            finalReturnStatement += "Round " + currentRound + ": " + returnStatement + "\n";
        }
        return finalReturnStatement;
    }
    
    public int getFish () {
      return fish;
    
    }
    
    public int getFlush () {
      return flush;
    
    }
    
        
    public int getFuss () {
      return fuss;
    
    }
    
    
    

}