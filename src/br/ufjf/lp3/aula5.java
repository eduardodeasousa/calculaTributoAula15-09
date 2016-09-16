package br.ufjf.lp3;

import javax.swing.JFrame;


public class aula5 {

    public static void main(String[] args) {
      JanelaExemplo1 janela = new JanelaExemplo1();
      janela.setSize(100,250);
      janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      janela.setLocationRelativeTo(null);
      janela.setVisible(true);
    }
    
}
