package cn.smbms.pojo;

import org.springframework.stereotype.Component;

@Component
public class Person {
	private int id;       //人员编号
	private String name;  //姓名
	private int gender;   //性别
	private int age;      //年龄
	private int rank;     //等级
	private String department;  //所在部门
	
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
	public int getGender() {
		return gender;
	}
	public void setGender(int gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", gender=" + gender + ", age=" + age + ", rank=" + rank
				+ ", department=" + department + "]";
	}
	
	

}
