package gamingtime.gametime;
import java.util.Scanner;
public class Gametime {

    public static void main(String[] args) {
        Scanner game= new Scanner(System.in);
        System.out.println("Hello Gamer. Let's record your time gameing");
        System.out.print("First let's get your name");
        String gamername = game.nextLine();
        Time gamer = new Time(gamername);
        System.out.println("How many time peramitters are you entering?");
        int gamecount = game.nextInt();
        
        for (int i = 0; i < gamecount; i++){
            System.out.print("Enter time for game" + (i+1) + "(in hours): ");
            double time = game.nextDouble();
            
            if(time < 0){
                System.out.println("Stop fucking lying!!! Enter someting legit!!!");
                i--;
                continue;
            }
            gamer.calcTotalgametime(time);
            }
        
        System.out.println("Gamer:"+ gamer.getName());
        System.out.println("Total Game time:"+ gamer.getTime() + "hours");
        System.out.println("Games Recorded: " + gamer.getGameCount());

       
        
    }   
}
