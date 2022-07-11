package net.recta.factionweapons.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.recta.factionweapons.block.ModItems;

public class ModItemGroup {
    public static final ItemGroup CUSTOM = FabricItemGroupBuilder.build(new Identifier(net.recta.factionweapons.FactionWeapons.MOD_ID, "factionweapons"),
            () -> new ItemStack(ModItems.REINFORCED_STRING));
}
