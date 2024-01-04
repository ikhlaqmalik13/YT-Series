import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.nio.channels.DatagramChannel;
import java.util.Scanner;

public class UDPServer {

    public static void main(String[] args) throws IOException {

        DatagramSocket ds = new DatagramSocket(1234);
        byte[] receive = new byte[65535];

        DatagramPacket packetRecieved = null;
        while (true) {

            packetRecieved = new DatagramPacket(receive, receive.length);
            ds.receive(packetRecieved);

            System.out.println("Client: " + receive[0]);

            receive = new byte[65535];
        }

    }

    public static StringBuilder data(byte[] a) 
    { 
        if (a == null) 
            return null; 
        StringBuilder ret = new StringBuilder(); 
        int i = 0; 
        while (a[i] != 0) 
        { 
            ret.append((char) a[i]); 
            i++; 
        } 
        return ret; 
    } 
}
