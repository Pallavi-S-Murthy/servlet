package EmployeeDto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class EmpDto {

	@Id
	private String email;
	private int psw;
	private String name;
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getPsw() {
		return psw;
	}
	public void setPsw(int psw) {
		this.psw = psw;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
