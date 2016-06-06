package com.example.windows.intent;

import java.io.Serializable;

/**
 * Created by windows on 2016/5/27.
 */
public class Info   implements Serializable {
    int a;
    String Data;
    public Info(int a,String Data){
        this.a=a;
        this.Data=Data;
    }

}
