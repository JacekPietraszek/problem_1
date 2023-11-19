import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int y = 0;
        int sum = 0;

        List<Integer> list = new ArrayList<>();
        for (int i = 1; i < 1000; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                list.add(i);
            }
        }
        while (y < list.size()) {
            sum += list.get(y);
            y++;
        }
        System.out.println(sum);
    }
}