package com.github.javarushcommunity.vanbot_telegramBotJavaRush.service;

import com.github.javarushcommunity.vanbot_telegramBotJavaRush.command.Command;
import org.telegram.telegrambots.meta.api.objects.Update;

import static com.github.javarushcommunity.vanbot_telegramBotJavaRush.command.CommandName.*;

public class HelpCommand implements Command {

    private final SendBotMessage sendBotMessage;

    public final static String HELP_MESSAGE = String.format("<b>Available commands</b>\n\n"

                    + "<b>Start\\End working with bot</b>\n"
                    + "%s - Start work with me\n"
                    + "%s - End work with me\n\n"
                    + "%s - Get help\n",
            START.getCommandName(), STOP.getCommandName(), HELP.getCommandName());

    public HelpCommand(SendBotMessage sendBotMessage) {
        this.sendBotMessage = sendBotMessage;
    }

    @Override
    public void execute(Update update) {
        sendBotMessage.sendMessage(update.getMessage().getChatId().toString(), HELP_MESSAGE);
    }
}
