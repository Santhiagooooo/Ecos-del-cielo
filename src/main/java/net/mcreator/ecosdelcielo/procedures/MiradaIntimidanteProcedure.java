package net.mcreator.ecosdelcielo.procedures;

import net.minecraftforge.eventbus.api.Event;

@Mod.EventBusSubscriber
public class MiradaIntimidanteProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player.level(), event.player.getX(), event.player.getY(), event.player.getZ(), event.player);
		}
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

private static void execute(
@Nullable Event event,
LevelAccessor world,
double x,
double y,
double z,
Entity entity
) {
if(
entity == null
) return ;
if (&&!world.getEntitiesOfClass(LivingEntity.class,
AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true)
.isEmpty()) {if (Math.random()<0.3) {if (Math.random()<0.2) {if (Math.random()<0.1) {if((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget():null) instanceof LivingEntity _entity && !_entity.level().isClientSide())
_entity.addEffect(new MobEffectInstance(MobEffects.CONFUSION,200,2, false, true));}}}}
}
}
