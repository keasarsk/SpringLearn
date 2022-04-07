package main.java.com.sk.demo01;

public class Client {
    public static void main(String[] args) {
        //实际类 房东要租房子
        Host host = new Host();
        //代理 中介帮房东租房子 并带一些自己的方法比如收中介费
        Proxy proxy = new Proxy(host);

        //租房子
        proxy.renthouse();
        // 看房子
        proxy.seehouse();
    }
}
