package org.example.dotstart.lombok;


import lombok.NonNull;

public class NonNullExample {
    private String name;

    public NonNullExample(@NonNull String person) {
        this.name = person;
    }
}
