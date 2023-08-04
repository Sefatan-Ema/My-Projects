import java.util.*;
import mypackage.*;

public class Main {
    public static void main(String[] arg3s) throws Exception {

        App database = new App();
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://127.0.0.1/currency";
        String username = "root";
        String password = "";

        double rupee, dollar, pound, euro, KWD, taka;
        int code;

        Scanner sc = new Scanner(System.in);

        Test1 t = new Test1();
        Test r = new Test();
        Test d = new Test();
        Test p = new Test();
        Test e = new Test();
        Test k = new Test();
        System.out.println(
                " WelCome to Currency Converter Project.");
        while (true) {
            System.out.println(
                    "\nEnter the currency choice \n1:Taka\n2:Dollar\n3:Pound\n4:Rupees\n5:Euro\n6:Kuwaiti dinar \n\n7:add\n8:update\n9:delete\n10:show\n11.Exit\n");
            code = sc.nextInt();
            switch (code) {
                case 1: {
                    System.out.println("Enter amount in taka:");
                    taka = sc.nextFloat();
                    t.BDTTo(taka);
                    break;
                }
                case 2: {
                    System.out.println("Enter amount in dollar:");
                    dollar = sc.nextFloat();
                    d.DollarTo(dollar);
                    break;
                }

                case 3: {
                    System.out.println("Enter amount in Pound:");
                    pound = sc.nextFloat();
                    p.PoundTo(pound);
                    break;
                }
                case 4: {

                    System.out.println("Enter amount in rupees:");
                    rupee = sc.nextFloat();
                    r.RupeeTo(rupee);
                    break;
                }
                case 5: {
                    System.out.println("Enter amount in Euro:");
                    euro = sc.nextFloat();
                    e.EuroTo(euro);
                    break;
                }

                case 6: {
                    System.out.println("Enter amount in Kuwaiti dinar:");
                    KWD = sc.nextFloat();
                    k.KwdTo(KWD);
                    break;
                }

                case 7: {
                    database.add(url, username, password);

                    break;
                }
                case 8: {
                    database.update(url, username, password);
                    break;
                }

                case 9: {

                    database.delete(url, username, password);
                    break;
                }
                case 10: {

                    database.show(url, username, password);
                    break;
                }
                case 11: {

                    break;
                }

                default:
                    System.out.println("Invalid Code");
            }
            if (code == 11)
                break;
        }

    }

}
