package com.monkey.learn.lombok.getset;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import org.junit.jupiter.api.Test;

/**
 * @program: lombok
 * @description: get,set注解可用于属性或者类，但是在类上不支持lazy属性
 * @author: monkey
 * @create: 2018-05-18 12:35
 **/

@Getter(value = AccessLevel.PACKAGE)
@Setter
public class TestGetSet {

    private String name;

    @Test
    public void execute(){
        this.setName("monkey");
        this.getName();
    }
}
