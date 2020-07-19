package WorkHours;

import java.util.ArrayList;
import java.util.Scanner;

public class HoursWorked{
    private Scanner input = new Scanner(System.in);
    private int counter = 1;
    private int numberOfJobs;
    protected int totalNoOfDays;
    private ArrayList<Double> salary;
    private ArrayList<Double> totalHoursWorked;
    protected double grandTotalHoursWorked;

    public HoursWorked(int numberOfJobs, int totalNoOfDays){
        this.numberOfJobs = numberOfJobs;
        this.totalNoOfDays = totalNoOfDays;
    }
    public double hoursWorked (){
        while (counter <= numberOfJobs){

            System.out.println("Number of months: How many months worked at job " + counter + "?");
            int months = input.nextInt();

            System.out.println("Hourly rate: What is your hourly rate at job " + counter + "?");
            double wageRate = input.nextDouble();

            System.out.println("Monthly earnings: Enter your earnings for each month worked:");
            salary = new ArrayList<>();
            for(int i = 0; i < months; i++){
                double earnings = input.nextDouble();
                salary.add(earnings);
            }
            double totalSalary = 0;
            for (int j = 0; j < salary.size(); j++){
                double eachSalary = salary.get(j);
                totalSalary += eachSalary;
            }
            double hoursWorkedPerJob = totalSalary/wageRate;
            System.out.println("The hours worked at job " + counter + " is " + hoursWorkedPerJob);
            System.out.println(" ");
            System.out.println("***************************************************");
            System.out.println(" ");
            grandTotalHoursWorked += hoursWorkedPerJob;
            counter++;
        }
        return grandTotalHoursWorked;
    }
//    public void println(){
//        System.out.println(grandTotalHoursWorked);
//        System.out.println(totalHoursWorked);
//    }
}