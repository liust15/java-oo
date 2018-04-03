package practice11;

import java.lang.reflect.Field;

public class Person {
    int id;
    String name;
    int age;

    public Person(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String introduce() {
        return "My name is " + name + ". I am " + age + " years old.";
    }
    @Override
    public boolean equals(Object obj) {
        if(obj == this) return true;
        if(obj instanceof Person){
            try {
                Boolean check = true;
                Field[] objectFields = obj.getClass().getDeclaredFields();
                Field[] PersonFields = obj.getClass().getDeclaredFields();
                for(int i = 0;i< objectFields.length;i++){
                    if(!objectFields[i].get(obj).equals(PersonFields[i].get(this))){
                        check = false;
                        break;
                    }
                }
                return check;

            } catch (Exception e) {

                e.printStackTrace();
            }
            return true;
        }
        return false;
    }

    //重写hashCode方法，把对象的name和age属性转为一个字符串，返回次字符串的hashCode值
    @Override
    public int hashCode() {
        String id = this.name + this.age + "";
        return id.hashCode();
    }

}

