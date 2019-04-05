package com.tgbot.autostrada.autobot.Services;

import com.tgbot.autostrada.autobot.Controllers.BotController;
import com.tgbot.autostrada.autobot.Models.UserModel;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TelegramBot extends TelegramLongPollingBot {

    //getUpdpate() qua sotto
//    @Override
//    public void onUpdateReceived(Update update) {
//
////Instanza Repository
//        UserModel userModel = new UserModel();
//
//        // Controllo se l'update ha un messaggio e se il messaggio contiene del Testo
//        if (update.hasMessage() && update.getMessage().hasText()) {
//            RivescriptService rivescriptService = new RivescriptService();
//            rivescriptService.RivescriptService();
//
//            // Set variables
////            userModel.setUser_first_name(update.getMessage().getChat().getFirstName());  //Nome
////            userModel.setUser_last_name(update.getMessage().getChat().getLastName());    //Cognome
//            userModel.setUser_username(update.getMessage().getChat().getUserName());     //Username
//            userModel.setUser_id(update.getMessage().getChat().getId().toString());      //User ID
//            userModel.setMessage_text(update.getMessage().getText());                    //Testo Messaggio
//            userModel.setChat_id(update.getMessage().getChatId().toString());            //Chat ID
//
//            //Risposta = al messaggio da Rivescript
//            String answer = rivescriptService.risposta(userModel.getUser_username(), userModel.getMessage_text());
//
//            // Controller logica BOT
//            BotController botController = new BotController();
//
////            Dao dao = Dao.newIstance();
////            try {
////
////                String sql = "SELECT * FROM prova;";
////
////
////                ResultSet rs = dao.getConnection().createStatement().executeQuery(sql);
////
////                System.out.println("\n -- -- -- prova -- -- --:\n");
////                while (rs.next()) {
////                    //Retrieve by column name
////                    int id = rs.getInt("id");
////                    String username1 = rs.getString("nome");
////
////                    System.out.print("ID: " + id);
////                    System.out.print(", username1: " + username1+ "\n");
////                }
////
////                dao.getConnection().createStatement().close();
////                dao.getConnection().close();
////            } catch (SQLException e) {
////                e.printStackTrace();
////            }
//
//            // Logger
//            log(userModel.getUser_username(), userModel.getUser_id(), userModel.getMessage_text(), answer);
//
//            try {
//                // Chiama il Controller che invoca il metodo per inviare la risposta all'utente
//                execute(botController.sendMessages(userModel.getChat_id(),answer));
//            } catch (TelegramApiException e) {
//                e.printStackTrace();
//            }
//        }
//
//        // FACCIO GLI IF (img,video,doc,audio) *************************************************************
//    }

    // Metodo che stampa i log del Bot
    private void log(String username, String user_id, String txt, String bot_answer) {
        System.out.println("\n ----------------------------");
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();
        System.out.println(dateFormat.format(date));
        System.out.print("Message from " + username + " " + " (id = " + user_id + ") \n \t --> " + txt + "\n");
        System.out.print("Bot output: \n \t --=> " + bot_answer);
    }

    @Override
    public String getBotUsername() {
        return "Kevab_bot";
    }

    @Override
    public String getBotToken() {
        return  "710670346:AAEWKuGR_QDJNqYnaOgHwUf7B43TUV4yqsw";
    }

    //https://api.telegram.org/bot710670346:AAEWKuGR_QDJNqYnaOgHwUf7B43TUV4yqsw/setWebhook?url=https://telegramtripbot.herokuapp.com/
}
