package com.emergencias.detector;

import com.emergencias.model.EmergencyEvent;
import com.emergencias.model.UserData;

import java.util.Scanner;

public class EmergencyDetector {

    public EmergencyEvent detectEvent() {
        // Se pregunta al usuario mediante la consola
        Scanner scanner = new Scanner(System.in);
        System.out.println("Iniciando protocolo de emergencia...");
        System.out.println("Pulsa E para emergencia o H para ver historial");

        String opcion = scanner.nextLine();

        // Primero comprobamos si es historial
        if (opcion.equalsIgnoreCase("H")) {
            return null;
        }

        // Si no se introduce E o e se detiene el programa
        if (!opcion.equalsIgnoreCase("E")) {
            System.out.println("Opción no válida. Saliendo...");
            return null;
        }

        System.out.println("Ubicación: ");
        String ubicacion = scanner.nextLine();

        System.out.println("Latitud: ");
        double latitud = scanner.nextDouble();

        System.out.println("Longitud: ");
        double longitud = scanner.nextDouble();

        System.out.println("Fuerza del golpe: ");
        int fuerzaGolpe = scanner.nextInt();
        scanner.nextLine(); // limpiar buffer

        String nivelGravedad = validateSeverity(fuerzaGolpe);

        return new EmergencyEvent("General", ubicacion, latitud, longitud, nivelGravedad);
    }
    // Generamos los datos y devolvemos el objeto UserData completo
    public UserData getUserData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Indique su nombre:");
        String nombre = scanner.nextLine();

        System.out.println("Indique sus apellidos:");
        String apellidos = scanner.nextLine();

        System.out.println("Indique su teléfono:");
        String telefono = scanner.nextLine();

        return new UserData(nombre, apellidos, telefono);
    }

    public String validateSeverity(int fuerzaGolpe) {
        if (fuerzaGolpe >= 5 && fuerzaGolpe < 8) return "B";
        else if (fuerzaGolpe > 8) return "A";
        else return "C";
    }
}
