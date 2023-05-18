package com.example.lab_02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText ta;
    EditText tb;
    EditText tc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ta = findViewById(R.id.txt_a);
        tb = findViewById(R.id.txt_b);
        tc = findViewById(R.id.txt_c);
    }

    public void on_add_click(View v)
    {
        String sa = ta.getText().toString();
        String sb = tb.getText().toString();
        float fa = Float.parseFloat(sa);
        float fb = Float.parseFloat(sb);
        float fc = fa + fb;
        String sc = String.valueOf(fc);
        tc.setText(sc);

    }

    public void on_sub_click(View v)
    {
        String sa = ta.getText().toString();
        String sb = tb.getText().toString();
        float fa = Float.parseFloat(sa);
        float fb = Float.parseFloat(sb);
        float fc = fa - fb;
        String sc = String.valueOf(fc);
        tc.setText(sc);
    }

    public void on_mul_click(View v)
    {
        String sa = ta.getText().toString();
        String sb = tb.getText().toString();
        float fa = Float.parseFloat(sa);
        float fb = Float.parseFloat(sb);
        float fc = fa * fb;
        String sc = String.valueOf(fc);
        tc.setText(sc);
    }

    public void on_div_click(View v)
    {
        String sa = ta.getText().toString();
        String sb = tb.getText().toString();
        float fa = Float.parseFloat(sa);
        float fb = Float.parseFloat(sb);
        float fc = fa / fb;
        if (fa == 0)
        {
            String sc = "oshibka";
            tc.setText(sc);
        }
        if (fb == 0)
        {
            String sc = "oshibka";
            tc.setText(sc);
        }
        String sc = String.valueOf(fc);
        tc.setText(sc);
    }
    public void on_cos_click(View v)
    {
        String sa = ta.getText().toString();
        String sb = tb.getText().toString();
        float fa = Float.parseFloat(sa);
        float fb = Float.parseFloat(sb);
        String sc = String.valueOf(Math.cos(fa));
        ta.setText(sa);
        String sd = String.valueOf(Math.cos(fb));
        tb.setText(sd);
    }
    public void on_sin_click(View v)
    {
        String sa = ta.getText().toString();
        String sb = tb.getText().toString();
        float fa = Float.parseFloat(sa);
        float fb = Float.parseFloat(sb);
        String sc = String.valueOf(Math.sin(fa));
        ta.setText(sa);
        String sd = String.valueOf(Math.sin(fb));
        tb.setText(sd);
    }
    public void on_tan_click(View v)
    {
        String sa = ta.getText().toString();
        String sb = tb.getText().toString();
        float fa = Float.parseFloat(sa);
        float fb = Float.parseFloat(sb);
        String sc = String.valueOf(Math.tan(fa));
        ta.setText(sa);
        String sd = String.valueOf(Math.tan(fb));
        tb.setText(sd);
    }
}