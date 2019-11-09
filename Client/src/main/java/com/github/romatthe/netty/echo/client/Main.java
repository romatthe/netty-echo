package com.github.romatthe.netty.echo.client;

public class Main {

    public static void main(String[] args) throws Exception {
//        if (args.length != 2) {
//            System.err.println(
//                    "Usage: " + EchoClient.class.getSimpleName() +
//                            " <host> <port>");
//            return;
//        }

//        var host = args[0];
//        var port = Integer.parseInt(args[1]);

//        new EchoClient(host, port).start();
        new EchoClient("localhost", 8888).start();
    }

}
