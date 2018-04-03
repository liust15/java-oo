package practice11;

import java.util.Set;

public class Teacher extends Person implements IStuJoin,IStuLeader {
    Klass klass;
    Set<Klass> classes;


    public Teacher(int id, String name, int age, Set<Klass> classes) {
        super(id, name, age);
        this.classes = classes;
        for (Klass klass : classes) {
            klass.registerJoin(this);
            klass.registerLeader(this);
        }
    }

    public Set<Klass> getClasses() {
        return classes;
    }

    public Teacher(int id, String name, int age) {
        super(id, name, age);
    }

    public Klass getKlass() {
        return klass;
    }

    @Override
    public String introduce() {
        if (classes == null) {
            return isTeaching() + " No Class.";
        } else {
            return isTeaching() + " Class " + teachClass(classes) + ".";
        }
    }

    public String teachClass(Set<Klass> klasses) {
        String teachClass = "";
        for (Klass str : klasses) {
            teachClass += str.getNumber() + ", ";
        }
        return teachClass.substring(0, teachClass.length() - 2);
    }

    public String isTeaching() {
        return super.introduce() + " I am a Teacher. I teach";
    }

    public Boolean isTeaching(Student student) {
        klass=new Klass(classes);
        return klass.isIn(String.valueOf(student.getKlass().getNumber()), teachClass(classes));
    }


    public String introduceWith(Student student) {
        String klass = String.valueOf(student.klass.getNumber());
        if (teachClass(classes).contains(klass)) {
            return super.introduce() + " I am a Teacher. I teach Jerry.";
        } else {
            return super.introduce() + " I am a Teacher. I don't teach Jerry.";
        }
    }


    @Override
    public void stuJoin(Student student, Klass klass) {
        System.out.printf("I am Tom. I know "+student.getName()+" has joined Class "+klass.getNumber()+".\n");
    }

    @Override
    public void stuLeader(Student student, Klass klass) {
        System.out.printf("I am "+getName()+". I know Jerry become Leader of Class 2.\n");
    }
}
