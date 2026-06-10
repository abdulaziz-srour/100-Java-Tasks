import java.time.ZoneId;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Task59 {
    /**
     * Streams and filters the globally available system time zone IDs to select
     * specific regions in America and Europe, sorting them alphabetically.
     *
     * @return a sorted Set of time zone IDs that start with "America/L" or "Europe/S"
     */
    static Set<String> selectedAmericanAndEuropeanTimeZones(){
        return ZoneId.getAvailableZoneIds().stream()
                .filter(e -> e.startsWith("America/L") || e.startsWith("Europe/S"))
                .collect(Collectors.toCollection(TreeSet::new));
    }

    static void main() {
        System.out.println(selectedAmericanAndEuropeanTimeZones());
    }
}
