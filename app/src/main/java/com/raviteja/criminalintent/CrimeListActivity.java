package com.raviteja.criminalintent;

import android.support.v4.app.Fragment;

import com.raviteja.criminalintent.Abstract.SingleFragmentActivity;

/**
 * Created by admin on 11/14/2015.
 */
public class CrimeListActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
