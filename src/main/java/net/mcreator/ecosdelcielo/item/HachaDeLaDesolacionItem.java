
package net.mcreator.ecosdelcielo.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionResult;

import net.mcreator.ecosdelcielo.procedures.HachaDeLaDesolacionAlPresionarClickDerechoEnElBloqueProcedure;
import net.mcreator.ecosdelcielo.procedures.HachaDeLaDesolacionAlEstarEnLaManoProcedure;
import net.mcreator.ecosdelcielo.procedures.HachaDeLaDesolacionAlEntidadSerGolpeadaConLaHerramientaProcedure;

public class HachaDeLaDesolacionItem extends AxeItem {
	public HachaDeLaDesolacionItem() {
		super(new Tier() {
			public int getUses() {
				return 250;
			}

			public float getSpeed() {
				return 12f;
			}

			public float getAttackDamageBonus() {
				return 12f;
			}

			public int getLevel() {
				return 4;
			}

			public int getEnchantmentValue() {
				return 22;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(Items.NETHERITE_INGOT));
			}
		}, 1, -3.3f, new Item.Properties().fireResistant());
	}

	@Override
	public boolean hurtEnemy(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
		boolean retval = super.hurtEnemy(itemstack, entity, sourceentity);
		HachaDeLaDesolacionAlEntidadSerGolpeadaConLaHerramientaProcedure.execute(entity);
		return retval;
	}

	@Override
	public InteractionResult useOn(UseOnContext context) {
		super.useOn(context);
		HachaDeLaDesolacionAlPresionarClickDerechoEnElBloqueProcedure.execute(context.getLevel(), context.getClickedPos().getX(), context.getClickedPos().getY(), context.getClickedPos().getZ(), context.getItemInHand());
		return InteractionResult.SUCCESS;
	}

	@Override
	public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
		super.inventoryTick(itemstack, world, entity, slot, selected);
		if (selected)
			HachaDeLaDesolacionAlEstarEnLaManoProcedure.execute(entity);
	}
}
