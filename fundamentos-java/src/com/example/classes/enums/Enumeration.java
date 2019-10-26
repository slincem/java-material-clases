package com.example.classes.enums;

public enum Enumeration {

    LOW_RANGE(0, 2),
    MEDIUM_RANGE(3, 5),
    HIGH_RANGE(5, 7);

    private final Integer starRange;
    private final Integer endRange;

    Enumeration(Integer starRange, Integer endRange) {
        this.starRange = starRange;
        this.endRange = endRange;
    }

    public Integer getStarRange() {
        return starRange;
    }

    public Integer getEndRange() {
        return endRange;
    }
}
