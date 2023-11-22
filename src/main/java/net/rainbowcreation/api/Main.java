package net.rainbowcreation.api;

import net.minecraftforge.fml.common.Mod;
import net.rainbowcreation.api.compatibles.lobbyspawn;
import net.rainbowcreation.api.compatibles.event;
import org.apache.logging.log4j.Logger;

public class Main
{
    @Mod.Instance
    public final Main instance = this;
    public static final event API = new lobbyspawn();
    public static Logger logger;
}
