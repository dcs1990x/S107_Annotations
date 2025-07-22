package Level_1.Exercise_2;

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
    public void callToNeverendingMeeting(){
        System.out.println("Let's chit chat about nothing important ;)");
    }

    @Override
    public String toString(){
        return "Name: " + this.getName() + " " + this.getSurname() + "\n" +
                "Hourly Salary: " + this.getHourlySalary() + " €\n" +
                "Level_1.Exercise_1.Worker Type: " + this.getClass();
    }
}
