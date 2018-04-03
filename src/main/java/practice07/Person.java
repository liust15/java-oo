package practice07;

public class Person {
    String name;int age;
    public Person(String name,int age){
        this.age=age;
        this.name=name;
    }
    public String getName() {
        return name;
    }
    public int getAge(){
        return age;
    }
    public String introduce(){
        return  "My name is "+name+". I am "+age+" years old.";
    }
}