//RedHeadDuck.java
public class RedHeadDuck extends Duck{
  public RedHeadDuck() {
    quackBehaviour = new Squeak();
    swimBehaviour = new SwimWithLegs();
    flyBehaviour = new CanFly();
  }
}
