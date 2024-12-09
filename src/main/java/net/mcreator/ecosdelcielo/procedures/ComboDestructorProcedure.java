package net.mcreator.ecosdelcielo.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingHurtEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

import net.mcreator.ecosdelcielo.network.EcosDelCieloModVariables;
import net.mcreator.ecosdelcielo.init.EcosDelCieloModItems;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class ComboDestructorProcedure {
	@SubscribeEvent
	public static void onEntityAttacked(LivingHurtEvent event) {
		if (event != null && event.getEntity() != null) {
			execute(event, event.getEntity().level(), event.getEntity(), event.getSource().getEntity());
		}
	}

	public static void execute(LevelAccessor world, Entity entity, Entity sourceentity) {
		execute(null, world, entity, sourceentity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == EcosDelCieloModItems.CUCHILLA_DEL_HERALDO_OSCURO.get()) {
			{
				double _setval = 0;
				sourceentity.getCapability(EcosDelCieloModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.LastPunchTickCounter = _setval;
					capability.syncPlayerVariables(sourceentity);
				});
			}
			{
				boolean _setval = true;
				sourceentity.getCapability(EcosDelCieloModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.PunchDetectorCuchillaDelHeraldoOscuro = _setval;
					capability.syncPlayerVariables(sourceentity);
				});
			}
			{
				double _setval = (sourceentity.getCapability(EcosDelCieloModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EcosDelCieloModVariables.PlayerVariables())).ExtraDamageCuchillaDelHeraldoOscuro + 1;
				sourceentity.getCapability(EcosDelCieloModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.ExtraDamageCuchillaDelHeraldoOscuro = _setval;
					capability.syncPlayerVariables(sourceentity);
				});
			}
			if (entity instanceof LivingEntity _entity)
				_entity.setHealth((float) ((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1)
						- (sourceentity.getCapability(EcosDelCieloModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EcosDelCieloModVariables.PlayerVariables())).ExtraDamageCuchillaDelHeraldoOscuro));
			if (!world.isClientSide() && world.getServer() != null)
				world.getServer().getPlayerList().broadcastSystemMessage(Component.literal(((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) + "")), false);
			if ((sourceentity.getCapability(EcosDelCieloModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EcosDelCieloModVariables.PlayerVariables())).ExtraDamageCuchillaDelHeraldoOscuro >= 8) {
				{
					double _setval = 8;
					sourceentity.getCapability(EcosDelCieloModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.ExtraDamageCuchillaDelHeraldoOscuro = _setval;
						capability.syncPlayerVariables(sourceentity);
					});
				}
			}
		}
	}
}
