package com.interview.questions;

import java.util.*;


//Learning Link : https://www.youtube.com/watch?v=ZA2oNhtNk3w
class Student implements Comparable<Student>{
    int age;
    String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Student o) {
        if(o.age < this.age)
            return 1;
        else
            return -1;
    }
}
public class ComparatorAndComparable {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(43, 11, 46, 72, 49);

        //if we can sort in Ascending order
        //Collections.sort(numbers);

        //If we sort based on number last digit we need to use Comparator and write our own logic
        //Collections work only on WrapperCLasses
        //The below is a way of implementing interface known as anynomous interface
        Comparator<Integer> comparator = (Integer o1, Integer o2) -> {
//                if (o1 % 10 > o2 % 10)
//                    return 1;
//                else
//                    return -1;
            return o1 % 10 > o2 % 10 ? 1 : -1;
        };

        //This one also works fine but need to pass studentComparator inside Collections.sort(student,studentComparator)
        Comparator<Student> Studentcomparator = (Student o1, Student o2) -> {
//                if (o1 % 10 > o2 % 10)
//                    return 1;
//                else
//                    return -1;
            return o1.age > o2.age ? 1 : -1;
        };

        Collections.sort(numbers,comparator);
        System.out.println(numbers);// we can't directly add above line in print as it retuns void


        //Sort String based on Length
        List<String> names = Arrays.asList("Sai","Sravan","ramudu","rama");
        Collections.sort(names,Comparator.comparing(String::length));
        names.stream().sorted(Comparator.comparing(String::length));
        System.out.println(names);


        List<Student> student = new ArrayList<>();
        student.add(new Student(21,"Sai"));
        student.add(new Student(24,"Ram"));
        student.add(new Student(23,"Suresh"));
        student.add(new Student(19,"Navin"));
        student.add(new Student(20,"mahesh"));

//        student.stream()
//                .sorted(Comparator.comparingInt(Student::getAge))
//                .forEach(System.out::println);
        Collections.sort(student);
        System.out.println(student);
        //So here Integer already implements Comparator so normal sort works
        // if we want to use Collection.sort(student) our class should implement Comparable
        //if we want to give power to the class itself to compare then we need Comparable
    }
}
