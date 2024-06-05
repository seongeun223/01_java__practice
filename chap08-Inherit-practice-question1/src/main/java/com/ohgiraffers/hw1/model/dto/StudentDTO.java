package com.ohgiraffers.hw1.model.dto;

public class StudentDTO extends PersonDTO{
    private int grade;
    private String major;

    public StudentDTO() {
    }

    public StudentDTO(String name, int age, double height, double weight, int grade, String major) {
        super(age, height, weight);
        super.name = name;
        this.grade = grade;
        this.major = major;
    }

    @Override
    public String toString() {
        return "StudentDTO{" + " name=" + super.name + " age=" + super.getAge() + " height=" + super.getHeight() + " weight=" + super.getWeight() +
                "grade=" + grade +
                ", major='" + major + '\'' +
                '}';
    }
}
