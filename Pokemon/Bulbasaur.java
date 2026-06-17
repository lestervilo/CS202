package Pokemon;

public class Bulbasaur extends Pokemon {
    public Bulbasaur(String n) {
        super(n, 45);
        setPicture("bulbasaur.png");
        setType(GRASS);
    }

    @Override
    public String greeting() {
        return "Bulbasaur! I am a Bulbasaur and I have a plant bulb on my back!";
    }
}
