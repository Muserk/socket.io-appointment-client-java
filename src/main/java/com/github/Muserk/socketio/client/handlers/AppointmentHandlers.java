package com.github.Muserk.socketio.client.handlers;

import com.github.Muserk.socketio.client.models.Appointment;
import io.socket.emitter.Emitter;

public class AppointmentHandlers {

    public static Emitter.Listener onCreate = new Emitter.Listener() {
        @Override
        public void call(Object... args) {
            String json = (String) args[0];
            Appointment model = Gson.getGson().fromJson(json, Appointment.class);
            if (model.process()) {
                model.createInDb();
            }
        }
    };

    public static Emitter.Listener onUpdate = new Emitter.Listener() {
        @Override
        public void call(Object... args) {
            String json = (String) args[0];
            Appointment model = Gson.getGson().fromJson(json, Appointment.class);
            if (model.process()) {
                model.updateInDb();
            }
        }
    };

    public static Emitter.Listener onDelete = new Emitter.Listener() {
        @Override
        public void call(Object... args) {
            String json = (String) args[0];
            Appointment model = Gson.getGson().fromJson(json, Appointment.class);
            if (model.process()) {
                model.deleteFromDb();
            }
        }
    };

}
