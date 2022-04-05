import java.util.ArrayList;


class Ninja {

// -- MEMBER VARIABLES ---
    private String name;
    private int health;

    //// NEW Member Variable: ////
    private Sword sword;
    // private ArrayList<Sword> listOfSwords; // null
    private ArrayList<Sword> listOfSwords = new ArrayList<Sword>(); //[]

// -- CONSTRUCTOR --
    public Ninja(String name){
        this.name = name;
        this.health = 100;
        // this.listOfSwords = new ArrayList<Sword>(); //[]
    }

// -- METHODS --
    public void displayStats(){
        System.out.println("Name: " + this.getName());
        System.out.println("Health:" + this.getHealth());
        // show the sword type and integrity
        System.out.println(this.getName() + " has a sword called " + this.getSword().getType());
        System.out.println(this.getSword().getType() + "'s integrity is: " + this.getSword().getIntegrity());
        
    }

    public void eatStrawberry(){
        // this.health += 10;
        this.setHealth(this.getHealth() + 10);
    }

    public void pickUpSword(Sword swordType) {
        // Add the code to give the ninja a sword
        this.setSword(swordType);
    }


    // --GETTERS & SETTERS--
    public int getHealth() {
        return this.health;
    }
    public void setHealth(int health) {
        this.health = health;
    }

    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }

    // sword member getters and setters
    // getter
    public Sword getSword() {
        return this.sword;
    }
    // setter
    public void setSword(Sword someSword) {
        this.sword = someSword;
    }

}