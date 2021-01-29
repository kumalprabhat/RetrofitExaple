package com.example.retrofitexaple;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    final String URL_GET_DATA = "http://onestopdomains.in/Kids/API/get_all_page.php/";
    RecyclerView recyclerView;
    ObjectsAdapter adapter;
    List<Objects> objectsList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        objectsList = new ArrayList<>();

        loadHeroes();
    }
    private void loadHeroes() {
        StringRequest stringRequest = new StringRequest(Request.Method.GET, URL_GET_DATA,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        try {
                            JSONArray jsonArray = new JSONArray(response);

                            for (int i = 0; i < jsonArray.length(); i++) {
                                JSONObject obj = jsonArray.getJSONObject(i);

                                Objects objects = new Objects(
                                        obj.getString("id"),
                                        obj.getString("sid"),
                                        obj.getString("category"),
                                        obj.getString("sub_category"),
                                        obj.getString("title_eng"),
                                        obj.getString("title_hindi"),
                                        obj.getString("image"),
                                        obj.getString("title_kannada")
                                );

                                objectsList.add(objects);
                            }

                            recyclerView.setHasFixedSize(true);
                            adapter = new ObjectsAdapter(objectsList, getApplicationContext());
                            recyclerView.setAdapter(adapter);

                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {

                    }
                });
        RequestQueue requestQueue = Volley.newRequestQueue(this);
        requestQueue.add(stringRequest);
    }
}