package day21_DSARecursionDp;

import java.time.LocalDate;
import java.util.Objects;

public class Student {

	private int id;
	private String name;
	private String email;
	private String gender;
	private LocalDate localDate;

	public Student(int id, String name, String email, String gender, LocalDate localDate) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.gender = gender;
		this.localDate = localDate;
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

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public LocalDate getLocalDate() {
		return localDate;
	}

	public void setLocalDate(LocalDate localDate) {
		this.localDate = localDate;
	}

	@Override
	public int hashCode() {
		return Objects.hash(email, gender, id, localDate, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(email, other.email) && Objects.equals(gender, other.gender) && id == other.id
				&& Objects.equals(localDate, other.localDate) && Objects.equals(name, other.name);
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", email=" + email + ", gender=" + gender + ", localDate="
				+ localDate + "]";
	}

}
