package org.example.dotstart.lombok;


import java.util.ArrayList;
import java.util.HashMap;
import lombok.val;

/**
 * 您可以使用 val 作为局部变量声明的类型，而不是实际编写类型。当你这样做时，类型将从初始化表达式中推断出来。局部变量也将成为final。此功能仅适用于局部变量和foreach循环，而不适用于字段。需要初始值设定项表达式。
 * @author wbb
 */
public class ValExample {
    public String example() {
        val example = new ArrayList<String>();
        example.add("Hello, World!");
        val foo = example.get(0);
        return foo.toLowerCase();
    }

    public void example2() {
        val map = new HashMap<Integer, String>();
        map.put(0, "zero");
        map.put(5, "five");
        for (val entry : map.entrySet()) {
            System.out.printf("%d: %s\n", entry.getKey(), entry.getValue());
        }
    }
}
