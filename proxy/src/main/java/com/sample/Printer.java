package com.sample;

public class Printer implements Printable {

	private String name;

	public Printer() {
		heavyJob("Printerのインスタンスを生成中");
	}

	public Printer(String name) {
		this.name = name;
		heavyJob("Printerのインスタンス(" + name + ")を生成中");
	}

	private void heavyJob(String string) {
		System.out.print(string);
		for (int i=0; i<5; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.print(".");
		}
		System.out.println("完了。");
	}

	@Override
	public void setPrinterName(String name) {
		this.name = name;
	}

	@Override
	public String getPrinterName() {
		return name;
	}

	@Override
	public void print(String string) {
		System.out.println("=== " + name + " ===");
		System.out.println(string);
	}

}
