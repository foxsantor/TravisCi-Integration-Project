package com.sawwo.test.project.entities;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class TestEntity {
private int number;
private String charSequence;

    public TestEntity(int number, String charSequence) {
        this.number = number;
        this.charSequence = charSequence;
    }
}
