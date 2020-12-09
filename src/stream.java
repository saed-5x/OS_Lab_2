public class stream {
    private int currentTime = 0;
    private int maxTime;
    private int numStream;

    public stream(int number, int counter) {
        this.numStream +=number;
        this.maxTime=counter;
    }

    public void implementStream() {
        System.out.println("[ stream ] [ "+numStream+ " ], with maximum time "+maxTime + "performed");
        while (maxTime > currentTime)
        {
            currentTime++;
            System.out.println("[ stream ] [ "+numStream+ " ] with runtime: "+currentTime);
            maxTime--;
            if (maxTime==0) {
                System.out.println("Quantum of" + "[ stream ] [ "+numStream+ " ] expired");
                break;
            }
        }
        System.out.println("[ stream ] [ "+numStream+ " ] completed");
    }

    public boolean needTime()
    {
        return (maxTime > currentTime);
    }

    public int numStrem() {
        return numStream;
    }
}

