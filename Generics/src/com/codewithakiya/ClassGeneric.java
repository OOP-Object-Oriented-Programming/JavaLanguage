package com.codewithakiya;

public class ClassGeneric<T> {

    T obj;

    public ClassGeneric(T obj){
        this.obj = obj;
    }

    public T getObj(){
        return obj;
    }

    public void setObj(T obj){
        this.obj = obj;
    }
}
