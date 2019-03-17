package com.puffnote.backendservice.controller;

import com.puffnote.backendservice.model.Note;
import com.puffnote.backendservice.model.NoteOperationObject;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

/**
 * Created by sudeshgutta on 2019-03-12
 */
@Controller
public interface NoteController {
    @MessageMapping("/note/{identifier}")
    @SendTo("/topic/room/{identifier}")
    //TODO: Add operation object as parameter to this method
    Note patchNote(@Payload NoteOperationObject payload);
}