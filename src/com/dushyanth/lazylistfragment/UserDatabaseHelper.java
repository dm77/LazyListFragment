package com.dushyanth.lazylistfragment;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class UserDatabaseHelper extends SQLiteOpenHelper {
    private static final String DB_NAME = "users.db";
    private static final int DB_VERSION = 1;

    UserDatabaseHelper(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE users(_id INTEGER PRIMARY KEY AUTOINCREMENT, first_name TEXT, url TEXT);");
        db.execSQL("INSERT INTO users(first_name, url) values('John', 'http://a3.twimg.com/profile_images/670625317/aam-logo-v3-twitter.png')");
        db.execSQL("INSERT INTO users(first_name, url) values('James', 'http://a3.twimg.com/profile_images/740897825/AndroidCast-350_normal.png')");
        db.execSQL("INSERT INTO users(first_name, url) values('Peter', 'http://a3.twimg.com/profile_images/121630227/Droid_normal.jpg')");
        db.execSQL("INSERT INTO users(first_name, url) values('Ram', 'http://a1.twimg.com/profile_images/957149154/twitterhalf_normal.jpg')");
        db.execSQL("INSERT INTO users(first_name, url) values('Parnell', 'http://a1.twimg.com/profile_images/97470808/icon_normal.png')");
        db.execSQL("INSERT INTO users(first_name, url) values('Vladimir', 'http://a3.twimg.com/profile_images/511790713/AG.png')");
        db.execSQL("INSERT INTO users(first_name, url) values('Yugoslav', 'http://a3.twimg.com/profile_images/956404323/androinica-avatar_normal.png')");
        db.execSQL("INSERT INTO users(first_name, url) values('Kostya', 'http://a1.twimg.com/profile_images/909231146/Android_Biz_Man_normal.png')");
        db.execSQL("INSERT INTO users(first_name, url) values('Ajit', 'http://a3.twimg.com/profile_images/72774055/AndroidHomme-LOGO_normal.jpg')");
        db.execSQL("INSERT INTO users(first_name, url) values('Shella', 'http://a1.twimg.com/profile_images/349012784/android_logo_small_normal.jpg')");
        db.execSQL("INSERT INTO users(first_name, url) values('Joan', 'http://a1.twimg.com/profile_images/841338368/ea-twitter-icon.png')");
        db.execSQL("INSERT INTO users(first_name, url) values('Rock', 'http://a3.twimg.com/profile_images/64827025/android-wallpaper6_2560x160_normal.png')");
        db.execSQL("INSERT INTO users(first_name, url) values('Katy', 'http://a3.twimg.com/profile_images/77641093/AndroidPlanet_normal.png')");
        db.execSQL("INSERT INTO users(first_name, url) values('Lucky', 'http://a1.twimg.com/profile_images/850960042/elandroidelibre-logo_300x300_normal.jpg')");
        db.execSQL("INSERT INTO users(first_name, url) values('Steve', 'http://a1.twimg.com/profile_images/655119538/andbook.png')");
        db.execSQL("INSERT INTO users(first_name, url) values('Taylor', 'http://a3.twimg.com/profile_images/768060227/ap4u_normal.jpg')");
        db.execSQL("INSERT INTO users(first_name, url) values('Ramdin', 'http://a1.twimg.com/profile_images/74724754/android_logo_normal.png')");
        db.execSQL("INSERT INTO users(first_name, url) values('Haddin', 'http://a3.twimg.com/profile_images/681537837/SmallAvatarx150_normal.png')");
        db.execSQL("INSERT INTO users(first_name, url) values('Chris', 'http://a1.twimg.com/profile_images/63737974/2008-11-06_1637_normal.png')");
        db.execSQL("INSERT INTO users(first_name, url) values('Jessy', 'http://a3.twimg.com/profile_images/548410609/icon_8_73.png')");
        db.execSQL("INSERT INTO users(first_name, url) values('Jay', 'http://a1.twimg.com/profile_images/612232882/nexusoneavatar_normal.jpg')");
        db.execSQL("INSERT INTO users(first_name, url) values('Goodwin', 'http://a1.twimg.com/profile_images/213722080/Bugdroid-phone_normal.png')");
        db.execSQL("INSERT INTO users(first_name, url) values('Evan', 'http://a1.twimg.com/profile_images/645523828/OT_icon_090918_android_normal.png')");
        db.execSQL("INSERT INTO users(first_name, url) values('Holy', 'http://a3.twimg.com/profile_images/64827025/android-wallpaper6_2560x160_normal.png')");
        db.execSQL("INSERT INTO users(first_name, url) values('Sam', 'http://a3.twimg.com/profile_images/77641093/AndroidPlanet.png')");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    @Override
    public void onOpen(SQLiteDatabase db) {
        super.onOpen(db);
    }

}
