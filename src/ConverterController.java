import javax.swing.*;
import java.awt.event.*;

public class ConverterController implements ActionListener, ItemListener {
    ConverterModel model;
    ConverterView view;

    public ConverterController(ConverterModel model, ConverterView view) {
        this.model = model;
        this.view=view;

        // Add action listener for convert button
        view.convert.addActionListener(this);

        // Add item listeners for JComboBoxes
        view.toConvert.addItemListener(this);
        view.toBeConverted.addItemListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Check if convert button was clicked
        if (e.getSource() == view.convert) {
            // Get selected currencies from JComboBoxes
            String fromCurrency = (String) view.toConvert.getSelectedItem();
            String toCurrency = (String) view.toBeConverted.getSelectedItem();

            // Validate input
            String input = view.initialSum.getText();
            if (input.isEmpty()) {
                JOptionPane.showMessageDialog(view.frame, "Please enter a valid input", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            // Convert input to double
            double amount;
            try {
                amount = Double.parseDouble(input);
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(view.frame, "Please enter a valid number", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            // Convert currency and update final result text field
            double result = model.convertCurrency(amount, fromCurrency, toCurrency);
            view.finalResult.setText(String.format("%.2f", result));
        }
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        if (e.getStateChange() == ItemEvent.SELECTED) {
            // Get selected currencies from JComboBoxes
            String fromCurrency = (String) view.toConvert.getSelectedItem();
            String toCurrency = (String) view.toBeConverted.getSelectedItem();

            // Update initial value label and message label based on selected currencies
            view.initialValue.setText(fromCurrency);
            view.message.setText(String.format("1 %s = %s %s", fromCurrency, toCurrency));

        }
    }
}
