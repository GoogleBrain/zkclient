package com.sun;

import org.I0Itec.zkclient.IZkDataListener;
import org.I0Itec.zkclient.ZkClient;
import org.I0Itec.zkclient.serialize.BytesPushThroughSerializer;

public class SubscribeDataChanges {
	private static class ZKDataListener implements IZkDataListener {

		public void handleDataChange(String dataPath, Object data)
				throws Exception {

			System.out.println(dataPath + ":" + data.toString());
		}

		public void handleDataDeleted(String dataPath) throws Exception {
			System.out.println(dataPath);
		}
	}

	public static void main(String[] args) throws InterruptedException {
		String ZKServers = "127.0.0.1:2181";
		ZkClient zkClient = new ZkClient(ZKServers, 10000, 10000,
				new BytesPushThroughSerializer());
		System.out.println("conneted ok!");

		zkClient.subscribeDataChanges("/testUserNode", new ZKDataListener());
		Thread.sleep(Integer.MAX_VALUE);

	}
}