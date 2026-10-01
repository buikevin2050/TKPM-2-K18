package starter.v6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class IOMemory {
    private final List<Long> results = new ArrayList<>();

    public void save(long result) {
        results.add(result);
    }

    public boolean contains(long result) {
        return results.contains(result);
    }

    public List<Long> getResults() {
        return Collections.unmodifiableList(results);
    }
}