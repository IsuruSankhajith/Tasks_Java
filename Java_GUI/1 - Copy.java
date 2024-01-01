////////////////////////////////////////////////////////////////////////////////////////////////////
//1
////////////////////////////////////////////////////////////////////////////////////////////////////
/*
import java.awt.*;
import java.awt.event.*;

public class MyGUIProgram1 extends Frame {

    public MyGUIProgram1() {
        setTitle ("My GUI Program");
        setSize(400,200);

        setVisible(true);

    }
    public static void main (String [] args){
        new MyGUIProgram1();
    }
}

*/



////////////////////////////////////////////////////////////////////////////////////////////////////
//2
////////////////////////////////////////////////////////////////////////////////////////////////////
/*
import java.awt.*;
import java.awt.event.*;

public class MyGUIProgram extends Frame {
    private Button myButton;

    public MyGUIProgram() {
        // Set the frame's properties
        setTitle("My GUI Program");
        setSize(400, 200);

        // Create a button
        myButton = new Button("Click Me");

        // Add the button to the frame
        add(myButton);

        // Register an event handler for the button
        myButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button Clicked!");
            }
        });

        // Make the frame visible
        setVisible(true);
    }

    public static void main(String[] args) {
        new MyGUIProgram();
    }
}
*/

////////////////////////////////////////////////////////////////////////////////////////////////////
//3
////////////////////////////////////////////////////////////////////////////////////////////////////
/*import java.awt.*;
import java.awt.event.*;

public class MyGUIProgram extends Frame {

	public MyGUIProgram() {
		setTitle ("My GUI Program");
		setSize(400,200);

	setVisible(true);

	}
	public static void main (String [] args){
		new MyGUIProgram();
	}
}
*/
/*
import java.awt.*;
import java.awt.event.*;

public class MyCalculator extends Frame implements ActionListener {

    // The display area
    private TextField display;

    // Buttons for digits, operators, and equals
    private Button[] digitButtons;
    private Button[] operatorButtons;
    private Button equalsButton;

    // Variables to store the operands and operator
    private double operand1;
    private String operator;

    public MyCalculator() {
        setTitle("My Calculator");
        setSize(400, 400);
        setLayout(new GridLayout(5, 4));

        // Initialize the display
        display = new TextField();
        add(display);

        // Initialize digit buttons
        digitButtons = new Button[10];
        for (int i = 0; i < 10; i++) {
            digitButtons[i] = new Button(String.valueOf(i));
            digitButtons[i].addActionListener(this);
            add(digitButtons[i]);
        }

        // Initialize operator buttons
        operatorButtons = new Button[4];
        operatorButtons[0] = new Button("+");
        operatorButtons[1] = new Button("-");
        operatorButtons[2] = new Button("*");
        operatorButtons[3] = new Button("/");
        for (int i = 0; i < 4; i++) {
            operatorButtons[i].addActionListener(this);
            add(operatorButtons[i]);
        }

        // Initialize equals button
        equalsButton = new Button("=");
        equalsButton.addActionListener(this);
        add(equalsButton);

        // Make the frame visible
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        if (Character.isDigit(command.charAt(0))) {
            // If a digit button is clicked, append the digit to the display
            display.setText(display.getText() + command);
        } else if (command.equals("+") || command.equals("-") || command.equals("*") || command.equals("/")) {
            // If an operator button is clicked, store the current display value as operand1
            operand1 = Double.parseDouble(display.getText());
            operator = command;
            display.setText("");
        } else if (command.equals("=")) {
            // If the equals button is clicked, perform the calculation
            double operand2 = Double.parseDouble(display.getText());
            double result = 0.0;
            if (operator.equals("+")) {
                result = operand1 + operand2;
            } else if (operator.equals("-")) {
                result = operand1 - operand2;
            } else if (operator.equals("*")) {
                result = operand1 * operand2;
            } else if (operator.equals("/")) {
                if (operand2 != 0) {
                    result = operand1 / operand2;
                } else {
                    display.setText("Error");
                    return;
                }
            }
            display.setText(String.valueOf(result));
        }
    }

    public static void main(String[] args) {
        new MyCalculator();
    }
}
*/
////////////////////////////////////////////////////////////////////////////////////////////////////
//4
////////////////////////////////////////////////////////////////////////////////////////////////////
/*
import java.awt.*;
import java.awt.event.*;

public class MyCalculator extends Frame implements ActionListener {

    // The display area
    private TextField display;

    // Buttons for digits, operators, and equals
    private Button[] digitButtons;
    private Button[] operatorButtons;
    private Button equalsButton;

    // Variables to store the operands and operator
    private double operand1;
    private String operator;

    public MyCalculator() {
        setTitle("My Calculator");
        setSize(400, 400);
        setLayout(new GridLayout(5, 4));

        // Initialize the display
        display = new TextField();
        add(display);

        // Initialize digit buttons
        digitButtons = new Button[10];
        for (int i = 0; i < 10; i++) {
            digitButtons[i] = new Button(String.valueOf(i));
            digitButtons[i].addActionListener(this);
            add(digitButtons[i]);
        }

        // Initialize operator buttons
        operatorButtons = new Button[4];
        operatorButtons[0] = new Button("+");
        operatorButtons[1] = new Button("-");
        operatorButtons[2] = new Button("*");
        operatorButtons[3] = new Button("/");
        for (int i = 0; i < 4; i++) {
            operatorButtons[i].addActionListener(this);
            add(operatorButtons[i]);
        }

        // Initialize equals button
        equalsButton = new Button("=");
        equalsButton.addActionListener(this);
        add(equalsButton);

        // Make the frame visible
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        if (Character.isDigit(command.charAt(0))) {
            // If a digit button is clicked, append the digit to the display
            display.setText(display.getText() + command);
        } else if (command.equals("+") || command.equals("-") || command.equals("*") || command.equals("/")) {
            // If an operator button is clicked, store the current display value as operand1
            operand1 = Double.parseDouble(display.getText());
            operator = command;
            display.setText("");
        } else if (command.equals("=")) {
            // If the equals button is clicked, perform the calculation
            double operand2 = Double.parseDouble(display.getText());
            double result = 0.0;
            if (operator.equals("+")) {
                result = operand1 + operand2;
            } else if (operator.equals("-")) {
                result = operand1 - operand2;
            } else if (operator.equals("*")) {
                result = operand1 * operand2;
            } else if (operator.equals("/")) {
                if (operand2 != 0) {
                    result = operand1 / operand2;
                } else {
                    display.setText("Error");
                    return;
                }
            }
            display.setText(String.valueOf(result));
        }
    }

    public static void main(String[] args) {
        new MyCalculator();
    }
}
*/

