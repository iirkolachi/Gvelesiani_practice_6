package Task2;

public class Mammal extends Animal {
    protected String diet;

    public Mammal(String species, String diet) {
        super(species);
        this.diet = diet;
    }

}
