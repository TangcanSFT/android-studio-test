package com.example.tangcan.mytest;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class HeadView extends RelativeLayout {

	private List<RelativeLayout> views = new ArrayList<RelativeLayout>();
	private LinearLayout navLayout;
	private TextView topTitleTv; // 导航中的标题控件


	public HeadView(final Context context) {
		super(context);


		LayoutInflater.from(context).inflate(R.layout.head_view,null);
		/**
		 * 刚开始的时候，adapter是在后面new的，总是空指针，放在前面就好了，数据库参数开始也放错位置，要仔细
		 * 判断有没有网，有网，加载数据，没有网络从本地读取，json数据下载到数据库中
		 */



	}






}
