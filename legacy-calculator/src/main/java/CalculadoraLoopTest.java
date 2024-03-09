package main.java;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class CalculadoraLoopTest {
   private final long z = 375000L;
   private final long s = 37500L;

   public CalculadoraLoopTest() {
   }

   public double calcularEspiras(int tensao, int frequencia, double diametroExterno, double diametroInterno, double comprimentoPacote, double alturaRanhura) {
      double d1 = this.dum(diametroInterno, alturaRanhura);

      double espiras;
      try {
         espiras = 375000.0 * ((double)tensao / ((double)frequencia * (diametroExterno - d1) * comprimentoPacote));
      } catch (Exception var16) {
         espiras = 0.0;
      }

      BigDecimal bd = (new BigDecimal(espiras)).setScale(3, RoundingMode.HALF_UP);
      return bd.doubleValue();
   }

   public double calcularSeccao(int tensao, int frequencia, double diametroExterno, double diametroInterno, double comprimentoPacote, double alturaRanhura) {
      double d1 = this.dum(diametroInterno, alturaRanhura);
      double espiras = this.calcularEspiras(tensao, frequencia, diametroExterno, diametroInterno, comprimentoPacote, alturaRanhura);
      double z2 = espiras * espiras;

      double seccao;
      try {
         seccao = 37500.0 * ((double)tensao * (diametroExterno + d1) / ((double)frequencia * z2 * comprimentoPacote * (diametroExterno - d1)));
      } catch (Exception var20) {
         seccao = 0.0;
      }

      BigDecimal bd = (new BigDecimal(seccao)).setScale(3, RoundingMode.HALF_UP);
      return bd.doubleValue();
   }

   public double dum(double diametroInterno, double alturaRanhura) {
      double d1;
      try {
         d1 = diametroInterno + 2.0 * alturaRanhura;
      } catch (Exception var8) {
         d1 = 0.0;
      }

      return d1;
   }
}
