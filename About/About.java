package About;

import javax.swing.JOptionPane;

public class About {
    
    void main(String[] args) {
        String aboutMessage = """
                This is a simple Java application that demonstrates the use of JOptionPane to display an "About" message.
                The application provides information about the developer and the purpose of the application.
                It serves as an example of how to create a user-friendly interface for displaying information in a Java application.
                """;
        JOptionPane.showMessageDialog(null, aboutMessage);
    }
}
