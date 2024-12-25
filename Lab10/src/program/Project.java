package src.program;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Project {

	private String name;
	private LocalDate startDate;
	private LocalDate finishDate;

	public String getName() {
		return name;
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public LocalDate getFinishDate() {
		return finishDate;
	}

	public int hours;

	public int getProjectTerm() {
		return (int) ChronoUnit.DAYS.between(startDate, finishDate);
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	public void setFinishDate(LocalDate finishDate) {
		this.finishDate = finishDate;
	}
}