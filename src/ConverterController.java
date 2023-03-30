import javax.swing.*;
import java.awt.event.*;

public class ConverterController implements ActionListener, ItemListener {
    ConverterModel model;
    ConverterView view;

    public ConverterController(ConverterModel model, ConverterView view) {
        this.model = model;
        this.view=view;

        //Register listeners
        view.convert.addActionListener(this);
        view.toConvert.addItemListener(this);
        view.toBeConverted.addItemListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == view.convert) {
            String fromCurrency = (String) view.toConvert.getSelectedItem();
            String toCurrency = (String) view.toBeConverted.getSelectedItem();
            String input = view.initialSum.getText();
            if (input.isEmpty()) {
                JOptionPane.showMessageDialog(view.frame, "No input. Please enter a value and select the units for conversion.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            double amount;
            try {
                amount = Double.parseDouble(input);
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(view.frame, "Please enter a valid number", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            double result = model.convertCurrency(amount, fromCurrency, toCurrency);
            view.finalResult.setText(String.format("%f", result));
        }
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        if (e.getStateChange() == ItemEvent.SELECTED) {
            String fromCurrency = (String) view.toConvert.getSelectedItem();
            String toCurrency = (String) view.toBeConverted.getSelectedItem();
            if (fromCurrency.equals("Please choose a currency unit...") || toCurrency.equals("Please choose a currency unit...")) { //do nothing
                view.message.setText("Currency Converter");
            }
            else {
                //set the labels according the selections made
                view.initialValue.setText(fromCurrency.substring(0, 3));
                view.finalValue.setText(toCurrency.substring(0, 3));
                view.message.setText("1 " + fromCurrency.substring(0, 3) + " = " + model.selectValueForConversion(fromCurrency, toCurrency) + " " + toCurrency.substring(0, 3));
            }
        }
    }
}
