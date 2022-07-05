package Cat_Api_test.Cat_Api_test;

import org.hamcrest.Matchers;
import org.junit.Test;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.given;


public class CatFact {
	@Test
	 public void ressponseAssertion() {

	      //base URL
	      RestAssured.baseURI = "https://cat-fact.herokuapp.com";

	      //GET operation
	      given() .when().get("/#/cat/facts/5887e1d85c873e0011036889").
	      then().log().all()

	      //verify status code as 200
	      .assertThat().statusCode(200)

	      //verify body
	      .body("isEmpty()", Matchers.is(false));

	      
	   }

}
