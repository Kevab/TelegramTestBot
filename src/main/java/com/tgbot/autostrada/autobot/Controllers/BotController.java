package com.tgbot.autostrada.autobot.Controllers;

import org.springframework.stereotype.Controller;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;

@Controller
public class BotController {

    /*  Controller: Implementa la logica di controllo, riceve i comandi dell’utente (in genere
        attraverso lo strato View) e li attua modificando lo stato degli altri due component    */

    public SendMessage sendMessages(String chat_id, String risposta_bot) {

        SendMessage message = new SendMessage()
                .setChatId(chat_id)                  //Prende ChatID da cui arriva il messaggio
                .setText(risposta_bot);              //Legge il testo del messaggio
        return message;
    }
}
