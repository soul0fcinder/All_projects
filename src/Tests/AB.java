package Tests;

import java.io.*;

public class AB {
    class A{
        public void f() throws IOException{}
    }
    class B extends A{}
        public void f() throws FileNotFoundException{}
}
