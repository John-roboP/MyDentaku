package com.t_robop.otaka.mydentaku;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    int result = 0;//結果
    boolean tvh;//tv0かtv2の判定に使う
                //boolean関数:True Falseの二択の時に使う。初期はfalse
    int a, b;//入力

    int ope=0;//初期0、＋が１、－が２、×が３、÷が４

    TextView tv0,tv1,tv2,tv3,tv4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv0 = (TextView) findViewById(R.id.textView0);
        tv1 = (TextView) findViewById(R.id.textView1);
        tv2 = (TextView) findViewById(R.id.textView2);      //関連づけ
        tv3 = (TextView) findViewById(R.id.textView3);
        tv4 = (TextView) findViewById(R.id.textView4);

    }

    public void button0 (View view){
        int num0=0;
        if(tvh==false){
        a=num0+a*10;
        tv0.setText(String.valueOf(a));}
        else {
            b=num0+b*10;
            tv2.setText(String.valueOf(b));
        }

    }


    public void button1(View view) {
       int num1=1;
        if(tvh==false){
        a=num1+a*10;                //連続に表示させるため10倍
        tv0.setText(String.valueOf(a));}else {
                b=num1+b*10;
                tv2.setText(String.valueOf(b));     //bの値をtv2に入れた
            }
        }


    public void button2(View view) {
        int num2=2;

        if(tvh==false){
            a=num2+a*10;
            tv0.setText(String.valueOf(a));}else {
            b=num2+b*10;
            tv2.setText(String.valueOf(b));
        }
    }

    public void button3(View view) {
        int num3=3;
        if(tvh==false){
            a=num3+a*10;
            tv0.setText(String.valueOf(a));}else {
            b=num3+b*10;
            tv2.setText(String.valueOf(b));
        }
    }

    public void button4(View view) {
        int num4=4;
        if(tvh==false){
            a=num4+a*10;
            tv0.setText(String.valueOf(a));}else {
            b=num4+b*10;
            tv2.setText(String.valueOf(b));
        }

    }

    public void button5(View view) {
        int num5=5;
        if(tvh==false){
            a=num5+a*10;
            tv0.setText(String.valueOf(a));}else {
            b=num5+b*10;
            tv2.setText(String.valueOf(b));
        }

    }

    public void button6(View view) {
        int num6=6;
        if(tvh==false){
            a=num6+a*10;
            tv0.setText(String.valueOf(a));}else {
            b=num6+b*10;
            tv2.setText(String.valueOf(b));
        }
    }

    public void button7(View view) {
        int num7=7;
        if(tvh==false){
            a=num7+a*10;
            tv0.setText(String.valueOf(a));}else {
            b=num7+b*10;
            tv2.setText(String.valueOf(b));
        }
    }

    public void button8(View view) {
        int num8=8;
        if(tvh==false){
            a=num8+a*10;
            tv0.setText(String.valueOf(a));}else {
            b=num8+b*10;
            tv2.setText(String.valueOf(b));
        }
    }

    public void button9(View view) {
        int num9=9;
        if(tvh==false){
            a=num9+a*10;
            tv0.setText(String.valueOf(a));}else {
            b=num9+b*10;
            tv2.setText(String.valueOf(b));
        }
    }

    public void buttonEq(View view){

        tv3.setText("=");
       if(ope==1) {             //＋の場合
           result=a+b;
           tv4.setText(String.valueOf(result));
       }else if(ope==2){            //－の場合
           result=a-b;
           tv4.setText(String.valueOf(result));
       }else if(ope==3){                   //×の場合
           result=a*b;
           tv4.setText(String.valueOf(result));
       }else if(ope==4){                        //÷の場合
           result=a/b;
           tv4.setText(String.valueOf(result));
       }

    }

    public void buttonKa(View view) {
    ope=3;tvh=true;
        tv1.setText("×");           //×
    }

    public void buttonPi(View view) {
    ope=1;tvh=true;
        tv1.setText("+");                   //＋

    }

    public void buttonMi(View view) {
    ope=2;tvh=true;
        tv1.setText("-");               //－
    }

    public void buttonWa(View view) {
        ope=4;tvh=true;
        tv1.setText("÷");                   //÷
    }

}

