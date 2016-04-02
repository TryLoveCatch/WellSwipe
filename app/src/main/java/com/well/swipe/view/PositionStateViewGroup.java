package com.well.swipe.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;

/**
 * Created by mingwei on 3/29/16.
 */
public class PositionStateViewGroup extends ViewGroup {

    public int mPositionState = PositionState.POSITION_STATE_LEFT;

    public PositionStateViewGroup(Context context) {
        super(context);
    }

    public PositionStateViewGroup(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public PositionStateViewGroup(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onLayout(boolean changed, int l, int t, int r, int b) {

    }

    public void setPositionState(int state) {
        this.mPositionState = state;
        requestLayout();
    }
}