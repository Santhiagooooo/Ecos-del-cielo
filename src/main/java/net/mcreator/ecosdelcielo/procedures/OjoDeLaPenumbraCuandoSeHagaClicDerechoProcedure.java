package net.mcreator.ecosdelcielo.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.ecosdelcielo.network.EcosDelCieloModVariables;

public class OjoDeLaPenumbraCuandoSeHagaClicDerechoProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		{
			boolean _setval = true;
			entity.getCapability(EcosDelCieloModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.MiradaIntimidante = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
	}
}
