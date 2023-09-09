
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.chakra.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.chakra.block.KakBlock;
import net.mcreator.chakra.ChakraMod;

public class ChakraModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, ChakraMod.MODID);
	public static final RegistryObject<Block> KAK = REGISTRY.register("kak", () -> new KakBlock());
}
