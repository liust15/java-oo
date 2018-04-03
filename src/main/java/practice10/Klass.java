package practice10;

import java.util.Set;

public class Klass {
    int number;
    Student leader;
    Set<Klass> set;

    public void assignLeader(Student student) {
        if (student.getKlass().equals(this)) {
            this.leader = student;
        } else {
            System.out.println("It is not one of us.");
        }
    }

    public Klass(Set<Klass> set) {
        this.set = set;
    }

    public Klass(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public String getDisplayName() {
        return "Class " + number;
    }

    public Student getLeader() {
        return leader;
    }

    public Boolean isIn(String number, String classes) {
        return classes.contains(number);
    }

    public void appendMember(Student jerry) {
        jerry.setKlass(this);
    }
}
