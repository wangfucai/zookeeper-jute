package org.apache.jute.test;

import org.apache.jute.compiler.generated.Rcc;

public class ParseTest {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String params[] = new String[3];
        params[0] = "-l";
        params[1] = "java";
        params[2] = "d:/eclipse-workspace3/zookeeper-jute/src/org/apache/jute/test/zookeeper.jute";
        Rcc.main(params);
        System.out.println(System.getProperty("user.dir"));
    }

}
