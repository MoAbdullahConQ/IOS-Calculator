package com.example.calculatoriosversionone;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tvValue, textView;
    EditText editText;
    String plusTv, val1, val2, minusTv, multiTv, divideTv, modTv;
    String opreator = "-";
    double operate = 0;
    Button btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btnDot, btnEqual, btnPlus, btnMinus, btnMulti, btnDivide, btnMod, btnPM, btnAC;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        tvValue = findViewById(R.id.tv_value);
        textView = findViewById(R.id.textView);

        editText = findViewById(R.id.editTextText2);


        btn0 = findViewById(R.id.btn_zero);
        btn1 = findViewById(R.id.btn_1);
        btn2 = findViewById(R.id.btn_2);
        btn3 = findViewById(R.id.btn_3);
        btn4 = findViewById(R.id.btn_4);
        btn5 = findViewById(R.id.btn_5);
        btn6 = findViewById(R.id.btn_6);
        btn7 = findViewById(R.id.btn_7);
        btn8 = findViewById(R.id.btn_8);
        btn9 = findViewById(R.id.btn_9);
        btnDot = findViewById(R.id.btn_dot);
        btnEqual = findViewById(R.id.btn_equal);
        btnPlus = findViewById(R.id.btn_plus);
        btnMinus = findViewById(R.id.btn_minus);
        btnMulti = findViewById(R.id.btn_multi);
        btnDivide = findViewById(R.id.btn_divide);
        btnMod = findViewById(R.id.btn_mod);
        btnPM = findViewById(R.id.btn_plus_mins);
        btnAC = findViewById(R.id.btn_ac);

        editText.setShowSoftInputOnFocus(false);


        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (String.valueOf(operate).equals(editText.getText().toString())) {
                    editText.getText().clear();
                    editText.append(btn0.getText().toString());
                } else {
                    editText.append(btn0.getText().toString());
                }
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (String.valueOf(operate).equals(editText.getText().toString())) {
                    editText.getText().clear();
                    editText.append(btn1.getText().toString());
                } else {
                    editText.append(btn1.getText().toString());
                }
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (String.valueOf(operate).equals(editText.getText().toString())) {
                    editText.getText().clear();
                    editText.append(btn2.getText().toString());
                } else {
                    editText.append(btn2.getText().toString());
                }
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (String.valueOf(operate).equals(editText.getText().toString())) {
                    editText.getText().clear();
                    editText.append(btn3.getText().toString());
                } else {
                    editText.append(btn3.getText().toString());
                }
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (String.valueOf(operate).equals(editText.getText().toString())) {
                    editText.getText().clear();
                    editText.append(btn4.getText().toString());
                } else {
                    editText.append(btn4.getText().toString());
                }
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (String.valueOf(operate).equals(editText.getText().toString())) {
                    editText.getText().clear();
                    editText.append(btn5.getText().toString());
                } else {
                    editText.append(btn5.getText().toString());
                }
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (String.valueOf(operate).equals(editText.getText().toString())) {
                    editText.getText().clear();
                    editText.append(btn6.getText().toString());
                } else {
                    editText.append(btn6.getText().toString());
                }
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (String.valueOf(operate).equals(editText.getText().toString())) {
                    editText.getText().clear();
                    editText.append(btn7.getText().toString());
                } else {
                    editText.append(btn7.getText().toString());
                }
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (String.valueOf(operate).equals(editText.getText().toString())) {
                    editText.getText().clear();
                    editText.append(btn8.getText().toString());
                } else {
                    editText.append(btn8.getText().toString());
                }
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (String.valueOf(operate).equals(editText.getText().toString())) {
                    editText.getText().clear();
                    editText.append(btn9.getText().toString());
                } else {
                    editText.append(btn9.getText().toString());
                }
            }
        });
        btnDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (String.valueOf(operate).equals(editText.getText().toString())) {
                    editText.getText().clear();
                    editText.append(btnDot.getText().toString());
                } else {
                    editText.append(btnDot.getText().toString());
                }
            }
        });
        btnEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                val2 = editText.getText().toString();

                if (opreator == "+") {
                    textView.setText(plusTv + " " + val2 + " " + btnEqual.getText().toString());
                    operate = Double.parseDouble(val1) + Double.parseDouble(val2);

                } else if (opreator == "-") {
                    textView.setText(minusTv + " " + val2 + " " + btnEqual.getText().toString());
                    operate = Double.parseDouble(val1) - Double.parseDouble(val2);
                } else if (opreator == "*") {
                    textView.setText(multiTv + " " + val2 + " " + btnEqual.getText().toString());
                    operate = Double.parseDouble(val1) * Double.parseDouble(val2);
                } else if (opreator == "÷") {
                    textView.setText(divideTv + " " + val2 + " " + btnEqual.getText().toString());
                    operate = Double.parseDouble(val1) / Double.parseDouble(val2);
                } else if (opreator == "%") {
                    textView.setText(modTv + " " + val2 + " " + btnEqual.getText().toString());
                    operate = Double.parseDouble(val1) % Double.parseDouble(val2);
                } else {
                    textView.setText(val1);
                    operate = Double.parseDouble(val1);
                }

//                if (operate == (int) operate) {
//                    editText.setText(String.valueOf((int)operate));
//
//                } else {
                editText.setText(String.valueOf(operate));
//                }


            }
        });

        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                plus();
            }
        });
        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                minus();
            }
        });
        btnMulti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                multi();
            }
        });
        btnDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                divide();
            }
        });
        btnMod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mod();
            }
        });
        btnPM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(btnPM.getText().toString());
            }
        });
        btnAC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                tvValue.setText("");
                editText.setText("");
                textView.setText("");
            }
        });


    }

    void plus() {
        opreator = "+";
        val1 = editText.getText().toString();
        plusTv = val1 + " " + btnPlus.getText().toString();
        textView.setText(plusTv);
        editText.getText().clear();
    }

    void minus() {
        opreator = "-";
        val1 = editText.getText().toString();
        minusTv = val1 + " " + btnMinus.getText().toString();
        textView.setText(minusTv);
        editText.getText().clear();
    }

    void multi() {
        opreator = "*";
        val1 = editText.getText().toString();
        multiTv = val1 + " " + btnMulti.getText().toString();
        textView.setText(multiTv);
        editText.getText().clear();
    }

    void divide() {
        opreator = "÷";
        val1 = editText.getText().toString();
        divideTv = val1 + " " + btnDivide.getText().toString();
        textView.setText(divideTv);
        editText.getText().clear();
    }

    void mod() {
        opreator = "%";
        val1 = editText.getText().toString();
        modTv = val1 + " " + btnMod.getText().toString();
        textView.setText(modTv);
        editText.getText().clear();
    }
}