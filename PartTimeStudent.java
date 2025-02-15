
public class PartTimeStudent extends Student {
    private static int count = 0; // Biến đếm tĩnh cho PartTimeStudent
    private int minHour;
    private int maxHour;

    public PartTimeStudent() {
        count++; // Tăng biến đếm khi khởi tạo
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
        // Cài đặt đăng ký giờ
    }

    public static int count() {
        return count; // Trả về số lượng đối tượng PartTimeStudent đã được tạo
    }
}
