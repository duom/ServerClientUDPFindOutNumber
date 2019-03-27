package com.company;

import java.io.IOException;
import java.net.SocketException;
import java.net.UnknownHostException;

public class MainClient {

    public static void main(String[] args) throws IOException {

        DatagramSocketClient datagramSocketClient = new DatagramSocketClient();



        datagramSocketClient.init("192.168.16.173",5557);
        datagramSocketClient.runClient();


    }
}
