class WeatherReport {
    private int dayOfMonth;
    private double highTemp;
    private double lowTemp;
    private double amountRain;
    private double amountSnow;
    public WeatherReport() {
        this.dayOfMonth = 0;
        this.highTemp = 0.0;
        this.lowTemp = 0.0;
        this.amountRain = 0.0;
        this.amountSnow = 0.0;
    }

    public WeatherReport(int dayOfMonth, double highTemp, double lowTemp, double amountRain, double amountSnow) {
        this.dayOfMonth = dayOfMonth;
        this.highTemp = highTemp;
        this.lowTemp = lowTemp;
        this.amountRain = amountRain;
        this.amountSnow = amountSnow;
    }

    public int getDayOfMonth() {
        return dayOfMonth;
    }
    public void setDayOfMonth(int dayOfMonth) {
        this.dayOfMonth = dayOfMonth;
    }
    public double getHighTemp() {
        return highTemp;
    }

    public void setHighTemp(double highTemp) {
        this.highTemp = highTemp;
    }

    public double getLowTemp() {
        return lowTemp;
    }

    public void setLowTemp(double lowTemp) {
        this.lowTemp = lowTemp;
    }

    public double getAmountRain() {
        return amountRain;
    }

    public void setAmountRain(double amountRain) {
        this.amountRain = amountRain;
    }

    public double getAmountSnow() {
        return amountSnow;
    }

    public void setAmountSnow(double amountSnow) {
        this.amountSnow = amountSnow;
    }
}





