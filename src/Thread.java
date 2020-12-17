public class Thread {
    private int currentTime = 0;
    private int maxTime;
    private int numThread;

    public Thread(int number, int counter) {
        this.numThread +=number;
        this.maxTime=counter;

    }
    public boolean needTime()
    {
        return (maxTime > currentTime);
    }
    public int numThread() {
        return numThread;
    }
}

