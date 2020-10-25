import java.util.Scanner; 

class RockPaperScissors {
 public static void main (String[] args) {
     Scanner input = new Scanner(System.in);
     final int ROCK = 1;
     final int PAPER = 2;
     final int SCISSORS = 3;
     int userChoice = 0;
     int wins = 0;
     int losses = 0;
     int ties = 0;
     
     String ans = ("Y");
     
     System.out.println("Good luck, human...");
     
     while (ans.equals("Y")) { 
         System.out.println("");
     do {
         System.out.println("What do you throw? [1] Rock, [2] Paper, [3] Scissors? ");
         userChoice = input.nextInt();
         if (userChoice > 3 || userChoice < 1) {
             System.out.println("Invalid response");
            }
        }while (userChoice > 3 || userChoice < 1);
         if (userChoice == 1) {
             userChoice = ROCK;
         }
         if (userChoice == 2){
             userChoice = PAPER;
         }
         if (userChoice == 3){
             userChoice = SCISSORS;
         }           
         
         int computerChoice = (int) (Math.random()*3) + 1;
         
            //ties
         if (userChoice == ROCK && computerChoice == ROCK){
             System.out.println("You threw rock! I threw rock!");
             System.out.println("We tied! Ok ok not bad...");
             ties+=1;
            }
         if (userChoice == PAPER && computerChoice == PAPER){
             System.out.println("You threw paper! I threw paper!");
             System.out.println("A draw... pretty good human! I demand a rematch...");
             ties+=1;
            }
         if (userChoice == SCISSORS && computerChoice == SCISSORS){
             System.out.println("You threw scissors! I threw scissors!");
             System.out.println("A tie... Hmmm... I know what to choose next time.");
             ties+=1;
            }
            //losses
         if (userChoice == ROCK && computerChoice == PAPER){
             System.out.println("You threw rock! I threw paper!");
             System.out.println("I win! You are not a challenge for me...");
             losses+=1;
            }
         if (userChoice == PAPER && computerChoice == SCISSORS){
             System.out.println("You threw paper! I threw scissors!");
             System.out.println("This is too easy! Are you even trying?");
             losses+=1;
            }
         if (userChoice == SCISSORS && computerChoice == ROCK){
             System.out.println("You threw scissors! I threw rock!");
             System.out.println("I knew i would win!");
             losses+=1;
            }
            //wins
         if (userChoice == ROCK && computerChoice == SCISSORS){
             System.out.println("You threw rock! I threw scissors!");
             System.out.println("Noooo! How did I lose...");
             wins+=1;
            }
         if (userChoice == PAPER && computerChoice == ROCK){
             System.out.println("You threw paper! I threw rock!");
             System.out.println("Whaaa?? ... You beat me? RAGE!");
             wins+=1;
            }
         if (userChoice == SCISSORS && computerChoice == PAPER){
             System.out.println("You threw scissors! I threw paper!");
             System.out.println("How... You're cheating!");
             wins+=1;
            }
            
            System.out.println("");
            System.out.println("Play again? [Y,N] ");
            ans = input.next();
     }
     System.out.println("");
     System.out.println("Good Game! Thanks for playing.");
     System.out.println("");
     System.out.println("Wins: "+wins);
     System.out.println("Losses: "+losses);
     System.out.println("Ties: "+ ties);
    }
}