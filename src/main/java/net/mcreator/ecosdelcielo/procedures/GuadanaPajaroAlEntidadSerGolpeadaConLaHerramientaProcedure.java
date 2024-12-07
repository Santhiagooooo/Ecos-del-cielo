package net.mcreator.ecosdelcielo.procedures;

import net.minecraftforge.eventbus.api.Event;

public class GuadanaPajaroAlEntidadSerGolpeadaConLaHerramientaProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
			_entity.addEffect(new MobEffectInstance(MobEffects.BLINDNESS, 30, 1));
		if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
			_entity.addEffect(new MobEffectInstance(MobEffects.POISON, 120, 2));
	}
}
