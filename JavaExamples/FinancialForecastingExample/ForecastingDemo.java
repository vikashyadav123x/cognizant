package FinancialForecastingExample;

public class ForecastingDemo {
    public static void main(String[] args) {
        double initialValue = 1000.0;
        double growthRate = 0.10; // 10%
        int years = 5;

        double forecastedValue = FinancialForecasting.forecastValue(initialValue, growthRate, years);
        System.out.println("Forecasted value after " + years + " years: " + forecastedValue);
    }
}
