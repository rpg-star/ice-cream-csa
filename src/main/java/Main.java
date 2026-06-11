import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.TimeUnit;

public class Main{
    public static void main(String[] args){

        int customers = 0;
        Player player = new Player();
        Shop shop = new Shop();
        
        while (customers <= 5 || player.getLives() != 0){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to ice cream shop simulator! Please type in your name: ");
        String x = scanner.nextLine();
        player.setName(x);
        System.out.println("welcome " + player.getName() + "!\nGame start! You have " + player.getLives() + " lives to begin.\n");

    System.out.println(player.getName() + ": Man, I’m completely strapped for cash…");
    System.out.println(player.getName() + ": Every time I go out I have to ask my parents for money, but I can’t keep doing that forever… I think it’s time to get a j*b!");
    System.out.println("[Store front: _____]\n[Hiring now!]\n");
    System.out.println(player.getName() + ": that ice cream shop is hiring… I guess i can try my chances!\n");
    System.out.println("[You got hired!]\n\nYou will start working on Monday!\n\nTime skip to Monday\n");
    System.out.println("You walk into the shop, and go behind the counter. There, you see a yellow sticky note that says:");
    System.out.println("[" + player.getName() + ",\nWelcome to your first day at (the name of the shop)! I’m your manager.\nYour job is to serve ice cream to customers and to maintain the shop! Make sure each customer gets what they want in a timely fashion.\nHere at (shop name), we use a quota system to ensure that our employees keep our customers happy.\nPlease ensure that you fulfill each quota every day, or else the money will get docked out of your pay, and something unfortunate may happen.\nAs the shop expands, more flavors will be added. Finally, remember: keep the customer happy!");
    System.out.println("");
    System.out.println("P.S. there may be select customers that may disrupt the cheery vibe of the store. If they are not handled within a certain amount of time, I will have to step in.\nBest,\nManager]\n");
    System.out.println(player.getName() + ": Great, I have to do the manager’s job without the pay to justify the workload! I should probably quit right now… but I can’t, literally nowhere else is hiring right now!! I hate this stupid job market!!!\n"+ player.getName() + ": Shoot! There’s a customer. Time to work I guess…\n\n" + player.getName() + ": Hello, how can I help you today?");
    System.out.println("Customer 1: You don’t look familiar… are you new or something?\n" + player.getName() + ": (Obviously im new… if i wasn’t you wouldn’t be asking the question…)\n" + player.getName() + ": Yes, it’s my first day here. What would you like to order?");
    System.out.println("Customer 1: I see... I hate when when they hire newbies. They always get my order wrong! How do you mess up 2 scoops of chocolate ice cream with hot fudge?! It’s literally so simple!!!");
    System.out.println(player.getName() + ": (I guess that’s his order… Let’s get to it)\n");
    System.out.println("Order: 2 scoops of chocolate ice cream, drizzle of hot fudge\n\n ////////Inventory//////// \n\n~~~~~~~Ice cream flavors~~~~~~~\n\n" + shop.getChoco() + " scoops of chocolate left \n" + shop.getBerry()+ " scoops of strawberry left \n" + shop.getVan() + " scoops of vanilla left \n\n~~~~~~~Toppings~~~~~~~\n\n" + shop.getCherry() + " cherries left \n" + shop.getFudge() + " pumps of fudge left\n" + shop.getSprinkle() + " spoonfuls of sprinkles left\n////////////////////////" + "Type A for vanilla, B for chocolate, and C for strawberry\n");

    String choice1 = scanner.nextLine();
    // int wrong1 = 0;
    // if(choice1.equals("A") || choice1.equals("a") || choice1.equals("C") || choice1.equals("c")){
    //     wrong1 ++;
    // }
    System.out.println("Great! Now second scoop:\nType A for vanilla, B for chocolate, and C for strawberry\n");
    String choice2 = scanner.nextLine();

    System.out.println("Ok, now don't forget about the toppings!\nType A for hot fudge, B for sprinkles, C for cherry");
    String choice3 = scanner.nextLine();

    if(choice1.equals("A") || choice1.equals("a") || choice1.equals("C") || choice1.equals("c") || choice2.equals("A") || choice2.equals("a") || choice3.equals("C") || choice3.equals("c")){
        shop.serveIceCream();
        System.out.println("He gives you a weird look.\nCustomer 1: Are you serious?! Why can't any of you newbies get it right?! I'm not supporting a business that hires incompetent fools like you!");
        player.loseLife();

        if(choice1.equals("A") || choice1.equals("a")){
            shop.lessVan();
        }else if(choice1.equals("C") || choice1.equals("c")){
            shop.lessStraw();
        }

        if(choice2.equals("B") || choice2.equals("b")){
            shop.lessSprinkle();
        }else if(choice2.equals("C") || choice2.equals("c")){
            shop.lessCherry();
        }
    } else{
        shop.serveIceCream();
        System.out.println("He has a shocked look in his face.\n\nCustomer 1: Wow... you got my order right! This is the first time a rookie didn't mess up my order! Kudos to you... What's your name again?\n" + player.getName() + ": " + player.getName() + ".\nCustomer 1: " + player.getName() + "... What a pretty name. My name is Kyren. Sorry for acting rude earlier, I was just tired of having my order always getting messed up. Thank you " + player.getName() + ", I hope I see you here tomorrow...\n" + player.getName() + ": Have a good one Kyren!\nKyren: Thank you again, " + player.getName() + ".");
        shop.lessFudge();
    }
    customers ++;

        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
        @Override  
        public void run() {
       System.out.println("delayed hello world");
                }
            },  45000);
        }//while loop
    }// main
}//Main
