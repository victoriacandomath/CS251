/** Victoria Varela
 * victoriia25@unm.edu
 * CS251-001
 * Candy class that takes a name,
 * weight, and price input
 */

public class Candy extends Dessert {

    private double weight;
    private double price;
    private String candyName;

    public static void main(String[] args) {

    }

    /**
     * Candy constructor
     * @param candyName input for the name
     * @param weight input for the weight to buy
     * @param price input for the price of the candy
     */
    public Candy(String candyName, double weight, double price) {
        super(candyName);
        this.weight = weight;
        this.price = price;
    }

    /**
     * Gets the weight we buy
     * @return returns the weight input
     */
    public double getWeightInPounds() {
        return weight;
    }

    /**
     * Gets the price per lb of the candy
     * @return returns the price input
     */
    public double getPricePerPound() {
        return price;
    }

    /**
     * Gets the total price based on weight
     * @return returns the total price
     */
    public double getPrice() {
        return (price*weight);
    }
}
