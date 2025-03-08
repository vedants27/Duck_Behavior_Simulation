//Duck.java

abstract public class Duck {
    QuackBehaviour quackBehaviour;
    SwimBehaviour swimBehaviour;
    FlyBehaviour flyBehaviour;

    // Setter method to change the swimming behavior dynamically at runtime.
    public void setSwimBehaviour(SwimBehaviour swimBehaviour) {
        this.swimBehaviour = swimBehaviour;
    }
    // Setter method to change the quacking behavior dynamically at runtime.
    public void setQuackBehaviour(QuackBehaviour quackBehaviour) {
        this.quackBehaviour = quackBehaviour;
    }
    // Setter method to change the flying behavior dynamically at runtime.
    public void setFlyBehaviour(FlyBehaviour flyBehaviour) {
        this.flyBehaviour = flyBehaviour;
    }
    // Abstract method to be implemented by subclasses to define duck appearance.
    abstract public void display();

   // Method to execute the assigned quack behavior.
    public void performQuack(){
        quackBehaviour.quack();
    }
    // Method to execute the assigned swim behavior.
    public void performSwim(){
        swimBehaviour.swim();
    }
    // Method to execute the assigned fly behavior.
    public void performFly(){
        flyBehaviour.fly();
    }
}
