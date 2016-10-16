package enterprise.sample.com.select_spinner_with_button;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    Spinner spinnerTest;
    Button setItem;

    String[] mobile = new String[]{

            "MICROMAX",
            "SAMSUNG",
            "SONY",
            "GIONEE",
            "LENOVO"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spinnerTest = (Spinner)findViewById(R.id.spinner1);

        setItem = (Button)findViewById(R.id.button1);

        ArrayAdapter<String> spinnerArrayAdapter = new ArrayAdapter<String>(
                this,R.layout.textview_for_spinner,mobile );

        spinnerArrayAdapter.setDropDownViewResource(R.layout.textview_for_spinner);

        spinnerTest.setAdapter(spinnerArrayAdapter);

        setItem.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub

// Here  1 means the second item of spinner because array adapter indexing starts
// with 0(zero).

                spinnerTest.setSelection(1);
            }
        });

    }
}