package com.example.classes.acessmodifiers.setofclasses2;

import com.example.classes.acessmodifiers.setofclasses1.AccessModifier;

public class TestSubClassTwo extends AccessModifier {

    public static void main(String[] args) {
        TestSubClassTwo testSubClassTwo = new TestSubClassTwo();
        testSubClassTwo.publicAccess();
        testSubClassTwo.protectedAccess();
        // Ni Default, ni Private pueden ser llamados aqui

        AccessModifier accessModifier = new AccessModifier();
        accessModifier.publicAccess();
        // De esta manera no import si se trata de su clase padre, solo puede llamarse sus métodos publicos.
    }
}
