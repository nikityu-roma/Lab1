package minsk.bsuir.psp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.LinkedList;

public class fileReadWrite {

	public static void writeListToFile(LinkedList<?> obj, String File) {
		if (obj != null && File != null) {
			FileOutputStream fos = null;
			ObjectOutputStream oos = null;
			try {
				fos = new FileOutputStream(File);
				oos = new ObjectOutputStream(fos);
				oos.writeObject(obj);
				oos.flush();
			} catch (IOException e) {

			} finally {
				try {
					oos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
				try {
					fos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

	public static LinkedList<?> readListFromFile(String File) {
		if (File != null) {
			FileInputStream fis = null;
			ObjectInputStream ois = null;
			LinkedList<?> ReadObject = null;
			try {
				fis = new FileInputStream(File);
				ois = new ObjectInputStream(fis);
				ReadObject = (LinkedList<?>) ois.readObject();
			} catch (FileNotFoundException e) {
				return new LinkedList();
			} catch (IOException e) {
				return new LinkedList();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
			try {
				ois.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			return ReadObject;
		} else
			return new LinkedList();
	}

}
