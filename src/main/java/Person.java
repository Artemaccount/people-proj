import java.util.Objects;

public class Person {
    final String name;
    final String surname;
    Integer age;
    String address;

    public Person(String name, String surname) {
            this.name = name;
            this.surname = surname;
    }

    public Person(String name, String surname, Integer age) {
            this.name = name;
            this.surname = surname;
            this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }

    public Integer getAge() {
        return this.age;
    }

    public boolean hasAge() {
        return this.age != null;
    }

    public boolean hasAddress() {
        return this.address != null;
    }

    public PersonBuilder newChildBuilder() {
        return new PersonBuilder()
                .setSurname(this.surname)
                .setAddress(this.address);
    }

    public Person(PersonBuilder builder) {
        this.name = builder.name;
        this.surname = builder.surname;
        this.age = builder.age;
        this.address = builder.address;
    }

    public String getAddress() {
        return this.address;
    }

    public String setAddress(String address) {
        this.address = address;
        return "Новый адрес " + getSurname() + " " + getName() + ": " + getAddress();
    }

    public void happyBirthday() {
        System.out.println("У " + this.getSurname() + " " + getName() + " сегодня ДР");
        if(this.hasAge()){
            this.age++;
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, age, address);
    }
}
