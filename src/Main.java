import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<WeatherReport> monthlyData = new ArrayList<>();

        monthlyData.add(new WeatherReport(1, 25.0, 10.0, 0.5, 0.0));
        monthlyData.add(new WeatherReport(2, 28.0, 12.0, 0.2, 0.0));

        MonthlyReportGenerator generator = new MonthlyReportGenerator(monthlyData);
        generator.generateReport();
    }
}