package com.github.igorperikov.jraft.infrastructure;

import com.github.igorperikov.jraft.infrastructure.constants.MessageFields;
import org.springframework.stereotype.Component;

import java.util.Objects;

@Component
public class MessageValidator {
    public void validate(MaelstromMessage message) {
        Objects.requireNonNull(message.getDest());
        Objects.requireNonNull(message.getBody());
        Objects.requireNonNull(message.getBody().get(MessageFields.BODY_MSG_TYPE));
    }
}