package asp;



import java.util.Comparator;

public class ActivityComparator implements Comparator<Activity> {
    @Override
    public int compare(Activity a1, Activity a2) {
        return a1.getEnd() - a2.getEnd(); // end time ascending
    }
}
