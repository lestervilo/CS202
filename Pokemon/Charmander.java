package Pokemon;

public class Charmander extends Pokemon {
    public Charmander(String n) {
        super(n, 39);
        setPicture("charmander.png");
    }

    @Override
    public String greeting() {
        return "Charmander! I got a flaming tail!";
    }
}