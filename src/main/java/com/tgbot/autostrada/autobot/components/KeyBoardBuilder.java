package com.tgbot.autostrada.autobot.components;

import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;

import java.util.List;

public interface KeyBoardBuilder {
    ReplyKeyboardMarkup build(List<String> command);
}
