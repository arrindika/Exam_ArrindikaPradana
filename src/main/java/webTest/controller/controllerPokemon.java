package webTest.controller;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class controllerPokemon {
    public Response getPokemon(){
        Response responsePikachu = RestAssured
                .given()
                .baseUri("http://pokeapi.co")
                .basePath("/api")
                .get("v2/pokemon/pikachu");
        return responsePikachu;
    }
}
