package com.dushyanth.lazylistfragment;

import com.dushyanth.imageloader.*;

import android.view.View;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.content.Context;
import android.database.Cursor;
import android.support.v4.widget.CursorAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class UserListAdapter extends CursorAdapter {
    private static final String TAG = "UserListAdapter";
    private ImageLoader mImageLoader;

    public UserListAdapter(Context context, Cursor cursor, int flags) {
        super(context, cursor, flags);
        mImageLoader = new ImageLoader(context);
    }

    @Override
    public void bindView(View view, Context context, Cursor cursor) {
        // Setup first name
        TextView firstName = (TextView)view.findViewById(R.id.first_name);
        firstName.setText(cursor.getString(cursor.getColumnIndex("first_name")));

        ImageView image = (ImageView)view.findViewById(R.id.user_logo);
        mImageLoader.DisplayImage(cursor.getString(cursor.getColumnIndex("url")), image);
    }

    @Override
    public View newView(Context context, Cursor cursor, ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(context);
        return inflater.inflate(R.layout.user_list_item, parent, false);
    }
}
