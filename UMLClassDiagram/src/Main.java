public class Main {

    public static void main(String[] args) {

        User user = new User();
        Cart cart = new Cart();
        Customer customer = new Customer();
        Item items = new Item();

        // User is allowed to register
        String name = "Oscar";
        String username = "heyhow";
        user.register(name, username);

        // Manager is allowed to create, delete or update items
        Manager manager = new Manager();
        manager.createItem(items);

        // Customer browse items and returns items that have been created
        customer.browseItem(items);

        // #4 Create a method CalculateCombinedPrice and Print all combined prices
        cart.calculateCombinedPrice(items);

        // #7 Within Cart class print name and username
        cart.customerInfo(user);

        // Add credit card info for customer
        customer.setCreditcard();

        // #8 Within Customer class print all cards that belong to customer
        customer.customCreditCardInfo();

        // #9 Within Item class print the item type, i.e Book, MusicCD, Computer Software
        items.itemType();
    }
}
