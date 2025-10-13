package Level_2.Exercise_1.model;

@JsonSerializable(directory =  "directoryPath")
public class OnSiteWorker extends Worker {

    private static final int GAS_COST = 50;

    public OnSiteWorker(String name, String surname, double hourlySalary){
        super(name, surname, hourlySalary);
    }

    @Override
    public double calculateSalary(int hours){
        return (this.getHourlySalary() * hours) + GAS_COST;
    }

    @Deprecated
    public void banOfficeCoffee(){
        System.out.println("There is no coffee in this office. ");
    }

    public void meetForCoffee(){
        banOfficeCoffee();
        System.out.println("Let's grab a coffee and kill some time ;)");
    }

    @Override
    public String toString(){
        return "Name: " + this.getName() + " " + this.getSurname() + "\n" +
                "Hourly Salary: " + this.getHourlySalary() + " €\n" +
                "Worker Type: " + this.getClass().getSimpleName().replace("Worker", "");
    }
}