package FinancialForecastingExample;

public class FinancialForecasting {
    public static double forecastValue(double initialValue, double growthRate, int years) {
        if (years == 0) {
            return initialValue;
        }
        return forecastValue(initialValue * (1 + growthRate), growthRate, years - 1);
    }
}

// The recursive approach repeatedly applies the growth rate each year.
// Time complexity is O(n) for n years
// For larger values of n an iterative or memoized approach can be more efficient and avoid recursion overhead.