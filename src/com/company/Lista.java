package com.company;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Lista {

    int tamamo=(int)(Math.random()*(10-100+1)+100);
    ArrayList<Integer> numeros = new ArrayList<Integer>((int)(Math.random()*(10-100+1)+100));
    int [] lista2 = new int[tamamo];
    Scanner sc= new Scanner(System.in);

    public void generarLista1(){
        System.out.println("El tamaño de la lista es de= "+lista2.length);
        for(int i=0; i<=(lista2.length)-1;i++){
            lista2[i]=(int)(Math.random()*(1000-9999+1)+9999);
            System.out.println("indice "+(i+1)+" Valor: "+lista2[i]);
        }
        
    }
    public void sumatoria(){
        int sumaResult = 0;
        for (int i=0;i<=(lista2.length)-1;i++){
            sumaResult=lista2[i]+sumaResult;
        }
        System.out.println("La suma es "+sumaResult);
    }
    public void generarLista2(){
        for(int i=0;i<=tamamo;i++){
            numeros.add((int)(Math.random()*(1000-9999+1)+9999));
            System.out.println("indice "+(i+1)+" Valor: "+numeros.get(i));
        }
        /*numeros.forEach((misNumeros)->{
            System.out.println(misNumeros);
        });
        System.out.println("El tamaño de la lista es de= "+numeros.size());*/
    }
    public void eliminarElemento(){
        System.out.println("Que elemento desea eliminar");
        int elementoAEliminar=sc.nextInt();
        for (int i=0;i<= numeros.size();i++){
            if (elementoAEliminar == numeros.get(i)){
                numeros.remove(i);
                numeros.forEach((misNumeros)->{
                    System.out.println(misNumeros);
                });
            };
        }



    }




}
