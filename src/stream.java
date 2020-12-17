public class stream {
    public int currentTime = 0;
    public int maxTime;
    public int numStream;

    public stream(int number, int counter) {
        this.numStream +=number;
        this.maxTime=counter;
    }
    public boolean needTime()
    {
        return (maxTime > currentTime);
    }
    public int numStrem() {
        return numStream;
    }
}

