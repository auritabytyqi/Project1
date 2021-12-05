
import java.awt.*;
import javax.swing.*;

public class Shfaqja_e_te_hollave  extends JPanel
{    
         private int eu50,eu20,eu10,eu5,eu2,eu1,ce50,ce20,ce10,cen5,ce2,ce1;   
      
         public void Shfaqja_e_te_hollave(int eu50, int eu20,int eu10,int eu5,int eu2,int eu1,
                                  int ce50,int ce20,int ce10,int cen5,int ce2,int ce1)
         {

              this.eu50=eu50;
              this.eu20=eu20;
              this.eu10=eu10;
              this.eu5=eu5;
              this.eu2=eu2;
              this.eu1=eu1;
              this.ce50=ce50;
              this.ce20=ce20;
              this.ce10=ce10;
              this.cen5=cen5;
              this.ce2=ce2;
              this.ce1=ce1;
              JFrame korniza= new JFrame();
              korniza.getContentPane().add(this);
              korniza.setTitle("Shfaqja e rezultatit");
              korniza.setSize(500, 500);
              korniza.setVisible(true);
              korniza.getContentPane().add(this);

         }
         
         public void paintComponent(Graphics g)
         {
              
              int gjatesia=70;
              int gjeresia=30;
              int majtas=5;
              int poshte=40;
              g.setColor(Color.black);
              g.drawString("Rrezultati i kërkuar është shfaqur më poshtë! ",20,20);
              g.setColor(Color.yellow.darker());
              g.fillRect(majtas,poshte,gjatesia,gjeresia);
              g.setColor(Color.black);
              g.drawString("50€",majtas+40,poshte+20);
              g.drawString("-------> "+eu50,majtas+gjatesia+5,poshte+20);
              g.setColor(Color.cyan);
              g.fillRect(majtas+10,poshte+40,gjatesia-10,gjeresia-5);
              g.setColor(Color.black);
              g.drawString("20€",majtas+40,poshte+55);
              g.drawString("-------> "+eu20,majtas+gjatesia+5,poshte+55);
              g.setColor(Color.red.brighter());
              g.fillRect(majtas+15,poshte+70,gjatesia-15,gjeresia-10);
              g.setColor(Color.black);
              g.drawString("10€",majtas+40,poshte+85);
              g.drawString("-------> "+eu10,majtas+gjatesia+5,poshte+85);
              g.setColor(Color.green.brighter());
              g.fillRect(majtas+18,poshte+100,gjatesia-18,gjeresia-12);
              g.setColor(Color.black);
              g.drawString("5€",majtas+45,poshte+115);
              g.drawString("-------> "+eu5,majtas+gjatesia+5,poshte+115);
              
              int diametri=20;
              
              g.setColor(Color.gray.brighter());
              g.fillOval(majtas+50,poshte+120,diametri,diametri);
              g.setColor(Color.black);
              g.drawString("2€",majtas+53,poshte+133);
              g.drawString("-------> "+eu2,majtas+diametri+55,poshte+135);
              g.setColor(Color.gray.brighter());
              g.fillOval(majtas+50,poshte+145,diametri,diametri);
              g.setColor(Color.black);
              g.drawString("1€",majtas+53,poshte+158);
              g.drawString("-------> "+eu1,majtas+diametri+55,poshte+160);
              g.setColor(Color.orange);
              g.fillOval(majtas+50,poshte+170,diametri,diametri);
              g.setColor(Color.black);
              g.drawString("50c",majtas+51,poshte+183);
              g.drawString("-------> "+ce50,majtas+diametri+55,poshte+185);
              g.setColor(Color.orange);
              g.fillOval(majtas+50,poshte+195,diametri,diametri);
              g.setColor(Color.black);
              g.drawString("20c",majtas+51,poshte+208);
              g.drawString("-------> "+ce20,majtas+diametri+55,poshte+210);
              g.setColor(Color.orange);
              g.fillOval(majtas+50,poshte+220,diametri,diametri);
              g.setColor(Color.black);
              g.drawString("10c",majtas+51,poshte+233);
              g.drawString("-------> "+ce10,majtas+diametri+55,poshte+235);
              g.setColor(Color.orange);
              g.fillOval(majtas+50,poshte+245,diametri,diametri);
              g.setColor(Color.black);
              g.drawString("5c",majtas+55,poshte+258);
              g.drawString("-------> "+cen5,majtas+diametri+55,poshte+260);
              diametri=diametri-3;
              g.setColor(Color.pink.darker());
              g.fillOval(majtas+53,poshte+267,diametri,diametri);
              g.setColor(Color.black);
              g.drawString("2c",majtas+55,poshte+280);
              g.drawString("-------> "+ce2,majtas+diametri+58,poshte+282);
              g.setColor(Color.pink.darker());
              g.fillOval(majtas+53,poshte+289,diametri,diametri);
              g.setColor(Color.black);
              g.drawString("1c",majtas+55,poshte+302);
              g.drawString("-------> "+ce1,majtas+diametri+58,poshte+304);
         }

}