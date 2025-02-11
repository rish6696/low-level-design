package com.example.client;

import com.example.student.StudentBuilder;
import com.example.student.Student;

public class Client {
    public static void main(String[] args) {
        StudentBuilder studentBuilder = new StudentBuilder();
        Student student = studentBuilder.setAddress("Delhi").setCanteenFacility(false).setDepartment("CSE")
                .setEmail("sbbd@gmail.com").setFirstName("Rahul").build();

        System.out.println(student.toString());
    }
}
