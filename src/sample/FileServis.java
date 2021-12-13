package sample;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileServis {

	public static void fileCopy(File in, File out) throws IOException {
		try (InputStream is = new FileInputStream(in); OutputStream os = new FileOutputStream(out)) {
			long readBytes = is.transferTo(os);
			System.out.println(readBytes + " copy");
		} catch (IOException e) {
			throw e;
		}
	}

	public static void folderCopy(File folderIn, File folderOut) throws IOException {
		File[] files = folderIn.listFiles();
		for (int i = 0; i < files.length; i++) {
			if (files[i].isFile()) {
				File fileOut = new File(folderOut, files[i].getName());
				fileCopy(files[i], fileOut);
			}
		}
	}

	public static void folderCopy(File folderIn, File folderOut, String extension) throws IOException {
		File[] files = folderIn.listFiles();
		for (int i = 0; i < files.length; i++) {
			if (files[i].isFile()) {
				if (getFileExtension(files[i].getName(), extension.length()).equals(extension)) {
					File fileOut = new File(folderOut, files[i].getName());
					fileCopy(files[i], fileOut);
				}

			}
		}
	}

	private static String getFileExtension(String nameFile, int lengthExtension) {
		String extension = nameFile.substring(nameFile.length() - lengthExtension, nameFile.length());
		return extension;
	}

}