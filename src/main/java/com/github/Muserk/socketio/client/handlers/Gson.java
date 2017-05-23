package com.github.Muserk.socketio.client.handlers;

public class Gson {
    private static com.google.gson.Gson Gson = new com.google.gson.GsonBuilder()
            .setDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ")
            .create();

    public static com.google.gson.Gson getGson() {
        return Gson;
    }


}
