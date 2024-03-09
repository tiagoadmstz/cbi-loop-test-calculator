package main.java;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class CalculadoraLoopTestListenner implements ActionListener {
   CalculadoraLoopTestForm frm;
   CalculadoraLoopTest looptest;

   public CalculadoraLoopTestListenner(CalculadoraLoopTestForm frm) {
      this.frm = frm;
      this.looptest = new CalculadoraLoopTest();
      this.attachListenner();
   }

   public void actionPerformed(ActionEvent e) {
      switch (e.getActionCommand()) {
         case "zerar":
            this.zerarCampos();
            break;
         case "Calcular":
            this.calcular();
      }

   }

   public void attachListenner() {
      this.frm.getZerarButton().addActionListener(this);
      this.frm.getCalcularButton().addActionListener(this);
   }

   public void zerarCampos() {
      this.frm.getTensaoTxt().setText("");
      this.frm.getFrequenciaTxt().setText("");
      this.frm.getDiamentroExternoTxt().setText("");
      this.frm.getDiamentroInternoTxt().setText("");
      this.frm.getAlturaRanhuraTxt().setText("");
      this.frm.getComprimentoPacoteTxt().setText("");
      this.frm.getEspirasTxt().setText("");
      this.frm.getCondutorTxt().setText("");
   }

   public void calcular() {
      try {
         double espiras = this.looptest.calcularEspiras(Integer.parseInt(this.frm.getTensaoTxt().getText()), Integer.parseInt(this.frm.getFrequenciaTxt().getText()), Double.parseDouble(this.frm.getDiamentroExternoTxt().getText().replace(",", ".")), Double.parseDouble(this.frm.getDiamentroInternoTxt().getText().replace(",", ".")), Double.parseDouble(this.frm.getComprimentoPacoteTxt().getText().replace(",", ".")), Double.parseDouble(this.frm.getAlturaRanhuraTxt().getText().replace(",", ".")));
         double seccao = this.looptest.calcularSeccao(Integer.parseInt(this.frm.getTensaoTxt().getText()), Integer.parseInt(this.frm.getFrequenciaTxt().getText()), Double.parseDouble(this.frm.getDiamentroExternoTxt().getText().replace(",", ".")), Double.parseDouble(this.frm.getDiamentroInternoTxt().getText().replace(",", ".")), Double.parseDouble(this.frm.getComprimentoPacoteTxt().getText().replace(",", ".")), Double.parseDouble(this.frm.getAlturaRanhuraTxt().getText().replace(",", ".")));
         this.frm.getEspirasTxt().setText(Double.toString(espiras).replace(".", ","));
         this.frm.getCondutorTxt().setText(Double.toString(seccao).replace(".", ","));
      } catch (Exception var5) {
         JOptionPane.showMessageDialog((Component)null, "Preencha todos os campos antes de calcular!", "Erro ao Calcular", 2);
      }

   }
}
