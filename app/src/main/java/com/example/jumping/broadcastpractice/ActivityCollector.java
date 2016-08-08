package com.example.jumping.broadcastpractice;

import android.app.Activity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jumping on 2016/8/8.
 */
public class ActivityCollector {
    public static List<Activity> activities = new ArrayList<Activity>();

    public static void addactivity(Activity activity){
        activities.add(activity);
    }

    public static void removeactivity (Activity activity){
        activities.remove(activity);
    }

    public static void finishall(){
        for (Activity activity:activities){
            if (!activity.isFinishing()){
                activity.finish();
            }
        }
    }
}
