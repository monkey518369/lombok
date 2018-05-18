package com.monkey.learn.lombok.constructor;

import lombok.AllArgsConstructor;
import org.junit.jupiter.api.Test;

/**
 * @program: lombok
 * @description:
 * @author: monkey
 * @create: 2018-05-18 13:50
 **/
@AllArgsConstructor()
public class TestAllConstructor {
    private String name ;

    @Test
    public void execute(){
        TestAllConstructor t = new TestAllConstructor("monkey");
    }
}
