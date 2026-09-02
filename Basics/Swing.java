import javax.swing.JOptionPane;

public class Swing {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Enter your name");
        System.out.println("You are " + name);
    }
}
