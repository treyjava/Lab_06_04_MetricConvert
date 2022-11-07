import java.util.Scanner;



public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        double meterMeasurement;
        String trash = "";

        System.out.print("Enter the length in meters: ");
        if(in.hasNextDouble())
        {
            meterMeasurement = in.nextDouble();
            in.nextLine();

            double miles = meterMeasurement / 1609.344;
            double feet = meterMeasurement * 3.28084;
            double inches = meterMeasurement * 39.3701;
            System.out.println("The length in miles is: " + miles);
            System.out.println("The length in feet is: " + feet);
            System.out.println("The length in inches is: " + inches);
        }
        else
        {
            trash = in.nextLine();
            System.out.println("You must enter a valid number, not: " + trash);
            System.exit(0);
        }
    }
}