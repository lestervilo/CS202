package Pokemon;

public class Bulbasaur extends Pokemon {
    public Bulbasaur(String n) {
        super(n, 45);
        setPicture("bulbasaur.png");
    }

    @Override
    public String greeting() {
        return "Bulbasaur!";
    }
}
