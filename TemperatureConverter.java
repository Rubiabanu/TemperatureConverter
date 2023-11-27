
import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input temperature and unit
        System.out.print("Enter temperature: ");
        double temperature = scanner.nextDouble();

        System.out.print("Enter unit (F for Fahrenheit, C for Celsius): ");
        char unit = scanner.next().charAt(0);

        // Perform conversion based on user input
        double convertedTemperature;
        if (unit == 'F' || unit == 'f') {
            convertedTemperature = fahrenheitToCelsius(temperature);
            System.out.println(temperature + " Fahrenheit is equal to " + convertedTemperature + " Celsius.");
        } else if (unit == 'C' || unit == 'c') {
            convertedTemperature = celsiusToFahrenheit(temperature);
            System.out.println(temperature + " Celsius is equal to " + convertedTemperature + " Fahrenheit.");
        } else {
            System.out.println("Invalid unit. Please enter F or C.");
        }

        // Close the scanner
        scanner.close();
    }

    // Convert Fahrenheit to Celsius
    private static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    // Convert Celsius to Fahrenheit
    private static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }
}
