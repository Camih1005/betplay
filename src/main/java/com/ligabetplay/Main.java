package com.ligabetplay;

import java.util.HashSet;
import java.util.Hashtable;
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
        team.setNameTeam(JOptionPane.showInputDialog(null,"Ingrese el nombre del equipo","Registro"));
        team.setCity(JOptionPane.showInputDialog(null,"Ingrese ciudad de origen"));

        teams.put(valueNumber,team);
    }

    public static int GenerateUnique() {
        int randomNumber =0;
        randomNumber= ThreadLocalRandom.current().nextInt(AutoIncrement.max);
        AutoIncrement.uniqueNumbers.add(randomNumber);
        return randomNumber;

    }
}