import java.util.ArrayList;
import java.util.Random;

public class Process {
    private String discription ="Process ";
    private ArrayList<stream> streams;
    stream streamer =new stream(0, 0);

    private Random rand= new Random();

    public Process(int number, int count) {
        streams = new ArrayList<stream>();
        int Counter=rand.nextInt(4)+1;
        this.discription += "[ "+number+" ] with number of threads"+Counter;
        System.out.println(discription);

        for (int i=0; i<Counter; i++) {
            stream stream = new stream((i+1), (count/Counter));
            streams.add(stream);
        }
    }

    public void implementStream() {
        System.out.println("[ stream ] [ "+ streamer.numStream+ " ], with maximum time "+ streamer.maxTime + "performed");
        while (streamer.maxTime > streamer.currentTime)
        {
            streamer.currentTime++;
            System.out.println("[ stream ] [ "+ streamer.numStream+ " ] with runtime: "+ streamer.currentTime);
            streamer.maxTime--;
            if (streamer.maxTime==0) {
                System.out.println("Quantum of" + "[ stream ] [ "+ streamer.numStream+ " ] expired");
                break;
            }
        }
        System.out.println("[ stream ] [ "+ streamer.numStream+ " ] completed");
    }

    public ArrayList<stream> getProcess(){
        return streams;
    }
    public String getDiscription() {
        return discription;
    }
    public boolean isEmpty()
    {
        return (streams.size() > 0);
    }
}
