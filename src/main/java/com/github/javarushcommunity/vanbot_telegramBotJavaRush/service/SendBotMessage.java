package com.github.javarushcommunity.vanbot_telegramBotJavaRush.service;

import org.telegram.telegrambots.meta.api.objects.Update;

public interface SendBotMessage {
    void sendMessage(String charId, String message);
}
