package com.bcopstein.ExercicioRefatoracaoBanco;

import java.util.GregorianCalendar; // atualizar esse 'import' depois

import javafx.collections.ObservableList;

public class Fachada {
    private static Fachada uniqueInstance = null;

    private Fachada () {
    
    }    

    public static Fachada getInstance() {
        if (uniqueInstance == null)
            uniqueInstance = new Fachada();

        return uniqueInstance;
    }

}