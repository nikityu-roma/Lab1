package minsk.bsuir.psp;

import java.util.LinkedList;

public class Inspector extends AppUser {
	protected LinkedList<Pit> PitList;

	public Inspector(String NM, String SNM) {
		super(NM, SNM);
		sendMessage("I");// ������ �� ��������� ������ ��
		do {
			if (getMessage() == "S")// ��������������� ������� ��������
				PitList.add(Pit.fromString(getMessage()));
			else
				break;
		} while (true);// �������� ��������
	}

	public void checkPit() {
		Pit CPT = new Pit();
		CPT.setChecker(Surname + " " + Name);
		sendMessage("C");// ������ �� �������� ���������� ���
		sendMessage(CPT.toString());
		PitList.remove(0);
	}
}
