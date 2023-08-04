import java.text.DecimalFormat;

abstract class BdtTo {
    abstract void BDTTo(double bdt);

}

public class Test1 extends BdtTo {

    double rupee, dollar, pound, euro, KWD, taka;
    DecimalFormat f = new DecimalFormat(" ");

    public void BDTTo(double bdt) {
        // this.rupee = rupee;
        dollar = bdt / 93;

        System.out.println("Dollar : " + f.format(dollar));

        pound = bdt / 112;
        System.out.println("Pound : " + f.format(pound));

        rupee = bdt / 1.2;
        System.out.println("Rupee : " + f.format(rupee));

        euro = bdt / 97;
        System.out.println("Euro : " + f.format(euro));

        KWD = bdt / 302;
        System.out.println("Kuwaiti dinar : " + f.format(KWD));

    }
}