package main.java.TimFromMarketing;

public class Badge {
    public String print(Integer id, String name, String department) {
        if (department == null)
            return id == null ? String.format("%s - OWNER", name)
                    : String.format("[%s] - %s - OWNER", id, name);
        return id == null ? String.format("%s - %s", name, department.toUpperCase())
            : String.format("[%s] - %s - %s", id, name, department.toUpperCase());
    }
}
