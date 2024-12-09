package net.mcreator.ecosdelcielo.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.network.chat.Component;

import net.mcreator.ecosdelcielo.network.EcosDelCieloModVariables;

public class OjoDeLaPenumbraAlEstarEnLaManoProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (!world.isClientSide() && world.getServer() != null)
			world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("Iniciando"), false);
		entity.getPersistentData().putDouble("Espera", (entity.getPersistentData().getDouble("Espera") + 1));
		if (entity.getPersistentData().getDouble("Espera") >= 100) {
			if (!world.isClientSide() && world.getServer() != null)
				world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("Iniciando x2"), false);
			entity.getPersistentData().putDouble("Cooldown", (entity.getPersistentData().getDouble("Cooldown") + 1));
			if (!(entity.getPersistentData().getDouble("Cooldown") >= 100)) {
				{
					boolean _setval = true;
					entity.getCapability(EcosDelCieloModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.DefensaRunica = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.GLOWING, 5, 1, true, false));
				if (!world.isClientSide() && world.getServer() != null)
					world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("Estas en Defensa Runica"), false);
			} else {
				DefensaRunicaTerminarProcedure.execute(world, entity);
			}
		}
	}
}
