package ca.nicbo.invadedlandsevents.compatibility;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

/**
 * Compatible materials for modern Minecraft versions.
 * Legacy material handling has been removed as this plugin now targets 1.21+.
 *
 * @author Nicbo
 */
public enum CompatibleMaterial {
    WOODEN_SWORD("WOODEN_SWORD"),
    GOLDEN_SWORD("GOLDEN_SWORD"),
    GOLDEN_AXE("GOLDEN_AXE"),
    DIAMOND_SHOVEL("DIAMOND_SHOVEL"),
    RAIL("RAIL"),
    LEAD("LEAD"),
    SNOWBALL("SNOWBALL"),
    WHITE_WOOL("WHITE_WOOL"),
    ORANGE_WOOL("ORANGE_WOOL"),
    MAGENTA_WOOL("MAGENTA_WOOL"),
    LIGHT_BLUE_WOOL("LIGHT_BLUE_WOOL"),
    YELLOW_WOOL("YELLOW_WOOL"),
    LIME_WOOL("LIME_WOOL"),
    PINK_WOOL("PINK_WOOL"),
    GREY_WOOL("GRAY_WOOL"),
    LIGHT_GREY_WOOL("LIGHT_GRAY_WOOL"),
    CYAN_WOOL("CYAN_WOOL"),
    PURPLE_WOOL("PURPLE_WOOL"),
    BLUE_WOOL("BLUE_WOOL"),
    BROWN_WOOL("BROWN_WOOL"),
    GREEN_WOOL("GREEN_WOOL"),
    RED_WOOL("RED_WOOL"),
    BLACK_WOOL("BLACK_WOOL"),
    WHITE_GLASS_PANE("WHITE_STAINED_GLASS_PANE"),
    ORANGE_GLASS_PANE("ORANGE_STAINED_GLASS_PANE"),
    MAGENTA_GLASS_PANE("MAGENTA_STAINED_GLASS_PANE"),
    LIGHT_BLUE_GLASS_PANE("LIGHT_BLUE_STAINED_GLASS_PANE"),
    YELLOW_GLASS_PANE("YELLOW_STAINED_GLASS_PANE"),
    LIME_GLASS_PANE("LIME_STAINED_GLASS_PANE"),
    PINK_GLASS_PANE("PINK_STAINED_GLASS_PANE"),
    GREY_GLASS_PANE("GRAY_STAINED_GLASS_PANE"),
    LIGHT_GREY_GLASS_PANE("LIGHT_GRAY_STAINED_GLASS_PANE"),
    CYAN_GLASS_PANE("CYAN_STAINED_GLASS_PANE"),
    PURPLE_GLASS_PANE("PURPLE_STAINED_GLASS_PANE"),
    BLUE_GLASS_PANE("BLUE_STAINED_GLASS_PANE"),
    BROWN_GLASS_PANE("BROWN_STAINED_GLASS_PANE"),
    GREEN_GLASS_PANE("GREEN_STAINED_GLASS_PANE"),
    RED_GLASS_PANE("RED_STAINED_GLASS_PANE"),
    BLACK_GLASS_PANE("BLACK_STAINED_GLASS_PANE");

    private final String name;

    CompatibleMaterial(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public ItemStack createItemStack() {
        return createItemStack(1);
    }

    public ItemStack createItemStack(int amount) {
        Material material = createMaterial();
        ItemStack item = new ItemStack(material);
        item.setAmount(amount);
        return item;
    }

    public Material createMaterial() {
        return Material.valueOf(name);
    }
}
