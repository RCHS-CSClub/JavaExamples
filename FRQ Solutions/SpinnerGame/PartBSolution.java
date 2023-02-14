public class PartBSolution {
    public void playRound() { 
        int player = spin(1,10);
        int computer = spin(2,8);
         boolean isTie = false;
        if (player > computer){
           System.out.println("You Win! " + (player-computer) + " points");
        }
       else if (player < computer){
            System.out.println("You Lose :( " + (player-computer) + " points");
       }
       else {
         isTie = true;
       }
       if (isTie == true){
         player += spin(1,10);
         computer += spin(2,8);
         if (player > computer){
           //You win! 3 points
           System.out.println("You Win!  +1 points");
        }
       else if (player < computer){
            System.out.println("You Lose :(  -1 points");
       }
       else {
         System.out.println("Tie. 0 Points");
       }
       }
       
       
     }
}
