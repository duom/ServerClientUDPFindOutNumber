package com.company;

import java.io.IOException;
import java.net.SocketException;
import java.util.Scanner;

public class MainServer {

    public static void main(String[] args) throws IOException {

        DatagramSocketServer dataServer = new DatagramSocketServer();
        dataServer.init(5557);

        dataServer.runServer();

    }
}
