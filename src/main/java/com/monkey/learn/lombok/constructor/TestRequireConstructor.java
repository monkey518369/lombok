package com.monkey.learn.lombok.constructor;

import lombok.RequiredArgsConstructor;
import org.junit.jupiter.api.Test;

/**
 * @program: lombok
 * @description:
 * @author: monkey
 * @create: 2018-05-18 13:52
 **/
@RequiredArgsConstructor()
public class TestRequireConstructor {

    private String name;

    private String age;

    private String sex;

    @Test
    public void run(){
        TestRequireConstructor t = new TestRequireConstructor();
    }
}
