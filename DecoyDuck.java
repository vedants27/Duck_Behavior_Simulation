//DecoyDuck.java
public class DecoyDuck extends Duck {

  public DecoyDuck() {
        quackBehaviour = new Quack();        // Decoy ducks are usually silent, but this one quacks.
        swimBehaviour = new SwimWithLegs();  // Uses legs to swim.
        flyBehaviour = new CannotFly();      // Decoy ducks cannot fly.
    }
  // Displays the appearance of the Decoy Duck.
    public void display() {
        System.out.println("I am Decoy duck..");
    }
}
