package com.rhcloud.lineufelipe.calculadora;

import android.app.Activity;
import android.os.Bundle;
import android.support.wearable.view.WatchViewStub;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class main extends Activity {

    private TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.round_activity_main);

        final TextView result = (TextView)findViewById(R.id.result);
        Calculadora calc = new Calculadora();
        ((Button)findViewById(R.id.btn0)).setOnClickListener(new NumberClick("0", result));
        ((Button)findViewById(R.id.btn1)).setOnClickListener(new NumberClick("1", result));
        ((Button)findViewById(R.id.btn2)).setOnClickListener(new NumberClick("2", result));
        ((Button)findViewById(R.id.btn3)).setOnClickListener(new NumberClick("3", result));
        ((Button)findViewById(R.id.btn4)).setOnClickListener(new NumberClick("4", result));
        ((Button)findViewById(R.id.btn5)).setOnClickListener(new NumberClick("5", result));
        ((Button)findViewById(R.id.btn6)).setOnClickListener(new NumberClick("6", result));
        ((Button)findViewById(R.id.btn7)).setOnClickListener(new NumberClick("7", result));
        ((Button)findViewById(R.id.btn8)).setOnClickListener(new NumberClick("8", result));
        ((Button)findViewById(R.id.btn9)).setOnClickListener(new NumberClick("9", result));

        ((Button)findViewById(R.id.btnDiv)).setOnClickListener(new OperacaoClick(Calculadora.OP_DIV, result, calc));
        ((Button)findViewById(R.id.btnMult)).setOnClickListener(new OperacaoClick(Calculadora.OP_MULT, result, calc));
        ((Button)findViewById(R.id.btnMinos)).setOnClickListener(new OperacaoClick(Calculadora.OP_SUB, result, calc));
        ((Button)findViewById(R.id.btnSoma)).setOnClickListener(new OperacaoClick(Calculadora.OP_SOMA, result, calc));

        ((Button)findViewById(R.id.btnApagar)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = (String) result.getText();
                if (str.length() > 0) {
                    str = str.substring(0, str.length() - 1);
                    result.setText(str);
                }

            }
        });

        ((Button)findViewById(R.id.btnPonto)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = (String)result.getText();
                if( str.indexOf(".") == -1 ){
                    str += ".";
                    result.setText(str);
                }
            }
        });

    }
}
