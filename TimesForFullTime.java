package WorkHours;

public class TimesForFullTime extends HoursWorked{

    //what we will calculate
    protected double noOfHoursAvailable;
    protected double theDaysWorked;
    protected double daysRemaining;

    public TimesForFullTime(int numberOfJobs, int totalNoOfDays){
        super(numberOfJobs, totalNoOfDays);
    }

    public double hoursRemaining(){
        double totalNoOfHoursAvailable = totalNoOfDays*8;
        noOfHoursAvailable = totalNoOfHoursAvailable - hoursWorked();
        return noOfHoursAvailable;
    }
    public double daysWorked(){
        theDaysWorked = hoursWorked()/8;
        return theDaysWorked;
    }
    public double totalDaysRemaining(){
        daysRemaining = totalNoOfDays - theDaysWorked;
        return daysRemaining;
    }
    public double monthsRemaining(){
        return daysRemaining/20;
    }
    public double convertDaysRemainingToPartTime(){
        return daysRemaining*2;
    }
}
