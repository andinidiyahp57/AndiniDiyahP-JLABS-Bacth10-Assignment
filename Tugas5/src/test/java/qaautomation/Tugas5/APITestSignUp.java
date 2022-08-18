package qaautomation.Tugas5;

import static io.restassured.RestAssured.given;
import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import io.restassured.response.Response;


public class APITestSignUp extends BaseAPITestSignUp{	
	
	@Test
	public void signupAPI() {
		Response responseSignUp = given().spec(signUpJsonSpec).when().get("/user");
		assertEquals(responseSignUp.statusCode(), 200);
	}
	
		
}
