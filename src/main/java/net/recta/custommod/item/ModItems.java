package net.recta.custommod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.recta.custommod.CustomMod;
import net.recta.custommod.item.custom.DowsingRodItem;
import net.recta.custommod.item.custom.ModAxeItem;
import net.recta.custommod.item.custom.ModHoeItem;
import net.recta.custommod.item.custom.ModPickaxeItem;

public class ModItems {

    public static final Item REINFORCED_STRING = registerItem("reinforced_string",
            new DowsingRodItem(new FabricItemSettings().group(ModItemGroup.CUSTOM)));

    public static final Item DOWSING_ROD = registerItem("dowsing_rod",
            new DowsingRodItem(new FabricItemSettings().group(ModItemGroup.CUSTOM).maxDamage(16)));

    public static final Item TACTICAL_MACHETE = registerItem("tactical_machete",
            new SwordItem(ModToolMaterials.SPECIAL, 1, 2f,
                    new FabricItemSettings().group(ModItemGroup.CUSTOM)));

    public static final Item TACTICAL_SCYTHE = registerItem("tactical_scythe",
            new ModHoeItem(ModToolMaterials.SPECIAL, 1, 2f,
                    new FabricItemSettings().group(ModItemGroup.CUSTOM)));

    public static final Item TACTICAL_ICEPICK = registerItem("tactical_icepick",
            new ModPickaxeItem(ModToolMaterials.SPECIAL, 1, 2f,
                    new FabricItemSettings().group(ModItemGroup.CUSTOM)));

    public static final Item TACTICAL_ENTRENCHER = registerItem("tactical_entrencher",
            new ShovelItem(ModToolMaterials.SPECIAL, 1, 2f,
                    new FabricItemSettings().group(ModItemGroup.CUSTOM)));

    public static final Item TACTICAL_TOMAHAWK = registerItem("tactical_tomahawk",
            new ModAxeItem(ModToolMaterials.SPECIAL, 1, 2f,
                    new FabricItemSettings().group(ModItemGroup.CUSTOM)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(CustomMod.MOD_ID, name), item);
    }
    public static void registerModItems() {
        CustomMod.LOGGER.info("Registering Mod Items for " + CustomMod.MOD_ID);
    }
}
