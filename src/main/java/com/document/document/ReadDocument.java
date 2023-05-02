package com.document.document;

import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadDocument {
	
	public static void main(String args[]) throws IOException {
		readFile();	
	}

	public static void read(String args[]) throws IOException {
		BufferedOutputStream bos = null;
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		bos = new BufferedOutputStream(baos);
		try {
			// create new output streams.

			// assign values to the byte array
			byte[] bytes = { 1, 2, 3, 4, 5 };

			// write byte array to the output stream
			bos.write(bytes, 0, 5);

			// flush the bytes to be written out to baos
			bos.flush();

			for (byte b : baos.toByteArray()) {

				// prints byte
				System.out.print(b);
			}
		} catch (IOException e) {
			// if any IOError occurs
			e.printStackTrace();
		} finally {
			// releases any system resources associated with the stream
			if (baos != null)
				baos.close();
			if (bos != null)
				bos.close();
		}
	}

	private static void readFile() {
		File file = new File("C:\\documents\\69328a6d-a150-4cfd-a3bb-73d2e66939b5.bin");
		FileInputStream fileInputStream = null;
		byte[] bFile = new byte[(int) file.length()];

		try {
			// Read bytes with InputStream
			fileInputStream = new FileInputStream(file);
			fileInputStream.read(bFile);
			fileInputStream.close();

			for (int i = 0; i < bFile.length; i++) {
				System.out.print((char) bFile[i]);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
