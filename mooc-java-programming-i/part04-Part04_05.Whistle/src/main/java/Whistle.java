public class Whistle {
    private String sound;

    public Whistle(String whistleSound) {
        this.sound = whistleSound; // we want to assign the constructor parameter to the class field.
    }
    public void sound() {
        System.out.println(this.sound);
        

    } 
    
}
