package io;

import java.io.RandomAccessFile;

public class WriteMarks {

	public static void main(String[] args) throws Exception {
		var raf = new RandomAccessFile("marks.dat", "rw");

		for (int i = 1; i <= 50; i++) {
			byte marks = (byte) (Math.random() * 99);
			raf.writeByte(marks);
		}

		raf.close();

	}

}
