package org.example.dotstart.lombok;


import lombok.Cleanup;
import java.io.*;

public class CleanupExample {
    public  void  example() throws IOException {
        @Cleanup InputStream in = new FileInputStream("src/main/resources/static/test.txt");
        @Cleanup OutputStream out = new FileOutputStream("src/main/resources/static/test.txt.temp");
        byte[] b = new byte[10000];
        while (true) {
            int r = in.read(b);
            if (r == -1) break;
            out.write(b, 0, r);
        }
    }
}
