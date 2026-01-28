import java.util.ArrayList;
import java.util.List;

public class ActivityStack {
    private List<String> stack = new ArrayList<>();

    public void push(String activity) {
        stack.add(activity);
    }

    public void display() {
        if (stack.isEmpty()) {
            System.out.println("No recent activities.");
            return;
        }
        for (int i = stack.size() - 1; i >= 0; i--) {
            System.out.println(stack.get(i));
        }
    }
}
