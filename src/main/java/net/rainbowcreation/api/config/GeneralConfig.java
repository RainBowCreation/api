package net.rainbowcreation.api.config;


public class GeneralConfig {
    public static class Settings {
        public boolean ENABLE = false;
        public double X = 0;
        public double Y = 0;
        public double Z = 0;
    }

    public static class Bypass {
        public String[] BYPASS_PLAYER = new String[] { "RainBowCreation", "VocanicZ" };
    }
}