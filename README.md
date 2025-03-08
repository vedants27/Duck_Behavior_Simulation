# Duck_Behavior_Simulation


## Description
This is a Menu-Driven Java Program that simulates different types of ducks, their behaviors, and interactions. The program follows Object-Oriented Programming (OOP) principles, using abstract classes, interfaces, and dynamic behavior assignment to model real-world duck behaviors.


## Features
- Implements various duck types: MallardDuck, RedHeadDuck, RubberDuck, and DecoyDuck.
- Uses Strategy Pattern to dynamically assign behaviors for quacking, swimming, and flying.
- Demonstrates behavior modification at runtime using setter methods.
- Provides a menu-driven approach for simulating ducks.


## Classes and Structure
  ### 1. Duck.java (Abstract Class)
  - Attributes:
    - QuackBehaviour quackBehaviour
    - SwimBehaviour swimBehaviour
    - FlyBehaviour flyBehaviour
  - Methods:
    - setSwimBehaviour(SwimBehaviour swimBehaviour): Changes swim behavior dynamically.
    - setQuackBehaviour(QuackBehaviour quackBehaviour): Changes quack behavior dynamically.
    - setFlyBehaviour(FlyBehaviour flyBehaviour): Changes fly behavior dynamically.
    - performQuack(): Executes the duck's quack behavior.
    - performSwim(): Executes the duck's swim behavior.
    - performFly(): Executes the duck's fly behavior.
    - abstract display(): Must be implemented by each duck type.
      
 ### 2. Behavior Interfaces
   - QuackBehaviour.java (Interface for quacking behavior)
       - quack(): Abstract method for quacking.
   - SwimBehaviour.java (Interface for swimming behavior)
       - swim(): Abstract method for swimming.
   - FlyBehaviour.java (Interface for flying behavior)
       - fly(): Abstract method for flying.
    
 ### 3. Duck Types
   - MallardDuck.java
       - Behaviors: Quack(), SwimWithLegs(), CanFly()
       - Displays: "I am Mallard duck."
   - RedHeadDuck.java
       - Behaviors: Squeak(), SwimWithLegs(), CanFly()
       - Displays: "I am a red head duck!"
   - RubberDuck.java
       - Behaviors: Squeak(), Floating(), CannotFly()
       - Displays: "I am a rubber duck!"
  - DecoyDuck.java
       - Behaviors: Quack(), SwimWithLegs(), CannotFly()
       - Displays: "I am a Decoy duck."

 ### 4. Behavior Implementations
   - Quack.java → Implements QuackBehaviour
       - quack(): "Quack Quack!"
   - Squeak.java → Implements QuackBehaviour
       - quack(): "Squeak Squeak!"
   - SwimWithLegs.java → Implements SwimBehaviour
       - swim(): "Swimming using legs."
   - Floating.java → Implements SwimBehaviour
       - swim(): "Floating on water."
   - CanFly.java → Implements FlyBehaviour
       - fly(): "Flying high in the sky!"
   - CannotFly.java → Implements FlyBehaviour
       - fly(): "I cannot fly."

### 5. Main.java
   - Handles user input and creates instances of different ducks.
   - Displays behavior simulation for each duck.


## How to Run the Program
  ### 1:Clone the Repository
   - git clone https://github.com/vedants27/Duck_Behavior_Simulation.git
   - cd Duck_Behavior_Simulation
 ### 2: Compile the Java Files
  - javac Main.java
### 3: Run the Program
  - java Main

  
## Code Structure

Duck_Behavior_Simulation/
- Main.java
- Duck.java
- QuackBehaviour.java
- SwimBehaviour.java
- FlyBehaviour.java
- MallardDuck.java
- RedHeadDuck.java
- RubberDuck.java
- DecoyDuck.java
- Quack.java
- Squeak.java
- SwimWithLegs.java
- Floating.java
- CanFly.java
- CannotFly.java
- README.md

 
## Example Output

![image](https://github.com/user-attachments/assets/1c917fa0-5eeb-4e2b-8228-dd229df0673f)


## Coding Guidelines Followed
  - Each behavior is implemented as a separate interface and class.
  - Proper OOP principles using abstract classes, interfaces, and dynamic behavior modification.
  - Descriptive comments included for clarity.
  - Code is properly formatted for readability.

  
