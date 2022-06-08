import java.util.List;
import java.util.ArrayList;

public class Project {
    private String name;
    private String number;
    private Double hours;
    private List<Worker> workers = new ArrayList<Worker>();


    public Project(String name, String number, Double hours) {
        this.name = name;
        this.number = number;
        this.hours = hours;
    }

    public List<Worker> getWorkers() {
        return workers;
    }

    public void addWorker(Worker worker) {
        workers.add(worker);
    }

    public void payWorkers() {
        System.out.println("Paying workers");
        for (Worker worker : workers) {
            if (worker instanceof HourlyWorker) {
                HourlyWorker hourlyWorker = new HourlyWorker(worker.getName(), worker.wage, ((HourlyWorker)worker).getHourlyWage());
                System.out.println(hourlyWorker.getName() + ": " + hourlyWorker.getWage(hours));
            }
            else System.out.println(worker.getName() + ": " + worker.getWage());
        }
    }

}