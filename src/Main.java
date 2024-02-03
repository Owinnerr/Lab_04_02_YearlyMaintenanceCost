public class Main {
    public static void main(String[] args)
    {
        double fallCost = 25.25; // Fall cost variable
        double winterCost = 50.50; // Winter cost variable
        double springCost = 75.75; // Spring cost variable
        double summerCost = 100.10; // Summer cost variable
        double totalYearlyCost = 0; // Initialize total cost variable
        totalYearlyCost = fallCost + winterCost + springCost + summerCost; // Make the total cost equal to the sum of all seasonal costs
        System.out.println("The fall cost is " + fallCost); // Output the fall cost
        System.out.println("The winter cost is " + winterCost); // Output the winter cost
        System.out.println("The spring cost is " + springCost); // Output the spring cost
        System.out.println("The summer cost is " + summerCost); // Output the summer cost
        System.out.println("The total yearly maintenance cost is " + totalYearlyCost); // Output the sum of all seasonal costs (totalYearlyCost variable)
    }
}