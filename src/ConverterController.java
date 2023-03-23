import javax.swing.*;
import java.awt.event.*;

public class ConverterController implements ActionListener {
    ConverterModel model;
    ConverterView view;

    public ConverterController(ConverterModel model, ConverterView view) {
        this.model=model;
        this.view = view;
    }

     view.convert.addActionListener(this);
        view.valoareDeconvertedPanel.addItemListener(new java.awt.event.ItemListener() {
        public void itemStateChanged(ItemEvent evt) {
            primaSelectie(evt);
        }
    });
        view.valoareconvertedPanela.addItemListener(new java.awt.event.ItemListener() {
        public void itemStateChanged(ItemEvent evt) {
            aDouaSelectie(evt);
        }
    });

    public void primaSelectie(ItemEvent e) {
        if (e.getStateChange() == ItemEvent.SELECTED) {
            if (e.getSource() == valoareDeconvertedPanel) {
                int pozitie = valoareDeconvertedPanel.getSelectedIndex();
                if (pozitie != 0) {
                    view.message.setText("1 " + model.money[pozitie].substring(0, 3) + " =");
                    view.initialValue.setText(model.money[pozitie].substring(0, 3));
                } else {
                    view.message.setText("Convertor Valutar");
                    view.initialValue.setText(" ");
                }
            }
        }
    }

    public void aDouaSelectie(ItemEvent e) {
        int pozitie = valoareconvertedPanela.getSelectedIndex();
        double valoare=-1.0;
        //folosind instructiunea switch, determinam intre care unitati moentare se face convertirea si alegem valoarea


    if (valoareDeconvertedPanel.getSelectedIndex() == 0  || pozitie==0) {  //daca nu este selectata nicio unitate, adica ne aflam pe "Selecteaza unitatea monetara..."
        initialValue.setText(" ");
        finalValue.setText(" ");
        message.setText("Convertor Valutar");
    } else {
        view.message.setText("1 " + money[valoareDeconvertedPanel.getSelectedIndex()].substring(0, 3) + " = " + valoare + " " + model.money[pozitie].substring(0, 3));
        finalValue.setText(money[pozitie].substring(0, 3));
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == view.convert) {
            if (view.valoareDeconvertedPanel.getSelectedIndex() == 0 || view.valoareconvertedPanela.getSelectedIndex() == 0) {
                JOptionPane.showMessageDialog(null, "Invalid Input", "Getting Error", JOptionPane.ERROR_MESSAGE);

            } else { //calcularea resultului

}


}