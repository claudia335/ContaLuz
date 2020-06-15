
package companhiaeletrica;

import javax.swing.JOptionPane;

class Sistema {
    public double anterior;
    public double atual;
    public double tusd = 0.30;
    public double valorTusd;
    public double valorTe;
    public double total;
    public double sub;
    public double valorIcms;
    public double totalParcial;
    public double te = 0.29;
    public double icms = 0.25;
    public String bandeira;
    public double add;
    
    public void setAnterior(double anterior){
       this.anterior = anterior;
    }
   
   public double getAnterior(){
       return anterior;
    }
    
   public void setAtual(double atual){
       this.atual = atual;
    }
   
   public double getAtual(){
       return atual;
    }
   
   public void setTusd(double tusd){
       this.tusd = tusd;
    }
   
   public double getTusd(){
       return tusd;
    }
   
   public void setTe(double te){
       this.te = te;
    }
   
   public double getTe(){
       return te;
    }
   
   public void validar(){
       if(atual<0 && anterior<0){
           JOptionPane.showMessageDialog(null, "INVÁLIDO");
       }
       else{
           this.bandeira();
       }
   }
    public void bandeira(){
       sub=atual-anterior;
       Math.ceil(valorTusd=sub*tusd);
       valorTe=sub*te;
      
       totalParcial=valorTusd+valorTe;
       valorIcms=(icms*totalParcial);
       total=valorIcms+totalParcial;
        
      if(sub<100 && sub>=0){
          bandeira="Verde"; 
          total=total+0;
      }
      else if(sub>=100&&sub<150){
          bandeira="Amarela";
          total=total+((sub*0.01343)+(sub*0.01343)*icms);   
      }
      else if(sub>=150&&sub<=200){
          bandeira="Vermelha 1";
          total=total+((sub*0.04169)+(sub*0.04169)*icms);   
      }
      else if(sub>200){
          bandeira="Vermelha 2";
          total=total+((sub*0.06243)+(sub*0.06243)*icms);   
      }     
      this.conta();
   }
   


   public void conta (){
       JOptionPane.showMessageDialog(null,"Leitura Anterior: "+anterior+"\n"
               + "Leitura Atual: "+atual+"\n"
               + "Kw/h consumidos: "+sub+"\n"
               + "Taxa TUSD: "+valorTusd+"\n"
               + "Taxa TE: "+Math.ceil(valorTe)+"\n"
               + "Total Parcial: "+totalParcial+"\n"
               + "Taxa ICMS: "+valorIcms+"\n"
               + "Bandeira: "+bandeira+"\n"
               + "Total: "+total);
   }
}
