package com.example.usermanagement;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.usermanagement.Activities.Login;
import com.example.usermanagement.Adapters.Adapter_RV_Home;
import com.example.usermanagement.Adapters.spinnerAdapter;
import com.example.usermanagement.Models.RequestedListModel;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private Adapter_RV_Home adapterRvHome;
    private ArrayList<RequestedListModel> listData;
    private TextView btn_LogOut, btn_AddRequeste;
    private RecyclerView rv_Home;
    private String[] spinnerValue = {
            "مشکل بالا نیامدن ویندوز",
            "مشکل شبکه", "مشکل بالا نیامدن ویندوز",
            "مشکل شبکه", "مشکل بالا نیامدن ویندوز",
            "مشکل شبکه", "مشکل بالا نیامدن ویندوز",
            "مشکل شبکه", "مشکل بالا نیامدن ویندوز",
            "مشکل شبکه", "مشکل بالا نیامدن ویندوز",
            "مشکل شبکه"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViews();
        setListener();
        adpterRV();
    }

    private void adpterRV() {
        listData = new ArrayList<>();
        listData.add(new RequestedListModel("محمد خواستار", "در حال بررسی", "قم،آزادگان،کوچه16", "مشکل شکبه"));
        listData.add(new RequestedListModel("محمد خواستار", "در حال بررسی", "قم،آزادگان،کوچه16", "مشکل شکبه"));
        listData.add(new RequestedListModel("محمد خواستار", "در حال بررسی", "قم،آزادگان،کوچه16", "مشکل شکبه"));
        listData.add(new RequestedListModel("محمد خواستار", "در حال بررسی", "قم،آزادگان،کوچه16", "مشکل شکبه"));
        listData.add(new RequestedListModel("محمد خواستار", "در حال بررسی", "قم،آزادگان،کوچه16", "مشکل شکبه"));
        listData.add(new RequestedListModel("محمد خواستار", "در حال بررسی", "قم،آزادگان،کوچه16", "مشکل شکبه"));
        listData.add(new RequestedListModel("محمد خواستار", "در حال بررسی", "قم،آزادگان،کوچه16", "مشکل شکبه"));
        listData.add(new RequestedListModel("محمد خواستار", "در حال بررسی", "قم،آزادگان،کوچه16", "مشکل شکبه"));
        listData.add(new RequestedListModel("محمد خواستار", "در حال بررسی", "قم،آزادگان،کوچه16", "مشکل شکبه"));
        listData.add(new RequestedListModel("محمد خواستار", "در حال بررسی", "قم،آزادگان،کوچه16", "مشکل شکبه"));


        adapterRvHome = new Adapter_RV_Home(this, listData);
        rv_Home.setAdapter(adapterRvHome);
        rv_Home.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
    }


    private void setListener() {
        btn_LogOut.setOnClickListener(v -> {
            startActivity(new Intent(MainActivity.this, Login.class));
            finish();
        });

        btn_AddRequeste.setOnClickListener(v -> {
            @SuppressLint("ResourceType") AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this, R.style.CustomAlertDialog);
            ViewGroup viewGroup = findViewById(android.R.id.content);
            View dialogView = LayoutInflater.from(this).inflate(R.layout.dialog_addreq, viewGroup, false);
            builder.setView(dialogView);
            AlertDialog alertDialog = builder.create();
            ImageView btn_close = dialogView.findViewById(R.id.btn_Dialog_Close);

            Spinner spinner = dialogView.findViewById(R.id.spinner_dialog);

            spinnerAdapter adapter = new spinnerAdapter(MainActivity.this, android.R.layout.simple_list_item_1);
            adapter.addAll(spinnerValue);
            adapter.add("انتخاب کنید...");
            spinner.setAdapter(adapter);
            spinner.setSelection(adapter.getCount());

            btn_close.setOnClickListener(view -> {
                alertDialog.dismiss();
            });
            alertDialog.show();
        });
    }

    private void findViews() {
        btn_AddRequeste = findViewById(R.id.btn_MainAct_AddReq);
        btn_LogOut = findViewById(R.id.btn_MainAct_LogOut);
        rv_Home = findViewById(R.id.rv_MainAct);
    }
}