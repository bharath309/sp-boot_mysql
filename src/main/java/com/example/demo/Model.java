package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity(name = "test")
public class Model {
	@Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    Integer id;
    String a;
    String b;

}
