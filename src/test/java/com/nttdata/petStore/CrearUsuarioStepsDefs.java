package com.nttdata.petStore;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.CoreMatchers.equalTo;

public class CrearUsuarioStepsDefs {

    @Step
    CrearUsuario crearUsuario;


    @When("creo el usuario con username {string},firstname {string},lastname {string}")
    public void crearUsuario (String username,String firsname,String lastname){
        crearUsuario.crearUsuario(username,firsname,lastname);

        
    }

    @Then("el código de respuesta es {int}")
    public void elCódigoDeRespuestaEs(int statusCode) {
        restAssuredThat(response -> response.statusCode(statusCode)); //verificar con video1:22
    }

    @And("el type es {string}")
    public void elTypeEs(String type) {
        restAssuredThat(response -> response.body("'type'",equalTo(type)));
        System.out.println("type: " + SerenityRest.lastResponse().body().path(":type").toString());
    }
}
