
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.ecosdelcielo.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.ecosdelcielo.block.PitosBlock;
import net.mcreator.ecosdelcielo.EcosDelCieloMod;

public class EcosDelCieloModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, EcosDelCieloMod.MODID);
	public static final RegistryObject<Block> PITOS = REGISTRY.register("pitos", () -> new PitosBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
