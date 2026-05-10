public class Pikachu extends Pichu {
    public Pikachu(int id) {
        super(id); // Calls Pichu's constructor (which calls Pokemon's constructor)
        setImage("pikachu.png"); // Overwrites the image with Pikachu
    }
}