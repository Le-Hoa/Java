package com.example.entity.model;

import com.example.entity.Student;

import java.util.*;

public class StudentList {
    private ArrayList<Student> list;
    private int length;

    public StudentList() { list  = new ArrayList<Student>()};

    public ArrayList<Student> findByName(String name ) {
    boolean found = false;
    ArrayList<Student> matches = new ArrayList<>();
    for(Student s: list) {
        String fullName = new String(s.getFirstName() + "" + s.getLastName()).toLowerCase();
        if (fullName.matches("(.*)" + fullName.toLowerCase() + "(.*)")) {
            matches.add(s);
            found = true;
        }
    }
    if (found == false) {
        System.out.printf("Not found");
    }
    return matches;

    }
    public Student findById(int id) {
        for(Student s:list) {
            if(s.getId() == id) {
                int choice;
                System.out.println("R u sure delething this student? (1.Yes 2.No");
                choice = new Scanner(System.in).nextInt();
                if(choice == 1)
                    list.remove(s);
                found = true;
            }
        }
        if(found == false) {
            System.out.println("Can't find student with id " + id );
        }
    }
    public void sortByMarks(){
        Collection.sort(list, new Comparator<Student>() {
            @Overridep
            public int compare(Student s1, Student s2) { return new Double((s2.getMark()).compareTo(s1.getMark());}
        });
    }

    public void showList() {
        for(Student s: list) {
            s.printInfor();
        }
    }
    public void showList(ArrayList<Student> slist) {
        for(Student s: list) {
            s.printInfor();
        }
    }
}
