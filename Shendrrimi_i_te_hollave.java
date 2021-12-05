
public class Shendrrimi_i_te_hollave 
{
 private int shuma_fillestare;
   public Shendrrimi_i_te_hollave(int shuma_fillestare)
   {
     this.shuma_fillestare=shuma_fillestare;
   }
   public void llogaritja()
   {
    
     int euroshe50=shuma_fillestare/5000;
     shuma_fillestare = shuma_fillestare% 5000;
     int euroshe20=shuma_fillestare/2000;
     shuma_fillestare = shuma_fillestare% 2000;
     int euroshe10=shuma_fillestare/1000;
     shuma_fillestare = shuma_fillestare% 1000;
     int euroshe5=shuma_fillestare/500;
     shuma_fillestare = shuma_fillestare% 500;
     int euroshe2=shuma_fillestare/200;
     shuma_fillestare = shuma_fillestare% 200;
     int euroshe1=shuma_fillestare/100;
     shuma_fillestare = shuma_fillestare% 100;
     int centeshe50=shuma_fillestare/50;
     shuma_fillestare = shuma_fillestare% 50;
     int centeshe20=shuma_fillestare/20;
     shuma_fillestare = shuma_fillestare% 20;
     int centeshe10=shuma_fillestare/10;
     shuma_fillestare = shuma_fillestare% 10;
     int centeshe5=shuma_fillestare/5;
     shuma_fillestare = shuma_fillestare% 5;
     int centeshe2=shuma_fillestare/2;
     shuma_fillestare = shuma_fillestare% 2;
     int centeshe1=shuma_fillestare;
     
     Shfaqja_e_te_hollave v=new Shfaqja_e_te_hollave();
     v.Shfaqja_e_te_hollave(euroshe50, euroshe20, euroshe10, euroshe5, euroshe2, euroshe1,
                            centeshe50, centeshe20, centeshe10, centeshe5, centeshe2, centeshe1);
     }
 
}