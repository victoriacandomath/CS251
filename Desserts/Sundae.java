/** Victoria Varela
 * victoriia25U@unm.edu
 * CS251-001
 * Sundae class that uses the IceCream
 * constructor to make various types of sundaes
 * topped with other desserts
 */

public class Sundae extends IceCream {

    public static void main(String[] args) {

    }

    /**
     * Sundae constructor
     * @param iceCream ice cream type including
     *                 its name and price
     * @param dessert other dessert type including its
     *                name and price
     */
    public Sundae(IceCream iceCream, Dessert dessert) {
        super(iceCream.getName() + " topped with " +
                dessert.getName(), iceCream.getPrice() +
                dessert.getPrice());
    }

}
