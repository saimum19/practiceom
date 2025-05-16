package asp;



import java.util.*;

public class ActivitySelector {

    public static void main(String[] args) {
        ArrayList<Activity> activities = new ArrayList<>();

        // Start and End time দেওয়া হচ্ছে
        activities.add(new Activity(1, 3));
        activities.add(new Activity(2, 5));
        activities.add(new Activity(4, 6));
        activities.add(new Activity(6, 7));
        activities.add(new Activity(5, 8));
        activities.add(new Activity(8, 9));

        // end time অনুযায়ী sort করা হচ্ছে
        Collections.sort(activities, new ActivityComparator());

        System.out.println("Selected Activities:");

        int lastEnd = -1;

        for (Activity activity : activities) {
            if (activity.getStart() >= lastEnd) {
                System.out.println(activity);
                lastEnd = activity.getEnd();
            }
        }
    }
}

