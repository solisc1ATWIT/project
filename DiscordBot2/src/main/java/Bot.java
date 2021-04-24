import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Activity;
import net.dv8tion.jda.api.requests.GatewayIntent;
import net.dv8tion.jda.api.utils.cache.CacheFlag;

import javax.security.auth.login.LoginException;
import java.util.EnumSet;

public class Bot {
    public static void main(String[] args) throws LoginException {

        @SuppressWarnings("unused")
		JDA jda = JDABuilder.createDefault("ODIxOTY2MTAwOTgzNTc4NjQ0.YFLZlQ.UUwvLtl9560f6NxPx3EN3S1xya0",
        GatewayIntent.GUILD_MEMBERS,
        GatewayIntent.GUILD_MESSAGES,
        GatewayIntent.GUILD_VOICE_STATES).disableCache(EnumSet.of(
                CacheFlag.CLIENT_STATUS,
                CacheFlag.ACTIVITY,
                CacheFlag.EMOTE
        )).enableCache(CacheFlag.VOICE_STATE).addEventListeners(new Listener())
                .setActivity(Activity.playing("Bangers"))
                .build();
    }
}
