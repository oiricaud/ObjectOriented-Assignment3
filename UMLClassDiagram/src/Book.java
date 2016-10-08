/**
 * A subclass that extends the Item class to represent
 * Book
 */
class Book extends Item {
    private String title;
    private Double price;
    //LinkedList<String> bookItems = new LinkedList<String>();
    public void showPreview() {
    }

    public String getTitle() {
        return title;
    }


    public void setTitle(String title) {
        this.title = title;
    }


    public Double getPrice() {
        return price;
    }


    public void setPrice(Double price) {
        this.price = price;
    }
}
