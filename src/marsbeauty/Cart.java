package marsbeauty;

public class Cart {
    int[] items = new int[2];
    String total = "";

    public Cart() {
    }

    public Cart(int[] items) {
        this.items = items;
    }

    public int[] getItems() {
        return items;
    }
    
    public int getItem(int i) {
        return items[i];
    }
    
    public void setItems(int[] items) {
        this.items = items;
    }
    
    public void setItem(int i, int value) {
        this.items[i] = value;
    }
    public String Total(String P1, String P2) {
        int Pr1 = Integer.valueOf(P1.replace("SR", ""));
        int Pr2 = Integer.valueOf(P2.replace("SR", ""));
        int T = Pr1 + Pr2;
        this.total = T + ".0SR";
        return total;
    }
    
}
