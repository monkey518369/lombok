package com.monkey.learn.lombok.var;

import lombok.experimental.var;
import lombok.val;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * @program: lombok
 * @description: 演示lombok的var和val注解
 * @author: monkey
 * @create: 2018-05-18 11:34
 **/
public class TestVar {

    /**
     * val 创建为final类型的变量
     * var 创建的是普通类型的变量
     * var和val在创建对象之后引用的类型都不可以改变
     */
    @Test
    public void execute(){
        val list = new ArrayList<String>();
        for(int i=0;i<100;i++){
            list.add(i+"");
        }
        list.forEach(item-> System.out.println(item));
    }

    @Test
    public void execute1(){
        var list = new ArrayList<String>();
        for(int i=0;i<100;i++){
            list.add(i+"");
        }
    }
}
