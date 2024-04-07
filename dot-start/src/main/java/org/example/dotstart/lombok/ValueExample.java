package org.example.dotstart.lombok;


import lombok.AccessLevel;
import lombok.experimental.NonFinal;
import lombok.Value;
import lombok.With;
import lombok.ToString;

@Value public class ValueExample {
    String name;
    @With(AccessLevel.PACKAGE) @NonFinal int age;
    double score;
    protected String[] tags;

    @ToString(includeFieldNames=true)
    @Value(staticConstructor="of")
    public static class Exercise<T> {
        String name;
        T value;
    }
}