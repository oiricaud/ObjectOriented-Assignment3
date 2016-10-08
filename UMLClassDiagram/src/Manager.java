import java.util.Scanner;

/* A subclass that extends the User class to represent the manager */
    public class Manager extends User{
        private String employerID;

        public void createItem(Item item) {
            Scanner input = new Scanner(System.in);
            System.out.println("- Manager Class/createItem");

            System.out.println("Manager how many items do you want to create? ");
            int items = input.nextInt();

            for(int i = 0 ; i < items; i++) {
                System.out.println("Choose a category for your item, Book, MusicCD, Computer Software");
                String category = input.next();
                System.out.println("Enter the name of the " + category + "title"); // Gives an error
                String title = input.next();                                    // if there is a space between words
                item.setTitle(category, title);
                System.out.println("Enter the price of " + title);
                Double price = input.nextDouble();
                item.setPrice(category, price);
            }
        }
        public void updateItem(Item t){}
        public void deleteItem(Item t) {}
        public void createCustomer(String name, String username){
            setName(name);
            setUsername(username);
        }
        public void updateCustomer(Customer c){
        }
        public void deleteCustomer(Customer c) {
        }

     public String getEmployerID() {
         return employerID;
     }

     public void setEmployerID(String employerID) {
         this.employerID = employerID;
     }
 }
