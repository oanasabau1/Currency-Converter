public class ConverterModel {
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
    public static final String[] money = {
            "Please choose a currency unit...",
            "RON - Romanian leu",
            "EUR - Euro",
            "USD - U.S. dollar",
            "CAD - Canadian dollar",
            "CHF - Swiss franc",
            "MDL - Moldavian leu",
            "GBP - British Pound Sterling",
            "HUF - Hungarian forint"
    };
    
    public double selectValueForConversion (String valueToConvert, String valueToBeConverted) {
        double value=0.0;
    switch (valueToConvert) {
        case "RON - Romanian leu": {
            switch (valueToBeConverted) {
                case "RON - Romanian leu":
                    value = RON_TO_RON;
                    break;
                case "EUR - Euro":
                    value = RON_TO_EURO;
                    break;
                case "USD - U.S. dollar":
                    value = RON_TO_USD;
                    break;
                case "CAD - Canadian dollar":
                    value = RON_TO_CAD;
                    break;
                case "CHF - Swiss franc":
                    value = RON_TO_CHF;
                    break;
                case "MDL - Leul moldovenesc":
                    value = RON_TO_MDL;
                    break;
                case "GBP - British Pound Sterling":
                    value = RON_TO_GBP;
                    break;
                case "HUF - Hungarian forint":
                    value = RON_TO_HUF;
                    break;
                default:
            }
        }
        break;
        case "EUR - Euro": {
            switch (valueToBeConverted) {
                case "RON - Romanian leu":
                    value = EURO_TO_RON;
                    break;
                case "EUR - Euro":
                    value = EURO_TO_EURO;
                    break;
                case "USD - U.S. dollar":
                    value = EURO_TO_USD;
                    break;
                case "CAD - Canadian dollar":
                    value = EURO_TO_CAD;
                    break;
                case "CHF - Swiss franc":
                    value = EURO_TO_CHF;
                    break;
                case "MDL - Leul moldovenesc":
                    value = EURO_TO_MDL;
                    break;
                case "GBP - British Pound Sterling":
                    value = EURO_TO_GBP;
                    break;
                case "HUF - Hungarian forint":
                    value = EURO_TO_HUF;
                    break;
                default:
            }
        }
        break;
        case "USD - U.S. dollar": {
            switch (valueToBeConverted) {
                case "RON - Romanian leu":
                    value = USD_TO_RON;
                    break;
                case "EUR - Euro":
                    value = USD_TO_EURO;
                    break;
                case "USD - U.S. dollar":
                    value = USD_TO_USD;
                    break;
                case "CAD - Canadian dollar":
                    value = USD_TO_CAD;
                    break;
                case "CHF - Swiss franc":
                    value = USD_TO_CHF;
                    break;
                case "MDL - Leul moldovenesc":
                    value = USD_TO_MDL;
                    break;
                case "GBP - British Pound Sterling":
                    value = USD_TO_GBP;
                    break;
                case "HUF - Hungarian forint":
                    value = USD_TO_HUF;
                    break;
                default:
            }
        }
        break;
        case "CAD - Canadian dollar": {
            switch (valueToBeConverted) {
                case "RON - Romanian leu":
                    value = CAD_TO_RON;
                    break;
                case "EUR - Euro":
                    value = CAD_TO_EURO;
                    break;
                case "USD - U.S. dollar":
                    value = CAD_TO_USD;
                    break;
                case "CAD - Canadian dollar":
                    value = CAD_TO_CAD;
                    break;
                case "CHF - Swiss franc":
                    value = CAD_TO_CHF;
                    break;
                case "MDL - Leul moldovenesc":
                    value = CAD_TO_MDL;
                    break;
                case "GBP - British Pound Sterling":
                    value = CAD_TO_GBP;
                    break;
                case "HUF - Hungarian forint":
                    value = CAD_TO_HUF;
                    break;
                default:
            }
        }
        break;
        case "CHF - Swiss franc": {
            switch (valueToBeConverted) {
                case "RON - Romanian leu":
                    value = CHF_TO_RON;
                    break;
                case "EUR - Euro":
                    value = CHF_TO_EURO;
                    break;
                case "USD - U.S. dollar":
                    value = CHF_TO_USD;
                    break;
                case "CAD - Canadian dollar":
                    value = CHF_TO_CAD;
                    break;
                case "CHF - Swiss franc":
                    value = CHF_TO_CHF;
                    break;
                case "MDL - Leul moldovenesc":
                    value = CHF_TO_MDL;
                    break;
                case "GBP - British Pound Sterling":
                    value = CHF_TO_GBP;
                    break;
                case "HUF - Hungarian forint":
                    value = CHF_TO_HUF;
                    break;
                default:
            }
        }
        break;
        case "MDL - Leul Moldovenesc": {
            switch (valueToBeConverted) {
                case "RON - Romanian leu":
                    value = MDL_TO_RON;
                    break;
                case "EUR - Euro":
                    value = MDL_TO_EURO;
                    break;
                case "USD - U.S. dollar":
                    value = MDL_TO_USD;
                    break;
                case "CAD - Canadian dollar":
                    value = MDL_TO_CAD;
                    break;
                case "CHF - Swiss franc":
                    value = MDL_TO_CHF;
                    break;
                case "MDL - Leul moldovenesc":
                    value = MDL_TO_MDL;
                    break;
                case "GBP - British Pound Sterling":
                    value = MDL_TO_GBP;
                    break;
                case "HUF - Hungarian forint":
                    value = MDL_TO_HUF;
                    break;
                default:
            }
        }
        break;
        case "GBP - British Pound Sterling": {
            switch (valueToBeConverted) {
                case "RON - Romanian leu":
                    value = GBP_TO_RON;
                    break;
                case "EUR - Euro":
                    value = GBP_TO_EURO;
                    break;
                case "USD - U.S. dollar":
                    value = GBP_TO_USD;
                    break;
                case "CAD - Canadian dollar":
                    value = GBP_TO_CAD;
                    break;
                case "CHF - Swiss franc":
                    value = GBP_TO_CHF;
                    break;
                case "MDL - Leul moldovenesc":
                    value = GBP_TO_MDL;
                    break;
                case "GBP - British Pound Sterling":
                    value = GBP_TO_GBP;
                    break;
                case "HUF - Hungarian forint":
                    value = GBP_TO_HUF;
                    break;
                default:
            }
        }
        break;
        case "HUF - Hungarian forint": {
            switch (valueToBeConverted) {
                case "RON - Romanian leu":
                    value = HUF_TO_RON;
                    break;
                case "EUR - Euro":
                    value = HUF_TO_EURO;
                    break;
                case "USD - U.S. dollar":
                    value = HUF_TO_USD;
                    break;
                case "CAD - Canadian dollar":
                    value = HUF_TO_CAD;
                    break;
                case "CHF - Swiss franc":
                    value = HUF_TO_CHF;
                    break;
                case "MDL - Leul moldovenesc":
                    value = HUF_TO_MDL;
                    break;
                case "GBP - British Pound Sterling":
                    value = HUF_TO_GBP;
                    break;
                case "HUF - Hungarian forint":
                    value = HUF_TO_HUF;
                    break;
                default:
            }
        }
        break;
        default:
            value=0.0;
    }
    return value;
}

public double calculateSum (String valueToConvert, String valueToBeConverted) {
    double sumIntrodusa = Double.parseDouble(sumInitiala.getText());
    double resultObtinut = 0.0;
    switch (valueToConvert) {
        case "RON - Leul romanesc": {
            switch (valueToBeConverted) {
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
            switch (valueToBeConverted) {
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
            switch (valueToBeConverted) {
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
            switch (valueToBeConverted) {
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