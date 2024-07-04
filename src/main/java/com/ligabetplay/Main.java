package com.ligabetplay;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import javax.swing.JOptionPane;

import com.ligabetplay.Staticvar.AutoIncrement;
import com.ligabetplay.torneo.Team;

public class Main {
    public static void main(String[] args) {
        int valueNumber =0;
        Hashtable <Integer,Team> teams =new Hashtable<>();
        AutoIncrement.uniqueNumbers = new HashSet<>();
        System.out.println();
        Team team = new Team();
        valueNumber=GenerateUnique();
        team.setId(valueNumber);
        String options="1.Add team \n2.Add player \n3.Quit";
        int option;
        do{
           option=Integer.parseInt(JOptionPane.showInputDialog(null,options ));
           switch (option) {
            case 1:
                team.setNameTeam(JOptionPane.showInputDialog(null,"Ingrese el nombre del equipo","Registro"));
                team.setCity(JOptionPane.showInputDialog(null,"Ingrese ciudad de origen"));
                break;
            case 2:
                break;
            case 3:
            JOptionPane.showMessageDialog(null, "Gracias por usar nuestros servicios", "Informacion", JOptionPane.INFORMATION_MESSAGE);
                break;
            default:
            JOptionPane.showMessageDialog(null, "Error en el dato ingresado", "Error", JOptionPane.INFORMATION_MESSAGE);
                break;
           }
        }while (option!=3);
       

        teams.put(valueNumber,team);
        team = teams.get(getLastNumber());

        teams.keySet().forEach(keyValue->{
            System.out.println(MessageFormat.format("LLave valor: {0}",keyValue));
        });
    }

    public static int GenerateUnique() {
        int randomNumber =0;
        randomNumber= ThreadLocalRandom.current().nextInt(AutoIncrement.max);
        AutoIncrement.uniqueNumbers.add(randomNumber);
        return randomNumber;

    }
    public static int getLastNumber(){
        List<Integer> numberlist= new ArrayList<>(AutoIncrement.uniqueNumbers);
        return numberlist.get(numberlist.size()-1);
    }
}