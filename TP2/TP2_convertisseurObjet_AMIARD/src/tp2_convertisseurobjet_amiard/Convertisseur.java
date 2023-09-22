/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_convertisseurobjet_amiard;

/**
 *
 * @author Clemence
 */
public class Convertisseur {

    public int nbConversions;
    
    public Convertisseur () {
        nbConversions = 0 ;
    }

    public double CelciusVersKelvin(double tCelcius) {
        double kelvin;
        kelvin = tCelcius + 273.15;
        nbConversions++;
        return kelvin;
    }

    public double KelvinVersCelcius(double tKelvin) {
        double c;
        c = tKelvin - 273.15;
        nbConversions++;
        return c;
    }

    public double FarenheitVersCelcius(double tFarenheit) {
        double c;
        c = (tFarenheit - 32) * 5 / 9;
        nbConversions++;
        return c;
    }

    public double CelciusVersFarenheit(double tCelcius) {
        double f;
        f = (tCelcius * 9 / 5) + 32;
        nbConversions++;
        return f;
    }

    public double KelvinVersFarenheit(double tKelvin) {
        double c;
        double f;
        c = KelvinVersCelcius(tKelvin);
        f = CelciusVersFarenheit(c);
        nbConversions -= 2;
        nbConversions++;
        return f;
    }

    public double FarenheitVersKelvin(double tFarenheit) {
        double c;
        double k;
        c = FarenheitVersCelcius(tFarenheit);
        k = CelciusVersKelvin(c);
        nbConversions -= 2;
        nbConversions++;
        return k;
    }
        
    @Override
    public String toString() {
        return "nb de conversions: " + nbConversions;       
    }
}
