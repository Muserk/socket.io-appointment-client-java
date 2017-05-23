package com.github.Muserk.socketio.client.models;

import java.util.UUID;

public abstract class BaseModel implements DBPersistent {
    UUID id;

    public abstract String getModelName();
    public abstract boolean validateFields();

    /**
     * Runs processing on the model. This may involve field validation, GUI events, etc.
     *
     * @return False if processing fails, True otherwise
     */
    public boolean process() {
        System.out.println("Global Processing: " + getModelName() + ":" + id);

        // Add common pre-field-validation processing for all models here



        if (!validateFields()) {
            return false;
        }

        // Add common post-field-validation processing for all models here



        return true;
    }

    @Override
    public void createInDb() {
        System.out.println("Create:" + getModelName() + ":" + id);
    }

    @Override
    public void updateInDb() {
        System.out.println("Update:" + getModelName() + ":" + id);
    }

    @Override
    public void deleteFromDb() {
        System.out.println("Delete:" + getModelName() + ":" + id);
    }

}
