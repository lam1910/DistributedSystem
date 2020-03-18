package com.hust.soict.NguyenNgocLam.client_server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client {
	public static void main(String[] args) throws UnknownHostException, IOException {
		// TODO Auto-generated method stub
		Socket socket = new Socket("127.0.0.1", 9898);
		BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
		System.out.println(in.readLine());
		Scanner scanner = new Scanner(System.in);
		String message = null;
		String toserver = "";
		do {
			System.out.print("Enter your number here, (leave blank to exit): ");
			message = scanner.nextLine();
			toserver = toserver.concat(message);
			toserver = toserver.concat(" ");
		} while (!(message.isEmpty()));
		System.out.println("List confirmed. Sending to server.");
		out.println(toserver);
		System.out.println("Sent");
		System.out.println("Sorted array inbound. It will showed in a moment.");
		System.out.println("The sorted array:" + in.readLine());
		socket.close();
		scanner.close();

	}
}
