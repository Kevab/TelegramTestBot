package com.tgbot.autostrada.autobot.Models;

import java.sql.Connection;
import java.sql.DriverManager;

public class Dao {

    private static Dao instance;
    //Uso singleton per gestire 1 sola connessione al DB
    private String driver;
    private String url;
    private String username;
    private String password;

    private Connection connection;

    //Costruttore che richiama il metodo di connessione al DB
    private Dao(){
        this.connessioneDb();
    }

    //La prima volta creo un instanza con newIstance
    public static Dao newIstance()    {
        if(instance==null)
        {
            instance = new Dao();
        }
        return instance;
    }

    //Con questo metodo richiamo sempre la stessa connessione
    public Connection getConnection() {
        return this.connection;
    }

    //Prova a creare la connessione al DB e la ritorna
    private Connection connessioneDb() {
        try {

            driver = "com.mysql.jdbc.Driver";

            Class.forName(driver);

            url = "jdbc:mysql://localhost:3306/DBTest";
            username = "root";
            password = "Password601!";

            //APRE LA CONNESSIONE
            connection = DriverManager.getConnection(url, username, password);
            System.out.println("Connessione al database OK");
            return connection;

        } catch (Exception e) {
            System.out.println("PATH: /Models/Dao.connessioneDb() ERROR -->" + e);
            return connection = null;
        }
    }



}
