package com.zxyuan.leetcode.mytest.rpc.server;

import java.io.IOException;

/**
 * @author ZXYUAN
 * @date 2019-08-12 17:59
 */
public interface Server {

    public void stop();

    public void start() throws IOException;

    public void register(Class serviceInterface, Class impl);

    public boolean isRunning();

    public int getPort();
}
