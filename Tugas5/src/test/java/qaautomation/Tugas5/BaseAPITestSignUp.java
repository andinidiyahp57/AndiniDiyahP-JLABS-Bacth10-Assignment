package qaautomation.Tugas5;

import static io.restassured.RestAssured.given;

import org.testng.annotations.BeforeMethod;

import com.github.javafaker.Faker;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class BaseAPITestSignUp {
	
	RequestSpecification commonJsonSpec = new RequestSpecBuilder()
			.setBaseUri("https://api-staging-builder.engineer.ai")
			.setContentType(ContentType.JSON)
			.build().log().all();
	RequestSpecification loginJsonSpec;
	RequestSpecification signUpJsonSpec;
	
	String token;
	@BeforeMethod	
	
	public void signUp() {
		
		Faker fake = new Faker();
		String name = fake.name().firstName();
		String name2 = fake.name().lastName();
		String email = fake.internet().emailAddress();
		String phone = fake.phoneNumber().cellPhone();
		
		String payload = "{\"user\":{\"first_name\" : \""+name+"\",\"last_name\":\""+name2+"\","
				+ "\"email\":\""+email+"\",\"password\":\"builder123\","
				+ "\"phone_number\":\"+62-"+phone+"\",\"user_type\":\"User\",\"currency_id\":2}}";
		
		Response responseSignUp = given().spec(commonJsonSpec)
				.body(payload)
				.when().post("/users");
		token = responseSignUp.jsonPath().get("user.authtoken");
		
		signUpJsonSpec = new RequestSpecBuilder()
				.setBaseUri("https://api-staging-builder.engineer.ai")
				.setContentType(ContentType.JSON).addHeader("authtoken", token)
				.build().log().all();
	}
	

}
