package com.example.develop.calculator;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.view.View;
import android.widget.Toast;
public class Activity1 extends Activity {

    Button bOne,bTwo,bThree,bFour,bFive,bSix,bSeven,bEight,bNine,bZero,bAdd,bSub,bMul,
            bDiv,bClear,bCE,bEqual;

    TextView txtViewResult,txtViewInput;
    String s = "",s1 = "",s2 = "",resultString = "";

    int i = 0,i1 = 0,c = -1;
    int result =0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1);
        // linking the UI components with the java code

        bOne = (Button) findViewById(R.id.one);
        bTwo = (Button) findViewById(R.id.two);
        bThree = (Button) findViewById(R.id.three);
        bFour = (Button) findViewById(R.id.four);
        bFive = (Button) findViewById(R.id.five);
        bSix = (Button) findViewById(R.id.six);
        bSeven = (Button) findViewById(R.id.seven);
        bEight = (Button) findViewById(R.id.eight);
        bNine = (Button) findViewById(R.id.nine);
        bZero = (Button) findViewById(R.id.zero);
        bDiv = (Button) findViewById(R.id.div);
        bClear = (Button) findViewById(R.id.Clear);
        bCE =  (Button) findViewById(R.id.CE);
        bAdd = (Button) findViewById(R.id.add);
        bSub = (Button) findViewById(R.id.sub);
        bMul = (Button) findViewById(R.id.mul);
        bEqual = (Button) findViewById(R.id.equal);


        txtViewInput = (TextView) findViewById(R.id.textViewInput);
        txtViewResult = (TextView) findViewById(R.id.textViewResult);


        // passing a the entire function View.OnClickListener as parameter to setOnClickListener
        bOne.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                s = (String) txtViewResult.getText();
                // txtViewResult is the lower TextView
                if (s.equals("+") || s.equals("-") || s.equals("/")
                        || s.equals("*")) {
                    // if the previous character is an operator set the textViewResult as blank
                    txtViewResult.setText("");
                    s = "";
                }
                // else append 1 in the textViewResult
                txtViewResult.setText(s + "1");
                s = "";
            }


        });


        bTwo.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                s = (String) txtViewResult.getText();
                if (s.equals("+") || s.equals("-") || s.equals("/")
                        || s.equals("*")) {
                    txtViewResult.setText("");
                    s = "";
                }
                txtViewResult.setText(s + "2");
                s = "";
            }


        });

        bThree.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                s = (String) txtViewResult.getText();
                if (s.equals("+") || s.equals("-") || s.equals("/")
                        || s.equals("*")) {
                    txtViewResult.setText("");
                    s = "";
                }
                txtViewResult.setText(s + "3");
                s = "";
            }


        });

        bFour.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                s = (String) txtViewResult.getText();
                if (s.equals("+") || s.equals("-") || s.equals("/")
                        || s.equals("*")) {
                    txtViewResult.setText("");
                    s = "";
                }
                txtViewResult.setText(s + "4");
                s = "";
            }


        });

        bFive.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                s = (String) txtViewResult.getText();
                if (s.equals("+") || s.equals("-") || s.equals("/")
                        || s.equals("*")) {
                    txtViewResult.setText("");
                    s = "";
                }
                txtViewResult.setText(s + "5");
                s = "";
            }


        });

        bSix.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                s = (String) txtViewResult.getText();
                if (s.equals("+") || s.equals("-") || s.equals("/")
                        || s.equals("*")) {
                    txtViewResult.setText("");
                    s = "";
                }
                txtViewResult.setText(s + "6");
                s = "";
            }


        });



        bSeven.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                s = (String) txtViewResult.getText();
                if (s.equals("+") || s.equals("-") || s.equals("/")
                        || s.equals("*")) {
                    txtViewResult.setText("");
                    s = "";
                }
                txtViewResult.setText(s + "7");
                s = "";
            }


        });

        bEight.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                s = (String) txtViewResult.getText();
                if (s.equals("+") || s.equals("-") || s.equals("/")
                        || s.equals("*")) {
                    txtViewResult.setText("");
                    s = "";
                }
                txtViewResult.setText(s + "8");
                s = "";
            }


        });

        bNine.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                s = (String) txtViewResult.getText();
                if (s.equals("+") || s.equals("-") || s.equals("/")
                        || s.equals("*")) {
                    txtViewResult.setText("");
                    s = "";
                }
                txtViewResult.setText(s + "9");
                s = "";
            }


        });


        bZero.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                s = (String) txtViewResult.getText();
                if (s.equals("+") || s.equals("-") || s.equals("/")
                        || s.equals("*")) {
                    txtViewResult.setText("");
                    s = "";
                }
                txtViewResult.setText(s + "0");
                s = "";
            }


        });

        // passing an entire function as parameter
        bAdd.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v){
                // TODO Auto-generated method stub
                // if add button is pressed the string in the textViewResult is stored in the tmp string variable
                String tmp = (String) txtViewResult.getText();
                if(tmp.isEmpty()) {
                    s1 = "0"; // if tmp is null set s1 = 0
                } else if(!tmp.equals("+") && !tmp.equals("-") && !tmp.equals("*") && !tmp.equals("/"))
                {
                    s1 = tmp; // if tmp is an operand store its value in s1
                }
                c = 0; // flag variable c = 0  for add
                resultString = ""; //
                txtViewResult.setText("+"); // display the operator in lower TextView
                txtViewInput.setText(s1 + " + "); // set the upper TextView as operand+operator
            }
        });


        bSub.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v){
                // TODO Auto-generated method stub
                String tmp = (String) txtViewResult.getText();
                if(tmp.isEmpty()) {
                    s1 = "0";
                } else if(!tmp.equals("+") && !tmp.equals("-") && !tmp.equals("*") && !tmp.equals("/"))
                {
                    s1 = tmp;
                }
                c = 1;
                resultString = "";
                txtViewResult.setText("-");
                txtViewInput.setText(s1 + " - ");
            }
        });

        bDiv.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v){
                // TODO Auto-generated method stub
                String tmp = (String) txtViewResult.getText();
                if(tmp.isEmpty()) {
                    s1 = "0";
                } else if(!tmp.equals("+") && !tmp.equals("-") && !tmp.equals("*") && !tmp.equals("/"))
                {
                    s1 = tmp;
                }
                c = 2;
                resultString = "";
                txtViewResult.setText("/");
                txtViewInput.setText(s1 + " / ");
            }
        });


        bMul.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v){
                // TODO Auto-generated method stub
                String tmp = (String) txtViewResult.getText();
                if(tmp.isEmpty()) {
                    s1 = "0";
                } else if(!tmp.equals("+") && !tmp.equals("-") && !tmp.equals("*") && !tmp.equals("/"))
                {
                    s1 = tmp;
                }
                c = 3;
                resultString = "";
                txtViewResult.setText("*");
                txtViewInput.setText(s1 + " * ");
            }
        });


        bCE.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                // TODO Auto-generated method stub
                txtViewResult.setText(""); // Clear the lower Text box
                txtViewInput.setText(""); // Clear the upper TextView
                i = 0; // Reset
                i1 = 0; // the calculator
                s1 = ""; // by
                s2 = ""; // initializing
                resultString = ""; // all
                c = -1; // fields
                result = 0;
            }

        });



        bEqual.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String operator = "";
                if (s1.equalsIgnoreCase("+") || s1.equalsIgnoreCase("-") || s1.equalsIgnoreCase("/") || s1.equalsIgnoreCase("*")) {
                    i = 0;
                } else if (s1 == null || s1.isEmpty()) {
                    i = 0;
                } else {
                    // if s1 contains digit characters,then
                    // it is converted into integer data type.
                    // and store it in i1
                    i = Integer.parseInt(s1);
                }

                if(resultString.isEmpty()) {
                    s2 = (String) txtViewResult.getText();
                    // get second operand s2 from the lower TextView
                    if (s2.equalsIgnoreCase("+") || s2.equalsIgnoreCase("-") || s2.equalsIgnoreCase("/") || s2.equalsIgnoreCase("*")) {
                        i1 = 0;
                    } else if (s2 == null || s2.isEmpty()) {
                        i1 = 0;
                    } else {
                        // store the second operand in i1
                        i1 = Integer.parseInt(s2);
                    }
                } else {
                    i = result;
                }
                // perform arithmetic operation based on the flag variables

                if (c == 0) {
                    operator = "+";
                    result = i + i1;
                } else if (c == 1) {
                    operator = "-";
                    result = i - i1;
                } else if (c == 2) {
                    operator = "/";
                    // Division by zero
                    if (i1 == 0) {
                        Toast.makeText(getApplicationContext(),
                                "Invalid Input", Toast.LENGTH_LONG).show();
                        result = 0;
                    } else {
                        result = i / i1;
                    }
                } else if (c == 3) {
                    operator = "*";
                    result = i * i1;
                } else {
                    operator = "";
                    result = 0;
                }

                //History Storage
                if(!operator.isEmpty()) {
                    txtViewInput.setText(i + " " + operator + " " + i1);

                } else {
                    txtViewInput.setText("");
                }
                //convert the int into string
                resultString = String.valueOf(result);
                txtViewResult.setText(resultString);
            }

        });





//        bClear.setOnClickListener(new View.OnClickListener() {
//
//            @Override
//            public void onClick(View v) {
//
//                s = (String) txtViewResult.getText();
//                if(s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/") || s.equals(""))
//                {
//                    i = 0;
//                }
//                else
//                {
//                    i = Integer.parseInt(s);
//                    i/=10;
//                }
//                if(i==0)
//                {
//                    txtViewResult.setText("");
//                }
//                else
//                {
//                    txtViewResult.setText(i+ "");
//                }
//                s = null;
//
//            }
//
//        });


    }
}
