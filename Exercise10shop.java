public class Exercise10shop {
    
    private String name;
    private int numitem;
    private double price;

    public Exercise10shop() {
        this.name = "";
        this.numitem = 0;
        this.price = 0.0;
    }

    
    
    public Exercise10shop(String name, int numitem, double price){
        this.name = name;
        this.numitem = numitem;
        this.price = price;
    }
    
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumitem() {
        return this.numitem;
    }

    public void setNumitem(int numitem) {
        this.numitem = numitem;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String toString() {
        String tabs = name.length() > 8 ? "\t" : "\t\t";
        return name + tabs + numitem + "\t" + String.format("%.2f", price);
    }

}
