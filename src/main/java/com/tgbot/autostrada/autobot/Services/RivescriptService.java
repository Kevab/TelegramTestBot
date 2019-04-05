package com.tgbot.autostrada.autobot.Services;

import com.rivescript.Config;
import com.rivescript.RiveScript;

public class RivescriptService {

    private RiveScript botter;

    public void RivescriptService() {
        botter = new RiveScript(Config.Builder
                .utf8()
                .unicodePunctuation("[.,!?;:]")
                .build());

    // Load a directory full of RiveScript documents (.rive files)
        botter.loadFile("/home/daniel/IdeaProjects/autobot/src/main/resources/Rivescripts/Init.rive");

    // Sort the replies after loading them!
        botter.sortReplies();
    }

    public String risposta(String username, String message) {
        // Get a reply.
        return botter.reply(username, message);
    }
}
