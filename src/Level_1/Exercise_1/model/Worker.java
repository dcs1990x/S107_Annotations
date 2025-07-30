package Level_1.Exercise_1.model;

public abstract class Worker {

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

    public abstract double calculateSalary(int hours);

    @Override
    public String toString(){
        return "Name: " + this.getName() + " " + this.getSurname() + "\n" +
                "Hourly Salary: " + this.getHourlySalary() + " €";
    }
}