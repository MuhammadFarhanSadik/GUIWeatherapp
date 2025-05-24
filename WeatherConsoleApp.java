
package farhans.weatherconsolapp;

import java.util.Scanner;

public class WeatherConsoleApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        WeatherApp weatherApp = new WeatherApp();

        while (true) {
            System.out.print("Enter a country code (e.g., BD) or type 'exit' to quit: ");
            String country = scanner.nextLine().trim();
            if (country.equalsIgnoreCase("exit")) {
                System.out.println("Exiting weather app. Goodbye!");
                break;
            }

            System.out.print("Enter a city in " + country + ": ");
            String city = scanner.nextLine().trim();
            if (city.equalsIgnoreCase("exit")) {
                System.out.println("Exiting weather app. Goodbye!");
                break;
            }

            weatherApp.displayWeather(city, country);
            System.out.println(); // for spacing
        }

        scanner.close();
    }
}



