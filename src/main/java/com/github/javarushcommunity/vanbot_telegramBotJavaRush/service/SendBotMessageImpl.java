package com.github.javarushcommunity.vanbot_telegramBotJavaRush.service;

import com.github.javarushcommunity.vanbot_telegramBotJavaRush.bot.JavaRushTelegramBot;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import java.io.IOException;

@Service
public class SendBotMessageImpl implements SendBotMessage {

    private final JavaRushTelegramBot javaRushTelegramBot;

    @Autowired
    public SendBotMessageImpl(JavaRushTelegramBot javaRushTelegramBot) {
        this.javaRushTelegramBot = javaRushTelegramBot;
    }

    @Override
    public void sendMessage(String chatId, String message) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText(message);
        sendMessage.enableHtml(true);

        try {
            javaRushTelegramBot.execute(sendMessage);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }
}
