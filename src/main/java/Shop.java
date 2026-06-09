public abstract class Shop {
    private String flavor;
    private int money;
    private boolean instock;
    private boolean clean;


//setters + getters
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
    public String checkStock(){}

    public String StockUp(){
        instock = true;
        return "Ice cream is stocked up!";
    }


    //methods: stock up ice cream, clean up the store, show state of cleanliness of the store
    //alert player that ice cream is out of stock
    //make store dirty  after a certain amount of customers enter the store/karen fight

}
