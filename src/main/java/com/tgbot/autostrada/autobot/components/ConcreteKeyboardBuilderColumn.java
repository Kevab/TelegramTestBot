package com.tgbot.autostrada.autobot.components;

import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow;

import java.util.ArrayList;
import java.util.List;

//Builder = Qua ci va la logica di costruzione del BOT
//Classe che costruisce BOT + classe costruttore bot(che avrà il metodo build)

public class ConcreteKeyboardBuilderColumn implements KeyBoardBuilder {

    @Override
    public ReplyKeyboardMarkup build(List<String> commandsLabel) {
        // Create ReplyKeyboardMarkup object

        // Create the keyboard (list of keyboard rows)
        List<KeyboardRow> keyboard = new ArrayList<>();
        // Create a keyboard row

        // Set each button, you can also use KeyboardButton objects if you need something else than text
        commandsLabel.forEach(command->{
            KeyboardRow row = new KeyboardRow();
            row.add(command);
            keyboard.add(row);

        });

        // Set the keyboard to the markup
        return new ReplyKeyboardMarkup().setKeyboard(keyboard);
    }
}