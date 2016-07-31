import java.util.HashMap;
import java.util.Map;

/**
 * Created by Leonid on 28.07.2016.
 *
 * TODO: архитектура???
 */
public class StudentGroups {
    public static void main(String[] args){
        Map<Student, Subjects[]> map = new HashMap<Student, Subjects[]>();
        map.put(new Student("Ivan", "Ivanov"), new Subjects[]{Subjects.MATHS, Subjects.ENGLISH});
        map.get(new Student("Ivan", "Ivanov"));
        Subjects kek = Subjects.ENGLISH;
        //kek.mark = 1.0;
    }
}

enum Subjects{
    MATHS{
        int mark;
    },
    ENGLISH{
        float mark;
    },
    HISTORY{
        float mark;
    },
    PE{
        int mark;
    };
}

class Student{
    private String firstName;

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    private String lastName;

    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {

        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}