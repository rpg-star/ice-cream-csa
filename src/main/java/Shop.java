public abstract class Shop {
    private String flavor;
    private int money;
    private boolean instock;
    private boolean clean;
    private int strawberry;
    private int chocolate;
    private int vanilla;



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
        this.flavor = flavor;
    }

    public int getVan(){
        return vanilla;
    }

    public void setFlavor(String flavor){
        this.flavor = flavor;
    }

    public String getFlavor(){
        return flavor;
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
