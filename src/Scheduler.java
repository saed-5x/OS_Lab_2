import java.util.ArrayList;
import java.util.Random;
import java.util.Vector;

public class Scheduler {
    private int counter =10;
    private Vector<Process> processes;
    private ArrayList<Thread> Threads;
    private Random random = new Random();

    public Scheduler() {
        processes= new Vector<Process>();
        Threads = new ArrayList<Thread>();
        int countProcess= random.nextInt(4)+1;
        System.out.println("Total number of processes: "+countProcess);

        for (int i=0; i<countProcess; i++) {
            Process process= new Process((i+1), counter);
            processes.add(process);
            Threads.addAll(process.getProcess());
        }
    }

    public void PlanThread() {
         int currentTime = 0;
         int maxTime=0;
         int numStream = 0;
        System.out.println("[ thread ] [ "+ numStream+ " ], with maximum time "+ maxTime + "performed");
        while (maxTime > currentTime)
        {
            currentTime++;
            System.out.println("[ thread ] [ "+ numStream+ " ] with runtime: "+ currentTime);
            maxTime--;
            if (maxTime==0) {
                System.out.println("Quantum of" + "[ thread ] [ "+ numStream+ " ] expired");
                break;
            }
        }
        System.out.println("[ thread ] [ "+ numStream+ " ] completed");
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
                    Thread Thread = Threads.remove(0);
                    if (Thread.needTime()){
                        PlanThread();
                        System.out.println();
                    }
                    else if (!Thread.needTime()) {
                        System.out.println("[ thread ] [ "+ Thread.numThread() + " ] completed");
                        Threads.lastIndexOf(Thread);
                    }
                }
            }
            System.out.println("All threads "+process.getDiscription()+" completed.");
            size--; System.out.println();
        }
    }
}