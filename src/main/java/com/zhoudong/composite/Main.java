package com.zhoudong.composite;

public class Main {

	public static void main(String[] args) throws Exception {
		Directory rootDir = new Directory("root");
		Directory usrDir = new Directory("usr");
		Directory localDir = new Directory("local");
		Directory tmpDir = new Directory("tmp");
		
		rootDir.add(usrDir);
		rootDir.add(localDir);
		rootDir.add(tmpDir);
		
		localDir.add(new File("start.sh", 500));
		localDir.add(new File("stop.sh", 500));
		 
		rootDir.printList();
	}
}
