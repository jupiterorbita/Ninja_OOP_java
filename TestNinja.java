public class TestNinja {
    public static void main(String[] args) {

        System.out.printf("hello my name is %s, \n", "john");

        // instantiating objects
        Ninja kikomo = new Ninja("Kenshiro");
        Sword nagakiba = new Sword("Nagakiba"); 

        // System.out.println(nagakiba.getType() ); //?
        // System.out.println(nagakiba.getIntegrity() ); //?

        // kikomo.displayStats();
        kikomo.pickUpSword(nagakiba);
        // kikomo.eatStrawberry();
        kikomo.displayStats();
        
        
    }
}