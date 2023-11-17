import javax.swing.JOptionPane;

/** Funciones utilizadas en la clase main
 * @author Sergio Sanroman
 * @version v1.0
 */
public class Soldo {

    /**
     *  Hace un bucle para meter los sueldos de los trabajadores
     *
     *  Calcula los rangos del salario
     *
     *  Si se tecela el 0 se acaba el bucle
     */


    public void calcularSoldo(){
        double salario;
        int i = 0;
        int j = 0;
        int nTrabajadores = 0;

        do {
            salario =Double.parseDouble(JOptionPane.showInputDialog("Introduzca salario del trabajador. Si no hay más teclee 0."));
            if (salario > 0) {
                nTrabajadores++;
                if (salario >= 1000 && salario <= 1750) {
                    i++;
                } else if (salario < 1000) {
                    j++;
                }
            }
        } while (salario != 0);

        float porcentaje = (float) j / nTrabajadores * 100;

        System.out.println("Número de trabajadores que ganan entre 1000 y 1750 €: " + i);
        System.out.println("Porcentaje de trabajadores que ganan menos de 1000 €: " + porcentaje + "%");
    }
}