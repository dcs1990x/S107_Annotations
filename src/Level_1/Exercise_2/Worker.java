package Level_1.Exercise_2;

public class Worker {

    private String name;
    private String surname;
    private double hourlySalary;


    public Worker(String name, String surname, double hourlySalary){
        this.name = name;
        this.surname = surname;
        this.hourlySalary = hourlySalary;
    }

    public String getName(){
        return this.name;
    }

    public String getSurname(){
        return this.surname;
    }

    public double getHourlySalary(){
        return this.hourlySalary;
    }

    public double calculateSalary(int hours){
        return this.getHourlySalary() * hours;
    }

    @Override
    public String toString(){
        return "Name: " + this.getName() + " " + this.getSurname() + "\n" +
                "Hourly Salary: " + this.getHourlySalary() + " €";
    }
}
