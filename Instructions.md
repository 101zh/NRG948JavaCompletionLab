# Instructions on the Lab

## Lore
You are creating an app that allows people to interact with animals (either as a game or just as a passion orject). You plan to implement more animals, but you have to start somewhere.\
Soo... why not start with the turtle? After all, they're one of the best animals out there!

## Lab Overall Requirements

- Create a Turtle Class
  - Implement Setters and Getters for member variables
  - Implement Methods for the Turtle class
- Prompt the user to allow them to interact with the Turtle
- Loosely follow the [example input and output](#example-input--output)

## Actual Instructions Start Here

### Turtle Class

#### Required Member Variables

Write Setters and Getters for each of these variables
- ``age``: an **integer** that represents the age of the turtle
- ``angry``: a **boolean**; true if the Turtle is angry
- ``name``: a **string** that represents the name of the turtle
- ``favoriteFood``: a **string** that represents name of the turtle's favorite food
- ``animalDescription``: No Setter or Getter for this one. This **string** is a **unchanging value** and **accessible from anywhere**, which is the description of the turtle as an animal.

NOTE: extra member variables may be required for method implementation

#### Methods

- ``eat``
  - Parameters
    - ``quantity``: an **integer**
    - ``food``: a **string**
  - Requirements to eat
    - ``quantity <= 3``
    - ``food.equals(favoriteFood) == true``
    - If they are angry, they have a 50% to decide to stop eating
    - Must have eaten 3 or more hours ago (time is based on lazing)
  - Behaviour
    - Prints out ``name ate food`` for each time they eat (based on ``quantity``)

- ``laze``
  - Parameter
    - ``hours``: a **double**
  - Requirements to laze
    - ``hours <= 6.0``
    - Can't laze if the turtle has lazed consecutively for 6 hours
      - If they eat then they can laze again
  - Behaviour
    - Prints out ``name lazed for x hours``

### Interaction Part

1. Create a Class called Main
2. Create a Turtle based on user prompts
3. In the main method allow the user to see the member variables listed in the class instructions
4. Allow the user to set the member variables
5. Allow the user to make the Turtle eat and laze
6. Allow user to end their interaction by typing exit

## Example Input & Output

