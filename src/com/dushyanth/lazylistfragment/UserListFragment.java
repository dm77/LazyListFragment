package com.dushyanth.lazylistfragment;

import android.database.Cursor;
import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.support.v4.app.LoaderManager;
import android.support.v4.content.CursorLoader;
import android.support.v4.content.Loader;
import android.support.v4.widget.CursorAdapter;
import android.widget.ListView;
import android.util.Log;

public class UserListFragment extends ListFragment implements LoaderManager.LoaderCallbacks<Cursor> {
    private final static String TAG = "UserListFragment";
    private static final int USER_LIST_LOADER = 0x01;
    private CursorAdapter mAdapter;

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        getLoaderManager().initLoader(USER_LIST_LOADER, null, this);
        mAdapter = new UserListAdapter(getActivity().getApplicationContext(),
                                       null, CursorAdapter.FLAG_REGISTER_CONTENT_OBSERVER);
        setListAdapter(mAdapter);
    }

    @Override
    public Loader<Cursor> onCreateLoader(int id, Bundle args) {
        String[] projection = {"_id", "first_name", "url"};
        String selection = null;
        String[] selectionArgs = null;

        CursorLoader cursorLoader = new CursorLoader(getActivity(),
                                                     UserListProvider.CONTENT_URI, 
                                                     projection, selection, 
                                                     selectionArgs, null);
        return cursorLoader;
    }

    @Override
    public void onLoadFinished(Loader<Cursor> loader, Cursor cursor) {
        mAdapter.swapCursor(cursor);
    }

    @Override
    public void onLoaderReset(Loader<Cursor> loader) {
        mAdapter.swapCursor(null);
    }
}

