
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.ecosdelcielo.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.ecosdelcielo.item.HachaDeLaDesolacionItem;
import net.mcreator.ecosdelcielo.item.GuadanaPajaroItem;
import net.mcreator.ecosdelcielo.EcosDelCieloMod;

public class EcosDelCieloModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, EcosDelCieloMod.MODID);
	public static final RegistryObject<Item> GUADANA_PAJARO = REGISTRY.register("guadana_pajaro", () -> new GuadanaPajaroItem());
	public static final RegistryObject<Item> HACHA_DE_LA_DESOLACION = REGISTRY.register("hacha_de_la_desolacion", () -> new HachaDeLaDesolacionItem());
	// Start of user code block custom items
	// End of user code block custom items
}
