package src.program;
public class Employee {

	private int SSNumber;
	private String name;
	private String email;

	public int getSSNumber() {
		return SSNumber;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	private final int BASE_SALARY = 50;

	public void setSSNumber(int SSNumber) {
		this.SSNumber = SSNumber;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void addPosition() {
		// TODO - implement Employee.addPosition
		throw new UnsupportedOperationException();
	}

	public int getSalary(int days) {
		return days * BASE_SALARY;
	}

}