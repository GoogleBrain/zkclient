package com.sun;

import org.I0Itec.zkclient.ZkClient;
import org.I0Itec.zkclient.serialize.SerializableSerializer;

/**
 * 连接
 *
 */
public class createSession {
	public static void main(String[] args) {
		String ZKServers = "127.0.0.1:2181";
		/**
		 * 创建会话 new SerializableSerializer() 创建序列化器接口，用来序列化和反序列化
		 */
		ZkClient zkClient = new ZkClient(ZKServers, 10000, 10000,
				new SerializableSerializer());
		System.out.println("conneted ok!");
	}
}