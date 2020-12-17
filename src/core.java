import java.util.ArrayList;
import java.util.Random;
import java.util.Vector;

public class core {
    private int counter =10;
    private Vector<Process> processes;
    private ArrayList<stream> streams;
    private Random random = new Random();

    public core() {
        processes= new Vector<Process>();
        streams = new ArrayList<stream>();
        int countProcess= random.nextInt(4)+1;
        System.out.println("Total number of processes: "+countProcess);

        for (int i=0; i<countProcess; i++) {
            Process process= new Process((i+1), counter);
            processes.add(process);
            streams.addAll(process.getProcess());
        }
    }

    public void ImplementsPlan() {
        int size=processes.size();
        int i=0;
        while(size>0){
            Process process= processes.get(i);
            System.out.println("-"+processes.get(i).getDiscription());
            i++;

            if (process.isEmpty()){
                for (int j = 0; j<process.getProcess().size(); j++){
                    stream stream = streams.remove(0);
                    if (stream.needTime()){
                        process.implementStream();
                        System.out.println();
                    }
                    else if (!stream.needTime()) {
                        System.out.println("[ stream ] [ "+stream.numStrem() + " ] completed");
                        streams.lastIndexOf(stream);
                    }
                }
            }
            System.out.println("All streams "+process.getDiscription()+" completed.");
            size--; System.out.println();
        }
    }
}