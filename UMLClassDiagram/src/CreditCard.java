import java.util.LinkedList;

class CreditCard  {
    public Customer owner;

    private int number;
    private int expirationData;
    private int CVS;

    LinkedList<Integer> creditcards = new LinkedList<Integer>();
    LinkedList<Integer> cvs = new LinkedList<Integer>();
    /* Setters and Getters */
    public LinkedList<Integer> getNumber() {
        return creditcards;
    }

    public void setNumber(int number) {
        creditcards.add(number);
        this.number = number;
    }
    public int getExpirationData() {
        return expirationData;
    }
    public void setExpirationData(int expirationData) {
        this.expirationData = expirationData;
    }
    public int getCVS() {
        return CVS;
    }
    public void setCVS(int CVS) {
        cvs.add(CVS);
        this.CVS = CVS;
    }
}
