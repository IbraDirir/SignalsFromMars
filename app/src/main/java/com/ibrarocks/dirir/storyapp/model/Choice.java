package com.ibrarocks.dirir.storyapp.model;

/**
 * Created by dirir on 11/7/2015.
 */
public class Choice {
    private String mText;
    private int mNextPage;

    public String getText() {
        return mText;
    }

    public void setText(String text) {
        mText = text;
    }

    public int getNextPage() {
        return mNextPage;
    }

    public void setNextPage(int nextPage) {
        mNextPage = nextPage;
    }
}
