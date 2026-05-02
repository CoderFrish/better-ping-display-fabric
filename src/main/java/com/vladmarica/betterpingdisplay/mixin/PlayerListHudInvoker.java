package com.vladmarica.betterpingdisplay.mixin;

//import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.GuiGraphicsExtractor;
import net.minecraft.client.gui.components.PlayerTabOverlay;
//import net.minecraft.client.gui.hud.PlayerListHud;
import net.minecraft.client.multiplayer.PlayerInfo;
//import net.minecraft.client.network.PlayerListEntry;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Invoker;

@Mixin(PlayerTabOverlay.class)
public interface PlayerListHudInvoker {
  @Invoker("extractPingIcon")
  void invokeRenderLatencyIcon(GuiGraphicsExtractor context, int width, int x, int y, PlayerInfo entry);
}
