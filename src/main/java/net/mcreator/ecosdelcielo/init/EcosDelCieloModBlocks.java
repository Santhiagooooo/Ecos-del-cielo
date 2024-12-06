
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.ecosdelcielo.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.ecosdelcielo.block.UWUBlock;
import net.mcreator.ecosdelcielo.block.SemenBlock;
import net.mcreator.ecosdelcielo.block.CdddBlock;
import net.mcreator.ecosdelcielo.EcosDelCieloMod;

public class EcosDelCieloModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, EcosDelCieloMod.MODID);
	public static final RegistryObject<Block> SEMEN = REGISTRY.register("semen", () -> new SemenBlock());
	public static final RegistryObject<Block> CDDD = REGISTRY.register("cddd", () -> new CdddBlock());
	public static final RegistryObject<Block> UWU = REGISTRY.register("uwu", () -> new UWUBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
