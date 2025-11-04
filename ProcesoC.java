import java .io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class ProcesoC { //contador de vocales
    String vocales = "aeiouáéíóúü";
    int totalVocales = 0;
    BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));

    try {
        String linea;

        while ((linea = lector.readLine()) != null) {
            int coma = linea.lastIndexOf(',');
            String palabra = linea.substring(0, coma);
            String numero = linea.substring(coma + 1);

            int longitud = palabra.length();
            try {
                longitud = Integer.parseInt(num.trim());
            } catch (NumberFormatException error) {
                
            }
            int contadorVocales = 0;
            for (char letra : palabra.toCharArray()) {
                if (vocales.indexOf(Character.toLowerCase(letra)) != -1) {
                    contadorVocales++;
                }
            }

            totalVocales += contadorVocales;

            System.out.println("Cadena: \"" + palabra + "\" _ Longitud: " + longitud + " _ Vocales: " + contadorVocales);
        }
        System.out.println("Total de vocales: " + totalVocales);

    } catch (IOException error) {
        error.printStackTrace(System.err);
    } 
}
