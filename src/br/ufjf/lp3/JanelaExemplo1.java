package br.ufjf.lp3;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class JanelaExemplo1 extends JFrame {
    
    private JCheckBox chkTributado = new JCheckBox("Tributado");
    private JCheckBox chkCMS = new JCheckBox("ICMS");
    private JLabel lblValor = new JLabel("Valor");
    private JLabel lblCotacao = new JLabel("Cotacao");
    private JLabel lblValorFinal = new JLabel("Valor final");
    private JButton btnCalcular = new JButton("Calcular");
    private JTextField txtValor = new JTextField(5);
    private JTextField txtCotacao = new JTextField(5);
    private JTextField txtVlFinal = new JTextField(5);
            
    public JanelaExemplo1()
    {
    super("Exemplo Aula 5");
    setLayout(new FlowLayout(FlowLayout.LEFT));
    add(lblValor);
    add(txtValor);
    add(lblCotacao);
    add(txtCotacao);
    add(chkTributado);
    add(chkCMS);
    add(lblValorFinal);
    add(txtVlFinal);
    add(btnCalcular);
    
    MudaFonte ouvinte = new MudaFonte();
    
    btnCalcular.addActionListener(ouvinte);
    
    }

    private class MudaFonte implements ActionListener {

        public MudaFonte() {
        
        }

        @Override
        public void actionPerformed(ActionEvent e) {
                               float init = Float.parseFloat(txtValor.getText());
         init*=Float.parseFloat(txtCotacao.getText());
         if(chkTributado.isSelected())
         {
             init*=1.6;
         }
         if(chkCMS.isSelected())
         {
             init*=1.8;
         }
         txtVlFinal.setText(String.valueOf(init));
        }
        }
         
       
    }

