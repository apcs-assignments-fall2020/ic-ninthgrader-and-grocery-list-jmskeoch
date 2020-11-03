public class GroceryList {
    //Instance vars
    private String[] gList;

    //Constructors
    public GroceryList() {
        this.gList = new String[10];
    }

    //Methods
    //Add item, remove item, list what's left
    public void add(String item) {
        for(int i = 0; i < gList.length; i++) {
            if(gList[i] == null) {
                gList[i] = item;
                break;
            }
        }
    }

    public void remove(String item) {
        for(int i = gList.length-1; i > 0; i--) {
            gList[i] = (gList[i].equals(item)) ? null : gList[i];
        }
    }

    public String toString() {
        String x = "";
        for(int i = 0; i < gList.length; i++) {
            if(gList[i] != null) {
                x += gList[i];
                x += ", ";      
            }
        }
        return x;
    }
}