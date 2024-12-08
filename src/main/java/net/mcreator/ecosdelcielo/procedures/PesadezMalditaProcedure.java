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
			if (entity instanceof LivingEntity _livingEntity3 && _livingEntity3.getAttributes().hasAttribute(Attributes.MOVEMENT_SPEED))
				_livingEntity3.getAttribute(Attributes.MOVEMENT_SPEED).setBaseValue((entity.getPersistentData().getDouble("OriginalSpeed") * 0.9));
		} else {
			entity.getPersistentData().putDouble("OriginalSpeed",
					(entity instanceof LivingEntity _livingEntity4 && _livingEntity4.getAttributes().hasAttribute(Attributes.MOVEMENT_SPEED) ? _livingEntity4.getAttribute(Attributes.MOVEMENT_SPEED).getBaseValue() : 0));
			if (entity instanceof LivingEntity _livingEntity7 && _livingEntity7.getAttributes().hasAttribute(Attributes.MOVEMENT_SPEED))
				_livingEntity7.getAttribute(Attributes.MOVEMENT_SPEED).setBaseValue((entity.getPersistentData().getDouble("OriginalSpeed")));
		}
	}
}
