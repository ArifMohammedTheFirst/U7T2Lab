/**
 * This class represents a prism object
 *
 * @author The Goat Arif mohammed the first
 */
import java.util.ArrayList;

public class UsedCarLot {

    /** A list of all the cars in the arrayList */
    private ArrayList<Car> inventory;


    /**
     * instantiates Car objects
     * makes a empty list
     */
    public UsedCarLot() {
        inventory = new ArrayList<Car>();
    }

    /**
     * Returns the list of cars
     * @return The inventory
     */
    public ArrayList<Car> getInventory() {
        return inventory;
    }

    /**
     * Adds a car to the list
     * @param added The car
     */
    public void addCar(Car added) {
        inventory.add(added);
    }

    /**
     * swaps the cars in different indexes of the list
     * @param one one of the cars
     * @param two the other one
     * @return true
     */
    public boolean swap(int one, int two) {
        if(one > inventory.size() || two > inventory.size()) {
            return false;
        }
        Car temp = inventory.get(one);
        Car temp1 = inventory.get(two);
        inventory.set(one,temp1);
        inventory.set(two,temp);
        return true;
    }
    /* Adds a Car to the inventory list at the index specified
    by indexToAdd; this method increases the size of inventory by 1
    PRECONDITION: 0 <= indexToAdd < inventory.size()
    DUE TO THIS PRECONDITION, you do NOT need to check for boundary errors
    like you did the other addCar method; also note that this method is void
*/

    /**
     * Adds a car at a specific index
     * @param indexToAdd the spot in the list
     * @param carToAdd  the specific car object
     */
    public void addCar(int indexToAdd, Car carToAdd)
    {
        inventory.add(indexToAdd,carToAdd);
    }

    /* "sells" the Car located at indexOfCarToSell which
        removes it from the inventory list and shifting the remaining
        Cars in the inventory list to the left to fill in the gap;
        this method reduces the size of inventory by 1

        Returns the Car that is being "sold" (removed from lot)

        PRECONDITION: indexOfCarToSell < inventory.size()

        HINT: the ArrayList remove() method returns the removed element while also
              removing it from the ArrayList
      */

    /**
     * shifts one car object to the left
     * @param indexOfCarToSell the position of the car in the index before moving
     * @return the car that is being shifted
     */
    public Car sellCarShift(int indexOfCarToSell)
    {
        Car sold = inventory.remove(indexOfCarToSell);

        return sold;
    }

    //nikita is cool kid
    /* "sells" the Car located at indexOfCarToSell,
       but instead of removing it and shifting the inventory
       list to the left, REPLACE the Car at indexOfCarToSell
       with NULL, thus creating an "empty parking spot" on the lot;
       this method does NOT reduce the size of inventory by 1

       PRECONDITION: indexOfCarToSell < inventory.size()

       This method returns the Car that is being "sold" (replaced with null)
     */

    /**
     * sells the car and removes it from the list
     * @param indexOfCarToSell the position of the list the car that is wanted
     * @return the car that is sold
     */
    public Car sellCarNoShift(int indexOfCarToSell)
    {
        Car sold = inventory.get(indexOfCarToSell);
        inventory.set(indexOfCarToSell, null);
        return sold;
    }

    /* moves Car located at index indexOfCarToMove to index destinationIndex;
       if destinationIndex > indexOfCarToMove, moves the Car to the right in
       inventory; if destinationIndex < indexOfCarToMove, moves the
       Car to the left in the inventory. All other cars in the inventory
       should shift accordingly

       PRECONDITIONS: indexOfCarToMove < inventory.size()
                      destinationIndex < inventory.size()
     */

    /**
     * Moves a car object to a specific index and moved the other objects to the left
     * @param indexOfCarToMove the position of the car
     * @param destinationIndex the position that the user wants to car object to be
     */
    public void moveCar(int indexOfCarToMove, int destinationIndex)
    {
        Car move = inventory.remove(indexOfCarToMove);
        inventory.add(destinationIndex,move);
    }
}
