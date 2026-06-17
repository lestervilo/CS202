package Pokemon;

public class Pichu extends Pokemon {

    //this instruction is common to all 3 constructors.
    //super in a constructor must be the first instruction, so we cannot put it in all 3 constructors.
    //we can put it in an initializer block, which is executed before the constructor.

    {
        setPicture("pichu.png");
    }

    public Pichu() {
        super("Pichu", 35);
    }

    public Pichu(String n) {
        super(n, 35);
    }

    public Pichu(String n, int h) {
        super(n, h);
        setType(ELECTRIC);
    }

    @Override
    public String greeting() {
        return "Pichu! I am a Pichu and I have an electric tail!";
    }
}
