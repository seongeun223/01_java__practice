package com.ohgiraffers.hw1.run;

import com.ohgiraffers.hw1.model.dto.EmployeeDTO;
import com.ohgiraffers.hw1.model.dto.PersonDTO;
import com.ohgiraffers.hw1.model.dto.StudentDTO;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        PersonDTO personDTO = new PersonDTO();
        personDTO.getInformation();

        StudentDTO studentDTO1 = new StudentDTO();
        studentDTO1.getInformation();
        StudentDTO[] studentDTOS = new StudentDTO[3];
        studentDTOS[0] = new StudentDTO("홍길동", 20, 178.2, 70.0, 1, "정보시스템학과");
        studentDTOS[1] = new StudentDTO("김말똥", 21, 187.3, 80.0, 2, "경영학과");
        studentDTOS[2] = new StudentDTO("강개순", 23, 167.0, 45.0, 4, "정보통신학과");

        for(StudentDTO studentDTO : studentDTOS) {
            System.out.println(studentDTO);

        }

        EmployeeDTO employeeDTO = new EmployeeDTO();
        employeeDTO.getInformation();

        EmployeeDTO[] employeeDTO1 = new EmployeeDTO[10];
        employeeDTO1[0] = new EmployeeDTO("박보검", 26, 180.3, 72.0, 100000000, "영업부");
        employeeDTO1[1] = new EmployeeDTO("강동원", 38, 182.0, 76.0, 200000000, "기획부");

        int count = 2;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("이름을 입력하세요.");
            String name = sc.next();
            System.out.println("나이를 입력하세요.");
            int age = sc.nextInt();
            System.out.println("신장을 입력하세요.");


            System.out.println("이름을 입력하세요.");
            System.out.println("이름을 입력하세요.");
            System.out.println("이름을 입력하세요.");
        }


    }
}
