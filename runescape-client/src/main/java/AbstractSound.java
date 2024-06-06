import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("cb")
@Implements("AbstractSound")
public abstract class AbstractSound extends Node {
	@ObfuscatedName("aa")
	@Export("position")
	int position;

	AbstractSound() {
	}
}
