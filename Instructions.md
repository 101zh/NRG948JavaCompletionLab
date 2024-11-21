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
- ``age``: an **integer** that represents the age of the turtle. Cannot be less than 0.
- ``angry``: a **boolean**; true if the Turtle is angry
- ``name``: a **string** that represents the name of the turtle
- ``favoriteFood``: a **string** that represents name of the turtle's favorite food
- ``turtleDescription``: No Setter or Getter for this one. This **string** is a **unchanging value** and **accessible from anywhere on the class**, which is the description of the turtle as an animal. (just copy and paste the wikipedia entry lol)

NOTE: extra member variables may be required for method implementation

#### Methods

- Constructor
- Parameters
  - ``age``: an **integer** that represents the age of the turtle. Cannot be less than 0.
  - ``angry``: a **boolean**; true if the Turtle is angry
  - ``name``: a **string** that represents the name of the turtle
  - ``favoriteFood``: a **string** that represents name of the turtle's favorite food
- The constructor should set the variables corresponding to the member variables

- ``eat``
  - Parameters
    - ``quantity``: an **integer**
    - ``food``: a **string**
  - Requirements to eat
    - ``quantity <= 3``
    - ``food.equals(favoriteFood) == true``
    - Must have eaten 3 or more hours ago (time is based on lazing)
  - Behaviour
    - Prints out ``name ate food`` for each time they eat (based on ``quantity``)
  - NOTE: by default when the turtle is created they just ate

- ``laze``
  - Parameter
    - ``hours``: a **double**
  - Requirements to laze
    - ``hours <= 6.0``
    - Can't laze if the turtle has lazed consecutively for 6 hours or more
      - If they eat then they can laze again
  - Behaviour
    - Prints out ``name lazes for x hours. It now lazed consecutively for y hours``

### Interaction Part

1. Create a Class called Main
2. Create a Turtle based on user prompts
3. In the main method allow the user to see the member variables listed in the class instructions
4. Allow the user to set the member variables
5. Allow the user to make the Turtle eat and laze
6. Allow user to end their interaction by typing exit

## Example Input & Output

1. [Turtle Creation](#turtle-creation)
2. [Turtle Feeding & Lazing](#turtle-feeding--lazing)

### Turtle Creation
```
Turtles are reptiles of the order Testudines, characterized by a special shell developed mainly from their ribs. Modern turtles are divided into two major groups, the Pleurodira (side necked turtles) and Cryptodira (hidden necked turtles), which differ in the way the head retracts. There are 360 living and recently extinct species of turtles, including land-dwelling tortoises and freshwater terrapins. They are found on most continents, some islands and, in the case of sea turtles, much of the ocean. Like other amniotes (reptiles, birds, and mammals) they breathe air and do not lay eggs underwater, although many species live in or around water.



Welcome to turtle interactor!!
It's time to create your turtle!
What is its name?
Daniel
What is its age? (# w/o decimal)
57
Is it angry? (true/false)
false
What is its favorite food?
straws


What would you like to do?
1: View Your Turtle's Characteristics
2: Create a new Turtle
3: Feed Your Turtle
4: Let Your Turtle Laze

1

Name: Daniel
Age: 57
Angry: false
Favorite Food: straws


What would you like to do?
1: View Your Turtle's Characteristics
2: Create a new Turtle
3: Feed Your Turtle
4: Let Your Turtle Laze

2

What is its name?
Daniel 2
What is its age? (# w/o decimal)
42
Is it angry? (true/false)
true
What is its favorite food?
plastic bags


What would you like to do?
1: View Your Turtle's Characteristics
2: Create a new Turtle
3: Feed Your Turtle
4: Let Your Turtle Laze

1

Name: Daniel 2
Age: 42
Angry: true
Favorite Food: plastic bags


What would you like to do?
1: View Your Turtle's Characteristics
2: Create a new Turtle
3: Feed Your Turtle
4: Let Your Turtle Laze

exit
```

### Turtle Feeding & Lazing

```
(After creating turtle)
Name: Daniel
Age: 57
Angry: false
Favorite Food: straws


What would you like to do?
1: View Your Turtle's Characteristics
2: Create a new Turtle
3: Feed Your Turtle
4: Let Your Turtle Laze

3

What food?
straws
How much?
1
(-^-)
Daniel just recently ate and can't eat anymore food


What would you like to do?
1: View Your Turtle's Characteristics
2: Create a new Turtle
3: Feed Your Turtle
4: Let Your Turtle Laze

4

How long (in hours)?
1.5
Daniel lazes for 1.5 hours. Daniel has now lazed consecutively for 1.5 hours


What would you like to do?
1: View Your Turtle's Characteristics
2: Create a new Turtle
3: Feed Your Turtle
4: Let Your Turtle Laze

3

What food?
straws
How much?
1
(-^-)
Daniel just recently ate and can't eat anymore food


What would you like to do?
1: View Your Turtle's Characteristics
2: Create a new Turtle
3: Feed Your Turtle
4: Let Your Turtle Laze

4

How long (in hours)?
20
Daniel shakes its head. It knows that 20.0 hours is too much


What would you like to do?
1: View Your Turtle's Characteristics
2: Create a new Turtle
3: Feed Your Turtle
4: Let Your Turtle Laze

4

How long (in hours)?
3.5
Daniel lazes for 3.5 hours. Daniel has now lazed consecutively for 5.0 hours


What would you like to do?
1: View Your Turtle's Characteristics
2: Create a new Turtle
3: Feed Your Turtle
4: Let Your Turtle Laze

3

What food?
straws
How much?
100
Daniel is shocked (?o?). It doesn't eat; there is too much food


What would you like to do?
1: View Your Turtle's Characteristics
2: Create a new Turtle
3: Feed Your Turtle
4: Let Your Turtle Laze

3

What food?
plastic
How much?
2
Daniel only wants to eat its favorite food


What would you like to do?
1: View Your Turtle's Characteristics
2: Create a new Turtle
3: Feed Your Turtle
4: Let Your Turtle Laze

3

What food?
straws
How much?
2
Daniel happily eats the straws! :)


What would you like to do?
1: View Your Turtle's Characteristics
2: Create a new Turtle
3: Feed Your Turtle
4: Let Your Turtle Laze

exit
```
