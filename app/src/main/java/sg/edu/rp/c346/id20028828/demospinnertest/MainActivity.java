package sg.edu.rp.c346.id20028828.demospinnertest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Spinner spnYesNo;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spnYesNo = findViewById(R.id.spinner);
        result = findViewById(R.id.results);


        spnYesNo.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        if (spnYesNo.getSelectedItemPosition() == 0) {
                            String text = "Spinner Item, " + spnYesNo.getSelectedItem() + " selected";
                            result.setText(text);
                        }
                        break;
                    case 1:
                        if (spnYesNo.getSelectedItemPosition() == 1) {
                            String text = "Spinner Item, " + spnYesNo.getSelectedItem() + " selected";
                            result.setText(text);
                        }
                        break;
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }

}