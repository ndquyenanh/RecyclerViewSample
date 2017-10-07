package com.qnv96.cutemessaging;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private TextAdapter mTextAdapter;
    private ArrayList<String> mSMSText;

    private RecyclerView mRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mSMSText = new ArrayList<>();
        mSMSText.add("Hello");
        mSMSText.add("Hello 1");
        mSMSText.add("Hello 2");

        mTextAdapter = new TextAdapter(mSMSText);
        mRecyclerView = (RecyclerView) findViewById(R.id.rv);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        mRecyclerView.setAdapter(mTextAdapter);
    }
}
