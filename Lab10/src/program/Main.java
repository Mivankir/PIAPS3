package src.program;

import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;

public class Main {
    public static void main(String[] args) {
        Project project = new Project();
        project.setName("Project");
        project.setStartDate(LocalDate.parse("2024-12-12"));
        project.setFinishDate(LocalDate.parse("2025-12-12"));
        Employee employee = new Employee();
        System.out.println(employee.getSalary(project.getProjectTerm()));
    }
}