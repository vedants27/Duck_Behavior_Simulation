//DecoyDuck.java
public class DecoyDuck extends Duck {

  public DecoyDuck() {
        quackBehaviour = new Quack();        // Decoy ducks are usually silent, but this one quacks.
        swimBehaviour = new SwimWithLegs();  // Uses legs to swim.
        flyBehaviour = new CannotFly();      // Decoy ducks cannot fly.
    }
}
