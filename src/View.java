import javax.swing.*;
import java.awt.*;

public class View {

    private JPanel rightPanel, bottomPanel;
    private JMenuBar mb;
    private JMenu menu1;
    private JMenuItem resetMenuitem;
    private JTextField amountInput, amountOutput;
    private JLabel jLabel1, jLabel2, informLabel;
    private JComboBox currencyComboBox;
    private JButton confirmButton, clearButton;
    private String[] currencies = {"EUR", "USD", "CHF",
            "GBP", "JPY"};



    public View(String title) {
        JFrame frame = new JFrame(title);
        mb = new JMenuBar();
        frame.setJMenuBar(mb);
        frame.getContentPane();
        frame.setSize(500, 500);
        addComponentsToPane(frame.getContentPane(), mb);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);

        // Display frame
        frame.pack();
        frame.setVisible(true);
    }

    //Creates and adds to pane UI elements
    public void addComponentsToPane( Container pane, JMenuBar mb) {

        menu1 = new JMenu("File");
        resetMenuitem = new JMenuItem("Reset");
        rightPanel = new JPanel();
        bottomPanel = new JPanel();
        jLabel1 = new JLabel(" = ");
        jLabel2 = new JLabel("PLN");
        informLabel = new JLabel(" ", SwingConstants.CENTER);
        amountInput = new JTextField(10);
        amountOutput = new JTextField(10);
        currencyComboBox = new JComboBox(currencies);
        confirmButton = new JButton("Confirm");
        clearButton = new JButton("Clear");

        amountOutput.setEditable(false);

        mb.add(menu1);
        menu1.add(resetMenuitem);

        rightPanel.add(jLabel1);
        rightPanel.add(amountOutput);
        rightPanel.add(jLabel2);

        bottomPanel.add(confirmButton);
        bottomPanel.add(clearButton);

        pane.add(informLabel, BorderLayout.PAGE_START);
        pane.add(amountInput, BorderLayout.LINE_START);
        pane.add(currencyComboBox, BorderLayout.CENTER);
        pane.add(rightPanel, BorderLayout.LINE_END);
        pane.add(bottomPanel, BorderLayout.PAGE_END);
    }

    public JTextField getAmountInput() {
        return amountInput;
    }

    public JTextField getAmountOutput() {
        return amountOutput;
    }

    public JComboBox getCurrencyComboBox() {
        return currencyComboBox;
    }

    public JButton getConfirmButton() {
        return confirmButton;
    }

    public JButton getClearButton() {
        return clearButton;
    }

    public JLabel getInformLabel() {
        return informLabel;
    }

    public JMenuItem getResetMenuitem() {
        return resetMenuitem;
    }
}
