package com.github.igorperikov.jraft.handler.consensus;

import com.github.igorperikov.jraft.Node;
import com.github.igorperikov.jraft.handler.MessageHandler;
import com.github.igorperikov.jraft.infrastructure.MaelstromMessage;
import org.springframework.stereotype.Component;

@Component
public class AppendEntriesHandler implements MessageHandler {
    private final Node node;

    public AppendEntriesHandler(Node node) {
        this.node = node;
    }

    @Override
    public MaelstromMessage handle(MaelstromMessage maelstromMessage) {
        return null;
    }
}