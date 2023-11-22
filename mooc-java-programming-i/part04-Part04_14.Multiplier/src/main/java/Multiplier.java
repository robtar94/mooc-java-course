public class Multiplier {

    //fields
    private int number;

    //constructor
    public Multiplier(int number) {
        this.number = number;
    }

    //method
    public int multiply(int number) {
        number*=this.number;
        return number;
    }
    
}
