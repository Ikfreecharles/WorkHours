package WorkHours;

import java.util.Scanner;

public class DisplayResult {

    private Scanner input = new Scanner(System.in);

    public void fullTime(){
        TimesForFullTime myFullTime = new TimesForFullTime(1,120);

        System.out.println("As a Full-time worker:");
        //call every method needed
        System.out.println(" ");
        System.out.println("***************************************************");
        System.out.println("You have worked for " + myFullTime.daysWorked() + " days");
        System.out.println("You have worked for " + myFullTime.hoursWorked() + " hours");
        System.out.println("You have " + myFullTime.hoursRemaining() + " hours remaining");
        System.out.println("You have " + myFullTime.totalDaysRemaining() + " days of full time work left on your work permit");
        System.out.println("You can also work " + myFullTime.convertDaysRemainingToPartTime() + " days as a Part-time worker");
        System.out.println("You can also work " + myFullTime.monthsRemaining() + " months on a full time basis");
    }
    public void partTime(){
        TimesForPartTime myPartTime = new TimesForPartTime(1, 240);

        System.out.println("As a Part-time worker:");
        //call every method needed
        System.out.println(" ");
        System.out.println("***************************************************");
        System.out.println("You have worked for " + myPartTime.daysWorked() + " days");
        System.out.println("You have worked for " + myPartTime.hoursWorked() + " hours");
        System.out.println("You have " + myPartTime.hoursRemaining() + " hour remaining");
        System.out.println("You have " + myPartTime.totalDaysRemaining() + " days of full time work left on your work permit");
        System.out.println("You can also work " + myPartTime.convertDaysRemainingToFullTime() + " days as a Full-time worker");
        System.out.println("You can also work " + myPartTime.monthsRemaining() + " months on a full time basis");
    }
    public void severalJobs(){
        System.out.println("How many jobs did you work in?");
        int myNumberOfJobs = input.nextInt();

        //create on object and call function from Several Jobs class
        SeveralJobsInput severalJobs = new SeveralJobsInput(myNumberOfJobs, 120);

        //call every method needed
        System.out.println(" ");
        System.out.println("***************************************************");
        System.out.println("You have worked for " + severalJobs.daysWorked() + " days");
        System.out.println("You have worked for " + severalJobs.hoursWorked() + " hours");
        System.out.println("You have " + severalJobs.hoursRemaining() + " hour remaining");
        System.out.println("You have " + severalJobs.totalDaysRemaining() + " days of full time work left on your work permit");
        System.out.println("You can also work " + severalJobs.convertDaysRemainingToPartTime() + " days as a Part-time worker");
        System.out.println("You can also work " + severalJobs.monthsRemaining() + " months on a full time basis");
    }
}
