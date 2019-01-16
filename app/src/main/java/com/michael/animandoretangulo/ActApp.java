package com.michael.animandoretangulo;

import android.app.Activity;
import android.os.Bundle;

public class ActApp extends Activity {

    public void onCreate(Bundle dundle) {

        super.onCreate(dundle);

        Tela t = new Tela(this);

        setContentView(t);

    }
}
