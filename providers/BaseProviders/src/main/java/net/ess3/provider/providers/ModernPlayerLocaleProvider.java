package net.ess3.provider.providers;

import net.ess3.provider.PlayerLocaleProvider;
import net.essentialsx.providers.ProviderData;
import net.essentialsx.providers.ProviderTest;
import org.bukkit.entity.Player;

@ProviderData(description = "1.12.2+ Player Locale Provider", weight = 1)
public class ModernPlayerLocaleProvider implements PlayerLocaleProvider {
    @ProviderTest
    public static boolean test() {
        try {
            Player.class.getDeclaredMethod("getLocale");
            return true;
        } catch (final NoSuchMethodException ignored) {
            return false;
        }
    }

    @Override
    public String getLocale(Player player) {
        return player.getLocale();
    }
}
