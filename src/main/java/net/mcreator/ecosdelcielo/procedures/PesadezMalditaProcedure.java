package net.mcreator.ecosdelcielo.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.ecosdelcielo.init.EcosDelCieloModItems;

public class PesadezMalditaProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == EcosDelCieloModItems.CUCHILLA_DEL_HERALDO_OSCURO.get()) {
			entity.getPersistentData().putDouble("OriginalSpeed",
					(entity instanceof LivingEntity _livingEntity2 && _livingEntity2.getAttributes().hasAttribute(Attributes.MOVEMENT_SPEED) ? _livingEntity2.getAttribute(Attributes.MOVEMENT_SPEED).getBaseValue() : 0));
			if (entity instanceof LivingEntity _livingEntity5 && _livingEntity5.getAttributes().hasAttribute(Attributes.MOVEMENT_SPEED))
				_livingEntity5.getAttribute(Attributes.MOVEMENT_SPEED).setBaseValue((entity.getPersistentData().getDouble("OriginalSpeed") * 0.9));
		} else {
			if (entity instanceof LivingEntity _livingEntity7 && _livingEntity7.getAttributes().hasAttribute(Attributes.MOVEMENT_SPEED))
				_livingEntity7.getAttribute(Attributes.MOVEMENT_SPEED).setBaseValue((entity.getPersistentData().getDouble("OriginalSpeed")));
		}
	}
}
