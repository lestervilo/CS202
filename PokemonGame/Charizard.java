public class Charizard extends Charmeleon {
    public Charizard(int id) {
        super(id); // Calls Charmeleon's constructor (which calls Charmander's constructor and ultimately Pokemon's constructor)
        setImage("charizard.png"); // Overwrites the image with Charizard
    }
}
