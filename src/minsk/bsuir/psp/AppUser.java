package minsk.bsuir.psp;

public class AppUser implements ISendable {
	protected String Name;
	protected String Surname;
	protected Pit Object;

	public AppUser(String NM, String SNM) {
		Name = new String(NM);
		Surname = new String(SNM);
	}

	public void MakeNote(String LOC, String LVL) {
		Object = new Pit(Surname + ' ' + Name, LOC, LVL);
	}

	@Override
	public void sendMessage(String MESS) {
		System.out.println("����� ����� �������� � �������� ��������� �� ������");
	}

	@Override
	public String getMessage() {
		String MESS = null;
		System.out.println("�������� ��������� �� ������� � �������������� � ������");
		return MESS;
	}
}
