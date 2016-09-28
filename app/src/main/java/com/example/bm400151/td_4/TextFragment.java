package com.example.bm400151.td_4;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class TextFragment extends Fragment {

    public TextFragment() { }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragmentbtext, container, false);

        return v;
    }

    public void changerNombre( int n ) {
        ((TextView)getView().findViewById(R.id.textView)).setText(""+n);
    }
}