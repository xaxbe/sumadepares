
package sumapares;

/**
 *
 * @author maryse
 *
 * Ciclo for Suma de los M primeros números pares.
 * El bucle puede diseñarse con  * un incremento de 2.
 *
 */
public class SumaPares2 {
    public void pares2() {
        final int M = 12;
        int suma = 0;
        for (int n = 2; n <= 2 * M; n += 2) {
            suma += n;
        }
        System.out.println("La suma de los " + M
                + " primeros números pares: " + suma);
    }

    public static void main(String[] args) {
        SumaPares2 suma2 = new SumaPares2();
        suma2.pares2();
    }
}
