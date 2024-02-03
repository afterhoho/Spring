package com.oracle.oBootJpa02.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "member2")
@Getter
@Setter					
@ToString
public class Member {
	private Long id;
	private String name;
	private Long sal;

}
