package com.ohgiraffers.hw1.model.dto;

public class EmployeeDTO extends PersonDTO{
    private int salary;
    private String dept;

    public EmployeeDTO() {
    }

    public EmployeeDTO(String name, int age, double height, double weight, int salary, String dept) {
        super(age, height, weight);
        super.name = name;
        this.salary = salary;
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "EmployeeDTO{" + " name=" + super.name + " age=" + super.getAge() + " height=" + super.getHeight() + " weight=" + super.getWeight() +
                "salary=" + salary +
                ", dept='" + dept + '\'' +
                '}';
    }
}
