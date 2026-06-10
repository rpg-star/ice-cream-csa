public class Player {
    private String name;
    private int lives;

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

    public String loseLife(){
        lives --;
        return "You lost a life! \nLives remaining: " + lives;
    }

    // public Player(){
    //     this.name = "Yelena";
    //     this.lives = 3;
    // }


    //player can only interact with a certain number of customers per day
}
