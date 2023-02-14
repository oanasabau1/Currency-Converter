import java.awt.* ;
import java.awt.event.*;
import javax.swing.*;

public class Converter implements ActionListener {
    //definesc aceste constante care reprezinta valorile monetare intre 2 unitati monetare
    public static final double RON_TO_RON = 1.00;
    public static final double RON_TO_EURO = 0.20;
    public static final double RON_TO_USD = 0.22;
    public static final double RON_TO_CAD = 0.29;
    public static final double RON_TO_CHF = 0.20;
    public static final double RON_TO_MDL = 4.09;
    public static final double RON_TO_GBP = 0.18;
    public static final double RON_TO_HUF = 79.06;

    public static final double EURO_TO_RON = 4.90;
    public static final double EURO_TO_EURO = 1.00;
    public static final double EURO_TO_USD = 1.07;
    public static final double EURO_TO_CAD = 1.43;
    public static final double EURO_TO_CHF = 0.99;
    public static final double EURO_TO_MDL = 20.05;
    public static final double EURO_TO_GBP = 0.89;
    public static final double EURO_TO_HUF = 387.43;

    public static final double USD_TO_RON = 4.59;
    public static final double USD_TO_EURO = 0.94;
    public static final double USD_TO_USD = 1.00;
    public static final double USD_TO_CAD = 1.34;
    public static final double USD_TO_CHF = 0.92;
    public static final double USD_TO_MDL = 18.78;
    public static final double USD_TO_GBP = 0.83;
    public static final double USD_TO_HUF = 362.96;

    public static final double CAD_TO_RON = 3.44;
    public static final double CAD_TO_EURO = 0.70;
    public static final double CAD_TO_USD = 0.75;
    public static final double CAD_TO_CAD = 1.00;
    public static final double CAD_TO_CHF = 0.69;
    public static final double CAD_TO_MDL = 14.06;
    public static final double CAD_TO_GBP = 0.62;
    public static final double CAD_TO_HUF = 271.60;

    public static final double CHF_TO_RON = 4.97;
    public static final double CHF_TO_EURO = 1.01;
    public static final double CHF_TO_USD = 1.08;
    public static final double CHF_TO_CAD = 1.45;
    public static final double CHF_TO_CHF = 1.00;
    public static final double CHF_TO_MDL = 20.32;
    public static final double CHF_TO_GBP = 0.90;
    public static final double CHF_TO_HUF = 392.75;

    public static final double MDL_TO_RON = 0.24;
    public static final double MDL_TO_EURO = 0.050;
    public static final double MDL_TO_USD = 0.053;
    public static final double MDL_TO_CAD = 0.071;
    public static final double MDL_TO_CHF = 0.049;
    public static final double MDL_TO_MDL = 1.00;
    public static final double MDL_TO_GBP = 0.044;
    public static final double MDL_TO_HUF = 19.33;

    public static final double GBP_TO_RON = 5.54;
    public static final double GBP_TO_EURO = 1.13;
    public static final double GBP_TO_USD = 1.21;
    public static final double GBP_TO_CAD = 1.61;
    public static final double GBP_TO_CHF = 1.11;
    public static final double GBP_TO_MDL = 22.65;
    public static final double GBP_TO_GBP = 1.00;
    public static final double GBP_TO_HUF = 437.64;

    public static final double HUF_TO_RON = 0.013;
    public static final double HUF_TO_EURO = 0.0026;
    public static final double HUF_TO_USD = 0.0028;
    public static final double HUF_TO_CAD = 0.0037;
    public static final double HUF_TO_CHF = 0.0025;
    public static final double HUF_TO_MDL = 0.052;
    public static final double HUF_TO_GBP = 0.0023;
    public static final double HUF_TO_HUF = 1.00;
    public static final String[] bani = {
            "Selecteaza unitate monetara...",
            "RON - Leul romanesc",
            "EUR - Euro",
            "USD - Dolarul american",
            "CAD - Dolarul canadian",
            "CHF - Francul elvetian",
            "MDL - Leul moldovenesc",
            "GBP - Lira sterlina",
            "HUF - Forint"
    };
    JFrame frame;
    JPanel panel, converteste, convertit, calculeaza, p1, p2;
    JLabel mesaj, rezultat, suma, valutaInitiala, valutaFinala;
    JButton convert;
    JComboBox valoareDeConvertit, valoareConvertita;
    JTextField sumaInitiala, rezultatFinal;

