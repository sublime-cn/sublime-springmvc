package com.zhihu;

import java.io.PrintStream;

/**
 * Created by gavin on 21/09/2016.
 */
public class ZhiHuAB {

    public static void main(String[] args) {
        print();
    }

    public static void print(){
        if(System.out.printf("a") == null){
            System.out.print("a");
        }
        else{
            System.out.print("b");
        }
    }

}
