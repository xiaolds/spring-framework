package com.lids.test;

public class Foo {
    private int fooInt;
    private String fooStr;

    public Foo() {}

    public Foo(int fooInt, String fooStr) {
        this.fooInt = fooInt;
        this.fooStr = fooStr;
    }

    public int getFooInt() {
        return fooInt;
    }

    public void setFooInt(int fooInt) {
        this.fooInt = fooInt;
    }

    public String getFooStr() {
        return fooStr;
    }

    public void setFooStr(String fooStr) {
        this.fooStr = fooStr;
    }

    @Override
    public String toString() {
        return "Foo{" +
                "fooInt=" + fooInt +
                ", fooStr='" + fooStr + '\'' +
                '}';
    }
}
