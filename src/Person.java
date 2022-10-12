class Person {
    private String name;
    private String surname;
    private int age;

    // создайте конструктор на все поля
    public Person(String Name, String Surname, int Age) {
        this.name = Name;
        this.surname = Surname;
        this.age = Age;
    }

    // создайте геттеры и сеттеры
    public void setName(String Name) {
        this.name = Name;
    }

    public void setSurname(String Surname) {
        this.surname = Surname;
    }

    public void setAge(int Age) {
        this.age = Age;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    // создайте toString
    @Override
    public String toString() {
        return name + " " + surname + " " + age;
    }
}