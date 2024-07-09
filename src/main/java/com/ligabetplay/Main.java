package com.ligabetplay;

import java.io.IOException;
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
        Team team = new Team();


        String options="1.Add team \n2.Add player\n3.Show teams \n7.Quit";
        int option;
        String leftAlignFormat = "| %-4d | %-40s | %n";
        do{
           option=Integer.parseInt(JOptionPane.showInputDialog(null,options ));
           switch (option) {
            case 1:
                team = new Team();
                valueNumber = GenerateUnique();
                team.setId(valueNumber);
                team.setNameTeam(JOptionPane.showInputDialog(null,"Ingrese el nombre del equipo","Registro"));
                team.setCity(JOptionPane.showInputDialog(null,"Ingrese ciudad de origen"));
                teams.put(valueNumber,team);
                break;
            case 2:
                clearConsole();
                System.out.format("+-------+------------------------------------+%n");
                System.out.format("|Id     | Name                               +%n");
                System.out.format("+-------+------------------------------------+%n");
                teams.values().forEach(keyvalue ->{
                    System.out.format(leftAlignFormat,keyvalue.getId(),keyvalue.getNameTeam());
                });
                System.out.format("+-------+------------------------------------+%n");
                try{
                    System.in.read();
                } catch (IOException e){
                    e.printStackTrace();
                }
                break;
            case 3:
                break;
            case 7:
            JOptionPane.showMessageDialog(null, "Gracias por usar nuestros servicios", "Informacion", JOptionPane.INFORMATION_MESSAGE);
                break;
            default:
            JOptionPane.showMessageDialog(null, "Error en el dato ingresado", "Error", JOptionPane.INFORMATION_MESSAGE);
                break;
           }
        }while (option!=7);
       

       

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
    public static void clearConsole() {
        try {
            if (System.getProperty("os.name").contains("windows")){
                new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
            } else {
                new ProcessBuilder("clear").inheritIO().start().waitFor();
            }
        }catch (IOException | InterruptedException ex){
            ex.printStackTrace();
        }
    }
}