import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public static void main(String[] args){

    int customers = 0;
    boolean game = true;
    while (customers <= 5 || game){
    Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to ice cream shop simulator! Please type in your name: ");
        String x = scanner.nextLine();
        Player player = new Player();
        player.setName(x);
        System.out.println("welcome " + player.getName() + "!");

    System.out.println(player.getName() + ": Man, I’m completely strapped for cash…");
    System.out.println(player.getName() + ": Every time I go out I have to ask my parents for money, but I can’t keep doing that forever… I think it’s time to get a j*b!");
    System.out.println("[Store front: _____]\n[Hiring now!]");
    System.out.println(player.getName() + ": that ice cream shop is hiring… I guess i can try my chances!");
    System.out.println("[You got hired!]\nYou will start working on Monday\n Time skip to Monday\n");
    System.out.println("");


    
Timer timer = new Timer();
timer.schedule(new TimerTask() {
   @Override  
   public void run() {
       System.out.println("delayed hello world");
   }
},  45000);
    }
}
