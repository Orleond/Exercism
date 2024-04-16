package main.java.TimFromMarketing;

public class Badge {
    public String print(Integer id, String name, String department) {

        return String.format("%s%s - %s", id == null ? "" : "[" + id + "] - ",
                name,
                department == null ? "OWNER" : department.toUpperCase());
    }
}
