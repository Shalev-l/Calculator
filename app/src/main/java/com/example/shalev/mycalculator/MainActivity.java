package com.example.shalev.mycalculator;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button one, two, three,
            four, five, six,
            seven, eight, nine,
            zero, add, sub, mul,
            div, cancel, equal;

    EditText disp;
    int op1;
    int op2;
    String optr;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.i("oncreate", "on creat function");

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    disp = (EditText) findViewById(R.id.Answer);
        zero= (Button) findViewById(R.id.button0);
        one= (Button) findViewById(R.id.button1);
        two= (Button) findViewById(R.id.button2);
        three= (Button) findViewById(R.id.button3);
        four= (Button) findViewById(R.id.button4);
        five= (Button) findViewById(R.id.button5);
        six= (Button) findViewById(R.id.button6);
        seven= (Button) findViewById(R.id.button7);
        eight= (Button) findViewById(R.id.button8);
        nine= (Button) findViewById(R.id.button9);
        cancel=(Button) findViewById(R.id.buttonC);
        add=(Button) findViewById(R.id.buttonAdd);
        sub=(Button) findViewById(R.id.buttonMinus);
        mul= (Button) findViewById(R.id.buttonX);
        div= (Button) findViewById(R.id.buttonDIV);
        equal=(Button) findViewById(R.id.buttonEQWAL);
        Log.i("creating", "creating objects via buttons");

            one.setOnClickListener(this);
            two.setOnClickListener(this);
            three.setOnClickListener(this);
            four.setOnClickListener(this);
            five.setOnClickListener(this);
            six.setOnClickListener(this);
            seven.setOnClickListener(this);
            eight.setOnClickListener(this);
            nine.setOnClickListener(this);
            zero.setOnClickListener(this);
            cancel.setOnClickListener(this);
            add.setOnClickListener(this);
            sub.setOnClickListener(this);
            mul.setOnClickListener(this);
            div.setOnClickListener(this);
            equal.setOnClickListener(this);
            Log.i("setOnListener", "set on listener to the buttons");

        }



    //@SuppressLint("SetTextI18n")
    public void operation() {
        switch (optr) {
            case "+":
                op2 = Integer.parseInt(disp.getText().toString());
                disp.setText("");
                op1 = op1 + op2;
                disp.setText("Result : " + Integer.toString(op1));
                Log.i("cratingOPreations+", "this parth creating opretion +");
                break;
            case "-":
                op2 = Integer.parseInt(disp.getText().toString());
                disp.setText("");
                op1 = op1 - op2;
                disp.setText("Result : " + Integer.toString(op1));
                Log.i("cratingOPreations -", "creating the logical parth opreation -");
                break;
            case "*":
                op2 = Integer.parseInt(disp.getText().toString());
                disp.setText("");
                op1 = op1 * op2;
                disp.setText(String.format("Result : %s", Integer.toString(op1)));
                Log.i("cratingOPreations *", "creating the logical parth opreation *");

                break;
            case "/":
                op2 = Integer.parseInt(disp.getText().toString());
                disp.setText("");//add if

                op1 = op1 / op2;
                disp.setText("Result : " + Integer.toString(op1));
                Log.i("cratingOPreations /", "creating the logical parth opreation /");

                break;
        }
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onClick(View arg0)
    {
        Log.i("oncClick","on Click function");
        Editable str = disp.getText();

        switch (arg0.getId()) {

            case R.id.button0:
                if (op2 != 0) {
                    op2 = 0;
                    disp.setText("");
                }
                str = str.append(two.getText());
                disp.setText(str);

                break;

            case R.id.button1:
                if (op2 != 0) {
                    op2 = 0;
                    disp.setText("");
                }
                str = str.append(two.getText());
                disp.setText(str);
                Log.i(" is it possibal?", "checking the logical number, and if he diffrent then 0");

                break;

            case R.id.button2:
                if (op2 != 0) {
                    op2 = 0;
                    disp.setText("");
                }
                str = str.append(two.getText());
                disp.setText(str);
                break;
            case R.id.button3:
                Log.i("button3Clickes", "button 3 has been clicked");
                if (op2 != 0) {
                    op2 = 0;
                    disp.setText("");
                }
                str = str.append(three.getText());
                disp.setText(str);
                break;
            case R.id.button4:
                if (op2 != 0) {
                    op2 = 0;
                    disp.setText("");
                }
                str = str.append(four.getText());
                disp.setText(str);
                break;
            case R.id.button5:
                if (op2 != 0) {
                    op2 = 0;
                    disp.setText("");
                }
                str = str.append(five.getText());
                disp.setText(str);
                break;
            case R.id.button6:
                if (op2 != 0) {
                    op2 = 0;
                    disp.setText("");
                }
                str = str.append(six.getText());
                disp.setText(str);
                break;
            case R.id.button7:
                if (op2 != 0) {
                    op2 = 0;
                    disp.setText("");
                }
                str = str.append(eight.getText());
                disp.setText(str);
                break;
            case R.id.button8:
                if (op2 != 0) {
                    op2 = 0;
                    disp.setText("");
                }
                str = str.append(nine.getText());
                disp.setText(str);
                break;
            case R.id.button9:
                if (op2 != 0) {
                    op2 = 0;
                    disp.setText("");
                }
                Log.i(" is it possibal ", "checking logical number, and if he diffrent then 0");

                str = str.append(zero.getText());
                disp.setText(str);
                break;

            case R.id.buttonC:
                op1 = 0;
                op2 = 0;
                disp.setText("");
                disp.setHint("Perform Operation ");
                Log.i("cLearAll", " clear all and the 'temps' numbers gets 0");

                break;
            case R.id.buttonAdd:
                optr = "+";
                if (op1 == 0) {
                    op1 = Integer.parseInt(disp.getText().toString());
                    disp.setText("");
                } else if (op2 != 0) {
                    op2 = 0;
                    disp.setText("");
                } else {
                    op2 = Integer.parseInt(disp.getText().toString());
                    disp.setText("");
                    op1 = op1 + op2;
                    disp.setText("Result : " + Integer.toString(op1));
                }
                break;
            case R.id.buttonMinus:
                optr = "-";
                if (op1 == 0) {
                    op1 = Integer.parseInt(disp.getText().toString());
                    disp.setText("");
                } else if (op2 != 0) {
                    op2 = 0;
                    disp.setText("");
                } else {
                    op2 = Integer.parseInt(disp.getText().toString());
                    disp.setText("");
                    op1 = op1 - op2;
                    disp.setText("Result : " + Integer.toString(op1));
                }
                break;
            case R.id.buttonX:
                optr = "*";
                if (op1 == 0) {
                    op1 = Integer.parseInt(disp.getText().toString());
                    disp.setText("");
                } else if (op2 != 0) {
                    op2 = 0;
                    disp.setText("");
                } else {
                    op2 = Integer.parseInt(disp.getText().toString());
                    disp.setText("");
                    op1 = op1 * op2;
                    disp.setText("Result : " + Integer.toString(op1));
                }
                break;
            case R.id.buttonDIV:
                optr = "/";
                if (op1 == 0) {
                    op1 = Integer.parseInt(disp.getText().toString());
                    disp.setText("");
                } else if (op2 != 0) {
                    op2 = 0;
                    disp.setText("");
                } else {
                    op2 = Integer.parseInt(disp.getText().toString());
                    disp.setText("");
                    op1 = op1 / op2;
                    disp.setText("Result : " + Integer.toString(op1));
                }
                break;
            case R.id.buttonEQWAL:
                EditText editText = (EditText) findViewById(R.id.Answer);
                String editTextStr = editText.getText().toString();
                Log.i("creatingString", "creating String array from the textBox");
                // int i=0;
                //   while(editTextStr.charAt( (i)!='/0'))

            for (int counter = editTextStr.length(); counter > -1; counter--)
            {
                if (!optr.equals(null))
                {

                    if (op2 != 0)
                    {
                        switch (optr)
                        {
                            case "+":
                                disp.setText("");
                                /*op1 = op1 + op2;*/
                                disp.setText("Result : " + Integer.toString(op1));
                                break;
                            case "-":
                                disp.setText("");/* op1 = op1 - op2;*/
                                disp.setText("Result : " + Integer.toString(op1));
                                break;
                            case "*":
                                disp.setText("");/* op1 = op1 * op2;*/
                                disp.setText("Result : " + Integer.toString(op1));
                                break;
                            case "/":
                                disp.setText("");/* op1 = op1 / op2;*/
                                disp.setText("Result : " + Integer.toString(op1));
                                break;
                        }
                    } else {
                        operation();
                    }
                }
                break;
            }
        }
    }
}

