package com.sun;

import org.I0Itec.zkclient.ZkClient;
import org.I0Itec.zkclient.serialize.SerializableSerializer;

/**
 * 删除节点
 */
public class Delete {
	public static void main(String[] args) {
		String ZKServers = "127.0.0.1:2181";
		ZkClient zkClient = new ZkClient(ZKServers, 10000, 10000,
				new SerializableSerializer());
		System.out.println("conneted ok!");

		// 删除单独一个节点，返回true表示成功
		boolean e1 = zkClient.delete("/testUserNode");
		// 删除含有子节点的节点
		boolean e2 = zkClient.deleteRecursive("/test");

		// 返回 true表示节点成功 ，false表示删除失败
		System.out.println(e1);

		System.out.println(e2);
	}
}
