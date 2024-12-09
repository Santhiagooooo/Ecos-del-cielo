package net.mcreator.ecosdelcielo.procedures;

import net.minecraftforge.eventbus.api.Event;

@Mod.EventBusSubscriber
public class DefensaRunicaProcedure {
	@SubscribeEvent
	public static void onEntityAttacked(LivingHurtEvent event) {
		if (event != null && event.getEntity() != null) {
			execute(event, event.getEntity().level(), event.getEntity());
		}
	}

	public static void execute(LevelAccessor world, Entity entity) {
		execute(null, world, entity);
	}

private static void execute(
@Nullable Event event,
LevelAccessor world,
Entity entity
) {
if(
entity == null
) return ;
if (!(==0)) {if ((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget():null) instanceof LivingEntity _entity) _entity.setHealth((float)(((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget():null) instanceof LivingEntity _livEnt ? _livEnt.getHealth():-1)-/ 2));if (!world.isClientSide() && world.getServer() != null)
world.getServer().getPlayerList().broadcastSystemMessage(Component.literal((""+)), false);}
}
}
