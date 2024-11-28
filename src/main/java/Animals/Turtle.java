package Animals;

/**
 * A class that represents a simplified turtle.
 */
public class Turtle {

    public final static String turtleDescription = "Turtles are reptiles of the order Testudines, characterized by a special shell developed mainly from their ribs. Modern turtles are divided into two major groups, the Pleurodira (side necked turtles) and Cryptodira (hidden necked turtles), which differ in the way the head retracts. There are 360 living and recently extinct species of turtles, including land-dwelling tortoises and freshwater terrapins. They are found on most continents, some islands and, in the case of sea turtles, much of the ocean. Like other amniotes (reptiles, birds, and mammals) they breathe air and do not lay eggs underwater, although many species live in or around water.";
    private int age;
    private boolean isAngry;
    private String name;
    private String favoriteFood;

    // Stores the number of consecutive lazed hours
    private double consecutiveLazedHours = 0.0;

    /**
     * Creates an new instance of the turtle object
     * 
     * @param age          the age of the turtle in years
     * @param isAngry      a boolean representing whether or not the turtle is angry
     * @param name         the name of the turtle
     * @param favoriteFood the name of the turtle's favorite food
     */
    public Turtle(int age, boolean isAngry, String name, String favoriteFood) {
        setAge(age);
        setIsAngry(isAngry);
        setName(name);
        setFavoriteFood(favoriteFood);
    }

    /**
     * Attempts to feed the turtle {@code quantity} times with the food:
     * {@code food}
     * 
     * @param quantity the quantity of food fed to the turtle {@code quantity > 0}
     * @param food     the type of food fed to the turtle
     */
    public void eat(int quantity, String food) {
        // Checking if requirements are met to eat
        if (quantity > 3) {
            System.out.println(name + " is shocked (⊙o⊙). It doesn't eat; there is too much food");
            return;
        } else if (!food.equals(favoriteFood)) {
            System.out.println(name + " only wants to eat its favorite food");
            return;
        } else if (consecutiveLazedHours < 3.0) {
            System.out.println("(-^-)");
            System.out.println(name + " just recently ate and can't eat anymore food");
            return;
        }

        // If the eat method isn't ended early because a requirement is violated the eat
        // method runs
        consecutiveLazedHours = 0.0;
        for (int i = 0; i < quantity; i++)
            System.out.println(name + " happily eats a " + food + "! :)");
    }

    /**
     * Attempts to have the turtle laze {@code hours} hours
     * 
     * @param hours the amount of hours that the turtle will laze {@code hours > 0}
     */
    public void laze(double hours) {
        // Checking if requirements are met to laze
        if (hours > 6.0) {
            System.out.println(name + " shakes its head. It knows that " + hours + " hours is too much");
            return;
        } else if (consecutiveLazedHours >= 6.0) {
            System.out.println(name + " shakes its head. It has already lazed " + consecutiveLazedHours + " hours");
            return;
        }

        // If the laze method isn't ended early because a requirement is violated the
        // laze method runs
        consecutiveLazedHours += hours;
        System.out.println(
                name + " lazes for " + hours + " hours. " + name + " has now lazed consecutively for " + consecutiveLazedHours
                        + " hours");
    }

    /**
     * Sets the age of the turtle
     * 
     * @param age the age of the turtle in years {@code age > 0}
     */
    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("Invalid age; setting it to default");
            age = 0;
        }
    }

    /**
     * Sets if the turtle is angry
     * 
     * @param isAngry a boolean representing whether or not the turtle is angry
     */
    public void setIsAngry(boolean isAngry) {
        this.isAngry = isAngry;
    }

    /**
     * Sets the name of the turtle
     * 
     * @param name the name of the turtle
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Sets the turtle's favorite food
     * 
     * @param favoriteFood the name of the turtle's favorite food
     */
    public void setFavoriteFood(String favoriteFood) {
        this.favoriteFood = favoriteFood;
    }

    /**
     * Gets the age of the turtle in years
     * 
     * @return the age of the turtle in years
     */
    public int getAge() {
        return age;
    }

    /**
     * Gets if the turtle is angry or not
     * 
     * @return a boolean representing whether or not the turtle is angry
     */
    public boolean getIsAngry() {
        return isAngry;
    }

    /**
     * Gets the turtle's name
     * 
     * @return the name of the turtle
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the name of the turtle's favorite food
     * 
     * @return the name of the turtle's favorite food
     */
    public String getFavoriteFood() {
        return favoriteFood;
    }

}
