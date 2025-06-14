package creation_patterns.database_singleton_pattern;

public class Main {
    public static void main(String[] args) {
        Database db = Database.getInstance();

        db.query("SELECT * FROM users");
    }
}
