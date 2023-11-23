package net.rainbowcreation.api.compatibles;

import net.minecraft.entity.player.EntityPlayer;
import net.rainbowcreation.api.API;
import net.rainbowcreation.api.config.GeneralConfig;

import java.util.Arrays;


public class lobbyspawn implements event {
    @Override
    public void onJoin(EntityPlayer player) {
        GeneralConfig.Settings settings = API.getInstance().setting();
        if (!settings.ENABLE)
            return;
        if (!Arrays.asList(API.getInstance().bypass().BYPASS_PLAYER).contains(player.getName())) {
            player.setPositionAndUpdate(settings.X, settings.Y, settings.Z);
        }
    }
}