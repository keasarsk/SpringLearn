package main.java.com.sk.demo01;

//代理
//实现Rent接口
public class Proxy implements Rent{

//    把房东拿过来
    private Host host;

    public Proxy(){};
//    有参构造
    public Proxy(Host host){
        this.host = host;
    }

//    把host实现过的接口Rent 的方法再实现一遍
    @Override
    public void renthouse() {
        host.renthouse();
    }

   // 可以再加新方法
   // 看房子
    public void seehouse(){
        System.out.println("中介看房子");
    }
}
