package com.github.Muserk.socketio.client;

import com.github.Muserk.socketio.client.handlers.AppointmentHandlers;
import com.github.Muserk.socketio.client.handlers.PatientHandlers;

import com.github.Muserk.socketio.client.handlers.ServiceHandlers;
import io.socket.client.IO;
import io.socket.client.Socket;

import java.net.URISyntaxException;


/**
 * Registers Handlers to their corresponding Socket IO Events
 */
public class SocketEventRouter {

    private static Socket socket;

    // Initialize socket instance
    static {
        try {
            socket = IO.socket("http://localhost:8500");
        } catch (URISyntaxException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Registers all Handlers
     */
    public static void registerHandlers() {
        registerDefaultModelHandlers();

        // Register custom handlers here


        socket.connect();
    }

    /**
     * Registers the default Handlers for each model type
     */
    private static void registerDefaultModelHandlers() {
        registerPatientHandlers();
        registerAppointmentHandlers();
        registerServiceHandlers();

        // Add Handlers for new models here
    }

    private static void registerPatientHandlers() {
        socket.on("CREATE/Patient", PatientHandlers.onCreate);
        socket.on("UPDATE/Patient", PatientHandlers.onUpdate);
        socket.on("DELETE/Patient", PatientHandlers.onDelete);
    }

    private static void registerAppointmentHandlers() {
        socket.on("CREATE/Appointment", AppointmentHandlers.onCreate);
        socket.on("UPDATE/Appointment", AppointmentHandlers.onUpdate);
        socket.on("DELETE/Appointment", AppointmentHandlers.onDelete);
    }

    private static void registerServiceHandlers() {
        socket.on("CREATE/Service", ServiceHandlers.onCreate);
        socket.on("UPDATE/Service", ServiceHandlers.onUpdate);
        socket.on("DELETE/Service", ServiceHandlers.onDelete);
    }
}
