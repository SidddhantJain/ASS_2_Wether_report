import java.util.ArrayList;

class MonthlyReportGenerator {
    private ArrayList<WeatherReport> monthlyData;

    public MonthlyReportGenerator(ArrayList<WeatherReport> monthlyData) {
        this.monthlyData = monthlyData;
    }

    public void generateReport() {
        double totalHighTemp = 0.0;
        double totalLowTemp = 0.0;
        double totalAmountRain = 0.0;
        double totalAmountSnow = 0.0;

        for (WeatherReport report : monthlyData) {
            totalHighTemp += report.getHighTemp();
            totalLowTemp += report.getLowTemp();
            totalAmountRain += report.getAmountRain();
            totalAmountSnow += report.getAmountSnow();
        }

        int numDays = monthlyData.size();
        double averageHighTemp = totalHighTemp / numDays;
        double averageLowTemp = totalLowTemp / numDays;
        double averageAmountRain = totalAmountRain / numDays;
        double averageAmountSnow = totalAmountSnow / numDays;

        System.out.println("Monthly Report:");
        System.out.println("Average High Temperature: " + averageHighTemp);
        System.out.println("Average Low Temperature: " + averageLowTemp);
        System.out.println("Average Amount of Rain: " + averageAmountRain);
        System.out.println("Average Amount of Snow: " + averageAmountSnow);
    }
}