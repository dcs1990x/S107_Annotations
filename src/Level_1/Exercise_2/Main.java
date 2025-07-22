package Level_1.Exercise_2;

public class Main {
    public static void main(String[] args) {

        Worker worker1 = new Worker("Manolo", "García", 12.1);
        OnSiteWorker worker2 = new OnSiteWorker("María", "González", 12.5);
        OnlineWorker worker3 = new OnlineWorker("Jesús", "Del Moral", 11.5);

        System.out.println(worker1 + "\n" + "Monthly Salary: " + worker1.calculateSalary(25) + " €\n");
        System.out.println(worker2 + "\n" + "Monthly Salary: " + worker2.calculateSalary(40) + " €\n");
        System.out.println(worker3 + "\n" + "Monthly Salary: " + worker3.calculateSalary(40) + " €\n");

        worker2.meetForCoffee();
        worker3.callToNeverendingMeeting();
    }
}