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

    public void addCourse(String name) {
        tasks.put(name, new ArrayList<>());
        marks.put(name, new HashMap<>());
    }
    public Set<String> getCourses() {
        return tasks.keySet();
    }
    public ArrayList<String> getTasks(String course) {
        return tasks.get(course);
    }
    public Set<String> getStudents(String course) {
        return marks.get(course).keySet();
    }
    public void addTask(String course, String task) {
        tasks.get(course).add(task);
    }
    public void addStudent(String course, String student) {
        marks.get(course).put(student, new ArrayList<>());
    }
    public void addMark(String course, String student, int mark) {
        marks.get(course).get(student).add(mark);
    }
}
