package entity;

import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;

public class User {
	
	private int id;

	@Pattern(regexp="[A-Za-z]{5,15}+", message="Klaidingai ivestas vardas!")
	private String name;

	@Pattern(regexp=".+@.+\\..+", message="Klaidingai ivestas el. pastas!")
	private String email;
	
	@Min(value = 18, message = "Amzius turi buti ne mazesnis kaip 18m.")
	private int age;

	public User() {
	}

	public User(int id, String name, String email, int age) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.age = age;
	}

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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
