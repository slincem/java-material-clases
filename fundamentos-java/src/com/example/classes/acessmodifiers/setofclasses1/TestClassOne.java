package com.example.classes.acessmodifiers.setofclasses1;

public class TestClassOne {

    public static void main(String[] args) {
        AccessModifier accessModifier  = new AccessModifier();
        accessModifier.publicAccess();
        accessModifier.protectedAccess();
        accessModifier.defaultAcess();
        //accessModifier.privateAccess(); NO ES POSIBLE!.
    }
}
