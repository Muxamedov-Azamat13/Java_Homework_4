package market;

public class Customer {
    public String name;
    public int age;
    public int number;
    public Gender gender;

    public enum Gender{
        MALE, FEMALE, OTHER
    }

    public Customer(String name, int age, int number, Gender gender) {
        this.name = name;
        this.age = age;
        this.number = number;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Buyer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", number=" + number +
                '}';
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getNumber() {
        return number;
    }

    public Gender getGender() {
        return gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }
}
