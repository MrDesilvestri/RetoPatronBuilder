package org.example.patronbuilder;

import org.example.transferencia.datos.Estudiante;

public class PatronBuilderMain {
    public static void main(String[] args) {
        Estudiante est = new Estudiante.EstudianteBuilder()
                .setNombre("Gilberto Santarrosa")
                .setGenero("Masculino")
                .setEdad(49)
                .setCarrera("Ingeniería de Sistemas")  // Usando el nuevo método
                .setDireccion("Santurce "
                        + "San Juan", "Puerto Rico", "Puerto Rico", "03400")
                .addContactos("Fania All Star", "555777888", "123", "Estudios",
                        "New York", "Estados Unidos"
                        , "USA", "10023")
                .addContactos("Ruben Blades", "202020", null, "Celular")
                .addTelefonos("88889999", null, "Celular")
                .addTelefonos("1010103030", null, "Estudios")
                .build();
        System.out.println(est);
    }
}
