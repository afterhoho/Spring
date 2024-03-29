package com.oracle.oBootJpa01.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

// @Entity : JPA가 DB 관리하기 위해 필요함 (MyBatis에서의 명칭은 DTO)
   // 객체모델링, 논리모델링에서는 Entity. 물리모델링에서는 Table. 명칭 차이!

@Entity
@Table(name = "member1")
@Getter
@Setter
@ToString
public class Member {

   // @Id : DB column
   @Id
   private Long id;
   private String name;
   
//   public String trString() {
//	   // return super.toString();
//	   String returnStr="";
//	   returnStr = "[id:"+this.id+",name:"+this.name+"]";
//	   return returnStr;
//   }
   
   
   
   
   
//   public Long getId() {
//      return id;
//   }
//   public void setId(Long id) {
//      this.id = id;
//   }
//   public String getName() {
//      return name;
//   }
//   public void setName(String name) {
//      this.name = name;
//   }
   
}