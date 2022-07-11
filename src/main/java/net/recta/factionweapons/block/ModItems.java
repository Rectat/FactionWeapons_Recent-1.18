package net.recta.factionweapons.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import net.recta.factionweapons.FactionWeapons;
import net.recta.factionweapons.item.ModItemGroup;
import net.recta.factionweapons.item.ModToolMaterials;
import net.recta.factionweapons.item.custom.DowsingRodItem;
import net.recta.factionweapons.item.custom.ModAxeItem;
import net.recta.factionweapons.item.custom.ModHoeItem;
import net.recta.factionweapons.item.custom.ModPickaxeItem;

public class ModItems {

    //REINFORCED WEAPONS

    public static final Item LAPIS_STICK = registerItem("lapis_stick",
            new Item(new FabricItemSettings().group(ModItemGroup.CUSTOM)));

    public static final Item IRON_STICK = registerItem("iron_stick",
            new Item(new FabricItemSettings().group(ModItemGroup.CUSTOM)));

    public static final Item BLACKSTONE_STICK = registerItem("blackstone_stick",
            new Item(new FabricItemSettings().group(ModItemGroup.CUSTOM)));

    public static final Item GOLD_STICK = registerItem("gold_stick",
            new Item(new FabricItemSettings().group(ModItemGroup.CUSTOM)));

    public static final Item GEODE_STICK = registerItem("geode_stick",
            new Item(new FabricItemSettings().group(ModItemGroup.CUSTOM)));

    public static final Item REINFORCED_STRING = registerItem("reinforced_string",
            new Item(new FabricItemSettings().group(ModItemGroup.CUSTOM)));

    public static final Item TACTICAL_MACHETE = registerItem("tactical_machete",
            new SwordItem(ModToolMaterials.SPECIAL, 5, -2.4f,
                    new FabricItemSettings().group(ModItemGroup.CUSTOM)));

    public static final Item TACTICAL_ICEPICK = registerItem("tactical_icepick",
            new ModPickaxeItem(ModToolMaterials.SPECIAL, 3, -2.8f,
                    new FabricItemSettings().group(ModItemGroup.CUSTOM)));

    public static final Item TACTICAL_ENTRENCHER = registerItem("tactical_entrencher",
            new ShovelItem(ModToolMaterials.SPECIAL, 3.5F, -3.0f,
                    new FabricItemSettings().group(ModItemGroup.CUSTOM)));

    public static final Item TACTICAL_TOMAHAWK = registerItem("tactical_tomahawk",
            new ModAxeItem(ModToolMaterials.SPECIAL, 7, -3f,
                    new FabricItemSettings().group(ModItemGroup.CUSTOM)));

    public static final Item TACTICAL_SCYTHE = registerItem("tactical_scythe",
            new ModHoeItem(ModToolMaterials.SPECIAL, 0, 0f,
                    new FabricItemSettings().group(ModItemGroup.CUSTOM)));

    //REFINED NETHERITE WEAPONS

    public static final Item REFINED_NETHERITE_BLADE = registerItem("refined_netherite_blade",
            new SwordItem(ModToolMaterials.SPECIAL, 5, -2.4f,
                    new FabricItemSettings().group(ModItemGroup.CUSTOM)));

    public static final Item REFINED_NETHERITE_ICEPICK = registerItem("refined_netherite_icepick",
            new ModPickaxeItem(ModToolMaterials.SPECIAL, 3, -2.8f,
                    new FabricItemSettings().group(ModItemGroup.CUSTOM)));

    public static final Item REFINED_NETHERITE_ENTRENCHER = registerItem("refined_netherite_entrencher",
            new ShovelItem(ModToolMaterials.SPECIAL, 3.5F, -3.0f,
                    new FabricItemSettings().group(ModItemGroup.CUSTOM)));

    public static final Item REFINED_NETHERITE_TOMAHAWK = registerItem("refined_netherite_tomahawk",
            new ModAxeItem(ModToolMaterials.SPECIAL, 7, -3f,
                    new FabricItemSettings().group(ModItemGroup.CUSTOM)));

    public static final Item REFINED_NETHERITE_SCYTHE = registerItem("refined_netherite_scythe",
            new ModHoeItem(ModToolMaterials.SPECIAL, 0, 0f,
                    new FabricItemSettings().group(ModItemGroup.CUSTOM)));

