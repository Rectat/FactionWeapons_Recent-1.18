package net.recta.custommod.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;
import net.recta.custommod.CustomMod;

public class ModItemGroup {
    public static final ItemGroup CUSTOM = FabricItemGroupBuilder.build(new Identifier(CustomMod.MOD_ID, "custommod"),
            () -> new ItemStack(ModItems.REINFORCED_STRING));
}
