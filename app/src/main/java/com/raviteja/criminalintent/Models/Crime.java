package com.raviteja.criminalintent.Models;

import java.util.Date;
import java.util.UUID;

/**
 * Created by admin on 11/14/2015.
 */
public class Crime {
    private UUID mID;
    private String mTitle,mSuspect;
    private Date mDate;
    private boolean mSolved;

    public Crime() {
        this(UUID.randomUUID());
      /*  mID = UUID.randomUUID();
        mDate = new Date();*/
    }

    public String getSuspect() {
        return mSuspect;
    }

    public void setSuspect(String mSuspect) {
        this.mSuspect = mSuspect;
    }

    public Crime(UUID id) {
        mID = id;

        mDate = new Date();
    }

    public UUID getID() {
        return mID;
    }


    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String mTitle) {
        this.mTitle = mTitle;
    }

    public Date getDate() {
        return mDate;
    }

    public void setDate(Date mDate) {
        this.mDate = mDate;
    }

    public boolean isSolved() {
        return mSolved;
    }

    public void setSolved(boolean mSolved) {
        this.mSolved = mSolved;
    }
}
