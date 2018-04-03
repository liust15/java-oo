package practice09;

public class Klass {
    int number;
    Student leader;



    public void assignLeader(Student student) {
        if (student.getKlass().equals(this)) {
            this.leader = student;
        } else {
            System.out.println("It is not one of us.");
        }

        //  return student;
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

    public void appendMember(Student jerry) {
        jerry.setKlass(this);
      //  this.leader=jerry;


    }
}
