package cucumber

this.metaClass.mixin(cucumber.api.groovy.EN)
import static io.restassured.RestAssured.*
import static io.restassured.matcher.RestAssuredMatchers.*
import static org.hamcrest.Matchers.*

Given(~/^a new user$/) { ->

}

When(~/^user enters the luncher$/) { ->
    get("http://localhost:5050/newUser").then().cookie("LUNCHERUID", notNullValue())
}

When(~/^gives its nickname$/) { ->
    post("http://localhost:5050/nick")
}
