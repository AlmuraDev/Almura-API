package com.almuramc.event.block;

import org.bukkit.block.Block;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class CropPopEvent extends Event implements Cancellable {    
	private static final HandlerList handlers = new HandlerList();
	private boolean cancel;

    public CropPopEvent(final Block theBlock) {}

    public boolean isCancelled() {    	
        return cancel;
    }

    public void setCancelled(boolean cancel) {
        this.cancel = cancel;
    }

    public HandlerList getHandlers() {
        return handlers;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }
}
