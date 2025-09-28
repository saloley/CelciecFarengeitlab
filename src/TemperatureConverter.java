import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Конвертер температур ===");
        System.out.println("1. Цельсий → Фаренгейт");
        System.out.println("2. Фаренгейт → Цельсий");
        System.out.print("Выберите опцию (1 или 2): ");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Введите температуру в Цельсиях: ");
                double celsius = scanner.nextDouble();
                double fahrenheit = celsiusToFahrenheit(celsius);
                System.out.printf("%.2f°C = %.2f°F%n", celsius, fahrenheit);
                break;

            case 2:
                System.out.print("Введите температуру в Фаренгейтах: ");
                fahrenheit = scanner.nextDouble();
                celsius = fahrenheitToCelsius(fahrenheit);
                System.out.printf("%.2f°F = %.2f°C%n", fahrenheit, celsius);
                break;

            default:
                System.out.println("Неверный выбор!");
        }

        scanner.close();
    }

    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }
}