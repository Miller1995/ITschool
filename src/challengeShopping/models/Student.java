package challengeShopping.models;

public class Student {
    private String name;
    private String surname;
    private String email;
    private int age;
    private boolean graduate;

    // created default constructor
    public Student(){}

    // created of constructor with parameters
    public Student(String name, String surname, int age, String email, boolean graduate) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.age = age;
        this.graduate = graduate;
    }


    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isGraduate() {
        return graduate;
    }

    public void setGraduate(boolean graduate) {
        this.graduate = graduate;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", graduate=" + graduate +
                '}';
    }
}



