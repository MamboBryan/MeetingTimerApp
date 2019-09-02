package com.mambobryan.jwtimer;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class HomeActivity extends AppCompatActivity {
    Dialog choiceDialog;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        //set up new dialog and its options
        choiceDialog = new Dialog(this);
        FloatingActionButton addTimerFab = findViewById(R.id.addTimerFAB);
        addTimerFab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                choiceDialog.setContentView(R.layout.dialog_timer_choice);
                TextView wholeMeeting = choiceDialog.findViewById(R.id.textView_whole_meeting);
                wholeMeeting.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                    }
                });
                TextView specificPart = choiceDialog.findViewById(R.id.textView_specific_part);
                specificPart.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                    }
                });
                choiceDialog.getWindow()
                        .setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                choiceDialog.show();
            }
        });
    }
}
