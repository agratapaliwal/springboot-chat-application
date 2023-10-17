package com.learnguides.simplewebchat.websocket;

import com.learnguides.simplewebchat.websocket.message.User;

import java.time.Instant;

public record Message(User user, String comment, Action action, Instant timestamp) {
}
