//Name: Vedant Shitole
//PRN: 23070126143
//Batch: AIML B3

//Main.java
public class Main {
    public static void main(String[] args) {
         // Creating an instance of RedHeadDuck and displaying its behavior
        RedHeadDuck rd = new RedHeadDuck();
        System.out.println("------------------");
        rd.display();
        rd.performQuack();
        rd.performSwim();
        rd.performFly();
        System.out.println("-----------------------");

        // Creating an instance of RubberDuck and displaying its behavior
        RubberDuck rb = new RubberDuck();
        System.out.println("------------------");
        rb.display();
        rb.performQuack();
        rb.performSwim();
        rb.performFly();
        System.out.println("-----------------------");

        // Creating an instance of MallardDuck and displaying its behavior
        MallardDuck md = new MallardDuck();
        System.out.println("------------------");
        md.display();
        md.performQuack();
        md.performSwim();
        md.performFly();
        System.out.println("-----------------------");

        
    }
}
