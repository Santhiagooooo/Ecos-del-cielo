
package net.mcreator.ecosdelcielo.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.ShieldItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.Entity;

import net.mcreator.ecosdelcielo.procedures.OjoDeLaPenumbraAlEstarEnLaManoProcedure;

public class OjoDeLaPenumbraItem extends ShieldItem {
	public OjoDeLaPenumbraItem() {
		super(new Item.Properties().durability(600).fireResistant());
	}

	@Override
	public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
		super.inventoryTick(itemstack, world, entity, slot, selected);
		if (selected)
			OjoDeLaPenumbraAlEstarEnLaManoProcedure.execute(world, entity);
	}
}
