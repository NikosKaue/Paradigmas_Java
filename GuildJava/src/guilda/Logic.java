package guilda;

import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Logic {
    
    private ArrayList<Guerreiro> listW;
    private ArrayList<Arqueiro> listA;
    private ArrayList<Mago> listM;
            
    public Logic()
    {
        listW = new ArrayList<Guerreiro>();
        listA = new ArrayList<Arqueiro>();
        listM = new ArrayList<Mago>();
    }
    
    public void addGuerreiro(Guerreiro w)
    {
        listW.add(w);
    }

    public ArrayList<Arqueiro> getListA() {
        return listA;
    }

    public void setListA(ArrayList<Arqueiro> listA) {
        this.listA = listA;
    }

    public ArrayList<Mago> getListM() {
        return listM;
    }

    public void setListM(ArrayList<Mago> listM) {
        this.listM = listM;
    }

    public ArrayList<Guerreiro> getListW() {
        return listW;
    }

    public void setListW(ArrayList<Guerreiro> listW) {
        this.listW = listW;
    }
    
    public void addArqueiro(Arqueiro a)
    {
        listA.add(a);
    }
    
    public void addMago(Mago m)
    {
        listM.add(m);
    }
    
    public void removeGuerreiro(Guerreiro w)
    {
        listW.remove(w);
    }
    
    public void removeArqueiro(Arqueiro a)
    {
        listA.remove(a);
    }
    
    public void removeMago(Mago m)
    {
        listM.remove(m);
    }
}
