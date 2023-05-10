package sg.edu.rp.c346.id22009211.l04_reservation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.TimePicker;

public class MainActivity extends AppCompatActivity {

    EditText name;
    EditText num;
    EditText size;
    DatePicker dp;
    TimePicker tp;
    RadioButton smoke;
    RadioButton nosmoke;
    Button reset;
    Button confirm;
    TextView nameDisplay;
    TextView numDisplay;
    TextView sizeDisplay;
    TextView dateDisplay;
    TextView timeDisplay;
    TextView areaDisplay;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = findViewById(R.id.editTextName);
        num = findViewById(R.id.editTextNumber);
        size = findViewById(R.id.editTextGroup);
        dp = findViewById(R.id.datePicker);
        tp = findViewById(R.id.timePicker);
        smoke = findViewById(R.id.smoke);
        nosmoke = findViewById(R.id.nonsmoke);
        reset = findViewById(R.id.buttonReset);
        confirm = findViewById(R.id.buttonConfirm);

        nameDisplay = findViewById(R.id.nameView);
        numDisplay = findViewById(R.id.numView);
        sizeDisplay = findViewById(R.id.sizeView);
        dateDisplay = findViewById(R.id.dateView);
        timeDisplay = findViewById(R.id.timeView);
        areaDisplay = findViewById(R.id.areaView);

        int day = dp.getDayOfMonth();
        int month = dp.getMonth();
        int year = dp.getYear();

        int hour = tp.getHour();
        int minute = tp.getMinute();

        confirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(smoke.isChecked()){
                    nameDisplay.setText("Name: " + name);
                    numDisplay.setText("Mobile Number: " + num);
                    sizeDisplay.setText("Group Size: " + size);
                    dateDisplay.setText("Date: " + day + "/" + (month + 1) + "/" + year);
                    timeDisplay.setText("Time: " + hour +":"+minute);
                    areaDisplay.setText("Area: " + smoke);
                } else if (nosmoke.isChecked()) {
                    nameDisplay.setText("Name: " + name);
                    numDisplay.setText("Mobile Number: " + num);
                    sizeDisplay.setText("Group Size: " + size);
                    dateDisplay.setText("Date: " + day + "/" + (month + 1) + "/" + year);
                    timeDisplay.setText("Time: " + hour +":"+minute);
                    areaDisplay.setText("Area: " + nosmoke);
                }
            }
        });
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nameDisplay.setText("Name:");
                numDisplay.setText("Mobile Number:");
                sizeDisplay.setText("Group Size:");
                dateDisplay.setText("Date:");
                timeDisplay.setText("Time:");
                areaDisplay.setText("Area:");
            }
        });
    }
}