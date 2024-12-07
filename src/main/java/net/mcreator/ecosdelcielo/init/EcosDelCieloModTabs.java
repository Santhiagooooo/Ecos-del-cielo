
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.ecosdelcielo.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.ecosdelcielo.EcosDelCieloMod;

public class EcosDelCieloModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, EcosDelCieloMod.MODID);
	public static final RegistryObject<CreativeModeTab> ECOS_DEL_CIELO = REGISTRY.register("ecos_del_cielo",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.ecos_del_cielo.ecos_del_cielo")).icon(() -> new ItemStack(EcosDelCieloModItems.GUADANA_PAJARO.get())).displayItems((parameters, tabData) -> {
				tabData.accept(EcosDelCieloModItems.GUADANA_PAJARO.get());
				tabData.accept(EcosDelCieloModItems.HACHA_DE_LA_DESOLACION.get());
			})

					.build());
}
