package net.mcreator.ecosdelcielo.procedures;

import net.minecraftforge.eventbus.api.Event;

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

private static void execute(
@Nullable Event event,
LevelAccessor world,
Entity entity,
Entity sourceentity
) {
if(
entity == null ||
sourceentity == null
) return ;
if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem():ItemStack.EMPTY).getItem() == EcosDelCieloModItems.DELETED_MOD_ELEMENT.get()) {if (entity instanceof LivingEntity _entity) _entity.setHealth((float)((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth():-1)-));if (!world.isClientSide() && world.getServer() != null)
world.getServer().getPlayerList().broadcastSystemMessage(Component.literal(((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth():-1)+"")), false);if (>=8) {}}
}
}
