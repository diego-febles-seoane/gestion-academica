package es.ies.puerto;

public class Ejercicio {
    static Persona persona;
    public static void main(String[] args) {
        persona = new Estudiante("Diego","b06g06107q", 18,"45980080K");
        System.out.println(persona.saludar());
    }
}
