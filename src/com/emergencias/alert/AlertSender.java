package com.emergencias.alert;

import com.emergencias.model.EmergencyEvent;
import com.emergencias.model.UserData;

import java.io.FileWriter;

public class AlertSender {
    // Recibimos por parámetro el objeto EmergencyEvent y el objeto UserData para simular la alerta al 112 y se crea el fichero con los datos
    public void sendAlert(EmergencyEvent event, UserData user) {
        if (event != null) {
            System.out.println("Enviando alerta a 112: " + event.getTipo() + " en " + event.getUbicacion());
            // Notificamos al usuario
            notifyContacts(user);
            try (FileWriter writer = new FileWriter("alertas.txt", true)) {
                System.out.println(event.toString());
                writer.write(event.toString() + "\n");
            } catch (Exception e) {
                System.err.println("Error en envío: " + e.getMessage());
            }
        }
    }

    // Recibimos por parámetro el objeto UserData para simular notificación al teléfono
    public void notifyContacts(UserData user){
        System.out.println("Notificando al contacto " + user.getNombre() + " " + user.getApellidos() + " al teléfono " + user.getTelefono());
    }
}