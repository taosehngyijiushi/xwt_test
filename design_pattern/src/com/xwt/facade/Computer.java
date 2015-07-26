package com.xwt.facade;
/**
 * 
 * @author xwt
 * ��������CPU��Memory��Disk��϶ȵ���Computer
 * ��������ģʽ
 *
 */
public class Computer {
	private CPU cpu;
	private Memory m;
	private Disk d;

	public Computer() {
		cpu = new CPU();
		m = new Memory();
		d = new Disk();
	}
	public void startup(){
		System.out.println("Computer startup...");
		cpu.startup();
		m.startup();
		d.startup();
		System.out.println("Computer startup finished");
	}
	public void shutdown(){
		System.out.println("Computer shutdown...");
		cpu.shutdown();
		m.shutdown();
		d.shutdown();
		System.out.println("Computer shutdown finished");
	}

}
