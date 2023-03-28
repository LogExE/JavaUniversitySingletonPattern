public class Main {
    public static void main(String[] args) {
        UniversitySystem us = UniversitySystem.getInstance();
        us.addCourse("Calculus");
        us.addTask("Calculus", "Demidovich, 666-668");
        us.addTask("Calculus", "Pinned pdf");
        us.addStudent("Calculus", "Vladimir Tkachev");
        us.addMark("Calculus", "Vladimir Tkachev", 4);
        us.addStudent("Calculus", "Pavel Fedorov");
        us.addMark("Calculus", "Pavel Fedorov", 5);

        us.addCourse("NIR");
        us.addTask("NIR", "Report");
        for (String student : new String[] {"Vladimir Tkachev",
                                            "Oleg Yankovsky",
                                            "Maxim Hasanov",
                                            "Danila Nagurny"
        }) {
            us.addStudent("NIR", student);
        }

        System.out.println("Courses:");
        for (String course : us.getCourses())
            System.out.println(course);
        System.out.println();
        System.out.println("Tasks in Calculus:");
        for (String task : us.getTasks("Calculus"))
            System.out.println(task);
        System.out.println();
        System.out.println("Students in NIR:");
        for (String student : us.getStudents("NIR"))
            System.out.println(student);
    }
}