    Converter() {
        frame = new JFrame();
        frame.setTitle("Convertor Valutar");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(500, 350, 600, 300);
        panel = new JPanel();
        panel.setLayout(new BorderLayout());
        converteste = new JPanel();
        convertit = new JPanel();
        mesaj = new JLabel("Convertor Valutar", JLabel.CENTER);
        mesaj.setFont(new Font("Rockwell", Font.BOLD, 25));
        mesaj.setSize(600, 200);
        valoareDeConvertit = new JComboBox(bani);
        valoareDeConvertit.setFont(new Font("Rockwell", Font.BOLD, 12));
        valoareDeConvertit.setBackground(Color.WHITE);
        valoareConvertita = new JComboBox(bani);
        valoareConvertita.setFont(new Font("Rockwell", Font.BOLD, 12));
        valoareConvertita.setBackground(Color.WHITE);
        converteste.add(valoareDeConvertit);
        convertit.add(valoareConvertita);
        panel.add(mesaj, BorderLayout.PAGE_START);
        panel.add(converteste, BorderLayout.LINE_START);
        panel.add(convertit, BorderLayout.LINE_END);

        calculeaza = new JPanel();
        calculeaza.setLayout(new FlowLayout());

        p1 = new JPanel();
        suma = new JLabel("Suma");
        suma.setFont(new Font("Rockwell", Font.BOLD | Font.ITALIC, 12));
        sumaInitiala = new JTextField(10);
        valutaInitiala = new JLabel(" ");
        p1.add(suma);
        p1.add(sumaInitiala);
        p1.add(valutaInitiala);

        p2 = new JPanel();
        rezultat = new JLabel("Rezultat");
        rezultat.setFont(new Font("Rockwell", Font.BOLD | Font.ITALIC, 12));
        rezultatFinal = new JTextField(10);
        valutaFinala = new JLabel(" ");
        p2.add(rezultat);
        p2.add(rezultatFinal);
        p2.add(valutaFinala);
        convert = new JButton("Calculeaza");
        //adaugarea listenerilor
        convert.addActionListener(this);
        valoareDeConvertit.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(ItemEvent evt) {
                primaSelectie(evt);
            }
        });
        valoareConvertita.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(ItemEvent evt) {
                aDouaSelectie(evt);
            }
        });

        calculeaza.add(p1);
        calculeaza.add(convert);
        calculeaza.add(p2);
        panel.add(calculeaza, BorderLayout.SOUTH);
        frame.add(panel);

        frame.setVisible(true);
    }

    public void primaSelectie(ItemEvent e) {
        if (e.getStateChange() == ItemEvent.SELECTED) {
            if (e.getSource() == valoareDeConvertit) {
                int pozitie = valoareDeConvertit.getSelectedIndex();
                if (pozitie != 0) {
                    mesaj.setText("1 " + bani[pozitie].substring(0, 3) + " =");
                    valutaInitiala.setText(bani[pozitie].substring(0, 3));
                } else {
                    mesaj.setText("Convertor Valutar");
                    valutaInitiala.setText(" ");
                }
            }
        }
    }

    public void aDouaSelectie(ItemEvent e) {
        int pozitie = valoareConvertita.getSelectedIndex();
        double valoare=-1.0;
        //folosind instructiunea switch, determinam intre care unitati moentare se face convertirea si alegem valoarea
        switch (valoareDeConvertit.getSelectedItem().toString()) {
            case "RON - Leul romanesc": {
                switch (valoareConvertita.getSelectedItem().toString()) {
                    case "RON - Leul romanesc":
                        valoare = RON_TO_RON;
                        break;
                    case "EUR - Euro":
                        valoare = RON_TO_EURO;
                        break;
                    case "USD - Dolarul american":
                        valoare = RON_TO_USD;
                        break;
                    case "CAD - Dolarul canadian":
                        valoare = RON_TO_CAD;
                        break;
                    case "CHF - Francul elvetian":
                        valoare = RON_TO_CHF;
                        break;
                    case "MDL - Leul moldovenesc":
                        valoare = RON_TO_MDL;
                        break;
                    case "GBP - Lira sterlina":
                        valoare = RON_TO_GBP;
                        break;
                    case "HUF - Forint":
                        valoare = RON_TO_HUF;
                        break;
                    default:
                }
            }
            break;
            case "EUR - Euro": {
                switch (valoareConvertita.getSelectedItem().toString()) {
                    case "RON - Leul romanesc":
                        valoare = EURO_TO_RON;
                        break;
                    case "EUR - Euro":
                        valoare = EURO_TO_EURO;
                        break;
                    case "USD - Dolarul american":
                        valoare = EURO_TO_USD;
                        break;
                    case "CAD - Dolarul canadian":
                        valoare = EURO_TO_CAD;
                        break;
                    case "CHF - Francul elvetian":
                        valoare = EURO_TO_CHF;
                        break;
                    case "MDL - Leul moldovenesc":
                        valoare = EURO_TO_MDL;
                        break;
                    case "GBP - Lira sterlina":
                        valoare = EURO_TO_GBP;
                        break;
                    case "HUF - Forint":
                        valoare = EURO_TO_HUF;
                        break;
                    default:
                }
            }
            break;
            case "USD - Dolarul american": {
                switch (valoareConvertita.getSelectedItem().toString()) {
                    case "RON - Leul romanesc":
                        valoare = USD_TO_RON;
                        break;
                    case "EUR - Euro":
                        valoare = USD_TO_EURO;
                        break;
                    case "USD - Dolarul american":
                        valoare = USD_TO_USD;
                        break;
                    case "CAD - Dolarul canadian":
                        valoare = USD_TO_CAD;
                        break;
                    case "CHF - Francul elvetian":
                        valoare = USD_TO_CHF;
                        break;
                    case "MDL - Leul moldovenesc":
                        valoare = USD_TO_MDL;
                        break;
                    case "GBP - Lira sterlina":
                        valoare = USD_TO_GBP;
                        break;
                    case "HUF - Forint":
                        valoare = USD_TO_HUF;
                        break;
                    default:
                }
            }
            break;
            case "CAD - Dolarul canadian": {
                switch (valoareConvertita.getSelectedItem().toString()) {
                    case "RON - Leul romanesc":
                        valoare = CAD_TO_RON;
                        break;
                    case "EUR - Euro":
                        valoare = CAD_TO_EURO;
                        break;
                    case "USD - Dolarul american":
                        valoare = CAD_TO_USD;
                        break;
                    case "CAD - Dolarul canadian":
                        valoare = CAD_TO_CAD;
                        break;
                    case "CHF - Francul elvetian":
                        valoare = CAD_TO_CHF;
                        break;
                    case "MDL - Leul moldovenesc":
                        valoare = CAD_TO_MDL;
                        break;
                    case "GBP - Lira sterlina":
                        valoare = CAD_TO_GBP;
                        break;
                    case "HUF - Forint":
                        valoare = CAD_TO_HUF;
                        break;
                    default:
                }
            }
            break;
            case "CHF - Francul elvetian": {
                switch (valoareConvertita.getSelectedItem().toString()) {
                    case "RON - Leul romanesc":
                        valoare = CHF_TO_RON;
                        break;
                    case "EUR - Euro":
                        valoare = CHF_TO_EURO;
                        break;
                    case "USD - Dolarul american":
                        valoare = CHF_TO_USD;
                        break;
                    case "CAD - Dolarul canadian":
                        valoare = CHF_TO_CAD;
                        break;
                    case "CHF - Francul elvetian":
                        valoare = CHF_TO_CHF;
                        break;
                    case "MDL - Leul moldovenesc":
                        valoare = CHF_TO_MDL;
                        break;
                    case "GBP - Lira sterlina":
                        valoare = CHF_TO_GBP;
                        break;
                    case "HUF - Forint":
                        valoare = CHF_TO_HUF;
                        break;
                    default:
                }
            }
            break;
            case "MDL - Leul Moldovenesc": {
                switch (valoareConvertita.getSelectedItem().toString()) {
                    case "RON - Leul romanesc":
                        valoare = MDL_TO_RON;
                        break;
                    case "EUR - Euro":
                        valoare = MDL_TO_EURO;
                        break;
                    case "USD - Dolarul american":
                        valoare = MDL_TO_USD;
                        break;
                    case "CAD - Dolarul canadian":
                        valoare = MDL_TO_CAD;
                        break;
                    case "CHF - Francul elvetian":
                        valoare = MDL_TO_CHF;
                        break;
                    case "MDL - Leul moldovenesc":
                        valoare = MDL_TO_MDL;
                        break;
                    case "GBP - Lira sterlina":
                        valoare = MDL_TO_GBP;
                        break;
                    case "HUF - Forint":
                        valoare = MDL_TO_HUF;
                        break;
                    default:
                }
            }
            break;
            case "GBP - Lira Sterlina": {
                switch (valoareConvertita.getSelectedItem().toString()) {
                    case "RON - Leul romanesc":
                        valoare = GBP_TO_RON;
                        break;
                    case "EUR - Euro":
                        valoare = GBP_TO_EURO;
                        break;
                    case "USD - Dolarul american":
                        valoare = GBP_TO_USD;
                        break;
                    case "CAD - Dolarul canadian":
                        valoare = GBP_TO_CAD;
                        break;
                    case "CHF - Francul elvetian":
                        valoare = GBP_TO_CHF;
                        break;
                    case "MDL - Leul moldovenesc":
                        valoare = GBP_TO_MDL;
                        break;
                    case "GBP - Lira sterlina":
                        valoare = GBP_TO_GBP;
                        break;
                    case "HUF - Forint":
                        valoare = GBP_TO_HUF;
                        break;
                    default:
                }
            }
            break;
            case "HUF - Forint": {
                switch (valoareConvertita.getSelectedItem().toString()) {
                    case "RON - Leul romanesc":
                        valoare = HUF_TO_RON;
                        break;
                    case "EUR - Euro":
                        valoare = HUF_TO_EURO;
                        break;
                    case "USD - Dolarul american":
                        valoare = HUF_TO_USD;
                        break;
                    case "CAD - Dolarul canadian":
                        valoare = HUF_TO_CAD;
                        break;
                    case "CHF - Francul elvetian":
                        valoare = HUF_TO_CHF;
                        break;
                    case "MDL - Leul moldovenesc":
                        valoare = HUF_TO_MDL;
                        break;
                    case "GBP - Lira sterlina":
                        valoare = HUF_TO_GBP;
                        break;
                    case "HUF - Forint":
                        valoare = HUF_TO_HUF;
                        break;
                    default:
                }
            }
            break;
            default:
                mesaj.setText("Convertor Valutar");
                valoare=0.0;
        }
        if (valoareDeConvertit.getSelectedIndex() == 0  || pozitie==0) {  //daca nu este selectata nicio unitate, adica ne aflam pe "Selecteaza unitatea monetara..."
            valutaInitiala.setText(" ");
            valutaFinala.setText(" ");
            mesaj.setText("Convertor Valutar");
        } else {
            mesaj.setText("1 " + bani[valoareDeConvertit.getSelectedIndex()].substring(0, 3) + " = " + valoare + " " + bani[pozitie].substring(0, 3));
            valutaFinala.setText(bani[pozitie].substring(0, 3));
        }
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == convert) {
            if (valoareDeConvertit.getSelectedIndex() == 0 || valoareConvertita.getSelectedIndex() == 0) {
                JOptionPane.showMessageDialog(null, "Invalid Input", "Getting Error", JOptionPane.ERROR_MESSAGE);

            } else { //calcularea rezultatului
                double sumaIntrodusa = Double.parseDouble(sumaInitiala.getText());
                double rezultatObtinut = 0.0;
                switch (valoareDeConvertit.getSelectedItem().toString()) {
                    case "RON - Leul romanesc": {
                        switch (valoareConvertita.getSelectedItem().toString()) {
                            case "RON - Leul romanesc":
                                rezultatObtinut = sumaIntrodusa * RON_TO_RON;
                                break;
                            case "EUR - Euro":
                                rezultatObtinut = sumaIntrodusa * RON_TO_EURO;
                                break;
                            case "USD - Dolarul american":
                                rezultatObtinut = sumaIntrodusa * RON_TO_USD;
                                break;
                            case "CAD - Dolarul canadian":
                                rezultatObtinut = sumaIntrodusa * RON_TO_CAD;
                                break;
                            case "CHF - Francul elvetian":
                                rezultatObtinut = sumaIntrodusa * RON_TO_CHF;
                                break;
                            case "MDL - Leul moldovenesc":
                                rezultatObtinut = sumaIntrodusa * RON_TO_MDL;
                                break;
                            case "GBP - Lira sterlina":
                                rezultatObtinut = sumaIntrodusa * RON_TO_GBP;
                                break;
                            case "HUF - Forint":
                                rezultatObtinut = sumaIntrodusa * RON_TO_HUF;
                                break;
                            default:
                                rezultatObtinut = sumaIntrodusa = 0.0;
                        }
                    }
                    break;
                    case "EUR - Euro": {
                        switch (valoareConvertita.getSelectedItem().toString()) {
                            case "RON - Leul romanesc":
                                rezultatObtinut = sumaIntrodusa * EURO_TO_RON;
                                break;
                            case "EUR - Euro":
                                rezultatObtinut = sumaIntrodusa * EURO_TO_EURO;
                                break;
                            case "USD - Dolarul american":
                                rezultatObtinut = sumaIntrodusa * EURO_TO_USD;
                                break;
                            case "CAD - Dolarul canadian":
                                rezultatObtinut = sumaIntrodusa * EURO_TO_CAD;
                                break;
                            case "CHF - Francul elvetian":
                                rezultatObtinut = sumaIntrodusa * EURO_TO_CHF;
                                break;
                            case "MDL - Leul moldovenesc":
                                rezultatObtinut = sumaIntrodusa * EURO_TO_MDL;
                                break;
                            case "GBP - Lira sterlina":
                                rezultatObtinut = sumaIntrodusa * EURO_TO_GBP;
                                break;
                            case "HUF - Forint":
                                rezultatObtinut = sumaIntrodusa * EURO_TO_HUF;
                                break;
                            default:
                                rezultatObtinut = sumaIntrodusa = 0.0;
                        }
                    }
                    break;
                    case "USD - Dolarul american": {
                        switch (valoareConvertita.getSelectedItem().toString()) {
                            case "RON - Leul romanesc":
                                rezultatObtinut = sumaIntrodusa * USD_TO_RON;
                                break;
                            case "EUR - Euro":
                                rezultatObtinut = sumaIntrodusa * USD_TO_EURO;
                                break;
                            case "USD - Dolarul american":
                                rezultatObtinut = sumaIntrodusa * USD_TO_USD;
                                break;
                            case "CAD - Dolarul canadian":
                                rezultatObtinut = sumaIntrodusa * USD_TO_CAD;
                                break;
                            case "CHF - Francul elvetian":
                                rezultatObtinut = sumaIntrodusa * USD_TO_CHF;
                                break;
                            case "MDL - Leul moldovenesc":
                                rezultatObtinut = sumaIntrodusa * USD_TO_MDL;
                                break;
                            case "GBP - Lira sterlina":
                                rezultatObtinut = sumaIntrodusa * USD_TO_GBP;
                                break;
                            case "HUF - Forint":
                                rezultatObtinut = sumaIntrodusa * USD_TO_HUF;
                                break;
                            default:
                                rezultatObtinut = sumaIntrodusa = 0.0;
                        }
                    }
                    break;
                    case "CAD - Dolarul canadian": {
                        switch (valoareConvertita.getSelectedItem().toString()) {
                            case "RON - Leul romanesc":
                                rezultatObtinut = sumaIntrodusa * CAD_TO_RON;
                                break;
                            case "EUR - Euro":
                                rezultatObtinut = sumaIntrodusa * CAD_TO_EURO;
                                break;
                            case "USD - Dolarul american":
                                rezultatObtinut = sumaIntrodusa * CAD_TO_USD;
                                break;
                            case "CAD - Dolarul canadian":
                                rezultatObtinut = sumaIntrodusa * CAD_TO_CAD;
                                break;
                            case "CHF - Francul elvetian":
                                rezultatObtinut = sumaIntrodusa * CAD_TO_CHF;
                                break;
                            case "MDL - Leul moldovenesc":
                                rezultatObtinut = sumaIntrodusa * CAD_TO_MDL;
                                break;
                            case "GBP - Lira sterlina":
                                rezultatObtinut = sumaIntrodusa * CAD_TO_GBP;
                                break;
                            case "HUF - Forint":
                                rezultatObtinut = sumaIntrodusa * CAD_TO_HUF;
                                break;
                            default:
                                rezultatObtinut = sumaIntrodusa = 0.0;
                        }
                    }
                    break;
                    case "CHF - Francul elvetian": {
                        switch (valoareConvertita.getSelectedItem().toString()) {
                            case "RON - Leul romanesc":
                                rezultatObtinut = sumaIntrodusa * CHF_TO_RON;
                                break;
                            case "EUR - Euro":
                                rezultatObtinut = sumaIntrodusa * CHF_TO_EURO;
                                break;
                            case "USD - Dolarul american":
                                rezultatObtinut = sumaIntrodusa * CHF_TO_USD;
                                break;
                            case "CAD - Dolarul canadian":
                                rezultatObtinut = sumaIntrodusa * CHF_TO_CAD;
                                break;
                            case "CHF - Francul elvetian":
                                rezultatObtinut = sumaIntrodusa * CHF_TO_CHF;
                                break;
                            case "MDL - Leul moldovenesc":
                                rezultatObtinut = sumaIntrodusa * CHF_TO_MDL;
                                break;
                            case "GBP - Lira sterlina":
                                rezultatObtinut = sumaIntrodusa * CHF_TO_GBP;
                                break;
                            case "HUF - Forint":
                                rezultatObtinut = sumaIntrodusa * CHF_TO_HUF;
                                break;
                            default:
                                rezultatObtinut = sumaIntrodusa = 0.0;
                        }
                    }
                    break;
                    case "MDL - Leul Moldovenesc": {
                        switch (valoareConvertita.getSelectedItem().toString()) {
                            case "RON - Leul romanesc":
                                rezultatObtinut = sumaIntrodusa * MDL_TO_RON;
                                break;
                            case "EUR - Euro":
                                rezultatObtinut = sumaIntrodusa * MDL_TO_EURO;
                                break;
                            case "USD - Dolarul american":
                                rezultatObtinut = sumaIntrodusa * MDL_TO_USD;
                                break;
                            case "CAD - Dolarul canadian":
                                rezultatObtinut = sumaIntrodusa * MDL_TO_CAD;
                                break;
                            case "CHF - Francul elvetian":
                                rezultatObtinut = sumaIntrodusa * MDL_TO_CHF;
                                break;
                            case "MDL - Leul moldovenesc":
                                rezultatObtinut = sumaIntrodusa * MDL_TO_MDL;
                                break;
                            case "GBP - Lira sterlina":
                                rezultatObtinut = sumaIntrodusa * MDL_TO_GBP;
                                break;
                            case "HUF - Forint":
                                rezultatObtinut = sumaIntrodusa * MDL_TO_HUF;
                                break;
                            default:
                                rezultatObtinut = sumaIntrodusa = 0.0;
                        }
                    }
                    break;
                    case "GBP - Lira Sterlina": {
                        switch (valoareConvertita.getSelectedItem().toString()) {
                            case "RON - Leul romanesc":
                                rezultatObtinut = sumaIntrodusa * GBP_TO_RON;
                                break;
                            case "EUR - Euro":
                                rezultatObtinut = sumaIntrodusa * GBP_TO_EURO;
                                break;
                            case "USD - Dolarul american":
                                rezultatObtinut = sumaIntrodusa * GBP_TO_USD;
                                break;
                            case "CAD - Dolarul canadian":
                                rezultatObtinut = sumaIntrodusa * GBP_TO_CAD;
                                break;
                            case "CHF - Francul elvetian":
                                rezultatObtinut = sumaIntrodusa * GBP_TO_CHF;
                                break;
                            case "MDL - Leul moldovenesc":
                                rezultatObtinut = sumaIntrodusa * GBP_TO_MDL;
                                break;
                            case "GBP - Lira sterlina":
                                rezultatObtinut = sumaIntrodusa * GBP_TO_GBP;
                                break;
                            case "HUF - Forint":
                                rezultatObtinut = sumaIntrodusa * GBP_TO_HUF;
                                break;
                            default:
                                rezultatObtinut = sumaIntrodusa = 0.0;
                        }
                    }
                    break;
                    case "HUF - Forint": {
                        switch (valoareConvertita.getSelectedItem().toString()) {
                            case "RON - Leul romanesc":
                                rezultatObtinut = sumaIntrodusa * HUF_TO_RON;
                                break;
                            case "EUR - Euro":
                                rezultatObtinut = sumaIntrodusa * HUF_TO_EURO;
                                break;
                            case "USD - Dolarul american":
                                rezultatObtinut = sumaIntrodusa * HUF_TO_USD;
                                break;
                            case "CAD - Dolarul canadian":
                                rezultatObtinut = sumaIntrodusa * HUF_TO_CAD;
                                break;
                            case "CHF - Francul elvetian":
                                rezultatObtinut = sumaIntrodusa * HUF_TO_CHF;
                                break;
                            case "MDL - Leul moldovenesc":
                                rezultatObtinut = sumaIntrodusa * HUF_TO_MDL;
                                break;
                            case "GBP - Lira sterlina":
                                rezultatObtinut = sumaIntrodusa * HUF_TO_GBP;
                                break;
                            case "HUF - Forint":
                                rezultatObtinut = sumaIntrodusa * HUF_TO_HUF;
                                break;
                            default:
                                rezultatObtinut = sumaIntrodusa = 0.0;
                        }
                    }
                    break;
                    default:
                        rezultatObtinut = sumaIntrodusa = 0.0;
                }
                rezultatFinal.setText(String.format("%.2f", rezultatObtinut));
            }
        }
    }
}






