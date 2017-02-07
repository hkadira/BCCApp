package com.ework.windows;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SplashScreen extends JWindow
{
  //---------------------------------------------------------------------------

  public SplashScreen(String image)
  {
    JLabel lbl = new JLabel(new ImageIcon(image));
    getContentPane().add(lbl, BorderLayout.CENTER);
    pack();
    setLocationRelativeTo(null);
    setVisible(true);
    
    Timer timer = new Timer(5000, new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            setVisible(false);
            dispose();
            new Login().show();
        }
    });
    timer.setRepeats(false);
    timer.start();
  }
  
  public static void main(String[] argv){
	  new SplashScreen("img/laprepairs.jpg");
  }
}
