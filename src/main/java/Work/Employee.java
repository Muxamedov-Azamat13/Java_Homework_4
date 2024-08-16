package Work;

public class Employee {
    public String name;
    public String midName;
    public String surName;
    public String jobTitle;
    public int number;
    public int salary;
    public int age;

    public Employee(String name, String midName, String surName, String jobTitle, int number, int salary, int age) {
        this.name = name;
        this.midName = midName;
        this.surName = surName;
        this.jobTitle = jobTitle;
        this.number = number;
        this.salary = salary;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getMidName() {
        return midName;
    }

    public String getSurName() {
        return surName;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public int getNumber() {
        return number;
    }

    public int getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMidName(String midName) {
        this.midName = midName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void printInfo(){
        System.out.println("Employee = name= " + name + "midName= " + midName +
                "surname= " + surName + "job= " + jobTitle + "number= " + number + "salary=" + salary +
                "age= " + age);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", midName='" + midName + '\'' +
                ", surName='" + surName + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", number=" + number +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }

    private static void salary(Employee[] emp){
        for (int i = 0; i < emp.length; i++) {
            if (emp[i].getAge() > 45){
                emp[i].setSalary(50000);
            }
        }
    }

    public int compareDate(int year1, int month1, int day1,int year2, int month2, int day2){
        int date1 = year1 * 10000 + month1 * 100 + day1;
        int date2 = year2 * 10000 + month2 * 100 + day2;
        return Integer.compare(date1, date2);
    }



}
