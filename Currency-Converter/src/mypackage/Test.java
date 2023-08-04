package mypackage;

//import java.util.*;
import java.text.DecimalFormat;

interface CurrencycTo {

    void RupeeTo(double rup);

    void DollarTo(double doll);

    void PoundTo(double pou);

    void EuroTo(double eur);

    void KwdTo(double kwd);
}

public class Test implements CurrencycTo {
    double rupee, dollar, pound, euro, KWD, taka;
    DecimalFormat f = new DecimalFormat(" ");

    public void RupeeTo(double rup) {
        // this.rupee = rupee;
        taka = rup / .84;
        System.out.println("Taka : " + f.format(taka));
        dollar = rup / 78;

        System.out.println("Dollar : " + f.format(dollar));
        pound = rup / 95;
        System.out.println("Pound : " + f.format(pound));

        euro = rup / 84;
        System.out.println("Euro : " + f.format(euro));

        KWD = rup / 254;
        System.out.println("Kuwaiti dinar : " + f.format(KWD));

    }

    public void DollarTo(double doll) {
        taka = doll * 93;
        System.out.println("Taka : " + f.format(taka));
        pound = doll * 0.72;
        System.out.println("Pound : " + f.format(pound));

        // this.dollar = dollar;
        rupee = doll * 78;

        System.out.println("Rupees : " + f.format(rupee));

        euro = doll * 0.88;

        System.out.println("Euro : " + f.format(euro));
        // taka = euro * 97;
        KWD = doll * 0.30;

        System.out.println("Kuwaiti dinar : " + f.format(KWD));
    }

    public void PoundTo(double pou) {
        taka = pou * 112;
        System.out.println("Taka : " + f.format(taka));

        dollar = pou * 1.35;

        System.out.println("Dollar : " + f.format(dollar));
        // this.pound = pound;
        rupee = pou * 101;

        System.out.println("Rupees : " + f.format(rupee));

        euro = pou * 1.36;

        System.out.println("Euro : " + f.format(euro));
        KWD = pou * 0.4;
        System.out.println("Kuwaiti dinar : " + f.format(KWD));

    }

    public void EuroTo(double eur) {
        taka = eur * 97;
        System.out.println("Taka : " + f.format(taka));
        // this.euro = euro;
        dollar = eur * 1.12;

        System.out.println("Dollar : " + f.format(dollar));

        pound = eur * 0.73;

        System.out.println("Pound : " + f.format(pound));
        rupee = eur * 84;

        System.out.println("Rupees : " + f.format(rupee));

        KWD = eur * 0.34;

        System.out.println("Kuwaiti dinar : " + f.format(KWD));

    }

    public void KwdTo(double kwd) {
        taka = kwd * 302;
        System.out.println("Taka : " + f.format(taka));
        // this.KWD = KWD;

        dollar = kwd * 3.30;

        System.out.println("Dollar : " + f.format(dollar));

        pound = kwd * 2.5;

        System.out.println("Pound : " + f.format(pound));
        rupee = kwd * 250;

        System.out.println("Rupees : " + f.format(rupee));

        euro = kwd * 2.94;

        System.out.println("Euro : " + f.format(euro));
    }

}
