package net.recta.factionweapons.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.World;
import net.recta.factionweapons.FactionWeapons;
import net.recta.factionweapons.item.ModItemGroup;

import org.jetbrains.annotations.Nullable;

import java.util.List;


public class ModBlocks {

    public static final Block STRING_BLOCK = registerBlock("string_block",
            new Block(FabricBlockSettings.of(Material.CARPET).strength(2f)),
            ModItemGroup.CUSTOM, "tooltip.factionweapons.string_block");


    private static Block registerBlock(String name, Block block, ItemGroup group, String tooltipKey) {
        registerBlockItem(name, block, group, tooltipKey);
        return Registry.register(Registry.BLOCK, new Identifier(FactionWeapons.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup group, String tooltipKey) {
        return Registry.register(Registry.ITEM, new Identifier(FactionWeapons.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(group)) {
                    @Override
                    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
                        tooltip.add(new TranslatableText(tooltipKey));
                    }

                    private static Block registerBlockWithoutBlockItem(String name, Block block, ItemGroup group) {
                        return Registry.register(Registry.BLOCK, new Identifier(FactionWeapons.MOD_ID, name), block);
                    }

                    private static Item registerBlockItem(String name, Block block, ItemGroup group) {
                        return Registry.register(Registry.ITEM, new Identifier(FactionWeapons.MOD_ID, name),
                                new BlockItem(block, new FabricItemSettings().group(group)));
                    }

                    public static void registerModBlocks() {
                        FactionWeapons.LOGGER.info("Registering ModBlocks for " + FactionWeapons.MOD_ID);
                    }
                }
                );
    }

};

