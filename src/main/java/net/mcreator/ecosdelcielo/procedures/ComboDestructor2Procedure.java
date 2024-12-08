package net.mcreator.ecosdelcielo.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.entity.Entity;

import net.mcreator.ecosdelcielo.network.EcosDelCieloModVariables;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class ComboDestructor2Procedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player);
		}
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		if ((entity.getCapability(EcosDelCieloModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EcosDelCieloModVariables.PlayerVariables())).PunchDetectorCuchillaDelHeraldoOscuro) {
			{
				double _setval = (entity.getCapability(EcosDelCieloModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EcosDelCieloModVariables.PlayerVariables())).LastPunchTickCounter + 1;
				entity.getCapability(EcosDelCieloModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.LastPunchTickCounter = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			if ((entity.getCapability(EcosDelCieloModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EcosDelCieloModVariables.PlayerVariables())).LastPunchTickCounter >= 100) {
				{
					double _setval = 0;
					entity.getCapability(EcosDelCieloModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.ExtraDamageCuchillaDelHeraldoOscuro = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					boolean _setval = false;
					entity.getCapability(EcosDelCieloModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.PunchDetectorCuchillaDelHeraldoOscuro = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
		}
	}
}
