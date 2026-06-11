public class Shop {
    private int money;
    private boolean instock;
    private boolean clean;
    private int strawberry = 5;
    private int chocolate = 5;
    private int vanilla = 5;
    private int fudge = 3;
    private int sprinkle = 3;
    private int cherry = 3;



//setters + getters
    public void setBerry(int strawberry){
        this.strawberry = strawberry;
    }

    public int getBerry(){
        return strawberry;
    }
public void setChoco(int chocolate){
        this.chocolate = chocolate;
    }

    public int getChoco(){
        return chocolate;
    }
public void setVan(int vanilla){
        this.vanilla = vanilla;
    }

    public int getVan(){
        return vanilla;
    }

    public void setFudge(int fudge){
        this.fudge = fudge;
    }

    public int getFudge(){
        return fudge;
    }

    public void setSprinkle(int sprinkle){
        this.sprinkle = sprinkle;
    }

    public int getSprinkle(){
        return sprinkle;
    }

    public void setCherry(int cherry){
        this.cherry = cherry;
    }

    public int getCherry(){
        return cherry;
    }

    public void setMoney(int money){
        this.money = money;
    }

    public int getMoney(){
        return money;
    }

    public void setStock(boolean instock){
        this.instock = instock;
    }

    public boolean getStock(){
        return instock;
    }

    public void setClean(boolean clean){
        this.clean = clean;
    }

    public boolean getClean(){
        return clean;
    }

//actual methods

    public void serveIceCream(){
        System.out.println("You serve the customer the ice cream.");
        System.out.println("    _.._\r\n" + //
                "  /`    `\\\r\n" + //
                " |        |\r\n" + //
                " \\._    _./\r\n" + //
                " / `\"\"\"\"` \\\r\n" + //
                "|          |\r\n" + //
                "\\._      _./\r\n" + //
                " \\ `\"\"\"\"` /\r\n" + //
                "  \\##    /\r\n" + //
                "   \\### /\r\n" + //
                "    \\##/\r\n" + //
                "     \\/\r\n");
    };

    public void lessChoco(){
        chocolate --;
        System.out.println("There are " + chocolate + " scoops of chocolate remaining.");
    }
    public void lessStraw(){
        strawberry --;
        System.out.println("There are " + strawberry + " scoops of strawberry remaining.");
    }
    public void lessVan(){
        vanilla --;
        System.out.println("There are " + vanilla + " scoops of vanilla remaining.");
    }
    public void lessFudge(){
        fudge --;
        System.out.println("There are " + fudge + " pumps of hot fudge remaining.");
    }
    public void lessSprinkle(){
        sprinkle --;
        System.out.println("There are " + sprinkle + " spoonfuls remaining.");
    }
    public void lessCherry(){
        cherry --;
        System.out.println("There are " + cherry + " cherries remaining.");
    }

    public void KarenFight(){
        System.out.println("                                                                                                     \n" + //
                        "@@@  @@@   @@@@@@   @@@@@@@   @@@@@@@@  @@@  @@@     @@@@@@@@  @@@   @@@@@@@@  @@@  @@@  @@@@@@@     \n" + //
                        "@@@  @@@  @@@@@@@@  @@@@@@@@  @@@@@@@@  @@@@ @@@     @@@@@@@@  @@@  @@@@@@@@@  @@@  @@@  @@@@@@@     \n" + //
                        "@@!  !@@  @@!  @@@  @@!  @@@  @@!       @@!@!@@@     @@!       @@!  !@@        @@!  @@@    @@!       \n" + //
                        "!@!  @!!  !@!  @!@  !@!  @!@  !@!       !@!!@!@!     !@!       !@!  !@!        !@!  @!@    !@!       \n" + //
                        "@!@@!@!   @!@!@!@!  @!@!!@!   @!!!:!    @!@ !!@!     @!!!:!    !!@  !@! @!@!@  @!@!@!@!    @!!       \n" + //
                        "!!@!!!    !!!@!!!!  !!@!@!    !!!!!:    !@!  !!!     !!!!!:    !!!  !!! !!@!!  !!!@!!!!    !!!       \n" + //
                        "!!: :!!   !!:  !!!  !!: :!!   !!:       !!:  !!!     !!:       !!:  :!!   !!:  !!:  !!!    !!:       \n" + //
                        ":!:  !:!  :!:  !:!  :!:  !:!  :!:       :!:  !:!     :!:       :!:  :!:   !::  :!:  !:!    :!:       \n" + //
                        " ::  :::  ::   :::  ::   :::   :: ::::   ::   ::      ::        ::   ::: ::::  ::   :::     ::       \n" + //
                        " :   :::   :   : :   :   : :  : :: ::   ::    :       :        :     :: :: :    :   : :     :        \n" + //
                        "                                                                                                     ");
    }

    public String checkStock(){
        if (instock){
            return "All flavors are in stock";
        }
        return "Flavors are not in stock";
    }

    public String StockUp(){
        instock = true;
        return "Ice cream is stocked up!";
    }

    public String cleanShop(){
        clean = true;
        return "The shop is clean!";
    }

    public String dirtyShop() {
        clean = false;
        return "The shop is dirty!";
    }
    //methods: stock up ice cream, clean up the store, show state of cleanliness of the store
    //alert player that ice cream is out of stock
    //make store dirty  after a certain amount of customers enter the store/karen fight

}
