package com.yegonron.rugbylms;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;
import com.github.mikephil.charting.interfaces.datasets.IBarDataSet;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;
import com.squareup.picasso.Picasso;
import com.yegonron.rugbylms.models.UserModel;

import java.util.ArrayList;
import java.util.Objects;



import androidx.appcompat.app.AppCompatActivity;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.Toast;

import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.utils.ColorTemplate;
import java.util.ArrayList;

public class ReportsActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private FirebaseRecyclerAdapter adapter;
    String currentUserID = null;

    private FirebaseAuth firebaseAuth;

    ArrayList barArraylist;

    Button button,btnuserlist, btnteamlist, btnteamreport, btngamelist, btngamereport;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reports);

        ImageButton backBtn = findViewById(R.id.backBtn);
        backBtn.setOnClickListener(v -> onBackPressed());
//        BarChart barChart = findViewById(R.id.barchart);
//
//
//
//
//        getData();
//        BarDataSet barDataSet = new BarDataSet(barArraylist,"Cambo Tutorial");
//        BarData barData = new BarData(barDataSet);
//        barChart.setData(barData);
//
//        //color bar data set
//        barDataSet.setColors(ColorTemplate.COLORFUL_COLORS);
//
//        //text color
//        barDataSet.setValueTextColor(Color.BLACK);
//
//        //settting text size
//        barDataSet.setValueTextSize(16f);
//        barChart.getDescription().setEnabled(true);


        button = (Button) findViewById(R.id.userreport);
        btnuserlist = (Button)findViewById(R.id.userlist);
        btnteamlist= (Button)findViewById(R.id.teamlist);
        btnteamreport = (Button)findViewById(R.id.teamreport);
        btngamelist = (Button)findViewById(R.id.gamelist);
        btngamereport = (Button)findViewById(R.id.gamereport);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int1 = new Intent(ReportsActivity.this,UserReport.class);
                startActivity(int1);

            }
        });

        btnuserlist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int2 = new Intent(ReportsActivity.this,UserList.class);
                startActivity(int2);
            }
        });

        btnteamlist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int3 = new Intent(ReportsActivity.this,TeamList.class);
                startActivity(int3);
            }
        });

        btnteamreport.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int4 = new Intent(ReportsActivity.this,TeamReport.class);
                startActivity(int4);
            }
        });
        btngamelist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int5 = new Intent(ReportsActivity.this,GameList.class);
                startActivity(int5);
            }
        });
        btngamereport.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int6 = new Intent(ReportsActivity.this,GameReport.class);
                startActivity(int6);
            }
        });





    }






    private void getData()
    {
        barArraylist = new ArrayList();
        barArraylist.add(new BarEntry(2f,10));
        barArraylist.add(new BarEntry(3f,20));
        barArraylist.add(new BarEntry(4f,30));
        barArraylist.add(new BarEntry(5f,40));
        barArraylist.add(new BarEntry(6f,50));
    }

}