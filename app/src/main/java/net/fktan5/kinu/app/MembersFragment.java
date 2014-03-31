package net.fktan5.kinu.app;

import android.app.Fragment;
import android.os.Bundle;

//import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by keigo on 2014/03/24.
 */
public class MembersFragment extends Fragment {

    public MembersFragment(){}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_member, container, false);
        return rootView;
    }


}
