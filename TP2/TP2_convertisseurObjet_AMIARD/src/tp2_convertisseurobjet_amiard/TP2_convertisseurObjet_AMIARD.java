/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_convertisseurobjet_amiard;

/**
 *
 * @author Clemence
 */
public class TP2_convertisseurObjet_AMIARD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Convertisseur obj = new Convertisseur();

        java.util.Scanner sc = new java.util.Scanner(System.in);
        double var1;
        System.out.println("Entrer une valeur :");
        var1 = sc.nextDouble();

        int var2 = 0;
        while (var2 != 7) {
            System.out.println("""
                           Saisissez la conversion que vous souhaitez effectuer :
                           1) De Celcius vers Kelvin
                           2) De Kelvin vers Celcius 
                           3) De Far vers Celcius 
                           4) De Celcius vers Far 
                           5) De Kelvin vers Far 
                           6) De Far vers Kelvin 
                           7)stop
                           """);
            var2 = sc.nextInt();

            switch (var2) {
                case 1 ->
                    System.out.println("celcius - kelvin: " + obj.CelciusVersKelvin(var1));
                case 2 ->
                    System.out.println("kelvin - celcius: " + obj.KelvinVersCelcius(var1));
                case 3 ->
                    System.out.println("far - celcius: " + obj.FarenheitVersCelcius(var1));
                case 4 ->
                    System.out.println("celcius - far: " + obj.CelciusVersFarenheit(var1));
                case 5 ->
                    System.out.println("kelvin - far: " + obj.KelvinVersFarenheit(var1));
                case 6 ->
                    System.out.println("far - kelvin: " + obj.FarenheitVersKelvin(var1));
                case 7 ->
                    System.out.println("ok on arrete");
                default ->
                    System.out.println("ce choix n'existe pas");
            }
            String result = obj.toString();
            System.out.println(result);
        }
    }

}
