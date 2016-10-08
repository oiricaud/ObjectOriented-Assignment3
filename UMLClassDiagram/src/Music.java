/** A subclass that extends the User class to represent
     * Music
     */
public class Music extends Item{
        private String title;
        private Double price;

        public void playSample(){
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
