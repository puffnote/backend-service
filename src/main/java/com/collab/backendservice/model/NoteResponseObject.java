package com.collab.backendservice.model;

/**
 * Created by karthik on 2019-05-01
 */
public class NoteResponseObject {

    // These variable names reflect those being used in the UI for consistency
    private String uuid;
    private String title;
    private String content;
    private String userUUID;

    /**
     * Constructor that takes Note object and maps to values signified as in the UI
     * @param note
     */
    public NoteResponseObject(Note note) {
        this.uuid = note.getUUID();
        this.title = note.getName();
        this.content = note.getValue();
        this.userUUID = note.getUserUUID();
    }

}
