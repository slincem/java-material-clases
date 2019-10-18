package com.example.classes.acessmodifiers.setofclasses1;

public class TestSubClassOne extends AccessModifier {

    public static void main(String[] args) {
        TestSubClassOne testSubClassOne = new TestSubClassOne();
        testSubClassOne.publicAccess();
        testSubClassOne.protectedAccess();
        testSubClassOne.defaultAcess();
    }
}
