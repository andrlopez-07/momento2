import java.util.Scanner;

public class niveldeconsumo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa el consumo del lunes:");
        double lunes = scanner.nextDouble();
        
        System.out.println("Ingresa el consumo del martes:");
        double martes = scanner.nextDouble();
        
        System.out.println("Ingresa el consumo del miércoles:");
        double miercoles = scanner.nextDouble();
        
        System.out.println("Ingresa el consumo del jueves:");
        double jueves = scanner.nextDouble();
        
        System.out.println("Ingresa el consumo del viernes:");
        double viernes = scanner.nextDouble();

        double promedioActual = (lunes + martes + miercoles + jueves + viernes) / 5;

        String nivelConsumo = "";
            if (promedioActual < 8) {
                nivelConsumo = "CONSUMO BAJO";
            } else if (promedioActual >= 8 && promedioActual <= 12) {
                nivelConsumo = "CONSUMO NORMAL";
            } else if (promedioActual > 12 && promedioActual <= 16) {
                nivelConsumo = "CONSUMO ALTO";
            } else {
                nivelConsumo = "CONSUMO CRÍTICO";
            }

        System.out.println("Ingresa el promedio anterior de consumo:");
        double promedioAnterior = scanner.nextDouble();

        double porcentaje = ((promedioActual - promedioAnterior) / promedioAnterior) * 100;

        String resultadoVariacion = "";
            if (porcentaje < 0) {
                resultadoVariacion = "El consumo disminuyó";
            } else if (porcentaje >= 0 && porcentaje <= 10) {
                resultadoVariacion = "El consumo aumentó ligeramente";
            } else if (porcentaje > 10 && porcentaje <= 25) {
                resultadoVariacion = "El consumo aumentó considerablemente";
            } else {
                resultadoVariacion = "ALERTA: aumento elevado del consumo";
            }

        System.out.println("=========================================");
        System.out.println("          ANALIZADOR DE CONSUMO          ");
        System.out.println("=========================================");
        System.out.println("\nPromedio de consumo: " + promedioActual);
        System.out.println("\nNivel: " + nivelConsumo);
        System.out.println("\nPromedio anterior: " + promedioAnterior);
        System.out.println("Promedio actual: " + promedioActual);
        System.out.println("\nVariación: " + String.format("%.2f", porcentaje) + "%");
        System.out.println("\nResultado:");
        System.out.println(resultadoVariacion);
        System.out.println("=========================================");

        scanner.close();
    }
}
    

