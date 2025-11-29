package com.emergencias.detector;

import com.emergencias.model.EmergencyEvent;
import com.emergencias.model.UserData;

import java.util.Scanner;

public class EmergencyDetector {
    // Generamos los datos y devolvemos el objeto EmergencyEvent completo
    public EmergencyEvent detectEvent() {
        // Se pregunta al usuario mediante la consola
        Scanner scanner = new Scanner(System.in);
        System.out.println("Iniciando protocolo de emergencia...");
        System.out.println("Pulsa E para emergencia");
        // Si no se introduce E o e se detiene el programa
        if (scanner.nextLine().equalsIgnoreCase("E")) {
            System.out.println("Ubicación: ");
            String ubi = scanner.nextLine();
            System.out.println("Latitud: ");
            double lat = scanner.nextDouble();
            System.out.println("Longitud: ");
            double lon = scanner.nextDouble();
            System.out.println("Fuerza del golpe: ");
            int fuerzaGolpe = scanner.nextInt();
            // Calculamos el nivel de gravedad en función de la fuerza del golpe
            String nivelGravedad = validateSeverity(fuerzaGolpe);
            return new EmergencyEvent("General", ubi, lat, lon, nivelGravedad);
    }
        System.out.println("Si tiene algún tipo de emergencia, no dude en volver a ejecutar el sistema");
        return null;
    }

    // Generamos los datos y devolvemos el objeto UserData completo
    public UserData getUserData(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Indique su nombre");
        String nombre = scanner.nextLine();
        System.out.println("Indique sus apellidos");
        String apellidos = scanner.nextLine();
        System.out.println("Indique su teléfono");
        String telefono = scanner.nextLine();
        return new UserData(nombre, apellidos, telefono);
    }

    public String validateSeverity(int fuerzaGolpe){
        String nivelGravedad;
        if (fuerzaGolpe >= 5 && fuerzaGolpe < 8){
            nivelGravedad = "B";
        } else if (fuerzaGolpe > 8) {
            nivelGravedad = "A";
        } else {
            nivelGravedad = "C";
        }
        return nivelGravedad;
    }
}