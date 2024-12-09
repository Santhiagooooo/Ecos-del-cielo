package net.mcreator.ecosdelcielo.procedures;

import net.minecraftforge.eventbus.api.Event;

public class OjoDeLaPenumbraAlEstarEnLaManoProcedure {
public static void execute(
LevelAccessor world,
Entity entity
) {
if(
entity == null
) return ;
if (!world.isClientSide() && world.getServer() != null)
world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("BEYONG"), false);if (==100) {if (!world.isClientSide() && world.getServer() != null)
world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("NEON"), false);if (==200) {if (!world.isClientSide() && world.getServer() != null)
world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("MARQUINHO"), false);}else{if(entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
_entity.addEffect(new MobEffectInstance(MobEffects.GLOWING,5,1, true, false));if (!world.isClientSide() && world.getServer() != null)
world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("HUB"), false);}}
}
}
