public class Charmeleon extends Charmander {
    public Charmeleon(int id) {
        super(id); // Calls Charmander's constructor (which calls Pokemon's constructor)
        setImage("charmeleon.png"); // Overwrites the image with Charmeleon
    }
}
