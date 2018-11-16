package aml.viewpager;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends FragmentActivity {

    MyPagerAdapter pagerAdapter ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        List<Fragment> fragments = getFragments();
        pagerAdapter = new MyPagerAdapter(getSupportFragmentManager(), fragments);

        ViewPager pager = (ViewPager)findViewById(R.id.viewpager);
        pager.setCurrentItem(fragments.size());
        pager.setAdapter(pagerAdapter);
    }

    private List<Fragment> getFragments() {

        List<Fragment> fList = new ArrayList<>();
        fList.add(MyFragment.newInstance("Fragment 1"));
        fList.add(MyFragment.newInstance("Fragment 2"));
        fList.add(MyFragment.newInstance("Fragment 3"));
        return fList ;
    }

    private class  MyPagerAdapter extends FragmentPagerAdapter {
private List <Fragment> fragments ;
            public MyPagerAdapter(FragmentManager fm , List<Fragment> fragments) {
                super(fm);
                this.fragments = fragments ;
            }

            @Override
            public Fragment getItem(int position) {
                return this.fragments.get(position);
            }

            @Override
            public int getCount() {
                return this.fragments.size();
            }
        }
}
