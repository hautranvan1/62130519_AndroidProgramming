package ntu.edu.sumapp;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
    public void XuLyCong(View view){
       EditText editTextSoA = findViewById(R.id.editA);
       EditText editTextSoB = findViewById(R.id.editB);
       EditText editTextSoKQ = findViewById(R.id.editKQ);
       String strA = editTextSoA.getText().toString();

       String strB = editTextSoA.getText().toString();
       int So_A= Integer.parseInt(strA);
        int So_B= Integer.parseInt(strB);
        int tong = So_A +So_B;
        String strTong = String.valueOf(tong);
        editTextSoKQ.setText(strTong);


    }
}