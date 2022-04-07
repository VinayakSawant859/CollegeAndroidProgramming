package com.example.collegeandroidprograms;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class ListViewUsingArrayAdpt extends AppCompatActivity {

    // Array list

    ListView arrayList;
    String progLanguages[] = {"Android","Java","PHP","Hadoop","Sap","Python","Ajax","C++","Ruby","Rails","Swift","VB.Net","Kotlin","Dart","JavaScript"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view_using_array_adpt);
        arrayList = (ListView) findViewById(R.id.simpleListView);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, R.layout.listview, R.id.textView, progLanguages);
        arrayList.setAdapter(arrayAdapter);

        arrayList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String itemstr = arrayAdapter.getItem(i);
                Toast.makeText(ListViewUsingArrayAdpt.this, itemstr, Toast.LENGTH_SHORT).show();
            }
        });
    }
}