package com.michael.animandoretangulo;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.Log;
import android.view.View;

import static android.content.ContentValues.TAG;

public class Tela extends View {

    private static final int x = 480;
    private static final int y = 800;
    private static final int tamVertical = 80;
    private static final int tamHorizontal = 80;

    private static int posRectX;
    private static int posRectY;

    private Paint paint;

    private static int cont = 0;
    private Rect rect = new Rect();

    public Tela(Context context){
        super(context);
        paint = new Paint();
    }

    @Override
    public void onDraw(Canvas canvas){

        setup();

        step(canvas);

        canvas.drawRect(rect, paint);

        Log.d(TAG, "Classe Tela, método onDraw() chamado. X: "+posRectX+", Y: "+posRectY);

        invalidate();
    }


    //método passo-a-passo do looping do jogo
    public void step(Canvas canvas){

        if(posRectX >= 0 && posRectX <=400 && posRectY<=0){

            direita();

        }if(posRectX >= 400 && posRectY <=650){

            baixo();

        } if( posRectY >= 650 && posRectX <= 400){
            esquerda();

        } if(posRectY <= 650 && posRectX <=0){

            cima();
        }

        Log.d(TAG, "Classe Tela, método step(1) chamado.");
    }

    //Altera os valores os elementos os preparando para as posições iniciais/nova *ALTERA*
    protected void setup(){

        rect.set(posRectX,posRectY,tamVertical+posRectX,tamHorizontal+posRectY);
        Log.d(TAG, "Classe Tela, método setup() chamado.");
    }


    public void direita(){

        posRectX = posRectX + 5;

    }
    public void esquerda(){

        posRectX = posRectX - 5;

    }
    public void cima(){

        posRectY = posRectY - 5;

    }
    public void baixo(){

        posRectY = posRectY + 5;

    }
}
