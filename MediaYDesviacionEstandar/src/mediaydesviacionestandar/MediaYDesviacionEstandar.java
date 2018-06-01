/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mediaydesviacionestandar;
import java.util.*;
/**
 *
 * @author adrianosorio
 */
public class MediaYDesviacionEstandar {
    static double numero;
    static double media;
    static double varianza;
    static double desviacion;
    static int n;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Cantidad de numeros a calcular: ");
        n = sc.nextInt();
        
        double numeros [] = new double[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese el numero : ");
            numeros[i] = sc.nextDouble();
        }
        
        //Calcular Media
        double suma = 0;
        for (double i: numeros) {
            suma = suma + i;
        }
        
        media = suma / n;
        System.out.println("La Media Es: "+media);
        
        //Calcular la varianza
        double sumatoria;
        for (int i = 0; i < n; i++) {
            sumatoria = Math.pow(numeros[i] - media,2);
            varianza = varianza + sumatoria;
        }
        varianza = varianza / (n-1);
        
        //Calcular la Desviacion Estandar
        desviacion = Math.sqrt(varianza);
        double redondeo = Math.rint(desviacion*100)/100;
        System.out.println("La Desviacion Estandar Es: "+redondeo);
    }
    
}
