package asp;
import java.util.*;
public class ActivitySelection {
    public static List<Activity> selectActivities(List<Activity> activities) {
        Collections.sort(activities); // end time অনুযায়ী sort
        List<Activity> selectedActivities = new ArrayList<>();
        int lastEndTime = -1;

        for (Activity activity : activities) {
            if (activity.getStart() >= lastEndTime) {
                selectedActivities.add(activity);
                lastEndTime = activity.getEnd();
            }
        }

        return selectedActivities;
    }
}