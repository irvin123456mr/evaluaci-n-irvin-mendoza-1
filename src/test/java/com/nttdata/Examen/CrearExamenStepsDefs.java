package com.nttdata.Examen;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.CoreMatchers.equalTo;

public class CrearExamenStepsDefs {

    @Step
    CrearExamen crearExamen;


    @When("creo el codigo con Id {int},title {string})
    public void crearExamen (int Id,String title){
        crearExamen.crearExamen(Id,title);

        
    }

    @Then("el código de respuesta es {int}")
    public void elCódigoDeRespuestaEs(int statusCode) {
        restAssuredThat(response -> response.statusCode(statusCode));
    }

    @And("el type es {string}")
    public void elTypeEs(String type) {
        restAssuredThat(response -> response.body("'type'",equalTo(type)));
        System.out.println("type: " + SerenityRest.lastResponse().body().path(":type").toString());
    }
}
