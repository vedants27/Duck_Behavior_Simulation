//RedHeadDuck.java
public class RedHeadDuck extends Duck{
  public RedHeadDuck() {
    quackBehaviour = new Squeak();
    swimBehaviour = new SwimWithLegs();
    flyBehaviour = new CanFly();
  }
  public void display() {
        System.out.println("I am a red head duck duck!!");
    }
}
