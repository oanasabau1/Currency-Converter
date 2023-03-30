import java.awt.* ;
import javax.swing.*;

public class ConverterView {
    //creating and designing the GUI
    ConverterModel model;
    JFrame frame;
    JPanel panel, convertPanel, convertedPanel, calculate, p1, p2;
    JLabel message, result, amount, initialValue, finalValue;
    JButton convert;
    JComboBox toConvert, toBeConverted;
    JTextField initialSum, finalResult;

    ConverterView(ConverterModel model) {
        this.model = model;

        frame = new JFrame("Currency Converter");
        frame.setBounds(500, 350, 600, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panel = new JPanel();
        panel.setLayout(new BorderLayout());
        convertPanel = new JPanel();
        convertedPanel = new JPanel();
        message = new JLabel("Currency Converter", JLabel.CENTER);
        message.setFont(new Font("Rockwell", Font.BOLD, 25));
        message.setSize(600, 200);
        toConvert = new JComboBox(model.money);
        toConvert.setFont(new Font("Rockwell", Font.BOLD, 12));
        toConvert.setBackground(Color.WHITE);
        toBeConverted = new JComboBox(model.money);
        toBeConverted.setFont(new Font("Rockwell", Font.BOLD, 12));
        toBeConverted.setBackground(Color.WHITE);
        convertPanel.add(toConvert);
        convertedPanel.add(toBeConverted);
        panel.add(message, BorderLayout.PAGE_START);
        panel.add(convertPanel, BorderLayout.LINE_START);
        panel.add(convertedPanel, BorderLayout.LINE_END);
        calculate = new JPanel();
        calculate.setLayout(new FlowLayout());
        p1 = new JPanel();
        amount = new JLabel("Amount");
        amount.setFont(new Font("Rockwell", Font.BOLD | Font.ITALIC, 12));
        initialSum = new JTextField(10);
        initialValue = new JLabel(" ");
        initialValue.setFont(new Font("Rockwell", Font.BOLD, 12));
        p1.add(amount);
        p1.add(initialSum);
        p1.add(initialValue);
        p2 = new JPanel();
        result = new JLabel("Result");
        result.setFont(new Font("Rockwell", Font.BOLD | Font.ITALIC, 12));
        finalResult = new JTextField(10);
        finalValue = new JLabel(" ");
        finalValue.setFont(new Font("Rockwell", Font.BOLD, 12));
        p2.add(result);
        p2.add(finalResult);
        p2.add(finalValue);
        convert = new JButton("Convert");
        convert.setFont(new Font("Rockwell", Font.BOLD, 12));
        calculate.add(p1);
        calculate.add(convert);
        calculate.add(p2);
        panel.add(calculate, BorderLayout.SOUTH);
        frame.add(panel);

        frame.setVisible(true);
    }
}