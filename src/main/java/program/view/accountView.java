package program.view;

import java.awt.event.ActionListener;
import javax.swing.*;

public class accountView extends JFrame {
    private JLabel introductoryLabel = new JLabel("Generate iban");
    private JButton generationButton = new JButton("Generate!");
    private JTextField resultingIban = new JTextField(10);

    public accountView(){
        JPanel ibanPanel = new JPanel();

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600, 200);

        ibanPanel.add(introductoryLabel);
        ibanPanel.add(generationButton);
        ibanPanel.add(resultingIban);

        this.add(ibanPanel);
    }

    public String getResultingIban(){
        return resultingIban.getText();
    }

    public void setResultingIban(String generatedIban){
        resultingIban.setText(generatedIban);
    }

    public void addListener (ActionListener listenerForGeneration){
        generationButton.addActionListener(listenerForGeneration);
    }
}
