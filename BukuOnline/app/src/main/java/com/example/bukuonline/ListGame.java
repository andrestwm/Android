package com.example.bukuonline;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;

public class ListGame extends AppCompatActivity {

    private HashMap<String, String> map;
    private ArrayList<HashMap<String, String>> mylist;
    private SimpleAdapter adapter;

    private ListView listview;
    private String[] img_lv, img_dp, profile_name, update_time, nama_tempat, nama_lokasi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_game);


//     listview = (ListView) findViewById(R.id.listview);

        img_lv = new String[]{Integer.toString(R.drawable.img_singkarak_sumatera_barat),
                            Integer.toString(R.drawable.img_raja_ampat),
                            Integer.toString(R.drawable.img_bromo),
                            Integer.toString(R.drawable.img_borobudur)};
        img_dp = new String[]{Integer.toString(R.drawable.img_dp_anu),
                            Integer.toString(R.drawable.img_dp_ekato),
                            Integer.toString(R.drawable.img_dp_ardi),
                            Integer.toString(R.drawable.img_dp_pitra)};
        profile_name = new String[]{"Andra Setiawan, Andre Setiawan, Andru Setiawan, Andri Setiawan"};
        update_time = new String[]{"7 Jam yang lalu, 8 Jam yang lalu, 9 Jam yang lalu, 10 Jam yang lalu"};
        nama_tempat = new String[]{"Jakarta Barat, Jakata Selatan, Jakarta Timur, Jakarta Utara"};
        nama_lokasi = new String[]{"Alam Kampung Tebet, Senayan, Gunung Balong, Menara Saidah"};

        mylist = new ArrayList<HashMap<String, String>>();

        for (int i = 0; i<nama_lokasi.length; i++){
            map = new HashMap<String, String>();
            map.put("profile_name", profile_name[i]);
            map.put("update_time", update_time[i]);
            map.put("nama_tempat", nama_tempat[i]);
            map.put("nama_lokasi", nama_lokasi[i]);
            map.put("img_dp", img_dp[i]);
            map.put("img_lv", img_lv[i]);
            mylist.add(map);
        }

        adapter = new SimpleAdapter(this.mylist,R.layout.activity_list_game,
                new  String[]{"profile_name", "update_time", "nama_tempat", "nama_lokasi", "img_dp", "img_lv"},
                new int[]{R.id.profile_name, R.id.update_time, R.id.nama_tempat, R.id.nama_lokasi, R.id.img_dp, R.id.img_iv});

        listview.setAdapter(adapter);

    }
}
