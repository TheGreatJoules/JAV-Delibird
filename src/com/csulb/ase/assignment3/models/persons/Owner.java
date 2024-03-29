package com.csulb.ase.assignment3.models.persons;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class Owner extends Person {
    @NonNull
    private String username;
    @NonNull
    private String password;
    private Double revenue;
    private Double expense;
}
