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

    private double lazedHours = 0.0;

    public Turtle(int age, boolean isAngry, String name, String favoriteFood) {
        setAge(age);
        setIsAngry(isAngry);
        setName(name);
        setFavoriteFood(favoriteFood);
    }

    public void eat(int quantity, String food) {
        if (quantity > 3) {
            System.out.println(name + " is shocked (⊙o⊙). It doesn't eat; there is too much food");
            return;
        } else if (!food.equals(favoriteFood)) {
            System.out.println(name + " only wants to eat its favorite food");
            return;
        } else if (lazedHours < 3.0) {
            System.out.println("(-^-)");
            System.out.println(name + " just recently ate and can't eat anymore food");
            return;
        }

        lazedHours = 0.0;
        for (int i = 0; i < quantity; i++)
            System.out.println(name + " happily eats a " + food + "! :)");
    }

    public void laze(double hours) {
        if (hours > 6.0) {
            System.out.println(name + " shakes its head. It knows that " + hours + " hours is too much");
            return;
        } else if (lazedHours >= 6.0) {
            System.out.println(name + " shakes its head. It has already lazed " + lazedHours + " hours");
            return;
        }

        lazedHours += hours;
        System.out.println(
                name + " lazes for " + hours + " hours. " + name + " has now lazed consecutively for " + lazedHours
                        + " hours");
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("Invalid age; setting it to default");
            age = 0;
        }
    }

    public void setIsAngry(boolean isAngry) {
        this.isAngry = isAngry;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFavoriteFood(String favoriteFood) {
        this.favoriteFood = favoriteFood;
    }

    public int getAge() {
        return age;
    }

    public boolean getIsAngry() {
        return isAngry;
    }

    public String getName() {
        return name;
    }

    public String getFavoriteFood() {
        return favoriteFood;
    }

}
