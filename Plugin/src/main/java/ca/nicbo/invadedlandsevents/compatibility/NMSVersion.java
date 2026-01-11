package ca.nicbo.invadedlandsevents.compatibility;

import org.bukkit.Bukkit;

/**
 * Version detection for Minecraft server.
 * <p>
 * Since Paper 1.20.5+, NMS package versioning was removed.
 * This class now detects the Minecraft version from the server.
 *
 * @author Nicbo
 */
public final class NMSVersion {
    private static final String MINECRAFT_VERSION;
    private static final int MAJOR_VERSION;
    private static final int MINOR_VERSION;

    static {
        MINECRAFT_VERSION = Bukkit.getMinecraftVersion();
        String[] versionParts = MINECRAFT_VERSION.split("\\.");
        MAJOR_VERSION = Integer.parseInt(versionParts[0]);
        MINOR_VERSION = Integer.parseInt(versionParts[1]);
    }

    private NMSVersion() {
    }

    /**
     * Returns the current Minecraft version string.
     *
     * @return the Minecraft version (e.g., "1.21.1")
     */
    public static String getCurrentVersion() {
        return MINECRAFT_VERSION;
    }

    /**
     * Returns the major version number.
     *
     * @return the major version (e.g., 1 for "1.21.1")
     */
    public static int getMajorVersion() {
        return MAJOR_VERSION;
    }

    /**
     * Returns the minor version number.
     *
     * @return the minor version (e.g., 21 for "1.21.1")
     */
    public static int getMinorVersion() {
        return MINOR_VERSION;
    }

    /**
     * Checks if the server is running a version before the combat update (1.9).
     * Always returns false for Paper 1.21+.
     *
     * @return false, as 1.21 is post-combat update
     */
    public static boolean isPreCombatUpdate() {
        return false;
    }

    /**
     * Checks if the server is running a legacy version (before 1.13).
     * Always returns false for Paper 1.21+.
     *
     * @return false, as 1.21 is post-flattening
     */
    public static boolean isLegacy() {
        return false;
    }
}
