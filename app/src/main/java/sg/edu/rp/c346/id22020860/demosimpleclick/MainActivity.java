package sg.edu.rp.c346.id22020860.demosimpleclick;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    TextView tvDisplay;
    Button btnDisplay;
    EditText etInput;
    ToggleButton tgbtn;
    RadioGroup rgGender;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvDisplay = findViewById(R.id.textViewDisplay);
        btnDisplay = findViewById(R.id.buttonDisplay);
        etInput = findViewById(R.id.editTextInput);
        tgbtn = findViewById(R.id.toggleButtonEnabled);
        rgGender = findViewById(R.id.radioGroup);



    btnDisplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v){
                String value = etInput.getText().toString();
                tvDisplay.setText(value);
            }
        } );
    tgbtn.setOnClickListener(new View.OnClickListener(){
        @Override
        public void onClick (View v){
            if (tgbtn.isChecked()){
                etInput.setEnabled(true);
            }
            else{
                etInput.setEnabled(false);
            }
        }
        });
        btnDisplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Code for the action
                String stringResponse = etInput.getText().toString();
                int checkedRadioId = rgGender.getCheckedRadioButtonId();
                if(checkedRadioId == R.id.radioButtonGenderMale){
                    stringResponse = "He is " + stringResponse;

                }
                else{
                    stringResponse = "She is " + stringResponse;

                }
                tvDisplay.setText(stringResponse);
            }
        });


    }
}