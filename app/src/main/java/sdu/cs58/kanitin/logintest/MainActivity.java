package sdu.cs58.kanitin.logintest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //Explicit
    TextView nameTextView;
    String getNameString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //ผูกตัวแปรบน JAVA บน Element บนหน้า UI
        nameTextView = findViewById(R.id.txvName);

        //รับค่า nameString จากหน้า login

        getNameString = getIntent().getStringExtra("nameString");
        nameTextView.setText("ยินดีต้อนรับ  " + getNameString + "   เข้าสู่ระบบ");





    }//END onCreate




}//END CLASS
