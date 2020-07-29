package DesignPatterns.memento;

import java.util.ArrayList;
import java.util.List;

public class DocHistory {

    private List<DocState> history = new ArrayList<>();

    public void push(DocState state) {
        history.add(state);
    }

    public DocState pop() {
        
    }
    
}