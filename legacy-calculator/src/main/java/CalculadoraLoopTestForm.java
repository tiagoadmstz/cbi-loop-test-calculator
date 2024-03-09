package main.java;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

public class CalculadoraLoopTestForm extends JFrame {
   private JPanel DicasPanel;
   private JPanel EntradasPanel;
   private JLabel FotoLabel;
   private JPanel FotoPanel;
   private JLabel LabelPanel;
   private JPanel PrincipalPanel;
   private JPanel ResultadosPanel;
   private JLabel alturaRanhuraLabel;
   private JTextField alturaRanhuraTxt;
   private JButton calcularButton;
   private JLabel comprimentoPacoteLabel;
   private JTextField comprimentoPacoteTxt;
   private JLabel condutorLabel;
   private JTextField condutorTxt;
   private JTextField diamentroExternoTxt;
   private JTextField diamentroInternoTxt;
   private JLabel diametroExternoLabel;
   private JLabel diametroInternoLabel;
   private JLabel dicasLabel;
   private JLabel entradasLabel;
   private JLabel espirasLabel;
   private JTextField espirasTxt;
   private JLabel frequenciaLabel;
   private JTextField frequenciaTxt;
   private JLabel tensaoLabel;
   private JTextField tensaoTxt;
   private JButton zerarButton;

   public CalculadoraLoopTestForm() {
      this.centralizarTela();
      this.initComponents();
      new CalculadoraLoopTestListenner(this);
      this.getTensaoTxt().requestFocus();
   }

   private void centralizarTela() {
      Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
      int x = ds.height / 5;
      int y = ds.width / 5;
      this.setLocation(y, x);
   }

   public JLabel getFotoLabel() {
      return this.FotoLabel;
   }

   public void setFotoLabel(JLabel FotoLabel) {
      this.FotoLabel = FotoLabel;
   }

   public JTextField getAlturaRanhuraTxt() {
      return this.alturaRanhuraTxt;
   }

   public void setAlturaRanhuraTxt(JTextField alturaRanhuraTxt) {
      this.alturaRanhuraTxt = alturaRanhuraTxt;
   }

   public JButton getCalcularButton() {
      return this.calcularButton;
   }

   public void setCalcularButton(JButton calcularButton) {
      this.calcularButton = calcularButton;
   }

   public JTextField getComprimentoPacoteTxt() {
      return this.comprimentoPacoteTxt;
   }

   public void setComprimentoPacoteTxt(JTextField comprimentoPacoteTxt) {
      this.comprimentoPacoteTxt = comprimentoPacoteTxt;
   }

   public JTextField getCondutorTxt() {
      return this.condutorTxt;
   }

   public void setCondutorTxt(JTextField condutorTxt) {
      this.condutorTxt = condutorTxt;
   }

   public JTextField getDiamentroExternoTxt() {
      return this.diamentroExternoTxt;
   }

   public void setDiamentroExternoTxt(JTextField diamentroExternoTxt) {
      this.diamentroExternoTxt = diamentroExternoTxt;
   }

   public JTextField getDiamentroInternoTxt() {
      return this.diamentroInternoTxt;
   }

   public void setDiamentroInternoTxt(JTextField diamentroInternoTxt) {
      this.diamentroInternoTxt = diamentroInternoTxt;
   }

   public JTextField getEspirasTxt() {
      return this.espirasTxt;
   }

   public void setEspirasTxt(JTextField espirasTxt) {
      this.espirasTxt = espirasTxt;
   }

   public JTextField getFrequenciaTxt() {
      return this.frequenciaTxt;
   }

   public void setFrequenciaTxt(JTextField frequenciaTxt) {
      this.frequenciaTxt = frequenciaTxt;
   }

   public JTextField getTensaoTxt() {
      return this.tensaoTxt;
   }

   public void setTensaoTxt(JTextField tensaoTxt) {
      this.tensaoTxt = tensaoTxt;
   }

