package org.tracy.todoapi;

public class Task {
    String description;
    boolean isDone;

    //constructor
    Task(String description) {
        this.description = description;
        this.isDone = false;
    }

    //override
    @Override
    public String toString() {
        return (isDone ? "[Done] " : "[Not done] ")+description;
    }
}
