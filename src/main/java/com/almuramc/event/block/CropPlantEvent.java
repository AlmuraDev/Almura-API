package com.almuramc.event.block;

import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class CropPlantEvent extends Event implements Cancellable {    
	private static final HandlerList handlers = new HandlerList();
	private boolean cancel;
    private boolean custom;
    private boolean canPlant;

    public CropPlantEvent() {}

    public boolean isCancelled() {    	
        return cancel;
    }

    public boolean isCustom() {
    	return custom;
    }
    
    public boolean canPlant() {
    	return canPlant;
    }
    
    public void setCustom(boolean custom) {
    	this.custom = custom;
    }
    
    public void setCancelled(boolean cancel) {
        this.cancel = cancel;
    }
    
    public void setCanPlant(boolean canPlant) {
    	this.canPlant = canPlant;
    }

    public HandlerList getHandlers() {
        return handlers;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }
}
