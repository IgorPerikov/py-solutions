package com.github.igorperikov.jraft;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Getter
@Setter
@Component
public class Node {
    private String id;
    // index of highest log entry known to be committed (initialized to 0, increases monotonically)
    private int commitIndex;
    // index of highest log entry applied to state machine (initialized to 0, increases monotonically)
    private int lastApplied;

    private volatile NodeState nodeState = NodeState.FOLLOWER;

    // this section for leaders only, reinitialized after election
    // for each server, index of the next log entry to send to that server(initialized to leader last log index + 1)
    private Map<String, Integer> nextIndexes = new HashMap<>();
    // for each server, index of highest log entry known to be replicated on server(init to 0, increases monotonically)
    private Map<String, Integer> matchIndexes = new HashMap<>();
}