package Level_1.Exercise_2;

import Level_1.Exercise_2.model.OnSiteWorker;
import Level_1.Exercise_2.model.OnlineWorker;

public class RunMain {

    public static void run() {

        OnSiteWorker worker2 = new OnSiteWorker("María", "González", 12.5);
        OnlineWorker worker3 = new OnlineWorker("Jesús", "Del Moral", 11.5);

        System.out.println(worker2 + "\n" + "Monthly Salary: " + worker2.calculateSalary(40) + " €\n");
        System.out.println(worker3 + "\n" + "Monthly Salary: " + worker3.calculateSalary(40) + " €\n");


        worker2.meetForCoffee();
        worker3.callToNeverendingMeeting();
    }
}