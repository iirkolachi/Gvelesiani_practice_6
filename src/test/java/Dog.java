public class Dog extends Mammal {
    protected String breed;

    public Dog(String species, String diet, String breed) {
        super(species, diet);
        this.breed = breed;
    }
    public void myDog () {
    System.out.println("My dog is of " + species + " species and he loves " + diet +
            ", as all other " + breed + "s.");
}
}