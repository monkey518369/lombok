package com.monkey.learn.lombok.tostring;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.junit.jupiter.api.Test;

/**
 * @program: lombok
 * @description:
 * @author: monkey
 * @create: 2018-05-18 13:42
 **/
@ToString(exclude = {"age"})
@Getter
@Setter
public class TestToString {

    private String name;
    private String age;
    private String sex;

    @Test
    public void run(){
        this.name = "monkey";
        this.age = "28";
        this.sex = "m";
        System.out.println(this.toString());
    }
}
