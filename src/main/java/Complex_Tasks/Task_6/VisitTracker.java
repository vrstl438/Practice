package Complex_Tasks.Task_6;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class VisitTracker {
    private List<UserVisit> visitTrackerContainer = new ArrayList<>();

    public void addVisit(UserVisit visit) {
        visitTrackerContainer.add(visit);
    }

    public int countUniqueIP(){
        return visitTrackerContainer.stream()
                .map(UserVisit::getIP)
                .collect(Collectors.toSet())
                .size();
    }

    public List<String>
}
