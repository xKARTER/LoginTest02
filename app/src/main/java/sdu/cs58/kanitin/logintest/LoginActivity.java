package sdu.cs58.kanitin.logintest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    //Explicit
    EditText nameEditText,userNameEditText, passwordEditText;
    Button loginButton;
    String nameString,userString,passString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        //Initial view ผูกตัวแปรบน JAVA ให้รู้จัก element บน xml
        nameEditText = findViewById(R.id.txtName);
        userNameEditText = findViewById(R.id.txtUsername);
        passwordEditText = findViewById(R.id.txtPassword);
        loginButton = findViewById(R.id.btnLogin);




        //เหมือผู้ใช้ทำการคลิกปุ่ม login ให้แสดงผล
        loginButton .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                //ดึงข้อมูล ที่ user มาเก็บเป็นตัวแปร ชนิด String
                nameString = nameEditText.getText().toString().trim();
                //Toast.makeText(getApplicationContext(), "john cena "+ nameString , Toast.LENGTH_SHORT).show();
                                                         //↑ ข้อความที่เกิดขึ้น
                userString = userNameEditText.getText().toString().trim();
                passString = passwordEditText.getText().toString().trim();


                //ตรวจสอบ ช่องว่าง or ค่าว่าง
                if ((nameString.length()==0) || (userString.length()==0) || (passString.length()==0)) {
                    Toast.makeText(getApplicationContext(),"กรุณาใส่ให้ครับ น่ะจ๊ะ",Toast.LENGTH_SHORT).show();
                }


                // ตรวจสอบการ login ผ่านคำสั่ง if & else
                if ((userString.equals("admin"))&&(passString.equals("1234"))) {
                    Toast.makeText(getApplicationContext(),"Login Success",Toast.LENGTH_LONG).show();
                }
                else {
                    Toast.makeText(getApplicationContext(),"Login Fail",Toast.LENGTH_SHORT).show();

                }
            }
        });//END OnClickListener





    } //END Void
}//END
