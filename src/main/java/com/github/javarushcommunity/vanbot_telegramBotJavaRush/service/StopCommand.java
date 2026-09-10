package com.github.javarushcommunity.vanbot_telegramBotJavaRush.service;

import com.github.javarushcommunity.vanbot_telegramBotJavaRush.command.Command;
import org.telegram.telegrambots.meta.api.objects.Update;

public class StopCommand implements Command {

    private final SendBotMessage sendBotMessage;

    public final static String STOP_MESSAGE = "All your follows are deactivated. ";

    public StopCommand(SendBotMessage sendBotMessage) {
        this.sendBotMessage = sendBotMessage;
    }

    @Override
    public void execute(Update update) {
        sendBotMessage.sendMessage(update.getMessage().getChatId().toString(), STOP_MESSAGE);
    }
}
