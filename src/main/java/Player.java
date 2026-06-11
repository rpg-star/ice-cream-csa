public class Player {
    private String name;
    private int lives = 3;

    public Player(){
        this.name = "Yelena";
        this.lives = 3;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setLives(int lives){
        this.lives = lives;
    }

    public int getLives(){
        return lives;
    }

    public void loseLife(){
        lives --;
        System.out.println("You lost a life! \nLives remaining: " + lives + "\nPlease note that after all lives are used, the manager will step in, and the game ends.");
    }

    // public Player(){
    //     this.name = "Yelena";
    //     this.lives = 3;
    // }


    //player can only interact with a certain number of customers per day
}
