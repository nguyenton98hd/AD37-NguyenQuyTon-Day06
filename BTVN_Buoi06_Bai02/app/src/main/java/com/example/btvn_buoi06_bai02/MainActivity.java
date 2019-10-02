package com.example.btvn_buoi06_bai02;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.content.DialogInterface;
import android.icu.text.CaseMap;
import android.media.Image;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.PopupMenu;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Calendar;

import static android.R.attr.width;
import static android.R.attr.x;
import static android.app.AlertDialog.THEME_DEVICE_DEFAULT_LIGHT;
import static android.icu.text.CaseMap.*;

public class MainActivity extends AppCompatActivity {

    Button btnSave, btnTune;
    EditText  edtTittle,edtDescription;
    TextView tvTime, tvDate,tvTags,tvWeeks;
    Spinner spnType;
    ArrayList<String> type;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActionBar actionBar=getSupportActionBar();
        actionBar.hide();

        btnSave=findViewById(R.id.save);
        btnTune=findViewById(R.id.tune);
        edtTittle=findViewById(R.id.title);
        edtDescription=findViewById((R.id.description));
        tvTime=findViewById(R.id.time);
        tvDate=findViewById(R.id.date);
        tvTags=findViewById(R.id.tags);
        tvWeeks=findViewById(R.id.weeks);
        spnType=findViewById(R.id.type);

        type=new ArrayList<>();
        type.add("Work");
        type.add("Family");
        type.add("Friend");

        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<>(getBaseContext(),android.R.layout.simple_list_item_1,type);
        spnType.setAdapter(arrayAdapter);

        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PopupMenu popupMenu=new PopupMenu(getBaseContext(),view);
                popupMenu.getMenuInflater().inflate(R.menu.menusave,popupMenu.getMenu());
                popupMenu.show();
            }
        });
        btnTune.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PopupMenu popupMenu=new PopupMenu(getBaseContext(),view);
                popupMenu.getMenuInflater().inflate(R.menu.menuturn,popupMenu.getMenu());
                popupMenu.show();
            }
        });
        tvTags.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String[] tags = {"Family", "Game", "Android","VTC","Friend"};
                boolean[] isChecks = {false, false, false, false,false};

                AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this)
                        .setTitle("Choose tags:")
                        .setMultiChoiceItems(tags, isChecks, new DialogInterface.OnMultiChoiceClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i, boolean b) {

                            }
                        })
                        .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {

                            }
                        })
                        .setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {

                            }
                        })
                        .create();

                alertDialog.show();
            }
        });
        tvWeeks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String[] tags = {"Monday", "Tuesday", "Wednesday","Thursday","Friday","Saturday","Sunday"};
                boolean[] isChecks = {false, false, false, false,false,false,false};

                AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this)
                        .setTitle("Choose tags:")
                        .setMultiChoiceItems(tags, isChecks, new DialogInterface.OnMultiChoiceClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i, boolean b) {

                            }
                        })
                        .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {

                            }
                        })
                        .setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {

                            }
                        })
                        .create();

                alertDialog.show();
            }
        });
        tvTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final int hour =14;
                int minute = 20;
                TimePickerDialog timePickerDialog = new TimePickerDialog(MainActivity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker view, int hourOfDay, int minute) {

                        Log.e(BATTERY_SERVICE, "onTimeSet: " + hour + ", " + minute);
                    }
                }, hour, minute, true);

                timePickerDialog.show();
            }
        });
        tvDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int year = 2016;
                int month = 02;
                int day = 04;
                DatePickerDialog datePickerDialog = new DatePickerDialog(MainActivity.this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {

                    }
                }, year, month, day);
                datePickerDialog.show();
            }
        });
    }

}
