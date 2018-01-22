package udp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

import chat.MsgReceiver;
import chat.MsgSender;

public class BasicUDPServer {
	DatagramSocket dsock;
	DatagramPacket sPack, rPack;
	InetAddress client;
	int sport = 7777, cport;
	
	
	public BasicUDPServer(int sport) {
		try {
			//DatagramPacket을 sport로 자정하여 생성
			this.sport = sport;
			System.out.println(">> 서버를 시작합니다.");
			System.out.println(">> 클라이언트가 접속하길 기다리고 있습니다." + "\n");
			this.dsock = new DatagramSocket(sport);
		} catch (SocketException e) {
			System.out.println(e);
		}
		
	}
	
	public void communicate() {
		try {
			//키보드로부터 전송할 문자열을 입력받기 위해 BufferedReader 형태로 변환
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			while (true) {
				byte[] buffer = new byte[1024];
				//클라이언트에서 전송되는 DatagramPacket 을 받기위해 rPack 생성한 후 대기
				rPack = new DatagramPacket(buffer, buffer.length);
				dsock.receive(rPack);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	
	

}
