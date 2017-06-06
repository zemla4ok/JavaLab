package by.belstu.dimaKot;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Random;

public class ServerThread extends Thread {
    private PrintStream os;
    private BufferedReader is;
    private InetAddress addr;

    public ServerThread(Socket s) throws IOException {
        os = new PrintStream(s.getOutputStream());
        is = new BufferedReader(new InputStreamReader(s.getInputStream()));
        addr = s.getInetAddress();
    }

    public void run() {
        try {
            Random rand = new Random();
            String str = "mess";
            int counter = 0;
            while (true) {
                os.println(str + (counter++));
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            disconnect();
        }
    }

    public void disconnect() {
        try {
            if (os != null)
                os.close();
            if (is != null)
                is.close();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            this.interrupt();
        }

    }
}
