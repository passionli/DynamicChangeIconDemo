package com.liguang.dynamicchangeicondemo;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;

/**
 * 动态改变应用在Launcher中的图标和标题
 */
public class ChangeIconUtils {
    private static final String TAG = "ChangeIconUtils";
    private static final int DISPLAY_ICON_11 = 11;
    private static final int DISPLAY_ICON_12 = 12;
    private static final String COMPONENT_NAME_DEFAULT = ".MainActivity";
    private static final String COMPONENT_NAME_11 = ".Test11";
    private static final String COMPONENT_NAME_12 = ".Test12";

    private static void enableComponent(PackageManager pm, ComponentName componentName) {
        pm.setComponentEnabledSetting(componentName,
                PackageManager.COMPONENT_ENABLED_STATE_ENABLED,
                PackageManager.DONT_KILL_APP);
    }

    private static void disableComponent(PackageManager pm, ComponentName componentName) {
        pm.setComponentEnabledSetting(componentName,
                PackageManager.COMPONENT_ENABLED_STATE_DISABLED,
                PackageManager.DONT_KILL_APP);
    }

    /**
     * switch to icon and title specified by server
     *
     * @param context     Context
     * @param displayIcon icon flag.
     *                    High level have no need to understand this data
     */
    public static void switchToIcon(Context context, int displayIcon) {
        switch (displayIcon) {
            case DISPLAY_ICON_11:
                enableComponent(context.getPackageManager(),
                        new ComponentName(context.getApplicationContext(),
                                context.getPackageName() + COMPONENT_NAME_11));
                disableComponent(context.getPackageManager(),
                        new ComponentName(context.getApplicationContext(),
                                context.getPackageName() + COMPONENT_NAME_DEFAULT));
                disableComponent(context.getPackageManager(),
                        new ComponentName(context.getApplicationContext(),
                                context.getPackageName() + COMPONENT_NAME_12));
                break;
            case DISPLAY_ICON_12:
                enableComponent(context.getPackageManager(),
                        new ComponentName(context.getApplicationContext(),
                                context.getPackageName() + COMPONENT_NAME_12));
                disableComponent(context.getPackageManager(),
                        new ComponentName(context.getApplicationContext(),
                                context.getPackageName() + COMPONENT_NAME_DEFAULT));
                disableComponent(context.getPackageManager(),
                        new ComponentName(context.getApplicationContext(),
                                context.getPackageName() + COMPONENT_NAME_11));
                break;
            default:
                Log.i(TAG, "switchToIcon: invalid input " + displayIcon);
        }
    }

    /**
     * switch to 11.11 icon and title
     *
     * @param context Context
     */
    public static void switchTo11(Context context) {
        switchToIcon(context, DISPLAY_ICON_11);
    }

    /**
     * switch to 12.12 icon and title
     *
     * @param context Context
     */
    public static void switchTo12(Context context) {
        switchToIcon(context, DISPLAY_ICON_12);
    }
}
