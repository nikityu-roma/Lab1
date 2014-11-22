package minsk.bsuir.psp;

import java.util.LinkedList;

public class Inspector extends AppUser {
	protected LinkedList<Pit> PitList;

	public Inspector(String NM, String SNM) {
		super(NM, SNM);
		sendMessage("I");// Запрос на получение списка ям
		do {
			if (getMessage() == "S")// предварительный признак отправки
				PitList.add(Pit.fromString(getMessage()));
			else
				break;
		} while (true);// отправка окончена
	}

	public void checkPit() {
		Pit CPT = new Pit();
		CPT.setChecker(Surname + " " + Name);
		sendMessage("C");// запрос на отправку провереной ямы
		sendMessage(CPT.toString());
		PitList.remove(0);
	}
}
