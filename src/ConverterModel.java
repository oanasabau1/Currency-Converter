public class ConverterModel {

    // This declaration contains conversion rates between several currencies, each constant representing the exchange rate of one unit to another
    // To extend the Currency Converter, new units and corresponding values can be added
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

    public double selectValueForConversion(String fromCurrency, String toCurrency) {  //the method will return the conversion rate between the given currencies, as specified by the corrsponding constant in the code
        double value = 0.0;
        //i use switch-case to select the value based on the name of the currency units
        switch (fromCurrency) {
            case "RON - Romanian leu": {
                switch (toCurrency) {
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
                    case "MDL - Moldavian leu":
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
                switch (toCurrency) {
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
                    case "MDL - Moldavian leu":
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
                switch (toCurrency) {
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
                    case "MDL - Moldavian leu":
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
                switch (toCurrency) {
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
                    case "MDL - Moldavian leu":
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
                switch (toCurrency) {
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
                    case "MDL - Moldavian leu":
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
            case "MDL - Moldavian leu": {
                switch (toCurrency) {
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
                    case "MDL - Moldavian leu":
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
                switch (toCurrency) {
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
                    case "MDL - Moldavian leu":
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
                switch (toCurrency) {
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
                    case "MDL - Moldavian leu":
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
                value = 0.0;
        }
        return value;
    }

    public double convertCurrency(Double amount, String fromCurrency, String toCurrency) {
        double value = this.selectValueForConversion(fromCurrency, toCurrency);  //first we select the value of conversion between the units using the method above
        return value * amount;
    }
}

