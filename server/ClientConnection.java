/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package UDPChat.Server;

import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * 
 * @author brom
 */
public class ClientConnection {
	private final String m_name;
	private final InetAddress m_address;
	private final int m_port;

	public ClientConnection(String name, InetAddress address, int port) {
		m_name = name;
		m_address = address;
		m_port = port;
	}

	public void sendMessage(String message, DatagramSocket socket) {
		// TODO: send a message to this client using socket.
	}

	public boolean hasName(String testName) {
		return testName.equals(m_name);
	}

}
