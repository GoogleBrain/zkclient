package com.sun;

import org.I0Itec.zkclient.ZkClient;
import org.I0Itec.zkclient.serialize.SerializableSerializer;

public class Update {
	public static void main(String[] args) {
		String ZKServers = "127.0.0.1:2181";
		ZkClient zkClient = new ZkClient(ZKServers, 10000, 10000,
				new SerializableSerializer());
		System.out.println("conneted ok!");

		User user = new User();
		user.setId("2");
		user.setName("testUser2");

		zkClient.writeData("/testUserNode", user);
	}
}