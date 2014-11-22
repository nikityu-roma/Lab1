package Main;

import java.util.Collections;
import java.util.LinkedList;
import javax.swing.JOptionPane;
import minsk.bsuir.psp.Pit;
import minsk.bsuir.psp.fileReadWrite;

public class Psp_Lab1 {
	public static void lab_1()
	{
	LinkedList<Pit> PitList = new LinkedList<Pit>();
	String action = null;
	do {
		action = JOptionPane
				.showInputDialog("1.Add\n2.Write To File\n3.Read List from file\n4.Sort list\n5.Show\n6.Exit");
		if (action != null)
        {
            if (action.equals("1")) {
                PitList.add(Pit.initByFrame());

            } else if (action.equals("2")) {
                if (!PitList.isEmpty()) {
                    fileReadWrite.writeListToFile(PitList, "List.bin");
                    JOptionPane.showMessageDialog(null, "Done!");
                } else JOptionPane.showMessageDialog(null, "List is empty!");

            } else if (action.equals("3")) {
                PitList = ((LinkedList<Pit>) fileReadWrite
                        .readListFromFile("List.bin"));

            } else if (action.equals("4")) {
                if (!PitList.isEmpty())
                    Collections.sort(PitList);
                else JOptionPane.showMessageDialog(null, "List is empty!");

            } else if (action.equals("5")) {
                if (!PitList.isEmpty()) {
                    String temp = new String();
                    for (int i = 0; i < PitList.size(); i++)
                        temp = temp + PitList.get(i).toString() + '\n';
                    JOptionPane.showMessageDialog(null, temp);
                } else JOptionPane.showMessageDialog(null, "List is empty!");

            } else if (action.equals("6")) {
                return;
            } else {
                JOptionPane.showMessageDialog(null,
                        "Enter the number from 1 to 6");
            }
        }
		else
			action = "6";
	} while (action != "6");
}
}
