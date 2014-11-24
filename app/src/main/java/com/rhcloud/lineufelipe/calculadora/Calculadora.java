package com.rhcloud.lineufelipe.calculadora;

/**
 * Created by LineuFelipe on 11/22/2014.
 */
public class Calculadora {

    public static final int OP_SOMA = 1;
    public static final int OP_SUB  = 2;
    public static final int OP_MULT = 3;
    public static final int OP_DIV  = 4;

    private float valor1;
    private float valor2;

    public Calculadora(){
        this.valor1 = 0;
        this.valor2 = 0;
    }

    public void setValor(float valor){
        if( this.valor1 == 0 )
            this.valor1 = valor;
        else
            this.valor2 = valor;
    }

    public float calcular(int op) throws Exception{
        if( this.valor2 == 0 )
            throw new Exception();

        switch (op) {
            case Calculadora.OP_SOMA:
                this.valor1 += this.valor2;
                break;
            case Calculadora.OP_SUB:
                this.valor1 -= this.valor2;
                break;
            case Calculadora.OP_MULT:
                this.valor1 *= this.valor2;
                break;
            case Calculadora.OP_DIV:
                this.valor1 /= this.valor2;
                break;
        }
        this.valor2 = 0;
        float result = this.valor1;
        this.valor1 = 0;
        return result;
    }
}
