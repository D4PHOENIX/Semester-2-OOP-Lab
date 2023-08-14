import javax.swing.*;

public class Calculator {
    private JPanel Calculator;
    private JButton btn0;
    private JButton btnDec;
    private JButton btn4;
    private JButton btn5;
    private JButton btn6;
    private JButton btn3;
    private JButton btn2;
    private JButton btn1;
    private JButton btnAdd;
    private JButton btnSub;
    private JButton btnEnter;
    private JButton btnMult;
    private JButton btnDiv;
    private JButton btn7;
    private JButton btn8;
    private JButton btn9;
    private JTextField textField1;
    private JLabel calcLabel;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculator");
        frame.setContentPane(new Calculator().Calculator);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
