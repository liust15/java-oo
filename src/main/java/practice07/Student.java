package practice07;

public class Student extends Person {
    Klass klass;
    public Student(String name,int age,Klass klass){
        super(name,age);
        this.klass=klass;
    }
    public Student(String name,int age){
        super(name,age);

    }
    public Klass getKlass(){
        return klass;
    }public String introduce(){
        return "My name is "+name+". I am "+age+" years old. I am a Student. I am at Class "+klass.getNumber()+".";
    }
}
