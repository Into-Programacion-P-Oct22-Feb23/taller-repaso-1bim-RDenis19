/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package repaso;
import java.util.Scanner;
import java.util.Locale;
/**
 *
 * @author SALA I
 */
public class Repaso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        String nombreEmpleado;
        int cedula;
        double horasmatutinas;
        double horasnocturnas;
        String ciudadEmpresa;
        double valormatutino = 10;
        double valornocturno = 15;
        double totalmatutino;
        double totalnocturno;
        double aumentoNocturno = 16.5;
        double subtotal;
        double segurosocial;
        double totalFinal;
        int contador = 0;
        boolean bandera = true;
        String mensaje = "";
        String salir = "o";

        while (bandera == true) {
            System.out.println("Ingrese el nombre del empleado:");
            nombreEmpleado = entrada.nextLine();
            System.out.println("Ingrese su numero de cedula:");
            cedula = entrada.nextInt();
            entrada.nextLine();
            System.out.println("Ingrese la ciudad de la empresa:");
            ciudadEmpresa = entrada.nextLine();
            System.out.println("Ingrese las horas matutinas trabajadas");
            horasmatutinas = entrada.nextDouble();
            System.out.println("Ingrese las horas nocturnas trabajadas");
            horasnocturnas = entrada.nextDouble();
            if (horasnocturnas >= 10) {
                totalmatutino = horasmatutinas * valormatutino;
                totalnocturno = horasnocturnas * aumentoNocturno;
                subtotal = totalmatutino + totalnocturno;
                segurosocial = (subtotal * 18) / 100;
                totalFinal = subtotal - segurosocial;
                mensaje = String.format("%s Rol del trabajador de nombre %s y "
                        + "cedula %d\n horas matutinas trabajadas: %.0f\n "
                        + "horas nocturnas trabajadas: %.0f\n subtotal: %.1f\n "
                        + "seguro social: %.1f\n total a "
                        + "cancelar: %.1f\n\n", mensaje, nombreEmpleado, cedula,
                        horasmatutinas, horasnocturnas, subtotal,
                        segurosocial, totalFinal);

            } else {
                totalmatutino = horasmatutinas * valormatutino;
                totalnocturno = horasnocturnas * valornocturno;
                subtotal = totalmatutino + totalnocturno;
                segurosocial = (subtotal * 18) / 100;
                totalFinal = subtotal - segurosocial;
                mensaje = String.format("%s Rol del trabajador de nombre %s y "
                        + "cedula %d\n horas matutinas trabajadas: %.0f\n "
                        + "horas nocturnas trabajadas: %.0f\n subtotal: %.1f\n "
                        + "seguro social: %.1f\n total a "
                        + "cancelar: %.1f\n\n", mensaje, nombreEmpleado, cedula,
                        horasmatutinas, horasnocturnas, subtotal,
                        segurosocial, totalFinal);
            }
            entrada.nextLine();
            System.out.println("ingrese s para salir");
            salir = entrada.nextLine();
            if (salir.equals("s")) {
                bandera = false;
            }
            contador = contador + 1;
        }

        System.out.printf("""
                          Nomina de trabajadores
                           %s 
                           Numero de empleados :%s 
                          """, mensaje,
                contador);
    }
}