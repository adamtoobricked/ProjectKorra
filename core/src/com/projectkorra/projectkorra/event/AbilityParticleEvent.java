package com.projectkorra.projectkorra.event;

import com.projectkorra.projectkorra.BendingPlayer;
import org.bukkit.Location;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class AbilityParticleEvent extends Event implements Cancellable {
	private static final HandlerList handlers = new HandlerList();
	@Nullable
	private BendingPlayer bPlayer;
	private Object source;
	private Location location;
	private int amount;
	private double xOffset;
	private double yOffset;
	private double zOffset;
	private float extra;
	private boolean cancelled = false;

	public AbilityParticleEvent(Object source, Location loc, int amount, double x, double y, double z, float extra) {
		this.source = source;
		this.location = loc;
		this.amount = amount;
		this.xOffset = x;
		this.yOffset = y;
		this.zOffset = z;
		this.extra = extra;
		this.bPlayer = null;
	}

	public AbilityParticleEvent(Object source, Location loc, int amount, double x, double y, double z, float extra, @Nullable BendingPlayer bPlayer) {
		this.source = source;
		this.location = loc;
		this.amount = amount;
		this.xOffset = x;
		this.yOffset = y;
		this.zOffset = z;
		this.extra = extra;
		this.bPlayer = bPlayer;
	}

	public Location getLocation() {
		return this.location;
	}

	public int getAmount() {
		return this.amount;
	}

	public double getxOffset() {
		return this.xOffset;
	}

	public double getyOffset() {
		return this.yOffset;
	}

	public double getzOffset() {
		return this.zOffset;
	}

	public float getExtra() {
		return this.extra;
	}

	public Object getSource() {
		return this.source;
	}

	@Nullable
	public BendingPlayer getBendingPlayer() {
		return this.bPlayer;
	}

	@NotNull
	public HandlerList getHandlers() {
		return handlers;
	}

	public static HandlerList getHandlerList() {
		return handlers;
	}

	public boolean isCancelled() {
		return this.cancelled;
	}

	public void setCancelled(boolean b) {
		this.cancelled = b;
	}
}