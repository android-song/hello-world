package com.imooc.viewpager;

import java.util.ArrayList;
import java.util.List;
import java.util.zip.Inflater;

import android.app.ActionBar;
import android.app.Activity;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.OnPageChangeListener;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;


public class MainActivity extends  Activity implements OnPageChangeListener{
private ViewPager  viewpager;
private   ViewpagerAdapter adapter;
private    List<View>  views;
private  int [] imagid={R.id.imagbut1,R.id.imagbut2,R.id.imagbut3};
private  ImageButton  [] dos=new ImageButton [3]; 
private ListView list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
 
        setContentView(R.layout.activity_main);
        if (savedInstanceState!=null) {
    		String i=	(String) savedInstanceState.getString("11");
       Toast.makeText(this, i, Toast.LENGTH_LONG).show();
    		}
     init();
 

    }
 
//
    private void date() {
    	//LayoutInflater inflater=LayoutInflater.from(this);
    	dos[0]=(ImageButton)findViewById(R.id.imagbut1);
    	dos[1]=(ImageButton) findViewById(R.id.imagbut2);
    	dos[2]=(ImageButton) findViewById(R.id.imagbut3);
		
	}


	private void init() {
    	
    	  viewpager=  (ViewPager) findViewById(R.id.viewpager);
    	views=new ArrayList<View>();
    	List<News>  newss=new ArrayList<News>();
    	for (int i = 0; i < 5; i++) {
    		News ne=new News("i"+i, R.drawable.ic_launcher);
    		newss.add(ne);
			
		}
    	list=(ListView) findViewById(R.id.list);
    	MyAdapter adapter=new MyAdapter(this, R.layout.list, newss);
    	list.setAdapter(adapter);
	views.add(LayoutInflater.from(this).inflate(R.layout.one, null));
	views.add(LayoutInflater.from(this).inflate(R.layout.two, null));
	views.add(LayoutInflater.from(this).inflate(R.layout.three, null));
   // adapter=new ViewpagerAdapter(views,this);
	ViewpagerAdapter adapte=new ViewpagerAdapter(views,this);
    viewpager.setAdapter(adapte);
    viewpager.setOnPageChangeListener(this);
		
	}
@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// TODO Auto-generated method stub
		return super.onOptionsItemSelected(item);
	}
	
	@Override
		protected void onSaveInstanceState(Bundle outState) {
			// TODO Auto-generated method stub
		outState.putString("11", "hhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
	
			super.onSaveInstanceState(outState);
		}

	@Override
	public void onPageScrollStateChanged(int arg0) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void onPageScrolled(int arg0, float arg1, int arg2) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void onPageSelected(int arg0) {
	     date();
		for (int j = 0; j < dos.length; j++) {
			   if (arg0==j) {
				dos[j].setImageResource(R.drawable.ic_drawer_logout);
					
				}else{
					
					dos[j].setImageResource(R.drawable.activity_main);	

				}
		}
	  
		
	}





}
