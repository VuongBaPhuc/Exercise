public class PartTimeStudent extends Student {
    private static int count = 0; 
    private int minHour;
    private int maxHour;

    public PartTimeStudent() {
        count++; 
    }

    public PartTimeStudent(String name, String major, String id) {
        super(name, major, id);
        count++;
    }

    public PartTimeStudent(String name, String major, String id, int minHour, int maxHour) {
        super(name, major, id);
        this.minHour = minHour;
        this.maxHour = maxHour;
        count++;
    }

    public void registerHour(int hour) {
    
    }

    public static int count() {
        return count; 
    }
}
