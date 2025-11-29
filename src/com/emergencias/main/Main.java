package com.emergencias.main;
import com.emergencias.controller.EmergencyManager;

public class Main {
    public static void main(String[] args) {
        //Llamada al orquestador
        EmergencyManager emergencyManager = new EmergencyManager();
        emergencyManager.startSystem();
    }
}
