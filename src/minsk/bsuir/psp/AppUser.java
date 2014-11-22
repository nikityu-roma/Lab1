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
		System.out.println("«десь будет создание и отправка сообщени€ на сервер");
	}

	@Override
	public String getMessage() {
		String MESS = null;
		System.out.println("ѕолучить сообщение от сервера и перекодировать в данные");
		return MESS;
	}
}
