import javax.swing.*;
import java.awt.*;
public class Hyrja_e_shumes
{
   
      private int shuma_hyrese, shuma_hyresec, total;

  public void shuma()
  {
    String shumae=JOptionPane.showInputDialog("Sh�no shum�n fillestare t� eurove:");
    shuma_hyrese=new Integer(shumae).intValue();
   

          if(( shuma_hyrese<0)||(shuma_hyrese>1000)) 
          {
          JOptionPane.showMessageDialog(null,"Shuma e dh�n� nuk mund t� llogaritet!");
          String shumae2=JOptionPane.showInputDialog("Sh�no shum�n e re t� eurove, pozitive m� t� vog�l se 1000:");
             shuma_hyrese=new Integer(shumae2).intValue();     
       }
       else  { }

         String shumac=JOptionPane.showInputDialog("Sh�no shum�n fillestare t� cent�ve:");
         shuma_hyresec=new Integer(shumac).intValue();
   
         if((shuma_hyresec<0)||(shuma_hyresec>99))
        { 
          JOptionPane.showMessageDialog(null,"Shuma e dh�n� nuk mund t� llogaritet!");
          String shumac2=JOptionPane.showInputDialog("Sh�no shum�n e re t� cent�ve, pozitive m� t� vog�l se 99:");
          shuma_hyresec=new Integer(shumac2).intValue();
       }
       else  {}    
       
          if ((shuma_hyrese>0)&& (shuma_hyrese<1000) && (shuma_hyresec>0) && (shuma_hyresec<99)) {
            total = shuma_hyrese * 100 + shuma_hyresec;

            Shendrrimi_i_te_hollave s = new Shendrrimi_i_te_hollave(total);
            s.llogaritja();
        }
        else {
            JOptionPane.showMessageDialog(null,"Shuma e dh�n� nuk mund t� llogaritet!");
        }
   
   }
 }
   