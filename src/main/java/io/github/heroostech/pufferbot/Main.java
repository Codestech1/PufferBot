/*
 * Copyright (c) 2023. The project is under the MIT license.
 */

package io.github.heroostech.pufferbot;

public final class Main {
    public static void main(String[] args) {
        BotBootstrap.boot(System.getenv("token"));
    }
}
