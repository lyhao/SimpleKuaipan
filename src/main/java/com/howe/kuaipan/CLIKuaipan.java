package com.howe.kuaipan;

public class CLIKuaipan {
	public static void main(String[] args) {
		SimpleCommandConsole cli = new SimpleCommandConsole(System.out, System.in);
		
		while (cli.execute()) 
			;

	}
}