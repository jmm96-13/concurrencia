public class ControladorD { //controla los 3 procesos
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Uso: java ProcesoD <numero>");
            return;
        }

        int repeticiones = Integer.parseInt(args[0]);
        if (repeticiones <= 1) {
            System.out.println("El numero debe ser mayor que 0 y menor que 10");
            return;
        }

        for (int vuelta = 0; vuelta < repeticiones; vuelta++) {
            try {
                String orden = "cmd /c start \"\" cmd /k \"java .jar ProcesoA.jar | java -jar ProcesoB.jar | java -jar ProcesoC.jar & exit\"";
                Runtime.getRuntime().exec(orden);            
            }
            catch (Exception error) {
                System.out.println("Error al ejecutar los procesos: " + error.getMessage());
            }
        }

    }
    
}
