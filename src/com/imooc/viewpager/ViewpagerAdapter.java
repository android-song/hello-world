package com.imooc.viewpager;

import java.util.ArrayList;
import java.util.List;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;

public class ViewpagerAdapter extends PagerAdapter{

	private Context context;
	private List<View>  list ;
	
public ViewpagerAdapter(List<View> views,Context context) {
    this.list=views;
    this.context=context;
}
   @Override
public void destroyItem(View container, int position, Object object) {
	((ViewPager) container).removeView(list.get(position));
	
}
 @Override
public Object instantiateItem(View container, int position) {
	// TODO Auto-generated method stub
	((ViewPager) container).addView(list.get(position));
	return list.get(position);
}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return list.size();
	}

	@Override
	public boolean isViewFromObject(View arg0, Object arg1) {
		
		return (arg0==arg1);
	}

}
