/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import java.util.ArrayList;

/**
 *
 * @author Juan
 */
public class LogicaAdosa2 {
    private int dificultad;//Mientras mayor el numero, mas dificil
    private ArrayList<Integer> baldosasSinMostrar;
    private ArrayList<Integer> baldosasAMostrar;
    
    public LogicaAdosa2(){
        
        baldosasSinMostrar = new ArrayList<>();
        for(int i = 0; i<8; i++){
            baldosasSinMostrar.add(i);
        }
        
        baldosasAMostrar = new ArrayList<>();
        for(int i = 0; i<3; i++){
            int cualBaldosa = (int) (Math.random() * baldosasSinMostrar.size());
            baldosasAMostrar.add(baldosasSinMostrar.get(cualBaldosa));
            baldosasSinMostrar.remove(cualBaldosa);
        }
        
    }
    
    public boolean baldosaAMostrar(int cualNumero){
        return baldosasAMostrar.indexOf(cualNumero) != -1;
    }
    
    public int baldosaACambiar(){
        return baldosasAMostrar.get((int) (Math.random() *
                baldosasAMostrar.size()));
    }
}
