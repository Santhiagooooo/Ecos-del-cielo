
package net.mcreator.ecosdelcielo.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.ShieldItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.InteractionHand;

import net.mcreator.ecosdelcielo.procedures.OjoDeLaPenumbraCuandoSeHagaClicDerechoProcedure;
import net.mcreator.ecosdelcielo.procedures.OjoDeLaPenumbraAlEstarEnLaManoProcedure;

public class OjoDeLaPenumbraItem extends ShieldItem {
	public OjoDeLaPenumbraItem() {
		super(new Item.Properties().durability(600).fireResistant());
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
		OjoDeLaPenumbraCuandoSeHagaClicDerechoProcedure.execute(entity);
		return ar;
	}

	@Override
	public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
		super.inventoryTick(itemstack, world, entity, slot, selected);
		if (selected)
			OjoDeLaPenumbraAlEstarEnLaManoProcedure.execute(world, entity);
	}
}
