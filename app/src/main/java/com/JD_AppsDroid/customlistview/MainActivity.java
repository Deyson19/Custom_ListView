package com.JD_AppsDroid.customlistview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    ArrayList<ListPojo> list;
    AdapterList adapterList;

    /*String [] titles ={"Title 1","Title 2","Title 3","Title 4","Title 5","Title 6","Title 7","Title 8"};
    String [] descriptions={"Description 1","Description 2","Description 3","Description 4","Description 5","Description 6","Description 7","Description 8"};
    int [] images ={R.drawable.activity_intent,R.drawable.menu1,R.drawable.menu2,R.drawable.menu3,R.drawable.menu4,R.drawable.menu5,R.drawable.menu6,R.drawable.menu7};
    ListView lv; */

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.list_view);
        listShow();

        adapterList = new AdapterList(this,list);
        listView.setAdapter(adapterList);
    }

    private void listShow(){
        list = new ArrayList<ListPojo>();

        list.add(new ListPojo("Banano","Es una fruta muy rica", R.drawable.aguacate));
        list.add(new ListPojo("Manzana","Es una fruta muy rica",R.drawable.mango));
        list.add(new ListPojo("Manzana 3","Es una fruta muy rica",R.drawable.manzana));
        list.add(new ListPojo("Manzana 4","Es una fruta muy rica",R.drawable.papaya));
        list.add(new ListPojo("Manzana 5","Es una fruta muy rica",R.drawable.guayaba));
        list.add(new ListPojo("Manzana 6","Es una fruta muy rica",R.drawable.banana));
        list.add(new ListPojo("Manzana 7","Es una fruta muy rica",R.drawable.sandia));
        list.add(new ListPojo("Manzana 8","Es una fruta muy rica",R.drawable.fast_food));
    }
}