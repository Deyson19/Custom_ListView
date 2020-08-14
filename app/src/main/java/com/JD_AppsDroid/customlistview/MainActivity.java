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

    int value [] = {3500,4000,3500,2500,2000,1500,5500,3500};
    String unityCost = "Por tan solo: \n";
    String coin = " COP";
    //String  aguacate,mango,manzana,papaya,guayaba,banano,sandia,pera;
    String aguacate = unityCost + value[0] +coin;
    String mango = unityCost + value[1] +coin;
    String manzana = unityCost + value[2]+coin;
    String papaya = unityCost + value[3]+coin;
    String guayaba = unityCost + value[4]+coin;
    String banano = unityCost + value[5]+coin;
    String sandia = unityCost + value[6]+coin;
    String pera = unityCost + value[7]+coin;


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

        list.add(new ListPojo("Aguacate",R.string.aguacate, aguacate, R.drawable.aguacate));
        list.add(new ListPojo("Mango",R.string.mango,mango,R.drawable.mango));
        list.add(new ListPojo("Manzana",R.string.manzana,manzana,R.drawable.manzana));
        list.add(new ListPojo("Papaya",R.string.papaya,papaya,R.drawable.papaya));
        list.add(new ListPojo("Guayaba",R.string.guagaya,guayaba,R.drawable.guayaba));
        list.add(new ListPojo("Banana",R.string.banano,banano,R.drawable.banana));
        list.add(new ListPojo("Sandia",R.string.sandia,sandia,R.drawable.sandia));
        list.add(new ListPojo("Pera",R.string.pera,pera,R.drawable.pera));
    }
}