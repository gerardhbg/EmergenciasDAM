package com.emergencias.controller;

import com.emergencias.alert.AlertSender;
import com.emergencias.detector.EmergencyDetector;
import com.emergencias.model.EmergencyEvent;
import com.emergencias.model.UserData;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.InputMismatchException;

public class EmergencyManager {
    // Inicio del sistema tras la llamada
    public void startSystem() {
        EmergencyDetector detector = new EmergencyDetector();
        try {
            // Recuperamos los datos de la emergencia
            EmergencyEvent event = detector.detectEvent();
            // En caso de que el usuario pulse H se muestra historial.
            if (event == null) {
                mostrarHistorialArchivo();
                return;
            }
            // Recuperamos los datos del usuario
            UserData user = detector.getUserData();

            // Enviamos los parámetros de la emergergencia para enviar la alerta y generar el fichero
            AlertSender sender = new AlertSender();
            sender.sendAlert(event, user);

        } catch (InputMismatchException e) {
            System.err.println("Debe introducir un dato válido.");
        }
    }
    // Mostrar historial desde historial.txt
    public void mostrarHistorialArchivo() {
        try (BufferedReader reader = new BufferedReader(new FileReader("historial.txt"))) {
            String linea;
            System.out.println("Historial de emergencias (archivo):");
            while ((linea = reader.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (IOException e) {
            System.err.println("Error leyendo historial: " + e.getMessage());
        }
    }
}
