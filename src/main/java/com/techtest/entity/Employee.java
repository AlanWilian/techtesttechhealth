package com.techtest.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tb_employee")
public class Employee {
	
	
		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		@Column(name="id")
		private int id;
		
		@Column(name="name")
		private String name;
		
		@Column(name="code")
		private String code;
		
		@Column(name="profession")
		private String profession;
		
		@Column(name="city")
		private String city;
		
		@Column(name="branch")
		private String branch;
		
		public int getId() {
			return id;
		}


		public void setId(int id) {
			this.id = id;
		}


		public String getName() {
			return name;
		}


		public void setName(String name) {
			this.name = name;
		}


		public String getCode() {
			return code;
		}


		public void setCode(String code) {
			this.code = code;
		}


		public String getProfession() {
			return profession;
		}


		public void setProfession(String profession) {
			this.profession = profession;
		}


		public String getCity() {
			return city;
		}


		public void setCity(String city) {
			this.city = city;
		}


		public String getBranch() {
			return branch;
		}


		public void setBranch(String branch) {
			this.branch = branch;
		}


		public Employee() {
			
		}

		public Employee(String name, String code, String profession) {
			this.name = name;
			this.code = code;
			this.profession = profession;
		}

		public Employee(int id, String name, String code, String profession, String city, String branch) {
			this.id = id;
			this.name = name;
			this.code = code;
			this.profession = profession;
			this.city = city;
			this.branch = branch;
		}


		@Override
		public String toString() {
			return "Employee [id=" + id + ", Name=" + name + ", code=" + code + ", profession=" + profession + "]";
		}

}
