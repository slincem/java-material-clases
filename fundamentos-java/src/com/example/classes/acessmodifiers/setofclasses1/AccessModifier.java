package com.example.classes.acessmodifiers.setofclasses1;

/**
 * Los modificadores de acceso son palabras reservadas que
 * determinan desde qué clases se puede acceder a un determinado elemento.
 *
 * En Java tenemos 4 tipos:
 *  - public:    misma clase, otra clase del mismo paquete, subclase de otro paquete, otra clase de otro paquete.
 *  - protected: misma clase, otra clase del mismo paquete, subclase de otro paquete.
 *  - default:   misma clase, otra clase del mismo paquete.
 *  - private    misma clase.
 *
 */
public class AccessModifier {

    public static void main(String[] args) {
        AccessModifier accessModifier = new AccessModifier();
        accessModifier.publicAccess();
        accessModifier.protectedAccess();
        accessModifier.defaultAcess();
        accessModifier.privateAccess();
    }

    public void publicAccess() {
        System.out.println("acceso publico");
    }

    private void privateAccess() {
        System.out.println("accesso privado");
    }

    protected void protectedAccess() {
        System.out.println("protected access");
    }

    void defaultAcess() {
        System.out.println("default access");
    }


}
