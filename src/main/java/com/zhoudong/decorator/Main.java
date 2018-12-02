package com.zhoudong.decorator;

/**
 * @author zhoudong
 * @create 2018/12/2
 * test decorator
 */
public class Main {
    public static void main(String[] args) {
        Display d1 = new StringDisplay("Hello World");
        Display d2 = new SideBorder(d1,'#');
        Display d3 = new FullBorder(d2);

        d1.show();
        d2.show();
        d3.show();
    }
}
