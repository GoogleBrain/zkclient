package com.sun;

import org.I0Itec.zkclient.ZkClient;
import org.I0Itec.zkclient.serialize.SerializableSerializer;

public class Exists {
	public static void main(String[] args) {
		String ZKServers = "127.0.0.1:2181";
		ZkClient zkClient = new ZkClient(ZKServers, 10000, 10000,
				new SerializableSerializer());
		System.out.println("conneted ok!");

		boolean e = zkClient.exists("/testUserNode");
		// 返回 true表示节点存在 ，false表示不存在
		System.out.println(e);
	}
}
