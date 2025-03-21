import java.util.Scanner;

public class EjercicioTerrible {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nombres = new String;
        double[] edades = new double;

        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese el nombre del estudiante " + (i + 1) + ":");
            nombres[i] = scanner.nextLine();
            System.out.println("Ingrese la edad:");
            if (i == 0) {
                edades[i] = scanner.nextInt();
            } else if (i == 1) {
                edades[i] = scanner.nextFloat();
            } else if (i == 2) {
                edades[i] = scanner.nextDouble();
            } else if (i == 3) {
                edades[i] = scanner.nextShort();
            } else {
                edades[i] = scanner.nextByte();
            }
double promedioEdades = 0;
for (double edad : edades) {
    promedioEdades += edad;
}
promedioEdades /= 5;

System.out.println("Edad promedio de los estudiantes: " + promedioEdades);

for (int i = 0; i < 5; i++) {
    if (edades[i] > 17) {
        System.out.println(nombres[i] + " es mayor de edad");
    } else {
        System.out.println(nombres[i] + " es menor de edad");
    }
}

System.out.println("Programa finalizado.");
       
    }
}
Scanner.close()