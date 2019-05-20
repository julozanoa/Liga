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
        System.out.println("Ingrese nombre del primer equipo que desea añadir");
        String e1 = sc.nextLine();
        Equipo equipo1 = new Equipo(e1);
        System.out.println("ingrese nombre gerente del equipo 1");
        String gn1 = sc.nextLine();
        System.out.println("ingfese apellido gerente del equipo 1");
        String ga1 = sc.nextLine();
        equipo1.añadirGerente(gn1, ga1);
        System.out.println("Cuantos aleros desea añadir al equipo 1?");
        int x1 = sc.nextInt();
        equipo1.añadirAleros(x1);
        System.out.println("Cuantos defensores desea añadir al equipo 1?");
        int y1 = sc.nextInt();
        equipo1.añadirDefensores(y1);
        System.out.println("Cuantos porteros desea añadir al equipo 1?");
        int z1 = sc.nextInt();
        equipo1.añadirPorteros(z1);
        
        System.out.println("Ingrese nombre del segundo equipo que desea añadir");
        String e2 = sc.nextLine();
        Equipo equipo2 = new Equipo(e2);
        System.out.println("ingrese nombre gerente del equipo 2");
        String gn2 = sc.nextLine();
        System.out.println("ingfese apellido gerente del equipo 2");
        String ga2 = sc.nextLine();
        equipo2.añadirGerente(gn2, ga2);
        System.out.println("Cuantos aleros desea añadir al equipo 2?");
        int x2 = sc.nextInt();
        equipo2.añadirAleros(x2);
        System.out.println("Cuantos defensores desea añadir al equipo 2?");
        int y2 = sc.nextInt();
        equipo2.añadirDefensores(y2);
        System.out.println("Cuantos porteros desea añadir al equipo 2?");
        int z2 = sc.nextInt();
        equipo2.añadirPorteros(z2);
        
        ArrayList <Equipo> Liga = new ArrayList<>();
        Liga.add(equipo1);
        Liga.add(equipo2);
        
        
        for (int i = 0; i < Liga.size(); i++) {
            System.out.println(Liga.get(i).getGerenteNombre()+" "+Liga.get(i).getGerenteApellido());
        }
        
        System.out.println(" La final de la Liga sera entre: "+Liga.get(0).getNombre()+" vs "+Liga.get(1).getNombre());
        
    }
}
