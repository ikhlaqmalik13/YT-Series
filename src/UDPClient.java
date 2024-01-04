import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class UDPClient {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        DatagramSocket ds = new DatagramSocket();
        InetAddress ip = InetAddress.getLocalHost();

        byte[] buff = null;
        while (true) {
            String inp = sc.nextLine();
            buff = inp.getBytes();
        
            DatagramPacket dpSend = new DatagramPacket(buff, buff.length, ip, 1234);
            ds.send(dpSend);
            
        }
    
    }
}
