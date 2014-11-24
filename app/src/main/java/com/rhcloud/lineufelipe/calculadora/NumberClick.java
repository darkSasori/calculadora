package com.rhcloud.lineufelipe.calculadora;

import android.view.View;
import android.widget.TextView;

/**
 * Created by LineuFelipe on 11/21/2014.
 */
public class NumberClick implements View.OnClickListener {
    private String value;
    private TextView result;

    public NumberClick(String value, TextView result){
        this.value = value;
        this.result = result;
    }
    @Override
    public void onClick(View v) {
        result.setText( result.getText() + value);
    }
}
