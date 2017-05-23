package com.github.Muserk.socketio.client.models;


public class Service extends BaseModel {
    public static final String MODEL_NAME = "Service";

    String name;
    Integer duration;


    public String getModelName() {
        return MODEL_NAME;
    }

    public boolean validateFields() {
        System.out.println("Validating fields: " + getModelName() + ":" + id);
        return true;
    }

    @Override
    public boolean process() {
        if (!super.process()) {
            return false;
        }

        // Add custom processing for this model



        System.out.println("Custom Processing: " + getModelName() + ":" + id);
        return true;
    }
}
