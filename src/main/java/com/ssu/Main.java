package com.ssu;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.javafaker.Faker;
import com.ssu.comon.Payload;
import com.ssu.model.student.StudentRequest;
import io.restassured.RestAssured;


import java.io.IOException;

import static io.restassured.RestAssured.given;

public class Main {

    public static void main(String[] args) throws IOException {

        /*GLOBAL CONFIGURATIONS*/
        /*RestAssured.baseURI = "http://localhost:8080";
        RestAssured.basePath = "/api/v1";

        ObjectMapper objectMapper = new ObjectMapper();*/


        /*Employee atherKhan = new Employee(1, "Ather", "Khan");
        Employee arizSiddi = new Employee(1, "Ariz", "Siddi");

        System.out.println(Employee.workingDay);

        System.out.println("");*/

        /*given()
                .when()
                .header("clientId", "web")
                .header("Content-Type", "application/json")
                .body(Payload.studentPayload)
                .post("/create").then().log().all();*/

//        System.out.println(Payload.studentPayload);

        /*FileInputStream fileReader = new FileInputStream("E:\\Intellij_Workspace\\rest-automation-test\\src\\main\\resources\\student\\student__post_payload.json");
        System.out.println(fileReader.);*/

        /*JSONObject studentPayload = new JSONObject();
        studentPayload.put("ID", UUID.randomUUID());

        studentPayload.put("firstName","Tester1");
        studentPayload.put("lastName","test2");
        studentPayload.put("country","Pakistan");
        studentPayload.put("admissionDate","99999");

        System.out.println(studentPayload);*/


        /*========================DATA GENERATION USING FAKER API===========================*/
        /*Faker faker = new Faker();

        StudentRequest student = new StudentRequest();
        student.setFirstName(faker.company().name());
        student.setLastName(faker.name().lastName());
        student.setDescription(faker.lorem().paragraph());
        student.setEmail(faker.internet().emailAddress());
        student.setAge(String.valueOf(faker.number().numberBetween(18, 90)));
        student.setCity(faker.address().city());
        student.setCountry(faker.address().country());
        student.setAddress(faker.address().fullAddress());
        student.setMobile(faker.phoneNumber().phoneNumber());
        student.setAdmissionDate(faker.date().birthday().toString());
        student.setProgramme(faker.educator().course());

        String[] arrayOfCourse = {faker.educator().course(), faker.educator().course(), faker.educator().course()};
        student.setCourses(arrayOfCourse);

        //System.out.println(objectMapper.writeValueAsString(student));

        System.out.println();

        String studentPojoPayload = objectMapper.writeValueAsString(student);

        String studentResponse = String.valueOf(given()
                .when()
                .header("clientId", "web")
                .header("Content-Type", "application/json")
                .body(studentPojoPayload)
                .post("/create").then().extract().body().asString());

        System.out.println("");*/

        given().when()
                .auth()
                .oauth("f5RMZoBRki4NEMoyo0iepFS0S", "i3mtvhasRFVxEljrdD56AVtwUBWJRf78FVuKDZcnQuf20xB0FE", "950372055073153025-KYaLc80WYidb2q060aZm9upr43LpCKT", "t9LvNqQDJ6SsaA1HeQTYtBmQqd1oen7p6P18OYogaYh4Q")
                .get("https://api.twitter.com/1.1/statuses/home_timeline.json").then().log().all();














    }
}
