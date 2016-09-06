package com.sun;

import org.I0Itec.zkclient.ZkClient;
import org.I0Itec.zkclient.serialize.SerializableSerializer;
import org.apache.zookeeper.data.Stat;

public class getData {
	public static void main(String[] args) {
		String ZKServers = "127.0.0.1:2181";
		ZkClient zkClient = new ZkClient(ZKServers, 10000, 10000,
				new SerializableSerializer());
		System.out.println("conneted ok!");

		Stat stat = new Stat();
		// 获取 节点中的对象
		User user = zkClient.readData("/testUserNode", stat);
		System.out.println(user.getName());
		System.out.println(stat);
	}
}