import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("qf")
public final class class416 {
	@ObfuscatedName("ak")
	@Export("base37Table")
	public static final char[] base37Table;
	@ObfuscatedName("al")
	static long[] field4665;

	static {
		base37Table = new char[]{'_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
		field4665 = new long[12];

		for (int var0 = 0; var0 < field4665.length; ++var0) {
			field4665[var0] = (long)Math.pow(37.0D, (double)var0);
		}

	}
}
