import java.util.Scanner; import java.util.Set;
/* A subclass that extends the User class to represent customer */
class Customer extends User {
    Scanner input = new Scanner(System.in);
    private String homeAddress;
    /* 1 customer has 1 cart */
     Cart customerCart = new Cart();
    /* 1 customer has at least 1 credit card or more */
    // Using the Set class we can obtain add Credit Cards
    private Set<CreditCard> creditCards;
    private CreditCard creditCard = new CreditCard();

    /* Setters and Getters */
    public String getHomeAddress() {
        return homeAddress;
    }
    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }

    public void getCreditcard() {
        System.out.println(" - Customer class/getCreditCard");
        System.out.println(creditCard.getNumber());
    }
    public void setCreditcard() {
        System.out.println("- Customer class/setCreditCard"); System.out.println("How many credit cards do you wish to add?");
        int totalCards = input.nextInt();
        for(int i = 0 ; i < totalCards; i++) {
            System.out.println("Please enter your credit card number"); int cc = input.nextInt();
            System.out.println("Please enter the 3 digit CVS number that is located behind your credit card"); int cvs = input.nextInt();
            creditCard.setNumber(cc); creditCard.setCVS(cvs);
        }
    }
    public void addToCart(Item t){}
    public void checkoutCart() {
        if (creditCards.isEmpty()){ System.out.println("User it appears that you have not added any credit cards."); }
        else{ System.out.println("Proceed with Check out"); }
    }
    public void customCreditCardInfo() {
        System.out.println("Customer class/customCreditCardInfo");
        System.out.println("Customer credit cards: " + creditCard.getNumber());
    }
}




