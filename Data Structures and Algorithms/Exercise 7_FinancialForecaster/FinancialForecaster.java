public class FinancialForecaster {

    /**
     * Recursive method to predict future value based on past data.
     * * @param presentValue The initial starting amount.
     * @param growthRate   The annual growth rate as a decimal (e.g., 0.05 for 5%).
     * @param years        The number of years into the future to forecast.
     * @return             The predicted future value.
     */
    public static double calculateFutureValue(double presentValue, double growthRate, int years) {
        // Base Case: If 0 years have passed, the value hasn't grown.
        if (years == 0) {
            return presentValue;
        }
        
        // Recursive Step: The value this year is last year's value + this year's growth.
        // We call the method again for (years - 1).
        double previousYearsValue = calculateFutureValue(presentValue, growthRate, years - 1);
        return previousYearsValue * (1 + growthRate);
    }

    public static void main(String[] args) {
        double initialInvestment = 10000.0;
        double annualGrowthRate = 0.07; // 7% historical average growth
        int forecastYears = 10;

        System.out.println("--- Financial Forecast ---");
        System.out.println("Initial Investment: $" + initialInvestment);
        System.out.println("Annual Growth Rate: " + (annualGrowthRate * 100) + "%");
        
        double projectedValue = calculateFutureValue(initialInvestment, annualGrowthRate, forecastYears);
        
        // Using printf to format the output to 2 decimal places
        System.out.printf("Projected Value after %d years: $%.2f%n", forecastYears, projectedValue);
    }
}
