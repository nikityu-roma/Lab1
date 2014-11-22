package minsk.bsuir.psp;

import java.io.*;

import javax.swing.JOptionPane;

public class Pit implements Serializable,Comparable<Pit> {
	protected int id;// даЄтс€ на сервере!
	protected String Location;
	protected String Level;
	protected String User;
	protected String Checker = "Unchecked";// добавл€етс€ провер€ющим
	protected String Worker = "Unchecked";

	// filework
	public Pit() {

	}

	public Pit(String USER, String LOC, String LVL) {
		User = new String(USER);
		Location = new String(LOC);
		Level = new String(LVL);
	}

	public Pit(Pit OBJ) {
		id = OBJ.id;
		Location = new String(OBJ.Location);
		User = new String(OBJ.User);
		Level = new String(OBJ.Level);
	}

	public void setId(int num) {
		id = num;
	}

	public int getId() {
		return id;
	}

	public void setLocation(String STR) {
		Location = new String(STR);
	}

	public String getLocation() {
		return Location;
	}

	public void setWorker(String STR) {
		Worker = new String(STR);
	}

	public String getWorker() {
		return Worker;
	}

	public void setChecker(String STR) {
		Checker = new String(STR);
	}

	public String getChecker() {
		return Checker;
	}

	public void setUser(String STR) {
		User = new String(STR);
	}

	public String getUser() {
		return User;
	}

	public void setLevel(String STR) {
		Level = new String(STR);
	}

	public String getLevel() {
		return Level;
	}

	public String toString() {
		return (User + " | " + Location + " | " + Level + " | " + Checker
				+ " | " + Worker);
	}

	static public Pit fromString(String STR) {
		Pit A = new Pit();
		// инициализаци€ транскодированием
		return A;
	}

	public void Set(String USER, String LOC, String LVL) {
		User = new String(USER);
		Location = new String(LOC);
		Level = new String(LVL);
	}

	public static void writeToFile(Pit obj, String File) throws IOException {
		FileOutputStream fos = new FileOutputStream(File);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(obj);
		oos.flush();
		oos.close();
	}

	public static Pit readFromFile(String File) throws IOException,
			ClassNotFoundException {
		FileInputStream fis = new FileInputStream(File);
		ObjectInputStream oin = new ObjectInputStream(fis);
		Pit ReadObject = (Pit) oin.readObject();
		return ReadObject;
	}
	public static Pit initByFrame(){
		return (new Pit(JOptionPane.showInputDialog("¬ведите им€"),JOptionPane.showInputDialog("¬ведите информацию по проблеме"),JOptionPane.showInputDialog("¬ведите критичность проблемы(низкий, средний, высокий)")));
	}

	public int compareTo(Pit B){
		if(Location==B.Location)
			if(Level==B.Level)
				if(User==B.User)
					if(Checker==B.Checker)
						if(Worker==B.Worker)
							return 0;
		return User.compareTo(B.User);
	}

}
