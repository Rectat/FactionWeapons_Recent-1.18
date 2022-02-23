package net.recta.custommod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.recta.custommod.CustomMod;

public class ModItems {

    public static final Item REINFORCED_STRING = registerItem("reinforced_string",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(CustomMod.MOD_ID, name), item);
    }
    public static void registerModItems() {
        CustomMod.LOGGER.info("Registering Mod Items for " + CustomMod.MOD_ID);
    }
}