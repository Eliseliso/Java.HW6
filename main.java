import java.util.HashSet;
import java.util.Set;

public class main {
    public static void main (String[] args) {

        Set<HW6> set = new HashSet<>();
        set.add(new HW6("Notebook 1", 8, "Windows10", 80000, "HP"));
        set.add(new HW6("Notebook 2", 16, "Windows10", 85000, "Asus"));
        set.add(new HW6("Notebook 3", 32, "linux", 85000, "Lenovo"));
        set.add(new HW6("Notebook 4", 64, "linux", 90000, "Lenovo"));

        OperationWithNotebook operation = new OperationWithNotebook(set);
        operation.start();

    }
}