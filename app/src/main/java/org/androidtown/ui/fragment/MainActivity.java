package org.androidtown.ui.fragment;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;


/**
 * 프래그먼트를 사용하는 방법에 대해 알 수 있습니다.
 *
 * @author Mike
 */
public class MainActivity extends ActionBarActivity implements SampleListFragment.ListItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onListItemSelected(int index) {
        SampleViewerFragment imageViewer = (SampleViewerFragment) getSupportFragmentManager().findFragmentById(R.id.image_viewer_fragment);
        imageViewer.update(index);
    }


}
