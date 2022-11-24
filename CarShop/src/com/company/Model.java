package com.company;

public enum Model {
    GRANTA("Granta"),
    FILDER("Filder"),
    LACETTI("Lacetti"),
    ZAFIRA("Zafira"),
    ENZO("Enzo");

    private final String name;

    Model(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
