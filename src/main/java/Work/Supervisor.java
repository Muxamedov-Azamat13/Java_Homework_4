package Work;

public class Supervisor extends Employee{

    public Supervisor(String name, String midName, String surName, String jobTitle, int number, int salary, int age) {
        super(name, midName, surName, jobTitle, number, salary, age);
    }

    public static void setSalary(Employee[] employees, int salary){
        for (int i = 0; i < employees.length; i++) {
            if (!(employees[i] instanceof Supervisor)){
                employees[i].setSalary(employees[i].getSalary() + salary);
            }
        }
    }



}
