package WorkHours;
import java.util.Scanner;

public class Main {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        DisplayResult displayResult = new DisplayResult();
        boolean tryAgain = false;

        while (!tryAgain){
            System.out.println("Kindly enter your JOB PREFERENCE \n 1 = Full Time at a single job \n 2 = Part Time at a single job \n 3 = Several hours at several job");
            int workOption = input.nextInt();
            if (workOption == 1){
                displayResult.fullTime();
            }
            else if (workOption == 2){
                displayResult.partTime();
            }
            else if (workOption == 3){
                displayResult.severalJobs();
            }
            else{
                System.out.println("Invalid Option");
            }
            System.out.println(" ");
            System.out.println("***************************************************");
            System.out.println("Would you like to continue?\n Enter 1 to continue\n Enter 2 to close the program.");
            int another = input.nextInt();
            if(another == 1){}
            else if(another == 2){
                tryAgain = true;
            }
            else{
                System.out.println("Invalid Option");
                break;
            }
        }
    }
}