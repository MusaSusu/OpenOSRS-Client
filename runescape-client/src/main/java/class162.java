import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gs")
public class class162 extends class147 {
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		longValue = -3097145892863964123L
	)
	long field1804;
	@ObfuscatedName("al")
	String field1801;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 1923959749
	)
	int field1802;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfu;"
	)
	final class150 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfu;)V"
	)
	class162(class150 var1) {
		this.this$0 = var1;
		this.field1804 = -1L;
		this.field1801 = null;
		this.field1802 = 0;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lua;I)V",
		garbageValue = "1738227110"
	)
	void vmethod3486(Buffer var1) {
		if (var1.readUnsignedByte() != 255) {
			--var1.offset;
			this.field1804 = var1.readLong();
		}

		this.field1801 = var1.readStringCp1252NullTerminatedOrNull();
		this.field1802 = var1.readUnsignedShort();
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lgc;B)V",
		garbageValue = "100"
	)
	void vmethod3490(ClanSettings var1) {
		var1.method3325(this.field1804, this.field1801, this.field1802);
	}

	@ObfuscatedName("jm")
	@ObfuscatedSignature(
		descriptor = "(Lde;III)V",
		garbageValue = "-1966702872"
	)
	@Export("performPlayerAnimation")
	static void performPlayerAnimation(Player var0, int var1, int var2) {
		if (var0.sequence == var1 && var1 != -1) {
			int var3 = FaceNormal.SequenceDefinition_get(var1).restartMode;
			if (var3 == 1) {
				var0.sequenceFrame = 0;
				var0.sequenceFrameCycle = 0;
				var0.sequenceDelay = var2;
				var0.field1239 = 0;
			}

			if (var3 == 2) {
				var0.field1239 = 0;
			}
		} else if (var1 == -1 || var0.sequence == -1 || FaceNormal.SequenceDefinition_get(var1).field2409 >= FaceNormal.SequenceDefinition_get(var0.sequence).field2409) {
			var0.sequence = var1;
			var0.sequenceFrame = 0;
			var0.sequenceFrameCycle = 0;
			var0.sequenceDelay = var2;
			var0.field1239 = 0;
			var0.field1226 = var0.pathLength;
		}

	}

	@ObfuscatedName("li")
	@ObfuscatedSignature(
		descriptor = "(Ldt;IIIIIIIIIII)V",
		garbageValue = "-1586816445"
	)
	static void method3417(WorldView var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
		NodeDeque var11 = var0.pendingSpawns;
		PendingSpawn var12 = null;

		for (PendingSpawn var13 = (PendingSpawn)var11.last(); var13 != null; var13 = (PendingSpawn)var11.previous()) {
			if (var13.plane == var1 && var2 == var13.x && var3 == var13.y && var4 == var13.type) {
				var12 = var13;
				break;
			}
		}

		if (var12 == null) {
			var12 = new PendingSpawn();
			var12.plane = var1;
			var12.type = var4;
			var12.x = var2;
			var12.y = var3;
			var12.field1190 = -1;
			GraphicsObject.method2099(var0, var12);
			var11.addFirst(var12);
		}

		var12.field1193 = var5;
		var12.field1197 = var6;
		var12.field1198 = var7;
		var12.delay = var9;
		var12.hitpoints = var10;
		var12.method2412(var8);
	}
}
