package com.tgbot.autostrada.autobot.components;

import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;

import java.util.List;

//Builder = Qua ci va la logica di costruzione del BOT
//Classe che costruisce BOT + classe costruttore bot(che avrà il metodo build)

public class DirectorBuilder {

    public ReplyKeyboardMarkup buildAKeyboard(List<String> commandsLabel) {

        if(commandsLabel.size()<0) throw new RuntimeException("impossibile creare una tastiera senza comandi");

        if(commandsLabel.size()>3) return new ConcreteKeyboardBuilderColumn().build(commandsLabel);

        return new ConcreteKeyboardBuilderRow().build(commandsLabel);
    }
}