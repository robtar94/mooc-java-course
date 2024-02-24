public class Timer {
    ClockHand seconds;
    ClockHand hundredsOfSeconds;

    public Timer() {
        this.seconds = new ClockHand(60);
        this.hundredsOfSeconds = new ClockHand(100);
    }



    public String toString() {
        return this.seconds + ":" + this.hundredsOfSeconds;
    }

    public void advance() {
        this.hundredsOfSeconds.advance();
        
        if(this.hundredsOfSeconds.value() == 0) {
            this.seconds.advance();
        }
    }
}



