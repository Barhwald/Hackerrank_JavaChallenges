public class Main {
    public static void main(String[] args) {

        Adder myAdder = new Adder();
        System.out.println("My superclass is: " +
                myAdder.getClass().getSuperclass().getName());
        System.out.println(myAdder.add(10,32) + " " + myAdder.add(10,3) +
                " " + myAdder.add(10,10));
    }
}
