import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.*;
import java.util.stream.Collectors;

public class StreamExamples {
    public static void main(String... args)
    {
        List<Student> list = Arrays.asList(
                new Student(1, "Rohit", "Mall", 30, "Male", "Mechanical Engineering", 2015, "Mumbai", 122),
                new Student(2, "Pulkit", "Singh", 56, "Male", "Computer Engineering", 2018, "Delhi", 67),
                new Student(3, "Ankit", "Patil", 25, "Female", "Mechanical Engineering", 2019, "Kerala", 164),
                new Student(4, "Satish Ray", "Malaghan", 30, "Male", "Mechanical Engineering", 2014, "Kerala", 26),
                new Student(5, "Roshan", "Mukd", 23, "Male", "Biotech Engineering", 2022, "Mumbai", 12),
                new Student(6, "Chetan", "Star", 24, "Male", "Mechanical Engineering", 2023, "Karnataka", 90),
                new Student(7, "Arun", "Vittal", 26, "Male", "Electronics Engineering", 2014, "Karnataka", 324),
                new Student(8, "Nam", "Dev", 31, "Male", "Computer Engineering", 2014, "Karnataka", 433),
                new Student(9, "Sonu", "Shankar", 27, "Female", "Computer Engineering", 2018, "Karnataka", 7),
                new Student(10, "Shubham", "Pandey", 26, "Male", "Instrumentation Engineering", 2017, "Mumbai", 98));



        //List of student whose name starts with A
        List<Student> studentofAs = list.stream()
                .filter(student -> student.getFirstName().startsWith("A"))
                .collect(Collectors.toList());
        System.out.println(studentofAs);


        //Group The Student By Department Names
        Map<String, List<Student>> studentsGroupedByDept = list.parallelStream()
                .collect(Collectors.groupingBy(Student::getDepartmantName));
        System.out.println(studentsGroupedByDept);


        // Find the total count of student using stream
        long countOfStudents = list.stream().count();
        System.out.println(countOfStudents);

        //Find the max age of student
        OptionalLong maxAgeOFStudent = list.parallelStream().mapToLong(student -> student.getAge())
                .max();
        long maxAge = maxAgeOFStudent.getAsLong();
        System.out.println(maxAge);


        // Find all departments names
        List<String> alldeptnames  = list.parallelStream()
                .map(student -> student.getDepartmantName())
                .distinct()
                .collect(Collectors.toList());
        System.out.println(alldeptnames);

        //Find the count of student in each department
        Map<String, Long> studentsNumberByDept = list.parallelStream()
                .collect(Collectors.groupingBy(Student::getDepartmantName, Collectors.counting()));
        System.out.println(studentsNumberByDept);

        //Find the list of students whose age is less than 30
        List<Student> studentsAgeLessThan30 = list.parallelStream()
                .filter(student -> student.getAge() < 30)
                .collect(Collectors.toList());
        System.out.println(studentsAgeLessThan30);

        //Find the list of students whose rank is in between 50 and 100
        List<Student> studentsRankInRanges = list.parallelStream()
                .filter(student -> student.getRank() < 100 && student.getRank() > 50)
                .collect(Collectors.toList());
        System.out.println(studentsRankInRanges);

        //Find the average age of male and female students
        Map<String, Double> studentsAvgAgeByGender = list.parallelStream()
                .collect(Collectors.groupingBy(Student::getGender, Collectors.averagingDouble(Student :: getAge)));
        System.out.println(studentsAvgAgeByGender);

        // Find the department who is having maximum number of students
        String maxStudentDepartment = list.parallelStream()
                .collect(Collectors.groupingBy(Student::getDepartmantName, Collectors.counting()))
                .entrySet().stream().max(((o1, o2) -> Long.compare(o1.getValue(), o2.getValue())))
                .get().getKey();
        System.out.println(maxStudentDepartment);

        //Find the Students who stays in Delhi and sort them by their names (sorted() function can't be used with parallelstream())
        List<Student> sortedStudentsInDelhi = list.stream()
                .filter(Student -> Student.getCity().equals("Delhi"))
                .sorted((s1, s2) -> s1.getFirstName().compareTo(s2.getFirstName()))
                .collect(Collectors.toList());
        System.out.println(sortedStudentsInDelhi);

        //Find the average rank in all departments
        Map<String, Double> avgRankInAllDepts = list.parallelStream()
                .collect(Collectors.groupingBy(Student::getDepartmantName,
                        Collectors.averagingDouble(Student::getRank)));
        System.out.println(avgRankInAllDepts);


        //Find the highest rank in each department
        Map<String, Optional<Student>> highestRankInAllDepts = list.parallelStream()
                .collect(Collectors.groupingBy(Student::getDepartmantName,
                        Collectors.maxBy((s1,s2) -> Long.compare(s1.getRank(), s2.getRank()))));
        System.out.println(highestRankInAllDepts);

        //Find the list of students and sort them by their rank (sorted() function can't be used with parallelstream())
        List<Student> studentsSortedByRank = list.stream()
                .sorted((s1,s2) -> Long.compare(s1.getRank(), s2.getRank()))
                .collect(Collectors.toList());
        System.out.println(studentsSortedByRank);

        // Find the student who has second rank
        Student studentWithSecondRank = list.stream()
                .sorted((s1,s2) -> Long.compare(s1.getRank(), s2.getRank()))
                .skip(1)
                .findFirst()
                .get();
        System.out.println(studentWithSecondRank);


    }
}
