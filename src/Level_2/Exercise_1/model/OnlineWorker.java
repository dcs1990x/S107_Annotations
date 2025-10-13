package Level_2.Exercise_1.model;

@JsonSerializable(directory =  "directoryPath")
public class OnlineWorker extends Worker {

    private static final int FLAT_RATE = 30;

    public OnlineWorker(String name, String surname, double hourlySalary){
        super(name, surname, hourlySalary);
    }

    @Override
    public double calculateSalary(int hours){
        return (this.getHourlySalary() * hours) + FLAT_RATE;
    }

    @Deprecated
    public void skipMeeting(){
        System.out.println("Sorry, I have another meeting at that time... ");
    }

    public void callToNeverEndingMeeting(){
        System.out.println("Let's chit chat about nothing important ;)");
    }

    @Override
    public String toString(){
        return "Name: " + this.getName() + " " + this.getSurname() + "\n" +
                "Hourly Salary: " + this.getHourlySalary() + " €\n" +
                "Worker Type: " + this.getClass().getSimpleName().replace("Worker", "");
    }
}