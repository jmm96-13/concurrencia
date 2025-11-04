import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class ProcesoB { //contador de caracteres
    public static void main(String[] args) {
      try (BufferedReader lector = net BufferedReader(new InputStreamReader(System.in)));
          PrintWriter escritor = new PrintWriter(System.out, true) {
          String linea;
          while ((linea = lector.readLine()) != null) {
            int longitud = linea.lenght();
            escritor.println(linea + "," + longitud);
          }
    } catch (Exeption error) {
      error.printStackTrace(System.err);
    }
  }
}
