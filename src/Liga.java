/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;
/**
 *
 * @author Estudiante
 */
public class Liga {
    public static void main(String[] args) {
        
   Scanner sc = new Scanner(System.in);
        Equipo aguilas = new Equipo();
        System.out.println("nombre gerente aguilas");
        String gn1 = sc.nextLine();
        System.out.println("apellido gerente aguilas");
        String ga2 = sc.nextLine();
        aguilas.crearEquipo(gn, ga, 0, an, aa, 0, dn, da, 0, pn, pa);
        Equipo leones = new Equipo();
        
        ArrayList <Equipo> Liga = new ArrayList<>();
        
        
        for ( Equipo Miembro : Liga) {
            System.out.println(Liga);
        }
        
        
    }
}
