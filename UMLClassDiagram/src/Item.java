import java.util.LinkedList;
import java.util.Scanner;

class Item {
    private String title;
    private Double price;
    Scanner input = new Scanner(System.in);
    LinkedList<String> inventoryTitle = new LinkedList<String>();
    LinkedList<String> inventoryType = new LinkedList<String>();
    LinkedList<Double> inventoryPrice = new LinkedList<Double>();

    /* Getters and Setters */
    public LinkedList<String> getItemTitles() {
        return inventoryTitle;
    }
    public Double getPrice() {
        double temp = 0;
        for (int i = 0; i < inventoryPrice.size(); i++){
            temp = temp + inventoryPrice.get(i);
        }
        return temp;
    }

    public void setTitle(String category, String title) {

        if(category.equalsIgnoreCase("Book")){
            Book book = new Book();
            book.setTitle(title);
            this.title = title;
        }
        if(category.equalsIgnoreCase("MusicCD")){
            Music music = new Music();
            music.setTitle(title);
            this.title = title;
        }
        if(category.equalsIgnoreCase("Computer Software")){
            Computer computersoftware = new Computer();
            computersoftware.setTitle(title);
            this.title = title;
        }
        inventoryType.add(category);
        inventoryTitle.add(title);
    }

    public void setPrice(String category, Double price) {

        if(category.equalsIgnoreCase("Book")){
            Book book = new Book();
            book.setPrice(price);
            this.price = price;
        }
        if(category.equalsIgnoreCase("MusicCD")){
            Music music = new Music();
            music.setPrice(price);
            this.price = price;
        }
        if(category.equalsIgnoreCase("Computer Software")){
            Computer computersoftware = new Computer();
            computersoftware.setPrice(price);
            this.price = price;
        }
        inventoryPrice.add(price);
    }

    public void itemType() {
        System.out.println("Item class/itemType");
        System.out.println(inventoryType);
    }
}

