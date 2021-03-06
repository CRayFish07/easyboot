package io.keyell.easyboot.lang.object;

/**
 * 方法参数传递 pass by value 指针
 * Created by huangke on 2017/1/18.
 */
public class PassByValue {
    public static void main(String[] args) {
        Dog dog = new Dog("小白");

        f(dog);
        System.out.println(dog.getName()); // 小黄
    }

    public static void f(Dog dog) {
        dog.setName("小黄");

        dog = new Dog("小黑"); // 复制的指针，指向了另外的对象。不影响原指针的指向

        dog.setName("小花");
    }
}

class Dog {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String name;

    Dog(String n) {
        name = n;
    }
}