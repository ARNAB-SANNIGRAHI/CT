package day24_DSARevise;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Objects;

public class Employee{
	private int id;
	private String name;
	private String email;
	private int experience;
	private LocalDate dateOfBirth;
	private LocalTime timeOfBirth;
	private long phoneNumber;
	public Employee() {
		
	}
	public Employee(int id, String name, String email, int experience, LocalDate dateOfBirth, LocalTime timeOfBirth,
			long phoneNumber) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.experience = experience;
		this.dateOfBirth = dateOfBirth;
		this.timeOfBirth = timeOfBirth;
		this.phoneNumber = phoneNumber;
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
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public LocalTime getTimeOfBirth() {
		return timeOfBirth;
	}
	public void setTimeOfBirth(LocalTime timeOfBirth) {
		this.timeOfBirth = timeOfBirth;
	}
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	@Override
	public int hashCode() {
		return Objects.hash(dateOfBirth, email, experience, id, name, phoneNumber, timeOfBirth);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(dateOfBirth, other.dateOfBirth) && Objects.equals(email, other.email)
				&& experience == other.experience && id == other.id && Objects.equals(name, other.name)
				&& phoneNumber == other.phoneNumber && Objects.equals(timeOfBirth, other.timeOfBirth);
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", email=" + email + ", experience=" + experience
				+ ", dateOfBirth=" + dateOfBirth + ", timeOfBirth=" + timeOfBirth + ", phoneNumber=" + phoneNumber
				+ "]";
	}
}
