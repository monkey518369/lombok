package com.monkey.learn.lombok.nonnull;

import lombok.NonNull;
import org.junit.jupiter.api.Test;

/**
 * @program: lombok
 * @description: lombok的nonnull注解用户fail-fast,可以快速的抛出
 *                  空指针异常，可以踊跃构造器，方法。
 * @author: monkey
 * @create: 2018-05-18 12:32
 **/
public class TestNonNull {

    @Test
    public void execute(){
        run("monkey");
        run(null);
    }

    private void run(@NonNull String name){
        System.out.println(name);
    }
}
