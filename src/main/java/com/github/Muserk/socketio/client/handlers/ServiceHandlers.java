package com.github.Muserk.socketio.client.handlers;

import com.github.Muserk.socketio.client.models.Service;
import io.socket.emitter.Emitter;

public class ServiceHandlers {

    public static Emitter.Listener onCreate = new Emitter.Listener() {
        @Override
        public void call(Object... args) {
            String json = (String) args[0];
            Service model = Gson.getGson().fromJson(json, Service.class);
            if (model.process()) {
                model.createInDb();
            }
        }
    };

    public static Emitter.Listener onUpdate = new Emitter.Listener() {
        @Override
        public void call(Object... args) {
            String json = (String) args[0];
            Service model = Gson.getGson().fromJson(json, Service.class);
            if (model.process()) {
                model.updateInDb();
            }
        }
    };

    public static Emitter.Listener onDelete = new Emitter.Listener() {
        @Override
        public void call(Object... args) {
            String json = (String) args[0];
            Service model = Gson.getGson().fromJson(json, Service.class);
            if (model.process()) {
                model.deleteFromDb();
            }
        }
    };

}
