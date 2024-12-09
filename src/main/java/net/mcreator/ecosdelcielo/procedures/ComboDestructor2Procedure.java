package net.mcreator.ecosdelcielo.procedures;

import net.minecraftforge.eventbus.api.Event;

@Mod.EventBusSubscriber
public class ComboDestructor2Procedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event);
		}
	}

	public static void execute() {
		execute(null);
	}

private static void execute(
@Nullable Event event
) {
if () {if (>=100) {}}
}
}
