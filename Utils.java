import java.util.Collection;
import java.util.function.Predicate;

public class Utils {
    public static <T> int countIf(Collection<T> collection, Predicate<T> condition) {
        int count = 0;
        for (T element : collection) {
            if (condition.test(element)) {
                count++;
            }
        }
        return count;
    }
}
