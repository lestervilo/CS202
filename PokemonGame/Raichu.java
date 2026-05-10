public class Raichu extends Pikachu {
    public Raichu(int id) {
        super(id); // Calls Pikachu's constructor (which calls Pichu's constructor and ultimately Pokemon's constructor)
        setImage("raichu.png"); // Overwrites the image with Raichu
    }
}
