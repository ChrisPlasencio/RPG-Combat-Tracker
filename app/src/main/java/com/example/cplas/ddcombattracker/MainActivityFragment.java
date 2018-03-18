package com.example.cplas.ddcombattracker;

import android.os.AsyncTask;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.net.URI;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View myView = inflater.inflate(R.layout.fragment_main, container, false);
        TextView monsters = myView.findViewById(R.id.monsters);

        return myView;
    }

    private class doNetwork extends AsyncTask<URI, String, String> {
        @Override
        protected String doInBackground(URI... uris) {
            return null;
        }
    }
}
