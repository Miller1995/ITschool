package challengeShopping;

import challengeShopping.models.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ChallengeShopping {

    public static void main(String[] args) {

        Student student1 = new Student("Nirca", "Anton", 39,"nirca@mail.ru", true);    // add object student use constructor
        Student student2 = new Student("Goto", "Ion", 19,"goto@mail.ru", false);
        Student student3 = new Student("Purca", "Mati", 14,"mati@mail.ru", false);
        Student student4 = new Student("aaaaa", "bbbbb", 55,"aaaa@mail.ru", true);
        Student student5 = new Student("cccccc", "ccccc", 11,"qqqqqq@mail.ru", false);
        Student student6 = new Student("tttttt", "tttttt", 88,"ttttttttt@mail.ru", false);

        List<Student> studentList = new ArrayList<>();  // created new array list
        studentList.add(student1);                      // add new student in array use method add
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);
        studentList.add(student5);
        studentList.add(student6);
        for(Student student : studentList)
            System.out.println(student);
        System.out.println("----------------------------------------------------------------");

        List<Student> graduateList = new ArrayList<Student>(studentList);  // created new array list in based on the previous list with the same dimensions
        Collections.copy(graduateList, studentList);                        // copy one list to another list use method copy from Collection first param is new list and sec param is list from copy
        for (Student student : graduateList){
            if (student.isGraduate() )                                      // if isGraduate is true print list
            System.out.println(student);
        }

    }
}
