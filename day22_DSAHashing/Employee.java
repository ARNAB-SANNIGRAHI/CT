package day22_DSAHashing;

import java.time.LocalDate;
import java.util.Objects;

public class Employee implements Comparable<Employee> {
	
	private int EmployeeId;
	private String name;
	private String gender;
	private LocalDate DateOfBirth;
	private int experience;
	private String email;
	private long phonenumber;
	

public Employee(int employeeId, String name, String gender, LocalDate dateOfBirth, int experience, String email,
		long phonenumber) {
	super();
	EmployeeId = employeeId;
	this.name = name;
	this.gender = gender;
	DateOfBirth = dateOfBirth;
	this.experience = experience;
	this.email = email;
	this.phonenumber = phonenumber;
}

public int getEmployeeId() {
	return EmployeeId;
}
public void setEmployeeId(int employeeId) {
	EmployeeId = employeeId;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public LocalDate getDateOfBirth() {
	return DateOfBirth;
}
public void setDateOfBirth(LocalDate dateOfBirth) {
	DateOfBirth = dateOfBirth;
}
public int getExperience() {
	return experience;
}
public void setExperience(int experience) {
	this.experience = experience;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public long getPhonenumber() {
	return phonenumber;
}
public void setPhonenumber(long phonenumber) {
	this.phonenumber = phonenumber;
}
@Override
public int hashCode() {
	return Objects.hash(DateOfBirth, EmployeeId, email, experience, gender, name, phonenumber);
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
	return Objects.equals(DateOfBirth, other.DateOfBirth) && EmployeeId == other.EmployeeId
			&& Objects.equals(email, other.email) && experience == other.experience
			&& Objects.equals(gender, other.gender) && Objects.equals(name, other.name)
			&& phonenumber == other.phonenumber;
}
@Override
public String toString() {
	return "Employee [EmployeeId=" + EmployeeId + ", name=" + name + ", gender=" + gender + ", DateOfBirth="
			+ DateOfBirth + ", experience=" + experience + ", email=" + email + ", phonenumber=" + phonenumber + "]";
}
@Override
public int compareTo(Employee o) {
    System.out.println("compareTo() invoked");
    return this.getEmployeeId() - o.getEmployeeId();
}

}



