package com.tgbot.autostrada.autobot.Models;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name = "utente")
public class UserModel {

    @Id
    @Column(name = "id")
    @NotEmpty
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String user_id;

    @Column(name = "username")
    @NotEmpty
    private String user_username;

    @Column(name = "chat_id")
    @NotEmpty
    private String chat_id;

/*     Provo a vedere se funziona tutto con una tabella
       Test Hibernate o mySQL    */
    @Column(name = "andata")
    private int andata;

    @Column(name = "ritorno")
    private int ritorno;

    @Column(name = "message")
    private String message_text;

    public String getMessage_text() {
        return message_text;
    }

    public void setMessage_text(String message_text) {
        this.message_text = message_text;
    }

    public int getAndata() {
        return andata;
    }

    public void setAndata(int andata) {
        this.andata = andata;
    }

    public int getRitorno() {
        return ritorno;
    }

    public void setRitorno(int ritorno) {
        this.ritorno = ritorno;
    }

// FINE TEST


    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getUser_username() {
        return user_username;
    }

    public void setUser_username(String user_username) {
        this.user_username = user_username;
    }

    public String getChat_id() {
        return chat_id;
    }

    public void setChat_id(String chat_id) {
        this.chat_id = chat_id;
    }

    @Override
    public String toString() {
        return "id= " + user_id + " username= " + user_username + " chatId= " + chat_id + " andata= " + andata + " ritorno= " + ritorno;
    }
}