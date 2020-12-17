import java.util.ArrayList;
import java.util.Random;

public class Process {
    private String discription ="Process ";
    private ArrayList<Thread> Threads;
    private Random rand= new Random();

    public Process(int number, int count) {
        Threads = new ArrayList<Thread>();
        int Counter=rand.nextInt(4)+1;
        this.discription += "[ "+number+" ] with number of threads"+Counter;
        System.out.println(discription);

        for (int i=0; i<Counter; i++) {
            Thread Thread = new Thread((i+1), (count/Counter));
            Threads.add(Thread);
        }
    }

    public ArrayList<Thread> getProcess(){
        return Threads;
    }
    public String getDiscription() {
        return discription;
    }
    public boolean isEmpty()
    {
        return (Threads.size() > 0);
    }
}
