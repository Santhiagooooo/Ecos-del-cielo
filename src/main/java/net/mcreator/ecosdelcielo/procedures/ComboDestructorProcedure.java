package net.mcreator.ecosdelcielo.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingHurtEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.core.registries.Registries;

import net.mcreator.ecosdelcielo.network.EcosDelCieloModVariables;
import net.mcreator.ecosdelcielo.init.EcosDelCieloModItems;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class ComboDestructorProcedure {
	@SubscribeEvent
	public static void onEntityAttacked(LivingHurtEvent event) {
		if (event != null && event.getEntity() != null) {
			execute(event, event.getEntity().level(), event.getSource(), event.getEntity());
		}
	}

	public static void execute(LevelAccessor world, DamageSource damagesource, Entity entity) {
		execute(null, world, damagesource, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, DamageSource damagesource, Entity entity) {
		if (damagesource == null || entity == null)
			return;
		if (((damagesource.getEntity()) instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == EcosDelCieloModItems.CUCHILLA_DEL_HERALDO_OSCURO.get()) {
			{
				double _setval = 0;
				(damagesource.getEntity()).getCapability(EcosDelCieloModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.LastPunchTickCounter = _setval;
					capability.syncPlayerVariables((damagesource.getEntity()));
				});
			}
			{
				boolean _setval = true;
				(damagesource.getEntity()).getCapability(EcosDelCieloModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.PunchDetectorCuchillaDelHeraldoOscuro = _setval;
					capability.syncPlayerVariables((damagesource.getEntity()));
				});
			}
			{
				double _setval = ((damagesource.getEntity()).getCapability(EcosDelCieloModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EcosDelCieloModVariables.PlayerVariables())).ExtraDamageCuchillaDelHeraldoOscuro + 1;
				(damagesource.getEntity()).getCapability(EcosDelCieloModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.ExtraDamageCuchillaDelHeraldoOscuro = _setval;
					capability.syncPlayerVariables((damagesource.getEntity()));
				});
			}
			entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.PLAYER_ATTACK), (damagesource.getEntity())),
					(float) ((damagesource.getEntity()).getCapability(EcosDelCieloModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EcosDelCieloModVariables.PlayerVariables())).ExtraDamageCuchillaDelHeraldoOscuro);
		}
	}
}
