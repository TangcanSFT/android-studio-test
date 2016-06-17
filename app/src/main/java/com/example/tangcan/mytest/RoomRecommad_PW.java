package com.example.tangcan.mytest;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.view.WindowCallbackWrapper;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by tangcan on 16/6/12.
 * 修改人：tangcan
 * 修改时间：16/6/12 下午6:30
 * 修改备注：
 */
public class RoomRecommad_PW extends PopupWindow {
    private Context context;
    private RecyclerView mRecyclerView;
    private HomeAdapter mAdapter;
    private List<CellData> cellDatas;
    private List<CellData> data = new ArrayList<CellData>();

    public RoomRecommad_PW(Context context) {
        super(context);
        this.context = context;
        initView();
    }

    private void initView(){
        View view = LayoutInflater.from(context).inflate(
                R.layout.layout, null);
        setContentView(view);
        mRecyclerView = (RecyclerView) view.findViewById(R.id.id_recyclerview);
        cellDatas = getData();
        mRecyclerView.setLayoutManager(new FullyLinearLayoutManager(context));

        mRecyclerView.setAdapter(mAdapter = new HomeAdapter(cellDatas));
        mRecyclerView.addItemDecoration(new DividerItemDecoration(context,
                DividerItemDecoration.VERTICAL_LIST));
        setAnimationStyle(R.style.player_setting_anim_style);
        WindowManager wm=(WindowManager)context.getSystemService(Context.WINDOW_SERVICE);
        setWidth(wm.getDefaultDisplay().getWidth()*3/4);
        setHeight(wm.getDefaultDisplay().getHeight());
        setFocusable(true);
        setTouchable(true);
        ColorDrawable dw = new ColorDrawable(0000000000);
        // 点back键和其他地方使其消失,设置了这个才能触发OnDismisslistener ，设置其他控件变化等操作
        this.setBackgroundDrawable(dw);
    }
    public List<CellData> getData() {
        data.add(new CellData("上海嘉定", "1000"));
        data.add(new CellData("上海嘉定", "2890"));
        data.add(new CellData("上海嘉定", "1000"));
        data.add(new CellData("上海嘉定", "2890"));
        data.add(new CellData("上海嘉定", "1000"));
        data.add(new CellData("北京达内", "2890"));
        data.add(new CellData("上海嘉定", "1000"));
        data.add(new CellData("上海嘉定", "2890"));
        data.add(new CellData("上海江桥", "1000"));
        data.add(new CellData("上海嘉定", "2890"));
        data.add(new CellData("上海嘉定", "28"));
        data.add(new CellData("上海嘉定", "1000"));

        data.add(new CellData("上海嘉定", "2890"));
        data.add(new CellData("上海嘉定", "1000"));
        data.add(new CellData("上海嘉定", "2890"));
        data.add(new CellData("上海嘉定", "1000"));
        data.add(new CellData("上海嘉定", "2890"));
        data.add(new CellData("上海嘉定", "1000"));
        data.add(new CellData("上海嘉定", "2890"));
        data.add(new CellData("上海嘉定", "1000"));
        data.add(new CellData("上海嘉定", "2890"));


        return data;
    }
    public void showPopupWindow(View parent) {
        if (!this.isShowing()) {
            this.showAsDropDown(parent, parent.getLayoutParams().width / 2, 18);
        } else {
            this.dismiss();
        }
    }
}
