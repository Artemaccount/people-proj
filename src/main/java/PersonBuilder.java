public class PersonBuilder {
    protected String name;
    protected String surname;
    protected Integer age;
    protected String address;

    public PersonBuilder() {
    }

    public PersonBuilder setName(String name) {
        if (name == null) {
            throw new IllegalStateException("Имя не может быть пустым!");
        } else {
            this.name = name;
            return this;
        }
    }

    public PersonBuilder setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public PersonBuilder setAge(int age) {
        if (age < 0 || age > 125) {
            throw new IllegalArgumentException("Возраст не может быть меньше 0 и больше 125");
        } else {
            this.age = age;
            return this;
        }
    }

    public PersonBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public Person build() {
        if (name == null || surname == null) {
            throw new IllegalStateException("Имя и фамилия не могут быть пустыми!");
        } else {
            return new Person(this);
        }
    }
}