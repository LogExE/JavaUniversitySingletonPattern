import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class UniversitySystem {
    private static UniversitySystem instance;

    private HashMap<String, ArrayList<String>> tasks;
    private HashMap<String, HashMap<String, ArrayList<Integer>>> marks;

    private UniversitySystem() {
        tasks = new HashMap<>();
        marks = new HashMap<>();
    }

    public static UniversitySystem getInstance() {
        if (instance == null)
            instance = new UniversitySystem();
        return instance;
    }

    public Set<String> getCourses() {
        return tasks.keySet();
    }

    public void testCourse(String course) {
        if (!tasks.containsKey(course))
            throw new IllegalArgumentException("Couldn't find course " + course + "!");
    }
    public void testStudent(String course, String student) {
        if (!marks.get(course).containsKey(student))
            throw new IllegalArgumentException("Couldn't find student "
                    + student + " at course " + course + "!");
    }
    public ArrayList<String> getTasks(String course) {
        testCourse(course);
        return tasks.get(course);
    }
    public Set<String> getStudents(String course) {
        testCourse(course);
        return marks.get(course).keySet();
    }
    public void addCourse(String name) {
        tasks.put(name, new ArrayList<>());
        marks.put(name, new HashMap<>());
    }
    public void addTask(String course, String task) {
        testCourse(course);
        tasks.get(course).add(task);
    }
    public void addStudent(String course, String student) {
        testCourse(course);
        marks.get(course).put(student, new ArrayList<>());
    }
    public void addMark(String course, String student, int mark) {
        testCourse(course);
        testStudent(course, student);
        marks.get(course).get(student).add(mark);
    }
}
