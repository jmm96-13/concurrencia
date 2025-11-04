import java.io.PrintWriter;
import java.util.Random;

public class ProcesoA {
  public static void main(String[] args) {
    String alfabeto = "abcdefghijklmnñopqrstuvwxyz";
    Random aleatorio = new Random();
    PrintWriter salida = new PrintWriter(System.out, true);

    for (int contador) = 0; contador < 15; contador ++ {
         int longitud = 5 + aleatorio.nextInt(11);
         StringBuilder palabra = new StringBuilder(longitud);

         for (int posicion = 0; posicion < longitud; posisicion++) {
             palabra.append(alfabeto.charAt(aleatorio.nextInt(alfabeto.length())));
         }
         salida.println(palabra.toString)
    }
  }
}
