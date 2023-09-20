package methods.encapsulation;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NewtonsLaw extends JFrame {
    private JPanel mainPanel;
    private JButton getForceButton;
    private JTextField textField1;
    private JTextField textField2;
    private JLabel result;

    public NewtonsLaw() {
    setContentPane(mainPanel);
    setTitle("Force Calc");
    setSize(400,400);
    getRootPane().setDefaultButton(getForceButton);
    setVisible(true);
        Method1 m1 = new Method1();
    getForceButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            double mass =Double.parseDouble(textField1.getText()) ;
            double acc = Double.parseDouble(textField2.getText());

            result.setText("the result is "+m1.getforce(mass,acc)+" N");
        }
    });
}

    public static void main(String[] args) {
        NewtonsLaw nl= new NewtonsLaw();
        Method1 m1 = new Method1();

    }
}
