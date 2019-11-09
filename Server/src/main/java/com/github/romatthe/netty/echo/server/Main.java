package com.github.romatthe.netty.echo.server;

public class Main {

    public static void main(String[] args) throws Exception {
//        if (args.length != 1) {
//            System.err.println("Usage: " + EchoServer.class.getSimpleName() + " <port>");
//        }

//        new EchoServer(Integer.parseInt(args[0]));
        new EchoServer(1883).start();
    }

}
