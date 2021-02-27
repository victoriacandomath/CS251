/** Victoria Varela
 * victoriia25@unm.edu
 * CS251-001
 * IceCream class that takes a name
 * and price input
 */

public class IceCream extends Dessert {

    private double price;

    public static void main(String[] args) {

    }

    /**
     * Constructor for the ice cream object
     * @param iceCreamName takes input for the name
     * @param price takes input for the scoop price
     */
    public IceCream(String iceCreamName, double price) {
        super(iceCreamName);
        this.price = price;
    }

    /**
     * Gets the price of the ice cream scoops
     * @return returns the input price
     */
    public double getPrice() {
        return price;
    }

}
