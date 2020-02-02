package com.codersam.samrat.toursandtravels;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.app.DatePickerDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.Calendar;

public class Flight extends AppCompatActivity {

    EditText journey_date,return_date;
    DatePickerDialog datePickerDialog1,datePickerDialog2;
    Spinner spinner_dep,spinner_des;
    String dep,dest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flight);

        spinner_dep = (Spinner) findViewById(R.id.spinnerDep);
        spinner_des = (Spinner) findViewById(R.id.spinnerDest);


        journey_date = (EditText) findViewById(R.id.dateStart);
        journey_date.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Calendar c = Calendar.getInstance();
                int year = c.get(Calendar.YEAR);
                int month = c.get(Calendar.MONTH);
                int day = c.get(Calendar.DAY_OF_MONTH);

                datePickerDialog1 = new DatePickerDialog(Flight.this,
                        new DatePickerDialog.OnDateSetListener() {

                            @Override
                            public void onDateSet(DatePicker view, int year,
                                                  int monthOfYear, int dayOfMonth) {
                                journey_date.setText(dayOfMonth + "-"
                                        + (monthOfYear + 1) + "-" + year);

                            }
                        }, year, month, day);
                datePickerDialog1.show();
            }
        });

        return_date = (EditText) findViewById(R.id.dateAnd);
        return_date.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final Calendar c1 = Calendar.getInstance();
                int year1 = c1.get(Calendar.YEAR);
                int month1 = c1.get(Calendar.MONTH);
                int day1 = c1.get(Calendar.DAY_OF_MONTH);
                // date picker dialog
                datePickerDialog2 = new DatePickerDialog(Flight.this,
                        new DatePickerDialog.OnDateSetListener() {

                            @Override
                            public void onDateSet(DatePicker view, int year,
                                                  int monthOfYear, int dayOfMonth) {
                                return_date.setText(dayOfMonth + "-"
                                        + (monthOfYear + 1) + "-" + year);


                            }
                        }, year1, month1,day1);
                datePickerDialog2.show();
            }
        });



    }

    public void Book_it(View v)
    {


        dep=String.valueOf(spinner_dep.getSelectedItem());
        dest=String.valueOf(spinner_des.getSelectedItem());


        String DateDest=journey_date.getText().toString();
        String DateDep=return_date.getText().toString();
//Book Button Logic test
        if(dep.length()==0 || dest.length()==0 || DateDep.length()==0 || DateDest.length()==0)
        {
            AlertDialog.Builder builder1 = new AlertDialog.Builder(Flight.this);
            builder1.setMessage("Please Fill all the information !");
            builder1.setCancelable(true);

            builder1.setPositiveButton(
                    "OK",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {
                            dialog.cancel();
                        }
                    });
            builder1.show();
        }
        else
        {
            Toast.makeText(getApplicationContext(),"Flight Booked !",Toast.LENGTH_LONG).show();
        }


    }

}


