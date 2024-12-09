
package net.mcreator.ecosdelcielo.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.ShieldItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

import net.mcreator.ecosdelcielo.procedures.OjoDeLaPenumbraAlEstarEnLaManoProcedure;

import java.util.List;

public class OjoDeLaPenumbraItem extends ShieldItem {
	public OjoDeLaPenumbraItem() {
		super(new Item.Properties().durability(600).fireResistant());
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level level, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, level, list, flag);
		list.add(Component.literal("Habilidades:"));
		list.add(Component.literal("Mirada Intimidante: Cuando se usa para bloquear, hay un 30% de probabilidad de aplicar un efecto"));
		list.add(Component.literal("de n\u00E1usea a los enemigos cercanos durante 10 segundos (pasiva)"));
		list.add(Component.literal(""));
		list.add(Component.literal("Defensa R\u00FAnica: Absorbe el da\u00F1o m\u00E1gico, devolviendo el 50% del da\u00F1o recibido al atacante."));
		list.add(Component.literal("(Esta habilidad tiene un couldown de 60 segundos y hace que el jugador brille para alertar a los dem\u00E1s, la habilidad dura 10 segundos.)"));
	}

	@Override
	public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
		super.inventoryTick(itemstack, world, entity, slot, selected);
		if (selected)
			OjoDeLaPenumbraAlEstarEnLaManoProcedure.execute(world, entity);
	}
}
