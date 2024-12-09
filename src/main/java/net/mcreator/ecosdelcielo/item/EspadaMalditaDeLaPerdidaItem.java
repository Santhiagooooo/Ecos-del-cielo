
package net.mcreator.ecosdelcielo.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.network.chat.Component;

import java.util.List;

public class EspadaMalditaDeLaPerdidaItem extends SwordItem {
	public EspadaMalditaDeLaPerdidaItem() {
		super(new Tier() {
			public int getUses() {
				return 1561;
			}

			public float getSpeed() {
				return 4f;
			}

			public float getAttackDamageBonus() {
				return 6f;
			}

			public int getLevel() {
				return 4;
			}

			public int getEnchantmentValue() {
				return 22;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of();
			}
		}, 3, -2.4f, new Item.Properties().fireResistant());
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level level, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, level, list, flag);
		list.add(Component.literal("Efecto especial: "));
		list.add(Component.literal(" \u2022 Drenado de vida: Recupera 20% del da\u00F1o infligido al enemigo."));
		list.add(Component.literal(" \u2022 Maldici\u00F3n de desgaste: Si no se usa para atacar durante 30 segundos, el jugador pierde 1 punto de salud cada 10 segundos hasta que ataque de nuevo."));
	}
}
