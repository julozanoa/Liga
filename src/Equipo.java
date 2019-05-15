/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;
/**

 * @author Estudiante
 */
public class Equipo {
    
    private Miembro gerente;
    private ArrayList <Miembro> aleros;
    private ArrayList <Miembro> defensores;
    private ArrayList <Miembro> porteros
            
            ;

    public Equipo() {
        this.gerente = gerente;
        this.aleros = new ArrayList<Miembro>();
        this.defensores = new ArrayList<Miembro>();
        this.porteros = new ArrayList<Miembro>();
    }
    
    public void crearEquipo(String gn, String ga, int x, String an, String aa, int y, String dn, String da, int z, String pn, String pa){
         Miembro gerente = new Miembro(gn, ga);
         for (int i = 0; i < x; i++) {
            Miembro alero = new Miembro(an,aa);
            aleros.add(alero);
        }
         for (int i = 0; i < y; i++) {
            Miembro defensor = new Miembro(dn,da);
            defensores.add(defensor);
        }
         for (int i = 0; i < z; i++) {
            Miembro portero = new Miembro(pn,pa);
            porteros.add(portero);
        }
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
