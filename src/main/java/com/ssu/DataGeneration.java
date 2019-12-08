package com.ssu;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.javafaker.Faker;
import com.ssu.model.student.StudentRequest;

import java.util.ArrayList;
import java.util.List;

public class DataGeneration {

    public static void main(String[] args) throws JsonProcessingException {

        Faker faker = new Faker();

        List<StudentRequest> studentRequestList = new ArrayList<StudentRequest>();
        ObjectMapper objectMapper =new ObjectMapper();


        for (int i = 0; i < 100; i++) {

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
            studentRequestList.add(student);
        }

        for (StudentRequest studentRequest : studentRequestList) {
            System.out.println(objectMapper.writeValueAsString(studentRequest));
        }

    }
}
