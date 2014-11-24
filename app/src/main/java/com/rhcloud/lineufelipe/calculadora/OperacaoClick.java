package com.rhcloud.lineufelipe.calculadora;

import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * Created by LineuFelipe on 11/22/2014.
 */
public class OperacaoClick implements View.OnClickListener {

    private int op;
    private TextView result;
    private Calculadora calc;

    public OperacaoClick(int op, TextView result, Calculadora calc){
        this.op = op;
        this.result = result;
        this.calc = calc;
    }
    @Override
    public void onClick(View v) {
        try{
            String str = (String)result.getText();
            float f = Float.parseFloat(str);
            calc.setValor(f);

            f = calc.calcular(this.op);
            str = Float.toString(f);
            result.setText(str);
        }
        catch(Exception e){
            result.setText("");
        }
    }
}
