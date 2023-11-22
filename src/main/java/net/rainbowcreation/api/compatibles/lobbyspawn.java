package net.rainbowcreation.api.compatibles;

import net.minecraft.entity.player.EntityPlayer;

import java.util.Arrays;

import static net.rainbowcreation.api.config.GeneralConfig.bypass;
import static net.rainbowcreation.api.config.GeneralConfig.settings;

public class lobbyspawn implements event {
    @Override
    public void onJoin(EntityPlayer player) {
        if (!settings.ENABLE)
            return;
        if (!Arrays.asList(bypass.BYPASS_PLAYER).contains(player.getName())) {
            player.setPositionAndUpdate(settings.X, settings.Y, settings.Z);
        }
    }
}