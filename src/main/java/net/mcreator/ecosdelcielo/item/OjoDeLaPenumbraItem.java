
package net.mcreator.ecosdelcielo.item;

public class OjoDeLaPenumbraItem extends ShieldItem {
	public OjoDeLaPenumbraItem() {
		super(new Item.Properties().durability(600).fireResistant());
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
		OjoDeLaPenumbraCuandoSeHagaClicDerechoProcedure.execute();
		return ar;
	}

	@Override
	public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
		super.inventoryTick(itemstack, world, entity, slot, selected);
		if (selected)
			OjoDeLaPenumbraAlEstarEnLaManoProcedure.execute();
	}
}
