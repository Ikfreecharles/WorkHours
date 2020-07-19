package WorkHours;

public class TimesForPartTime extends TimesForFullTime {

    public TimesForPartTime(int numberOfJobs, int totalNoOfDays) {
        super(numberOfJobs, totalNoOfDays);
    }
    @Override
    public double hoursRemaining(){
        double totalNoOfHoursAvailable = totalNoOfDays*4;
        noOfHoursAvailable = totalNoOfHoursAvailable - hoursWorked();
        return noOfHoursAvailable;
    }
    @Override
    public double daysWorked(){
        theDaysWorked = hoursWorked()/4;
        return theDaysWorked;
    }
    public double convertDaysRemainingToFullTime(){
        return daysRemaining/2;
    }
}