   public JButton getZerarButton() {
      return this.zerarButton;
   }

   public void setZerarButton(JButton zerarButton) {
      this.zerarButton = zerarButton;
   }

   private void initComponents() {
      this.PrincipalPanel = new JPanel();
      this.EntradasPanel = new JPanel();
      this.entradasLabel = new JLabel();
      this.zerarButton = new JButton();
      this.tensaoLabel = new JLabel();
      this.tensaoTxt = new JTextField();
      this.frequenciaLabel = new JLabel();
      this.frequenciaTxt = new JTextField();
      this.diametroExternoLabel = new JLabel();
      this.diamentroExternoTxt = new JTextField();
      this.diametroInternoLabel = new JLabel();
      this.diamentroInternoTxt = new JTextField();
      this.alturaRanhuraLabel = new JLabel();
      this.alturaRanhuraTxt = new JTextField();
      this.comprimentoPacoteLabel = new JLabel();
      this.comprimentoPacoteTxt = new JTextField();
      this.FotoPanel = new JPanel();
      this.FotoLabel = new JLabel();
      this.ResultadosPanel = new JPanel();
      this.calcularButton = new JButton();
      this.espirasLabel = new JLabel();
      this.espirasTxt = new JTextField();
      this.condutorLabel = new JLabel();
      this.condutorTxt = new JTextField();
      this.DicasPanel = new JPanel();
      this.LabelPanel = new JLabel();
      this.dicasLabel = new JLabel();
      this.setDefaultCloseOperation(2);
      this.setResizable(false);
      this.EntradasPanel.setBorder(BorderFactory.createEtchedBorder());
      this.EntradasPanel.setToolTipText("");
      this.EntradasPanel.setName("");
      this.entradasLabel.setFont(new Font("Tahoma", 1, 12));
      this.entradasLabel.setText("Entradas");
      this.zerarButton.setFont(new Font("Tahoma", 1, 12));
      this.zerarButton.setText("Zerar caixas");
      this.zerarButton.setActionCommand("zerar");
      this.tensaoLabel.setFont(new Font("Tahoma", 1, 12));
      this.tensaoLabel.setText("Tens\u00e3o (V)");
      this.tensaoTxt.setToolTipText("");
      this.tensaoTxt.setNextFocusableComponent(this.frequenciaTxt);
      this.frequenciaLabel.setFont(new Font("Tahoma", 1, 12));
      this.frequenciaLabel.setText("Frequ\u00eancia (Hz)");
      this.frequenciaTxt.setToolTipText("");
      this.frequenciaTxt.setNextFocusableComponent(this.diamentroExternoTxt);
      this.diametroExternoLabel.setFont(new Font("Tahoma", 1, 12));
      this.diametroExternoLabel.setText("Di\u00e2metro externo Estator (mm) D2");
      this.diamentroExternoTxt.setToolTipText("");
      this.diamentroExternoTxt.setNextFocusableComponent(this.diamentroInternoTxt);
      this.diametroInternoLabel.setFont(new Font("Tahoma", 1, 12));
      this.diametroInternoLabel.setText("Di\u00e2metro interno Estator (mm) Di");
      this.diamentroInternoTxt.setToolTipText("");
      this.diamentroInternoTxt.setNextFocusableComponent(this.alturaRanhuraTxt);
      this.alturaRanhuraLabel.setFont(new Font("Tahoma", 1, 12));
      this.alturaRanhuraLabel.setText("Altura da Ranhura (mm) hn1");
      this.alturaRanhuraTxt.setToolTipText("");
      this.alturaRanhuraTxt.setNextFocusableComponent(this.comprimentoPacoteTxt);
      this.comprimentoPacoteLabel.setFont(new Font("Tahoma", 1, 12));
      this.comprimentoPacoteLabel.setText("Comprimento do Pacote (mm)");
      this.comprimentoPacoteTxt.setToolTipText("");
      this.comprimentoPacoteTxt.setNextFocusableComponent(this.tensaoTxt);
      GroupLayout EntradasPanelLayout = new GroupLayout(this.EntradasPanel);
      this.EntradasPanel.setLayout(EntradasPanelLayout);
      EntradasPanelLayout.setHorizontalGroup(EntradasPanelLayout.createParallelGroup(Alignment.LEADING).addGroup(EntradasPanelLayout.createSequentialGroup().addContainerGap().addGroup(EntradasPanelLayout.createParallelGroup(Alignment.LEADING).addGroup(EntradasPanelLayout.createSequentialGroup().addGroup(EntradasPanelLayout.createParallelGroup(Alignment.LEADING).addGroup(EntradasPanelLayout.createSequentialGroup().addGroup(EntradasPanelLayout.createParallelGroup(Alignment.LEADING).addComponent(this.tensaoLabel).addComponent(this.frequenciaLabel).addComponent(this.diametroExternoLabel).addComponent(this.diamentroExternoTxt, -2, 168, -2)).addPreferredGap(ComponentPlacement.RELATED, -1, 32767)).addGroup(EntradasPanelLayout.createSequentialGroup().addGroup(EntradasPanelLayout.createParallelGroup(Alignment.TRAILING).addComponent(this.frequenciaTxt, Alignment.LEADING, -2, 168, -2).addComponent(this.tensaoTxt)).addGap(145, 145, 145))).addGroup(EntradasPanelLayout.createParallelGroup(Alignment.LEADING).addComponent(this.diametroInternoLabel).addComponent(this.alturaRanhuraLabel).addComponent(this.comprimentoPacoteLabel).addComponent(this.alturaRanhuraTxt, -2, 168, -2).addComponent(this.diamentroInternoTxt, -2, 168, -2).addComponent(this.comprimentoPacoteTxt, -2, 168, -2)).addGap(41, 41, 41)).addGroup(EntradasPanelLayout.createSequentialGroup().addGroup(EntradasPanelLayout.createParallelGroup(Alignment.LEADING).addComponent(this.entradasLabel).addComponent(this.zerarButton, -2, 120, -2)).addContainerGap(-1, 32767)))));
      EntradasPanelLayout.setVerticalGroup(EntradasPanelLayout.createParallelGroup(Alignment.LEADING).addGroup(EntradasPanelLayout.createSequentialGroup().addComponent(this.entradasLabel).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.zerarButton, -2, 34, -2).addPreferredGap(ComponentPlacement.UNRELATED).addGroup(EntradasPanelLayout.createParallelGroup(Alignment.TRAILING).addGroup(EntradasPanelLayout.createSequentialGroup().addComponent(this.tensaoLabel, -2, 15, -2).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.tensaoTxt, -2, 23, -2)).addGroup(EntradasPanelLayout.createSequentialGroup().addComponent(this.diametroInternoLabel, -2, 15, -2).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.diamentroInternoTxt, -2, 23, -2))).addPreferredGap(ComponentPlacement.UNRELATED).addGroup(EntradasPanelLayout.createParallelGroup(Alignment.LEADING).addGroup(EntradasPanelLayout.createSequentialGroup().addComponent(this.frequenciaLabel, -2, 15, -2).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.frequenciaTxt, -2, 23, -2)).addGroup(EntradasPanelLayout.createSequentialGroup().addComponent(this.alturaRanhuraLabel, -2, 15, -2).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.alturaRanhuraTxt, -2, 23, -2))).addPreferredGap(ComponentPlacement.UNRELATED).addGroup(EntradasPanelLayout.createParallelGroup(Alignment.LEADING).addGroup(EntradasPanelLayout.createSequentialGroup().addComponent(this.diametroExternoLabel, -2, 15, -2).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.diamentroExternoTxt, -2, 23, -2)).addGroup(EntradasPanelLayout.createSequentialGroup().addComponent(this.comprimentoPacoteLabel, -2, 15, -2).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.comprimentoPacoteTxt, -2, 23, -2))).addGap(0, 22, 32767)));
      this.FotoPanel.setBorder(BorderFactory.createEtchedBorder());
      this.FotoLabel.setIcon(new ImageIcon("C:\\DEV\\cbi-loop-test-calculator\\legacy-calculator\\src\\main\\java\\resources\\looptest.gif"));
      this.FotoLabel.setToolTipText("");
      GroupLayout FotoPanelLayout = new GroupLayout(this.FotoPanel);
      this.FotoPanel.setLayout(FotoPanelLayout);
      FotoPanelLayout.setHorizontalGroup(FotoPanelLayout.createParallelGroup(Alignment.LEADING).addComponent(this.FotoLabel, Alignment.TRAILING, -1, -1, 32767));
      FotoPanelLayout.setVerticalGroup(FotoPanelLayout.createParallelGroup(Alignment.LEADING).addComponent(this.FotoLabel, -1, -1, 32767));
      this.ResultadosPanel.setBorder(BorderFactory.createEtchedBorder());
      this.calcularButton.setFont(new Font("Tahoma", 1, 12));
      this.calcularButton.setText("Calcular");
      this.espirasLabel.setFont(new Font("Tahoma", 1, 12));
      this.espirasLabel.setText("N\u00fameros de Espiras");
      this.espirasTxt.setEditable(false);
      this.espirasTxt.setBackground(new Color(255, 255, 255));
      this.espirasTxt.setToolTipText("");
      this.condutorLabel.setFont(new Font("Tahoma", 1, 12));
      this.condutorLabel.setText("Se\u00e7\u00e3o do Condutor (mm2)");
      this.condutorTxt.setEditable(false);
      this.condutorTxt.setBackground(new Color(255, 255, 255));
      this.condutorTxt.setToolTipText("");
      GroupLayout ResultadosPanelLayout = new GroupLayout(this.ResultadosPanel);
      this.ResultadosPanel.setLayout(ResultadosPanelLayout);
      ResultadosPanelLayout.setHorizontalGroup(ResultadosPanelLayout.createParallelGroup(Alignment.LEADING).addGroup(ResultadosPanelLayout.createSequentialGroup().addGap(25, 25, 25).addComponent(this.calcularButton, -2, 88, -2).addGap(18, 18, 18).addGroup(ResultadosPanelLayout.createParallelGroup(Alignment.LEADING).addComponent(this.espirasLabel).addComponent(this.espirasTxt, -2, 130, -2).addComponent(this.condutorLabel).addComponent(this.condutorTxt, -2, 130, -2)).addContainerGap(-1, 32767)));
      ResultadosPanelLayout.setVerticalGroup(ResultadosPanelLayout.createParallelGroup(Alignment.LEADING).addGroup(ResultadosPanelLayout.createSequentialGroup().addContainerGap().addComponent(this.espirasLabel, -2, 15, -2).addPreferredGap(ComponentPlacement.RELATED).addGroup(ResultadosPanelLayout.createParallelGroup(Alignment.TRAILING).addGroup(ResultadosPanelLayout.createSequentialGroup().addComponent(this.espirasTxt, -2, 23, -2).addPreferredGap(ComponentPlacement.UNRELATED).addComponent(this.condutorLabel, -2, 15, -2)).addComponent(this.calcularButton, -2, 34, -2)).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.condutorTxt, -2, 23, -2).addContainerGap(21, 32767)));
      this.DicasPanel.setBorder(BorderFactory.createEtchedBorder());
      this.LabelPanel.setFont(new Font("Tahoma", 1, 12));
      this.LabelPanel.setText("Dicas sobre o Loop-Test");
      this.dicasLabel.setText("<html>*O tempo de indu\u00e7\u00e3o, deve ser em torno de 45<br>\nminutos \u00e0 60 minutos, para tornar o teste mais<br>\nexato poss\u00edvel.<br>\n*Caso haja algum ponto com temperatura de 10<br>\ngraus Celsius acima dos outros pontos, ent\u00e3o a<br>\ncarca\u00e7a com estator deve ser condenado;<br>\n*Deve-se sempre marcar os pontos em que as<br>\ntemperaturas foram medidas, para evitar confus\u00e3o<br>\ncom as medi\u00e7\u00f5es;<br>\n*As espiras devem ser divididas uniformemente<br>\nnos 360 graus do estator, para melhorar a<br>\nexatid\u00e3o do teste;<br>\n*O teste deve ser feito com o estator limpo e de<br>\nprefer\u00eancia sem o bobinado queimado, ou ent\u00e3o<br>\ncom todas as liga\u00e7\u00f5es em aberto;<br>\n*O teste deve ser feito com o estator dentro da<br>\ncarca\u00e7a;");
      this.dicasLabel.setVerticalAlignment(1);
      this.dicasLabel.setName("");
      GroupLayout DicasPanelLayout = new GroupLayout(this.DicasPanel);
      this.DicasPanel.setLayout(DicasPanelLayout);
      DicasPanelLayout.setHorizontalGroup(DicasPanelLayout.createParallelGroup(Alignment.LEADING).addGroup(DicasPanelLayout.createSequentialGroup().addComponent(this.LabelPanel).addGap(0, 0, 32767)).addGroup(DicasPanelLayout.createSequentialGroup().addContainerGap().addComponent(this.dicasLabel, -2, 283, -2).addContainerGap(-1, 32767)));
      DicasPanelLayout.setVerticalGroup(DicasPanelLayout.createParallelGroup(Alignment.LEADING).addGroup(DicasPanelLayout.createSequentialGroup().addComponent(this.LabelPanel, -2, 15, -2).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.dicasLabel).addContainerGap()));
      this.dicasLabel.getAccessibleContext().setAccessibleDescription("");
      GroupLayout PrincipalPanelLayout = new GroupLayout(this.PrincipalPanel);
      this.PrincipalPanel.setLayout(PrincipalPanelLayout);
      PrincipalPanelLayout.setHorizontalGroup(PrincipalPanelLayout.createParallelGroup(Alignment.LEADING).addGroup(PrincipalPanelLayout.createSequentialGroup().addContainerGap().addGroup(PrincipalPanelLayout.createParallelGroup(Alignment.LEADING, false).addComponent(this.FotoPanel, -1, -1, 32767).addComponent(this.EntradasPanel, -1, -1, 32767)).addPreferredGap(ComponentPlacement.RELATED).addGroup(PrincipalPanelLayout.createParallelGroup(Alignment.LEADING).addComponent(this.ResultadosPanel, -1, -1, 32767).addComponent(this.DicasPanel, Alignment.TRAILING, -1, -1, 32767)).addContainerGap()));
      PrincipalPanelLayout.setVerticalGroup(PrincipalPanelLayout.createParallelGroup(Alignment.LEADING).addGroup(PrincipalPanelLayout.createSequentialGroup().addContainerGap().addGroup(PrincipalPanelLayout.createParallelGroup(Alignment.LEADING).addGroup(PrincipalPanelLayout.createSequentialGroup().addComponent(this.EntradasPanel, -2, -1, -2).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.FotoPanel, -1, -1, 32767)).addGroup(PrincipalPanelLayout.createSequentialGroup().addComponent(this.ResultadosPanel, -2, -1, -2).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.DicasPanel, -1, -1, 32767))).addContainerGap()));
      GroupLayout layout = new GroupLayout(this.getContentPane());
      this.getContentPane().setLayout(layout);
      layout.setHorizontalGroup(layout.createParallelGroup(Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addComponent(this.PrincipalPanel, -1, -1, 32767).addContainerGap()));
      layout.setVerticalGroup(layout.createParallelGroup(Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addComponent(this.PrincipalPanel, -1, -1, 32767).addContainerGap()));
      this.pack();
   }
}
