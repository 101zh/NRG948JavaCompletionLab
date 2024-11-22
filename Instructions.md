# Instructions on the Lab

## Contents

1. [Lore](#lore)
2. [Lab Overall Requirements](#lab-overall-requirements)
3. [Lab Requirements Description](#lab-requirements-description)
    - [Turtle Class](#turtle-class)
        - [Required Member Variables](#required-member-variables)
        - [Methods](#methods)
    - [Interaction Part](#interaction-part)
4. [Step-by-Step Instructions](#step-by-step-instructions)
    - [Turtle Class Instructions](#turtle-class-instructions)
    - [Main Class Instructions](#main-class-instructions)
5. [Example Input & Output](#example-input--output)
    - [Turtle Creation](#turtle-creation)
    - [Turtle Feeding & Lazing](#turtle-feeding--lazing)


## Lore
You are creating an app that allows people to interact with animals (either as a game or just as a passion orject). You plan to implement more animals, but you have to start somewhere.\
Soo... why not start with the turtle? After all, they're one of the best animals out there!

## Lab Overall Requirements

- Create a Turtle Class
  - Implement Setters and Getters for member variables
  - Implement Methods for the Turtle class
- Prompt the user to allow them to interact with the Turtle
- Loosely follow the [example input and output](#example-input--output)

## Lab Requirements Description

### Turtle Class

#### Required Member Variables

Write Setters and Getters for each of these variables
- ``age``: an **integer** that represents the age of the turtle. **Cannot be less than 0**.
- ``angry``: a **boolean**; true if the Turtle is angry
- ``name``: a **string** that represents the name of the turtle
- ``favoriteFood``: a **string** that represents name of the turtle's favorite food
- ``turtleDescription``: No Setter or Getter for this one. This **string** is a **unchanging value** and **accessible from anywhere on the class**, which is the description of the turtle as an animal. (just copy and paste the wikipedia entry lol)

NOTE: extra member variables may be required for method implementation

#### Methods

##### - Constructor
  - Parameters
    - ``age``: an **integer** that represents the age of the turtle. Cannot be less than 0.
    - ``angry``: a **boolean**; true if the Turtle is angry
    - ``name``: a **string** that represents the name of the turtle
    - ``favoriteFood``: a **string** that represents name of the turtle's favorite food
  - The constructor should set the variables corresponding to the member variables

##### - ``eat``
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
  - Note: ideally, you would check that ``quantity < 0`` is false, but this isn't a requirement that is listed here

##### - ``laze``
  - Parameter
    - ``hours``: a **double**
  - Requirements to laze
    - ``hours <= 6.0``
    - Can't laze if the turtle has lazed consecutively for 6 hours or more
      - If they eat then they can laze again
  - Behaviour
    - Prints out ``name lazes for x hours. It now lazed consecutively for y hours``
  - Note: ideally, you would check that ``hours < 0.0`` is false, but this isn't a requirement that is listed here

### Interaction Part

1. Create a Class called Main
2. Create a Turtle based on user prompts
3. In the main method allow the user to see the member variables listed in the class instructions
4. Allow the user to create a new turtle
5. Allow the user to make the Turtle eat and laze
6. Allow user to end their interaction by typing exit

## Step-by-Step Instructions

### Turtle Class Instructions
1. First, start with declaring the private [member variables](#required-member-variables)!
2. Next, let's create setters and getters for them!
Remember a method is formatted like this
  ```java
  AccessModifier ReturnType methodName(Type paramName) {

  }
  ```
3. Now let's create the [constructor](#constructor)
  - Remember that constructors are methods with the same name as the class!
4. The first method we'll create is the [``laze``](#laze) method
    1. Start by using if statements to figure out if any requirements for the method is violated
    2. Then print a cute little message if any of the requirements are violated
    3. You can end a method early by calling ``return;`` in a void method!
    4. Then, if none of the requirements are violated you can run the actual method and print a message that shows that the turtle has eaten
    5. (**HINT**: You may need to keep track of the hours that the turtle has lazed with an additional private variable)
5. The next method we'll create is the [``eat``](#eat) method
    1. Now try and do the ``eat`` method the same way you did the ``laze`` method
    2. (**HINT**: You might need to use the variable you created for lazing here to figure out the requirements!)

### Main Class Instructions

Note: Rememember your inputs!

1. First, let's welcome the user and let them know what a turtle is! (use the ``turtleDescription`` variable)
2. Now let's prompt our user to let them enter in the variables for the turtle
3. Now that we have the user input we can create the Turtle!
4. Now we want to create a loop that will continously take in input from the user until they type ``exit``
5. After creating that loop now we want to prompt the user for what they want to do inside the loop
    - Users can...
        - See their turtle's characteristics
        - Create a new turtle
        - Feed their turtle
        - Let their turtle laze
6. For both feeding and lazing you'll want to prompt the user for the method parameters
7. If you want to see an example of the code in action go to [Example Input & Output](#example-input--output)

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
2
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
1000
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
1
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
3
Daniel happily eats a straws! :)
Daniel happily eats a straws! :)
Daniel happily eats a straws! :)


What would you like to do?
1: View Your Turtle's Characteristics
2: Create a new Turtle
3: Feed Your Turtle
4: Let Your Turtle Laze

exit
```
