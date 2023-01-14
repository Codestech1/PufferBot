/*
 * Copyright (c) 2023. The project is under the MIT license.
 */

package io.github.heroostech.pufferbot;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Activity;

public final class BotBootstrap {
    public static void boot(String token) {
        final JDA jda = JDABuilder.createLight(token)
                .setActivity(Activity.watching("Discord"))
                .build();
    }
}
