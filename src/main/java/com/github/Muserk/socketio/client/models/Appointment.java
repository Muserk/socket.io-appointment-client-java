package com.github.Muserk.socketio.client.models;


import java.util.Date;

public class Appointment extends BaseModel {
    public static final String MODEL_NAME = "Appointment";

    Date startDate;
    Date endDate;
    Integer patientId;

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
