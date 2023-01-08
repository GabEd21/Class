import java.util.ArrayList;

public class Item {
    static ArrayList<String> item_name = new ArrayList<String>();
    static ArrayList<Integer> quantity = new ArrayList<Integer>();
    static ArrayList<Double> price = new ArrayList<Double>();

    public void set(String sCart){
        item_name.add(sCart);
    }

    public void set(int x){
        quantity.add(x);
    }

    public void set(double x){
        price.add(x);
    }

    public static String getItemName(int x){
        return item_name.get(x);
    }

    public static int getQuantity(int x){
        return quantity.get(x);
    }

    public static double getPrice(int x){
        return price.get(x);
    }

    public static int getLength(){
        return item_name.size();
    }

    public void editItem(int x, String n, int q, double p){
        item_name.set((x - 1), n);
        quantity.set((x - 1), q);
        price.set((x - 1), p);
    }

    public void removeItem(int x){
        item_name.remove(x - 1);
        quantity.remove(x - 1);
        price.remove(x - 1);
    }

    public void clear(){
        item_name.remove(0);
        quantity.remove(0);
        price.remove(0);
    }
}
