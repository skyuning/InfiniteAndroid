package me.skyun.infinite.global;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by linyun on 16/7/25.
 */
public class GlobalPref {

    public static final String SETTINGS = "settings";

    public static void set(Context context, String key, String value) {
        SharedPreferences preferences = context.getSharedPreferences(SETTINGS, Context.MODE_PRIVATE);
        if (value != null) {
            preferences.edit().putString(key, value).apply();
        } else {
            preferences.edit().remove(key).apply();
        }
    }

    public static String get(Context context, String key) {
        SharedPreferences preferences = context.getSharedPreferences(SETTINGS, Context.MODE_PRIVATE);
        return preferences.getString(key, null);
    }
}
