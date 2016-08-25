package com.imooc.viewpager;

import java.util.ArrayList;
import java.util.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class MyAdapter extends ArrayAdapter<News>{
private List<News> list=new ArrayList<News>();
private int id;
	public MyAdapter(Context context, int textViewResourceId,
			List<News> objects) {
		super(context, textViewResourceId, objects);
		this.list=objects;
		this.id=textViewResourceId;
		// TODO Auto-generated constructor stub
	}
	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
		News news=getItem(position);
		View view=LayoutInflater.from(getContext()).inflate(id, null);
		ImageView ima=(ImageView)view.findViewById(R.id.imag);
		TextView text=(TextView) view.findViewById(R.id.text);
		text.setText(news.getContent());
		ima.setImageResource(news.getId());
		
		return view;
	}
	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return list.size();
	}

}
