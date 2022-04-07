package main.java.com.sk.demo01;

//房东
//实现接口 重写方法
public class Host implements Rent{
    @Override
    public void renthouse() {
        System.out.println("host renthouse");
    }
}
