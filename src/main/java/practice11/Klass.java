package practice11;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Klass {
    int number;
    Student leader;
    Set<Klass> set;


    private List<IStuJoin> stuJoinJoin= new ArrayList<IStuJoin>();
    private List<IStuLeader> appointLeader= new ArrayList<IStuLeader>();

    public void assignLeader(Student student) {
        if (student.getKlass().equals(this)) {
            this.leader = student;
            for (IStuLeader leaderListener : appointLeader) {
                leaderListener.stuLeader(student,this);
            }
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
        for (IStuJoin iStuJoin : stuJoinJoin) {
            iStuJoin.stuJoin(jerry,this);
        }
    }

    public void registerJoin(IStuJoin iStuJoin) {
        System.out.println(iStuJoin);
        this.stuJoinJoin.add(iStuJoin);
    }

    public void registerLeader(IStuLeader iStuLeader) {
        this.appointLeader.add(iStuLeader);
    }
}
