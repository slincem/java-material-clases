package com.example.classes.acessmodifiers.setofclasses2;

import com.example.classes.acessmodifiers.setofclasses1.AccessModifier;

public class TestClassTwo {

    public static void main(String[] args) {
        AccessModifier accessModifier = new AccessModifier();
        accessModifier.publicAccess();
        // El resto no se pueden llamar.
    }
}
