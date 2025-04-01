package fullReport;
import java.util.Locale;
import java.util.ResourceBundle;
import employee.Employee;
import java.text.NumberFormat;

public class FullReport extends Employee {
    public static void generateReport(Employee[] mas, Locale locale) {
        ResourceBundle messages = ResourceBundle.getBundle("task2", locale);
        System.out.println(messages.getString("reportTitle"));
        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(locale);
        for (int i = 0; i < mas.length; i++) {
            System.out.printf("\nРаботник №[%d]\nИмя: %5s, Зарплата: %s\n", (i + 1), mas[i].getFullName(), currencyFormat.format(mas[i].getSalary()));
        }
    }
}
