package com.github.javarushcommunity.vanbot_telegramBotJavaRush.service;

import com.github.javarushcommunity.vanbot_telegramBotJavaRush.command.Command;
import org.telegram.telegrambots.meta.api.objects.Update;

public class StartCommand implements Command {

    private final SendBotMessage sendBotMessage;

    public final static String START_MESSAGE = "Hi, i'm javaRush bot. I was created to teach person" +
            "to programing on Java language and follow the chosen creators on javaRush website. " +
            "I just started and so small";
    public StartCommand(SendBotMessage sendBotMessage) {
        this.sendBotMessage = sendBotMessage;
    }

    @Override
    public void execute(Update update) {
        sendBotMessage.sendMessage(update.getMessage().getChatId().toString(), START_MESSAGE);
    }
}
