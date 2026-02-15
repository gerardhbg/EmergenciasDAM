package com.emergencias.alert;

import com.emergencias.model.CentroSalud;
import com.emergencias.model.EmergencyEvent;
import com.emergencias.model.UserData;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

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
        leerCentrosDesdeJson("CentrosdeSalud.json");
    }


    //Leer json y mappear atributos del JSON con campos del objeto CentroSalud
    private void leerCentrosDesdeJson(String ruta) {
        try {
            byte[] jsonData = Files.readAllBytes(Paths.get(ruta));
            var objectMapper = new ObjectMapper();
            CentroSalud[] centrosArray = objectMapper.readValue(jsonData, CentroSalud[].class);
            ArrayList<CentroSalud> centros = new ArrayList<>(Arrays.asList(centrosArray));

            //Recorrer centros y mostrarlos por pantalla
            for (int i = 0; i <  centros.size(); i++) {
                System.out.println(centros.get(i));
            }

        } catch (Exception e) {
            System.out.println("ERROR leyendo centros: " + e.getMessage());
        }
    }

}