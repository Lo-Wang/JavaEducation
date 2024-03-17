package lr2;

class Person {
    private String name;
    private int age;
    private String gender;

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    // Getter/setter методы для имени
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter/setter методы для возраста
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Getter/setter методы для пола
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}