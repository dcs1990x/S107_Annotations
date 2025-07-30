package Level_1.Exercise_1.model;

public class OnSiteWorker extends Worker {

    private static final int GAS_COST = 50;

    public OnSiteWorker(String name, String surname, double hourlySalary){
        super(name, surname, hourlySalary);
    }

    @Override
    public double calculateSalary(int hours){
        return (this.getHourlySalary() * hours) + GAS_COST;
    }

    @Override
    public String toString(){
        return "Name: " + this.getName() + " " + this.getSurname() + "\n" +
                "Hourly Salary: " + this.getHourlySalary() + " €\n" +
                "Level_1.Exercise_1.model.Worker Type: " + this.getClass();
    }
}