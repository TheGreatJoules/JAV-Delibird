package com.csulb.ase.assignment3.models.persons;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@SuperBuilder
@AllArgsConstructor
public abstract class Person {
    @NonNull
    private String id;
    @NonNull
    private PersonEnum person_type;
    @NonNull
    private String first_name;
    private String middle_name;
    @NonNull
    private String last_name;
    private String phone_number;
    private String address;
    private String email;
    @NonNull
    private long start;
    private long end;

    public Person() {}
}
