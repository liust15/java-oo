package practice08;

public class Klass {
    int number;
    Student leader;

    public Klass() {

    }

    public void assignLeader(Student student) {
        this.leader = student;
        //  return student;
    }

    public Klass(int klass) {
        this.number = klass;
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


}
