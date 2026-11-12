package org.tracy.todoapi;

import org.junit.jupiter.api.Test;
import static  org.junit.jupiter.api.Assertions.assertEquals;

public class HelloTest {
//    @Test
//    void returnsHelloWorld(){
//        hello controller = new hello();
//
//        String result = controller.hello();
//        assertEquals("Hello, world!", result);
//    }

    @Test
    void greetsGivenName(){
        hello controller = new hello();
        String result = controller.hello(" Tracy!");
        assertEquals("Hello, Tracy!", result);
    }
}

