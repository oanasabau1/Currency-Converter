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
                double sumIntrodusa = Double.parseDouble(sumInitiala.getText());
                double resultObtinut = 0.0;
                switch (valoareDeconvertedPanel.getSelectedItem().toString()) {
                    case "RON - Leul romanesc": {
                        switch (valoareconvertedPanela.getSelectedItem().toString()) {
                            case "RON - Leul romanesc":
                                resultObtinut = sumIntrodusa * RON_TO_RON;
                                break;
                            case "EUR - Euro":
                                resultObtinut = sumIntrodusa * RON_TO_EURO;
                                break;
                            case "USD - Dolarul american":
                                resultObtinut = sumIntrodusa * RON_TO_USD;
                                break;
                            case "CAD - Dolarul canadian":
                                resultObtinut = sumIntrodusa * RON_TO_CAD;
                                break;
                            case "CHF - Francul elvetian":
                                resultObtinut = sumIntrodusa * RON_TO_CHF;
                                break;
                            case "MDL - Leul moldovenesc":
                                resultObtinut = sumIntrodusa * RON_TO_MDL;
                                break;
                            case "GBP - Lira sterlina":
                                resultObtinut = sumIntrodusa * RON_TO_GBP;
                                break;
                            case "HUF - Forint":
                                resultObtinut = sumIntrodusa * RON_TO_HUF;
                                break;
                            default:
                                resultObtinut = sumIntrodusa = 0.0;
                        }
                    }
                    break;
                    case "EUR - Euro": {
                        switch (valoareconvertedPanela.getSelectedItem().toString()) {
                            case "RON - Leul romanesc":
                                resultObtinut = sumIntrodusa * EURO_TO_RON;
                                break;
                            case "EUR - Euro":
                                resultObtinut = sumIntrodusa * EURO_TO_EURO;
                                break;
                            case "USD - Dolarul american":
                                resultObtinut = sumIntrodusa * EURO_TO_USD;
                                break;
                            case "CAD - Dolarul canadian":
                                resultObtinut = sumIntrodusa * EURO_TO_CAD;
                                break;
                            case "CHF - Francul elvetian":
                                resultObtinut = sumIntrodusa * EURO_TO_CHF;
                                break;
                            case "MDL - Leul moldovenesc":
                                resultObtinut = sumIntrodusa * EURO_TO_MDL;
                                break;
                            case "GBP - Lira sterlina":
                                resultObtinut = sumIntrodusa * EURO_TO_GBP;
                                break;
                            case "HUF - Forint":
                                resultObtinut = sumIntrodusa * EURO_TO_HUF;
                                break;
                            default:
                                resultObtinut = sumIntrodusa = 0.0;
                        }
                    }
                    break;
                    case "USD - Dolarul american": {
                        switch (valoareconvertedPanela.getSelectedItem().toString()) {
                            case "RON - Leul romanesc":
                                resultObtinut = sumIntrodusa * USD_TO_RON;
                                break;
                            case "EUR - Euro":
                                resultObtinut = sumIntrodusa * USD_TO_EURO;
                                break;
                            case "USD - Dolarul american":
                                resultObtinut = sumIntrodusa * USD_TO_USD;
                                break;
                            case "CAD - Dolarul canadian":
                                resultObtinut = sumIntrodusa * USD_TO_CAD;
                                break;
                            case "CHF - Francul elvetian":
                                resultObtinut = sumIntrodusa * USD_TO_CHF;
                                break;
                            case "MDL - Leul moldovenesc":
                                resultObtinut = sumIntrodusa * USD_TO_MDL;
                                break;
                            case "GBP - Lira sterlina":
                                resultObtinut = sumIntrodusa * USD_TO_GBP;
                                break;
                            case "HUF - Forint":
                                resultObtinut = sumIntrodusa * USD_TO_HUF;
                                break;
                            default:
                                resultObtinut = sumIntrodusa = 0.0;
                        }
                    }
                    break;
                    case "CAD - Dolarul canadian": {
                        switch (valoareconvertedPanela.getSelectedItem().toString()) {
                            case "RON - Leul romanesc":
                                resultObtinut = sumIntrodusa * CAD_TO_RON;
                                break;
                            case "EUR - Euro":
                                resultObtinut = sumIntrodusa * CAD_TO_EURO;
                                break;
                            case "USD - Dolarul american":
                                resultObtinut = sumIntrodusa * CAD_TO_USD;
                                break;
                            case "CAD - Dolarul canadian":
                                resultObtinut = sumIntrodusa * CAD_TO_CAD;
                                break;
                            case "CHF - Francul elvetian":
                                resultObtinut = sumIntrodusa * CAD_TO_CHF;
                                break;
                            case "MDL - Leul moldovenesc":
                                resultObtinut = sumIntrodusa * CAD_TO_MDL;
                                break;
                            case "GBP - Lira sterlina":
                                resultObtinut = sumIntrodusa * CAD_TO_GBP;
                                break;
                            case "HUF - Forint":
                                resultObtinut = sumIntrodusa * CAD_TO_HUF;
                                break;
                            default:
                                resultObtinut = sumIntrodusa = 0.0;
                        }
                    }
                    break;
                    case "CHF - Francul elvetian": {
                        switch (valoareconvertedPanela.getSelectedItem().toString()) {
                            case "RON - Leul romanesc":
                                resultObtinut = sumIntrodusa * CHF_TO_RON;
                                break;
                            case "EUR - Euro":
                                resultObtinut = sumIntrodusa * CHF_TO_EURO;
                                break;
                            case "USD - Dolarul american":
                                resultObtinut = sumIntrodusa * CHF_TO_USD;
                                break;
                            case "CAD - Dolarul canadian":
                                resultObtinut = sumIntrodusa * CHF_TO_CAD;
                                break;
                            case "CHF - Francul elvetian":
                                resultObtinut = sumIntrodusa * CHF_TO_CHF;
                                break;
                            case "MDL - Leul moldovenesc":
                                resultObtinut = sumIntrodusa * CHF_TO_MDL;
                                break;
                            case "GBP - Lira sterlina":
                                resultObtinut = sumIntrodusa * CHF_TO_GBP;
                                break;
                            case "HUF - Forint":
                                resultObtinut = sumIntrodusa * CHF_TO_HUF;
                                break;
                            default:
                                resultObtinut = sumIntrodusa = 0.0;
                        }
                    }
                    break;
                    case "MDL - Leul Moldovenesc": {
                        switch (valoareconvertedPanela.getSelectedItem().toString()) {
                            case "RON - Leul romanesc":
                                resultObtinut = sumIntrodusa * MDL_TO_RON;
                                break;
                            case "EUR - Euro":
                                resultObtinut = sumIntrodusa * MDL_TO_EURO;
                                break;
                            case "USD - Dolarul american":
                                resultObtinut = sumIntrodusa * MDL_TO_USD;
                                break;
                            case "CAD - Dolarul canadian":
                                resultObtinut = sumIntrodusa * MDL_TO_CAD;
                                break;
                            case "CHF - Francul elvetian":
                                resultObtinut = sumIntrodusa * MDL_TO_CHF;
                                break;
                            case "MDL - Leul moldovenesc":
                                resultObtinut = sumIntrodusa * MDL_TO_MDL;
                                break;
                            case "GBP - Lira sterlina":
                                resultObtinut = sumIntrodusa * MDL_TO_GBP;
                                break;
                            case "HUF - Forint":
                                resultObtinut = sumIntrodusa * MDL_TO_HUF;
                                break;
                            default:
                                resultObtinut = sumIntrodusa = 0.0;
                        }
                    }
                    break;
                    case "GBP - Lira Sterlina": {
                        switch (valoareconvertedPanela.getSelectedItem().toString()) {
                            case "RON - Leul romanesc":
                                resultObtinut = sumIntrodusa * GBP_TO_RON;
                                break;
                            case "EUR - Euro":
                                resultObtinut = sumIntrodusa * GBP_TO_EURO;
                                break;
                            case "USD - Dolarul american":
                                resultObtinut = sumIntrodusa * GBP_TO_USD;
                                break;
                            case "CAD - Dolarul canadian":
                                resultObtinut = sumIntrodusa * GBP_TO_CAD;
                                break;
                            case "CHF - Francul elvetian":
                                resultObtinut = sumIntrodusa * GBP_TO_CHF;
                                break;
                            case "MDL - Leul moldovenesc":
                                resultObtinut = sumIntrodusa * GBP_TO_MDL;
                                break;
                            case "GBP - Lira sterlina":
                                resultObtinut = sumIntrodusa * GBP_TO_GBP;
                                break;
                            case "HUF - Forint":
                                resultObtinut = sumIntrodusa * GBP_TO_HUF;
                                break;
                            default:
                                resultObtinut = sumIntrodusa = 0.0;
                        }
                    }
                    break;
                    case "HUF - Forint": {
                        switch (valoareconvertedPanela.getSelectedItem().toString()) {
                            case "RON - Leul romanesc":
                                resultObtinut = sumIntrodusa * HUF_TO_RON;
                                break;
                            case "EUR - Euro":
                                resultObtinut = sumIntrodusa * HUF_TO_EURO;
                                break;
                            case "USD - Dolarul american":
                                resultObtinut = sumIntrodusa * HUF_TO_USD;
                                break;
                            case "CAD - Dolarul canadian":
                                resultObtinut = sumIntrodusa * HUF_TO_CAD;
                                break;
                            case "CHF - Francul elvetian":
                                resultObtinut = sumIntrodusa * HUF_TO_CHF;
                                break;
                            case "MDL - Leul moldovenesc":
                                resultObtinut = sumIntrodusa * HUF_TO_MDL;
                                break;
                            case "GBP - Lira sterlina":
                                resultObtinut = sumIntrodusa * HUF_TO_GBP;
                                break;
                            case "HUF - Forint":
                                resultObtinut = sumIntrodusa * HUF_TO_HUF;
                                break;
                            default:
                                resultObtinut = sumIntrodusa = 0.0;
                        }
                    }
                    break;
                    default:
                        resultObtinut = sumIntrodusa = 0.0;
                }
                resultFinal.setText(String.format("%.2f", resultObtinut));
            }
        }
    }
}


}