    //COPPERITE WEAPONS

    public static final Item COPPERITE_MACHETE = registerItem("copperite_machete",
            new SwordItem(ModToolMaterials.SPECIAL, 5, -2.4f,
                    new FabricItemSettings().group(ModItemGroup.CUSTOM)));

    public static final Item COPPERITE_ICEPICK = registerItem("copperite_icepick",
            new ModPickaxeItem(ModToolMaterials.SPECIAL, 3, -2.8f,
                    new FabricItemSettings().group(ModItemGroup.CUSTOM)));

    public static final Item COPPERITE_ENTRENCHER = registerItem("copperite_entrencher",
            new ShovelItem(ModToolMaterials.SPECIAL, 3.5F, -3.0f,
                    new FabricItemSettings().group(ModItemGroup.CUSTOM)));

    public static final Item COPPERITE_TOMAHAWK = registerItem("copperite_tomahawk",
            new ModAxeItem(ModToolMaterials.SPECIAL, 7, -3f,
                    new FabricItemSettings().group(ModItemGroup.CUSTOM)));

    public static final Item COPPERITE_SCYTHE = registerItem("copperite_scythe",
            new ModHoeItem(ModToolMaterials.SPECIAL, 0, 0f,
                    new FabricItemSettings().group(ModItemGroup.CUSTOM)));

    // RECTAT WEAPONS

    public static final Item RECTAT_BLADE = registerItem("rectat_blade",
            new SwordItem(ModToolMaterials.SPECIAL, 5, -2.4f,
                    new FabricItemSettings().group(ModItemGroup.CUSTOM)));

    public static final Item RECTAT_ICEPICK = registerItem("rectat_icepick",
            new ModPickaxeItem(ModToolMaterials.SPECIAL, 3, -2.8f,
                    new FabricItemSettings().group(ModItemGroup.CUSTOM)));

    public static final Item RECTAT_ENTRENCHER = registerItem("rectat_entrencher",
            new ShovelItem(ModToolMaterials.SPECIAL, 3.5F, -3.0f,
                    new FabricItemSettings().group(ModItemGroup.CUSTOM)));

    public static final Item RECTAT_HATCHET = registerItem("rectat_hatchet",
            new ModAxeItem(ModToolMaterials.SPECIAL, 7, -3f,
                    new FabricItemSettings().group(ModItemGroup.CUSTOM)));

    public static final Item RECTAT_SCYTHE = registerItem("rectat_scythe",
            new ModHoeItem(ModToolMaterials.SPECIAL, 0, 0f,
                    new FabricItemSettings().group(ModItemGroup.CUSTOM)));

    // ETHITE WEAPONS

    public static final Item ETHITE_MACHETE = registerItem("ethite_machete",
            new SwordItem(ModToolMaterials.SPECIAL, 5, -2.4f,
                    new FabricItemSettings().group(ModItemGroup.CUSTOM)));

    public static final Item ETHITE_ICEPICK = registerItem("ethite_icepick",
            new ModPickaxeItem(ModToolMaterials.SPECIAL, 3, -2.8f,
                    new FabricItemSettings().group(ModItemGroup.CUSTOM)));

    public static final Item ETHITE_ENTRENCHER = registerItem("ethite_entrencher",
            new ShovelItem(ModToolMaterials.SPECIAL, 3.5F, -3.0f,
                    new FabricItemSettings().group(ModItemGroup.CUSTOM)));

    public static final Item ETHITE_TOMAHAWK = registerItem("ethite_tomahawk",
            new ModAxeItem(ModToolMaterials.SPECIAL, 7, -3f,
                    new FabricItemSettings().group(ModItemGroup.CUSTOM)));

    public static final Item ETHITE_SCYTHE = registerItem("ethite_scythe",
            new ModHoeItem(ModToolMaterials.SPECIAL, 0, 0f,
                    new FabricItemSettings().group(ModItemGroup.CUSTOM)));

    // Bows


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(FactionWeapons.MOD_ID, name), item);
    }
    public static void registerModItems() {
        FactionWeapons.LOGGER.info("Registering Mod Items for " + FactionWeapons.MOD_ID);
    }
}
