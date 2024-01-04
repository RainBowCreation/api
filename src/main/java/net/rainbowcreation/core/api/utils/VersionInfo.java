package net.rainbowcreation.core.api.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class VersionInfo {
    int major;
    int minor;

    public int getMajor() {
        return major;
    }

    public int getMinor() {
        return minor;
    }

    public static VersionInfo parseVersion(String versionString) {
        VersionInfo versionInfo = new VersionInfo();
        Pattern pattern = Pattern.compile("v(\\d+)_(\\d+)_\\d+");
        Matcher matcher = pattern.matcher(versionString);

        if (matcher.matches()) {
            versionInfo.major = Integer.parseInt(matcher.group(1));
            versionInfo.minor = Integer.parseInt(matcher.group(2));
            return versionInfo;
        } else {
            return null; // Invalid version format
        }
    }
}
