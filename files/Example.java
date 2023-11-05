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
