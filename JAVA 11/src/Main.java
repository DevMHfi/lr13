import localization.Localization;
import employee.*;
import fullReport.*;
import java.util.Locale;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        Localization example = new Localization();
        System.out.print("Сообщения на английском:\n");
        example.printMes(Locale.US);
        System.out.print("Сообщения на русском:\n");
        example.printMes(new Locale("ru", "RU"));
        System.out.println("Задание 2");
        FullReport report = new FullReport();
        Employee[] mas = new Employee[3];

        mas[0] = new Employee("Макс", 1500);
        mas[1] = new Employee("Владос", 1200);
        mas[2] = new Employee("Аркадий", 1800);
        System.out.print("\nОтчет на английском:\n\n");
        FullReport.generateReport(mas, Locale.US);
        System.out.print("\nОтчет на русском:\n\n");
        FullReport.generateReport(mas, new Locale("ru", "RU"));
    }
}