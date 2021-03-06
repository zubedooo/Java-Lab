import java.applet.Applet;
import java.awt.Button;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class FactorialReverseAwt extends Applet implements ActionListener{
	Button fact;
	Button reverse;
	TextField numberTextField;
	public void init() {
		numberTextField = new TextField(10);
		add(numberTextField);
		fact = new Button("Fact");
		reverse = new Button("Reverse");
		add(fact);
		add(reverse);
		fact.addActionListener(this);
		reverse.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String answerString = null;
		String numberString = numberTextField.getText();

		if (e.getSource() == fact) {
			int number = Integer.parseInt(numberString);
			int answer = 1;
			for (int i = 1; i <= number; i++) {
				answer *= i;
			}
			answerString = answer + "";
		}
		else if (e.getSource() == reverse) {
			StringBuilder sb = new StringBuilder(numberString);
			sb = sb.reverse();
			answerString = sb.toString();
		}
		showStatus(answerString);
	}

	
	
}
