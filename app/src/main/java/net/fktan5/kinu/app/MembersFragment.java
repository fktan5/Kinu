package net.fktan5.kinu.app;

import android.os.Bundle;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.PagerTitleStrip;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import net.fktan5.kinu.app.model.SchoolIdle;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by keigo on 2014/03/24.
 */
public class MembersFragment extends Fragment {

    private ViewPager mViewpager;
    private List<SchoolIdle> mIdleList;
    private PagerTitleStrip mPagerTitleStrip;

    public MembersFragment(){}

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_member, container, false);

        mIdleList = new ArrayList<SchoolIdle>();
        mIdleList.add(new SchoolIdle("高坂穂乃果", "新田恵海"));
        mIdleList.add(new SchoolIdle("園田海未", "三森すずこ"));
        mIdleList.add(new SchoolIdle("南ことり", "内田彩"));

        mViewpager = (ViewPager)rootView.findViewById(R.id.pager_member);
        mViewpager.setAdapter(new MemberFragmentPagerAdapter(getChildFragmentManager()));
        return rootView;
    }

    public class MemberFragmentPagerAdapter
            extends FragmentStatePagerAdapter {

        public MemberFragmentPagerAdapter(FragmentManager fragmentManager){
            super(fragmentManager);
        }

        @Override
        public Fragment getItem(int i){
            MemberSoloFragment soloFragment = MemberSoloFragment.newInstance(mIdleList.get(i).getName());

            return soloFragment;
        }

        @Override
        public int getCount() {
            return mIdleList.size();
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return mIdleList.get(position).getName();
        }
    }
}
