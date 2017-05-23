package com.github.Muserk.socketio.client.models;

/**
 * Implemented by all Models that persist in a Database
 */
public interface DBPersistent {
    void createInDb();
    void updateInDb();
    void deleteFromDb();
}
