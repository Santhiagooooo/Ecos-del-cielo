package net.mcreator.ecosdelcielo.procedures;

import net.minecraftforge.eventbus.api.Event;

public class GuadanaPajaroAlEstarEnLaManoProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
			_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 20, 1));
	}
}