/* Class170 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import javax.media.opengl.GL;

public class Class170 implements Interface5 {

	public boolean aBoolean3039 = false;
	public int anInt3040 = -1;

	public int method24() {
		return 4;
	}

	public void method21() {
		GL gl = HDToolkit.gl;
		if (aBoolean3039) {
			gl.glCallList(1 + anInt3040);
			aBoolean3039 = false;
		} else
			gl.glTexEnvi(8960, 34184, 5890);
	}

	public void method23(int arg0) {
	}

	public void method22() {
		GL gl = HDToolkit.gl;
		HDToolkit.method1847(1);
		if ((anInt3040 ^ 0xffffffff) <= -1 && DisplayModeInformation.aBoolean1441) {
			gl.glCallList(anInt3040);
			gl.glActiveTexture(33985);
			gl.glMatrixMode(5890);
			gl.glLoadIdentity();
			gl.glRotatef(-(360.0F * (float) Class3_Sub13_Sub8.renderYaw2) / 2048.0F, 0.0F, 1.0F, 0.0F);
			gl.glRotatef(-((float) ItemPile.renderPitch2 * 360.0F) / 2048.0F, 1.0F, 0.0F, 0.0F);
			gl.glScalef(-1.0F, 1.0F, 1.0F);
			gl.glMatrixMode(5888);
			gl.glActiveTexture(33984);
			aBoolean3039 = true;
		} else
			gl.glTexEnvi(8960, 34184, 34167);
	}

	public Class170() {
		if (HDToolkit.aBoolean1821) {
			GL gl = HDToolkit.gl;
			anInt3040 = gl.glGenLists(2);
			gl.glNewList(anInt3040, 4864);
			gl.glActiveTexture(33985);
			gl.glTexEnvi(8960, 34161, 34165);
			gl.glTexEnvi(8960, 34178, 34168);
			gl.glTexEnvi(8960, 34162, 7681);
			gl.glTexEnvi(8960, 34184, 34167);
			gl.glTexGeni(8192, 9472, 34066);
			gl.glTexGeni(8193, 9472, 34066);
			gl.glTexGeni(8194, 9472, 34066);
			gl.glEnable(3168);
			gl.glEnable(3169);
			gl.glEnable(3170);
			gl.glEnable(34067);
			gl.glActiveTexture(33984);
			gl.glEndList();
			gl.glNewList(anInt3040 - -1, 4864);
			gl.glActiveTexture(33985);
			gl.glTexEnvi(8960, 34161, 8448);
			gl.glTexEnvi(8960, 34178, 34166);
			gl.glTexEnvi(8960, 34162, 8448);
			gl.glTexEnvi(8960, 34184, 5890);
			gl.glDisable(3168);
			gl.glDisable(3169);
			gl.glDisable(3170);
			gl.glDisable(34067);
			gl.glMatrixMode(5890);
			gl.glLoadIdentity();
			gl.glMatrixMode(5888);
			gl.glActiveTexture(33984);
			gl.glEndList();
		}
	}
}
