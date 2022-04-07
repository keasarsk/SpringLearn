package main.java.com.sk.demo02proxy;

import main.java.com.sk.demo01.Rent;

//房东
//实现接口 重写方法
public class Host implements Rent {
    @Override
    public void renthouse() {
        System.out.println("host renthouse");
    }
}
