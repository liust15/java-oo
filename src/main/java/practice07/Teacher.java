package practice07;

public class Teacher extends Person {
    Klass klass;

    public Teacher(String name, int age, Klass klass) {
        super(name, age);
        this.klass = klass;
    }

    public Teacher(String name, int age) {
        super(name, age);
    }

    public Klass getKlass() {
        return klass;
    }

    public String introduce() {
        if (klass==null) {
            return "My name is " + name + ". I am " + age + " years old. I am a Teacher. I teach No Class.";
        } else {
            return "My name is " + name + ". I am " + age + " years old. I am a Teacher. I teach Class " + klass.getNumber() + ".";
        }
    }

    public String introduceWith(Student student) {
        if(student.klass.getNumber()==klass.getNumber()){
            return "My name is Tom. I am 21 years old. I am a Teacher. I teach Jerry.";
        }else {
        return "My name is Tom. I am 21 years old. I am a Teacher. I don't teach Jerry.";
    }}
}
