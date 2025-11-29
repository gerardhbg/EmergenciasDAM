package com.emergencias.controller;

import com.emergencias.alert.AlertSender;
import com.emergencias.detector.EmergencyDetector;
import com.emergencias.model.EmergencyEvent;
import com.emergencias.model.UserData;

import java.util.InputMismatchException;

public class EmergencyManager {
    // Inicio del sistema tras la llamada
    public void startSystem(){
        EmergencyDetector detector = new EmergencyDetector();
        try {
            // Recuperamos los datos de la emergencia
            EmergencyEvent event = detector.detectEvent();
            // Recuperamos los datos del usuario
            UserData user = detector.getUserData();

            // Enviamos los parámetros de la emergergencia para enviar la alerta y generar el fichero
            AlertSender sender = new AlertSender();
            sender.sendAlert(event, user);
        } catch (InputMismatchException e) {
            System.err.println("Debe introducir un dato válido");
        }
    }
}
