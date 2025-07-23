import javax.swing.JOptionPane;

public class Devin_Knight_Assignment3_Part1 {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog(null, "Enter a number:");
        double number = Double.parseDouble(input);
        double squareRoot = Math.sqrt(number);
        JOptionPane.showMessageDialog(null, "The square root of " + number + " is " + squareRoot);
    }
}