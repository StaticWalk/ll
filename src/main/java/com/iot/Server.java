package com.iot;


import com.iot.server.RpcServer;

public class Server {
    public static void main(String[] args) {
        new RpcServer().start();
    }
}
