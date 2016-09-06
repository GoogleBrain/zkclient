package com.sun;

import org.I0Itec.zkclient.ZkClient;
import org.I0Itec.zkclient.serialize.SerializableSerializer;
import org.apache.zookeeper.CreateMode;

/**
 * 创建节点
 * 
 */
public class createNode {

	public static void main(String[] args) {
		String ZKServers = "127.0.0.1:2181";
		ZkClient zkClient = new ZkClient(ZKServers, 10000, 10000,
				new SerializableSerializer());

		System.out.println("conneted ok!");

		User user = new User();
		user.setId("1");
		user.setName("testUser");

		/**
		 * "/testUserNode" :节点的地址 user：数据的对象 CreateMode.PERSISTENT：创建的节点类型
		 */
		String path = zkClient.create("/testUserNode", user,
				CreateMode.PERSISTENT);
		// 输出创建节点的路径
		System.out.println("created path:" + path);
	}
}