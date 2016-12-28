# DynamicChangeIconDemo
动态更换App在Launcher里面的Icon

# Sample
Config
```
    <activity-alias
        android:name=".Test11"
        android:enabled="false"
        android:icon="@mipmap/ic_play_arrow_black_48dp"
        android:label="@string/test11"
        android:targetActivity=".MainActivity">
        <intent-filter>
            <action android:name="android.intent.action.MAIN" />

            <category android:name="android.intent.category.LAUNCHER" />
        </intent-filter>
    </activity-alias>
```

Just one line:
```
    //mock data from server. displayIcon is not R.drawable.xxx
    int displayIcon = 11;
    ChangeIconUtils.switchToIcon(this, displayIcon);
```

# Reference
[上次发版我就改了一行代码！](https://segmentfault.com/a/1190000007911264)
