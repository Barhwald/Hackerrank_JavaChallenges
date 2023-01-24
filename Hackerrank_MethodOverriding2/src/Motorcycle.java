public class Motorcycle extends Bike {

    String defineMe() {
        return "a cycle with an engine.";
    }
    Motorcycle() {
        System.out.println("Hello I am a motorcycle, I am " + defineMe());
        System.out.println("My ancestor is a cycle who is " + super.defineMe() );
    }
}
