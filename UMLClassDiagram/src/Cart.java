import java.util.Set;

class Cart {
  /* 1 cart can have 0 or more items */
  // The following holds as many items the user wishes to add
  private Set<Item> itemList;

  /* 1 cart can only have 1 customer */


  /* Getters and Setters */
  public Set<Item> getItemList() {
    return itemList;
  }
  public void setItemList(Set<Item> itemList) {
    this.itemList = itemList;
  }

  /* Methods */
  public void orderByPrice(){
  }
  public void calculateCombinedPrice(Item items) {
    System.out.println("- Cart Class/calculateCombinedPrice ");
    System.out.println("The total value of the cart is $" + items.getPrice());
    System.out.println("");
  }

  public void customerInfo(User user){
    System.out.println("- Cart Class/customerInfo");
    System.out.println("Customer name: " + user.getName());
    System.out.println("Customer username: " + user.getUsername());
    System.out.println("");
  }
}
