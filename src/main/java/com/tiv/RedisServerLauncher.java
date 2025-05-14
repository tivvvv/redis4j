package com.tiv;

import com.tiv.server.RedisServer;
import com.tiv.server.impl.RedisServerImpl;

public class RedisServerLauncher {
    public static void main(String[] args) {
        RedisServer redisServer = new RedisServerImpl("localhost", 16379);
        redisServer.start();
    }
}
