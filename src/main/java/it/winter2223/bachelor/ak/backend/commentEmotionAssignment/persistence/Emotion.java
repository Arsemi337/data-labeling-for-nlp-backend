package it.winter2223.bachelor.ak.backend.commentEmotionAssignment.persistence;

import java.util.Arrays;
import java.util.function.Predicate;

public enum Emotion {
    ANGER, FEAR, JOY, LOVE, SADNESS, SURPRISE;

    public static boolean contains(String value) {
        return Arrays.stream(values()).map(Enum::name).anyMatch(Predicate.isEqual(value));
    }
}
