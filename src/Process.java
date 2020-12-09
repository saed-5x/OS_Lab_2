import java.util.ArrayList;
import java.util.Random;

public class Process {
    private String discription ="Process ";
    private ArrayList<stream> streams;
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
