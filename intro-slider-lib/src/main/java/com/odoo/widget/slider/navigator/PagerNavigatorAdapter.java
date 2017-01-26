package com.odoo.widget.slider.navigator;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Handler;
import android.view.View;
import android.widget.LinearLayout;

import com.odoo.widgets.slider.R;
import com.odoo.widgets.slider.R.color;

public class PagerNavigatorAdapter {

	private Context mContext = null;
	private LinearLayout mParent;

	public PagerNavigatorAdapter(Context context) {
		super();
		mContext = context;
	}

	public void navigator(int totalCount, View container) {
		mParent = (LinearLayout) container;
		pageNavigationDots(totalCount);
	}

	private void pageNavigationDots(int totalPage) {
		while (totalPage > 0) {
			View v = new View(mContext);
			LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
					getHeightWidth(false), getHeightWidth(false));
			v.setLayoutParams(params);
			mParent.addView(v);
			totalPage--;
		}
		new Handler().postDelayed(new Runnable() {
			@Override
			public void run() {
				focusOnPagerDot(0);
			}
		}, 500);
	}

	@SuppressLint("NewApi")
	public void focusOnPagerDot(int position) {
		for (int i = 0; i < mParent.getChildCount(); i++) {
			Drawable shapeBg;
			View child = mParent.getChildAt(i);
			LinearLayout.LayoutParams params;
			if (i == position) {
				params = new LinearLayout.LayoutParams(getHeightWidth(true),
						getHeightWidth(true));
				shapeBg = (Drawable) mContext
						.getResources().getDrawable(R.drawable.intro_slider_dot_bg_select);

			} else {
				params = new LinearLayout.LayoutParams(getHeightWidth(false),
						getHeightWidth(false));
				shapeBg = (Drawable) mContext
						.getResources().getDrawable(R.drawable.intro_slider_dot_bg);
			}
			params.setMargins(getLeftRightMargine(), getTopBottomMargine(),
					getLeftRightMargine(), getTopBottomMargine());
			child.setLayoutParams(params);
			if(Build.VERSION.SDK_INT >= 16 )
				child.setBackground(shapeBg);
			else
				child.setBackgroundDrawable(shapeBg);
			child.invalidate();
		}
	}

	private int getHeightWidth(boolean focused) {
		if (focused)
			return (int) mContext.getResources().getDimension(
					R.dimen.dot_focused_height_width);
		else
			return (int) mContext.getResources().getDimension(
					R.dimen.dot_normal_height_width);
	}

	private int getTopBottomMargine() {
		return (int) mContext.getResources().getDimension(
				R.dimen.dot_top_bottom_margine);
	}

	private int getLeftRightMargine() {
		return (int) mContext.getResources().getDimension(
				R.dimen.dot_left_right_margine);
	}
}
