package webtest;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Test;

public class appiumcek {
        @Test
        public void getEmployee(){
            Response responsePikachu = RestAssured
                    .given()
                    .baseUri("http://pokeapi.co")
                    .basePath("/api")
                    .get("v2/pokemon/pikachu");

            String pokemonPikachuName = responsePikachu.path("name");
            String pokemonPikachuNumber = responsePikachu.path("id").toString();
            System.out.println(pokemonPikachuName);
            System.out.println(pokemonPikachuNumber);
        }
    
}
