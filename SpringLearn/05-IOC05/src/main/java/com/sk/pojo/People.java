package com.sk.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class People {

    // 是byname的
    @Autowired
    private Cat cat;
    // 没有id是dog 且Dog类型有多个bean时 使用@Qualifier(value="具体id") 制定具体对象
    @Autowired
    @Qualifier(value = "dog2")
    private Dog dog;

    public Cat getCat() {
        return cat;
    }

    //注解自动注入可以不用写set方法
    // public void setCat(Cat cat) {
    //     this.cat = cat;
    // }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }
}
