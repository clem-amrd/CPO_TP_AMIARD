/*
 * TP0_Netbeans
 * Clémence AMIARD
 * 13/09/23
 */
package tp1_convertisseur;

import java.util.Scanner;

/**
 *
 * @author Clemence
 */
public class TP1_convertisseur {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double var1;
        System.out.println("Entrer une valeur :");
        var1 = sc.nextDouble();
        
        double ck;
        double kc;
        double cf;
        double fc;
        double kf;
        double fk;
        ck = CelciusVersKelvin(var1);
        kc = KelvinVersCelcius(var1);
        fc = FarenheitVersCelcius(var1);
        cf = CelciusVersFarenheit(var1);
        kf = KelvinVersFarenheit(var1);
        fk = FarenheitVersKelvin(var1);

        System.out.println("""
                           Saisissez la conversion que vous souhaitez effectuer :
                           1) De Celcius vers Kelvin
                           2) De Kelvin vers Celcius 
                           3) De Far vers Celcius 
                           4) De Celcius vers Far 
                           5) De Kelvin vers Far 
                           6) De Far vers Kelvin 
                           """);
        int var2;
        var2 = sc.nextInt();

        switch (var2) {
            case 1 -> System.out.println("celcius - kelvin: " + ck);
            case 2 -> System.out.println("kelvin - celcius: " + kc);
            case 3 -> System.out.println("far - celcius: " + fc);
            case 4 -> System.out.println("celcius - far: " + cf);
            case 5 -> System.out.println("kelvin - far: " + kf);
            case 6 -> System.out.println("far - kelvin: " + fk);
            default -> System.out.println("ce choix n'existe pas");
        }
    }

    public static double CelciusVersKelvin(double tCelcius) {
        double kelvin;
        kelvin = tCelcius + 273.15;
        return kelvin;
    }

    public static double KelvinVersCelcius(double tKelvin) {
        double c;
        c = tKelvin - 273.15;
        return c;
    }

    public static double FarenheitVersCelcius(double tFarenheit) {
        double c;
        c = (tFarenheit - 32) * 5 / 9;
        return c;
    }

    public static double CelciusVersFarenheit(double tCelcius) {
        double f;
        f = (tCelcius * 9 / 5) + 32;
        return f;
    }

    public static double KelvinVersFarenheit(double tKelvin) {
        double c;
        double f;
        c = KelvinVersCelcius(tKelvin);
        f = CelciusVersFarenheit(c);
        return f;
    }

    public static double FarenheitVersKelvin(double tFarenheit) {
        double c;
        double k;
        c = FarenheitVersCelcius(tFarenheit);
        k = CelciusVersKelvin(c);
        return k;
    }
}
