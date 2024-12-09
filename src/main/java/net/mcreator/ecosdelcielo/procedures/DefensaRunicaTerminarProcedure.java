package net.mcreator.ecosdelcielo.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

import net.mcreator.ecosdelcielo.network.EcosDelCieloModVariables;

public class DefensaRunicaTerminarProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (!world.isClientSide() && world.getServer() != null)
			world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("Termino la Defensa Runica"), false);
		entity.getPersistentData().putDouble("Espera", 0);
		entity.getPersistentData().putDouble("Cooldown", 0);
		{
			boolean _setval = false;
			entity.getCapability(EcosDelCieloModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.DefensaRunica = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
	}
}
