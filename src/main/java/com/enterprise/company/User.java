package com.enterprise.company;

import jakarta.persistence.*;

import java.time.Duration;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Locale;


@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE
    )
    @Column(
            name = "id"
    )
    private Long id;
    private String name;
    private LocalDate birthDate;

    @Transient
    private Integer age;
    private String email;
    private Integer salary;

    public User() {
    }

    public User(Long id, String name, LocalDate birthDate, String email, Integer salary) {
        this.id = id;
        this.name = name;
        this.birthDate = birthDate;
        this.age = (int)ChronoUnit.YEARS.between(birthDate, LocalDate.now());
        this.email = email;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", birthDate=" + birthDate +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", salary=" + salary +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public Integer getAge() {
        if (age == null) {
            age = (int)ChronoUnit.YEARS.between(birthDate, LocalDate.now());
        }
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }


}
