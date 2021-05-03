package sample;

import java.lang.Math;

public class Human
{
    int myNumber;
    String name;
    String addr;

    public Human(String n, String a) {
        int m = (int) (Math.floor(Math.random() * 10000));
        setMyNumber(m);
        setName(n);
        setAddr(a);
    }

    public int getMyNumber() {
        return this.myNumber;
    }

    public void setMyNumber(int m) {
        this.myNumber = m;
    }


    public String getName() {
        return this.name;
    }

    public void setName(String n) {
        this.name = n;
    }

    public String getAddr() {
        return this.addr;
    }

    public void setAddr(String a) {
        this.addr = a;
    }
}