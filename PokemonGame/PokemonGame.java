import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Random;

public class PokemonGame extends JPanel implements KeyListener {

    // Polymorphism: This list can hold ANY subclass of Pokemon
    private ArrayList<Pokemon> roster;

    public PokemonGame() {
        roster = new ArrayList<>();
        spawnPokemon();

        // Setup for the KeyListener
        setFocusable(true);
        addKeyListener(this);
    }

    private void spawnPokemon() {
        roster.clear(); // Clear out any leftovers
        Random rand = new Random();

        // Spawn 9 Pokemon, giving them IDs 1 through 9
        for (int i = 1; i <= 9; i++) {
            int type = rand.nextInt(6); // Random number 0-5
            
            // Instantiate a random subclass based on the number
            switch (type) {
                case 0: roster.add(new Pichu(i)); break;
                case 1: roster.add(new Pikachu(i)); break;
                case 2: roster.add(new Raichu(i)); break;
                case 3: roster.add(new Charmander(i)); break;
                case 4: roster.add(new Charmeleon(i)); break;
                case 5: roster.add(new Charizard(i)); break;
            }
        }
    }

    // This method is called automatically to draw our panel
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); // Clears the screen
        
        // Loop through all Pokemon and tell them to draw themselves
        for (Pokemon p : roster) {
            p.draw(g);
        }
    }

    // --- KeyListener Methods ---
    
    @Override
    public void keyTyped(KeyEvent e) {
        char keyChar = e.getKeyChar();
        
        // Only process if they typed a number between 1 and 9
        if (Character.isDigit(keyChar)) {
            // Convert the character (like '3') to the integer 3
            int targetId = Character.getNumericValue(keyChar);
            
            // Loop backwards through the ArrayList to safely remove items
            for (int i = roster.size() - 1; i >= 0; i--) {
                if (roster.get(i).getId() == targetId) {
                    roster.remove(i);
                }
            }
            
            // Check if we need to reset the game
            if (roster.isEmpty()) {
                spawnPokemon();
            }
            
            // Force the screen to redraw itself to reflect the changes
            repaint();
        }
    }

    // We must include these two methods to satisfy the KeyListener interface, 
    // even if we don't use them.
    @Override
    public void keyPressed(KeyEvent e) {}

    @Override
    public void keyReleased(KeyEvent e) {}

    // --- Main Method ---
    public static void main(String[] args) {
        // Create the window
        JFrame frame = new JFrame("Pokemon Catcher");
        PokemonGame gamePanel = new PokemonGame();

        frame.add(gamePanel);
        frame.setSize(1000, 1000); // 1000x1000 as requested
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}