/** Victoria Varela
 * victoriia25@unm.edu
 * CS251-001
 * Cookie class that takes the
 * number to buy and price per dozen
 */
public class Cookie extends Dessert{

    private int numberOfCookies;
    private double pricePerDozen;

    public static void main(String[] args) {

    }

    /**
     * Constructor for cookies
     * @param cookieName takes a string input for the name
     * @param numberOfCookies number of cookies purchased
     * @param pricePerDozen price per dozen of a specific cookie
     */
    public Cookie(String cookieName, int numberOfCookies, double pricePerDozen) {
        super(cookieName);
        this.numberOfCookies = numberOfCookies;
        this.pricePerDozen = pricePerDozen;
    }

    /**
     * Gets the number of cookies
     * @return returns the input number of cookies
     */
    public int getItemCount() {
        return numberOfCookies;
    }

    /**
     * Gets the price per dozen
     * @return returns the input price in constructor
     */
    public double getPricePerDozen() {
        return pricePerDozen;
    }

    /**
     * Gets the total price of the cookies
     * @return returns the total price for the
     * number of cookies bought based on their
     * price per dozen
     */
    public double getPrice() {
        return (pricePerDozen*numberOfCookies)/12;
    }
}
