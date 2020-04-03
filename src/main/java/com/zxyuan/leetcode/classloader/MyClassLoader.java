package com.zxyuan.leetcode.classloader;

import java.io.*;

/**
 * 类加载
 *
 * @author ZXYUAN
 * @date 2019-08-05 21:26
 */
public class MyClassLoader extends ClassLoader {

    private String path;

    private String classLoaderName;

    @Override
    protected Class findClass(String name) {
        byte[] bytes = loadclassData(name);
        return defineClass(bytes, 0, bytes.length);
    }

    private byte[] loadclassData(String name) {
        name = path + name + ".class";
        InputStream in = null;
        ByteArrayOutputStream out = null;
        try {
            in = new FileInputStream(new File(name));
            int i = 0;
            while ((i = in.read()) != -1) {
                out.write(i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                out.close();
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return out.toByteArray();
    }
}
