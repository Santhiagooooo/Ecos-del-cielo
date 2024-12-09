
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.ecosdelcielo.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.item.ItemProperties;

import net.mcreator.ecosdelcielo.item.OjoDeLaPenumbraItem;
import net.mcreator.ecosdelcielo.item.HachaDeLaDesolacionItem;
import net.mcreator.ecosdelcielo.item.GuadanaPajaroItem;
import net.mcreator.ecosdelcielo.item.EspadaMalditaDeLaPerdidaItem;
import net.mcreator.ecosdelcielo.item.CuchillaDelHeraldoOscuroItem;
import net.mcreator.ecosdelcielo.EcosDelCieloMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class EcosDelCieloModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, EcosDelCieloMod.MODID);
	public static final RegistryObject<Item> GUADANA_PAJARO = REGISTRY.register("guadana_pajaro", () -> new GuadanaPajaroItem());
	public static final RegistryObject<Item> HACHA_DE_LA_DESOLACION = REGISTRY.register("hacha_de_la_desolacion", () -> new HachaDeLaDesolacionItem());
	public static final RegistryObject<Item> OJO_DE_LA_PENUMBRA = REGISTRY.register("ojo_de_la_penumbra", () -> new OjoDeLaPenumbraItem());
	public static final RegistryObject<Item> ESPADA_MALDITA_DE_LA_PERDIDA = REGISTRY.register("espada_maldita_de_la_perdida", () -> new EspadaMalditaDeLaPerdidaItem());
	public static final RegistryObject<Item> CUCHILLA_DEL_HERALDO_OSCURO = REGISTRY.register("cuchilla_del_heraldo_oscuro", () -> new CuchillaDelHeraldoOscuroItem());

	// Start of user code block custom items
	// End of user code block custom items
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			ItemProperties.register(OJO_DE_LA_PENUMBRA.get(), new ResourceLocation("blocking"), ItemProperties.getProperty(Items.SHIELD, new ResourceLocation("blocking")));
		});
	}
}
