package org.example.dotstart.lombok;

import java.awt.*;
import java.util.ArrayList;

public class VarExample {
    public void example() {
        var x = "Hello";
        // x = Color.RED;
        // 不起作用; x的类型将被推断为 java.lang.String
    }
}
