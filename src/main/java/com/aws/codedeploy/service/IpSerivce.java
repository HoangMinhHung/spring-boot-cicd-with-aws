package com.aws.codedeploy.service;

import org.springframework.stereotype.Service;

import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

@Service
public class IpSerivce {
    public String getIpAddress(){
        try(final DatagramSocket socket = new DatagramSocket()){
            socket.connect(InetAddress.getByName("8.8.8.8"), 8080);
            String ip = socket.getLocalAddress().getHostAddress();
            return ip;
        } catch (SocketException | UnknownHostException e) {
            e.printStackTrace();
        }
        return null;
    }
}
