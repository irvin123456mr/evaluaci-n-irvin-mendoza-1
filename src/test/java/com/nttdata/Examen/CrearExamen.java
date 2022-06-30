package com.nttdata.Examen;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

public class CrearExamen {

    private static String CREATE_EXAMEN = "https://petstore.swagger.io/v2/user";


    @Step("Crear los valores {0} en examen")
    public void crearExamen(int Id, String title){
        SerenityRest.given()
                .contentType("application/json")
                .body("{\n" +
                        "  \"Id\":\" "+45335136+"\",\n" +
                        "  \"title\":\" "+evaluacion+"\",\n" +
                        "}")

                .get(CREATE_EXAMEN);
    }
}
