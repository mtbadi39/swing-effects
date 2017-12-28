package test.svg.transcoded;

import java.awt.AlphaComposite;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Component;
import java.awt.Composite;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.LinearGradientPaint;
import java.awt.MultipleGradientPaint;
import java.awt.Paint;
import java.awt.RadialGradientPaint;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.Stroke;
import java.awt.geom.AffineTransform;
import java.awt.geom.GeneralPath;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;

/**
 * This class has been automatically generated using <a
 * href="https://flamingo.dev.java.net">Flamingo SVG transcoder</a>.
 */
public class preferences_desktop_screensaver implements
		org.pushingpixels.flamingo.api.common.icon.ResizableIcon {
	/**
	 * Paints the transcoded SVG image on the specified graphics context. You
	 * can install a custom transformation on the graphics context to scale the
	 * image.
	 * 
	 * @param g
	 *            Graphics context.
	 */
	public static void paint(Graphics2D g) {
        Shape shape = null;
        Paint paint = null;
        Stroke stroke = null;
         
        float origAlpha = 1.0f;
        Composite origComposite = ((Graphics2D)g).getComposite();
        if (origComposite instanceof AlphaComposite) {
            AlphaComposite origAlphaComposite = 
                (AlphaComposite)origComposite;
            if (origAlphaComposite.getRule() == AlphaComposite.SRC_OVER) {
                origAlpha = origAlphaComposite.getAlpha();
            }
        }
        
	    AffineTransform defaultTransform_ = g.getTransform();
// 
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0
g.setComposite(AlphaComposite.getInstance(3, 0.50857145f * origAlpha));
AffineTransform defaultTransform__0_0_0 = g.getTransform();
g.transform(new AffineTransform(1.0502510070800781f, 0.0f, 0.0f, 1.8678879737854004f, -0.9455580115318298f, -28.106109619140625f));
// _0_0_0
paint = new RadialGradientPaint(new Point2D.Double(12.57571029663086, 67.501708984375), 8.766279f, new Point2D.Double(12.57571029663086, 67.501708984375), new float[] {0.0f,1.0f}, new Color[] {new Color(0, 0, 0, 255),new Color(0, 0, 0, 0)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.9258079528808594f, 0.0f, 0.0f, 0.5192620158195496f, 0.0f, 0.0f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(41.10058, 35.051105);
((GeneralPath)shape).curveTo(41.102608, 36.677742, 37.885326, 38.181053, 32.66113, 38.99453);
((GeneralPath)shape).curveTo(27.436935, 39.808006, 20.999876, 39.808006, 15.775681, 38.99453);
((GeneralPath)shape).curveTo(10.551486, 38.181053, 7.334205, 36.677742, 7.336233, 35.051105);
((GeneralPath)shape).curveTo(7.334205, 33.42447, 10.551486, 31.92116, 15.775681, 31.107683);
((GeneralPath)shape).curveTo(20.999876, 30.294207, 27.436935, 30.294207, 32.66113, 31.107683);
((GeneralPath)shape).curveTo(37.885326, 31.92116, 41.102608, 33.42447, 41.10058, 35.051105);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_0);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_1 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 60.033390045166016f, 8.07843017578125f));
// _0_0_1
paint = new Color(173, 176, 170, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(-26.263968, 29.716238);
((GeneralPath)shape).curveTo(-26.263968, 31.892017, -30.469992, 33.655834, -35.658386, 33.655834);
((GeneralPath)shape).curveTo(-40.846783, 33.655834, -45.052807, 31.892017, -45.052807, 29.716238);
((GeneralPath)shape).curveTo(-45.052807, 27.540459, -40.846783, 25.776642, -35.658386, 25.776642);
((GeneralPath)shape).curveTo(-30.469992, 25.776642, -26.263968, 27.540459, -26.263968, 29.716238);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
paint = new Color(75, 77, 74, 255);
stroke = new BasicStroke(1.0f,0,0,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(-26.263968, 29.716238);
((GeneralPath)shape).curveTo(-26.263968, 31.892017, -30.469992, 33.655834, -35.658386, 33.655834);
((GeneralPath)shape).curveTo(-40.846783, 33.655834, -45.052807, 31.892017, -45.052807, 29.716238);
((GeneralPath)shape).curveTo(-45.052807, 27.540459, -40.846783, 25.776642, -35.658386, 25.776642);
((GeneralPath)shape).curveTo(-30.469992, 25.776642, -26.263968, 27.540459, -26.263968, 29.716238);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_1);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_2 = g.getTransform();
g.transform(new AffineTransform(0.9023730158805847f, 0.0f, 0.0f, 0.8276500105857849f, 56.55215072631836f, 12.867919921875f));
// _0_0_2
paint = new LinearGradientPaint(new Point2D.Double(-35.65838623046875, 33.416473388671875), new Point2D.Double(-35.65838623046875, 28.2059383392334), new float[] {0.0f,1.0f}, new Color[] {new Color(123, 127, 122, 255),new Color(123, 127, 122, 0)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
stroke = new BasicStroke(1.1571338f,0,0,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(-26.263968, 29.716238);
((GeneralPath)shape).curveTo(-26.263968, 31.892017, -30.469992, 33.655834, -35.658386, 33.655834);
((GeneralPath)shape).curveTo(-40.846783, 33.655834, -45.052807, 31.892017, -45.052807, 29.716238);
((GeneralPath)shape).curveTo(-45.052807, 27.540459, -40.846783, 25.776642, -35.658386, 25.776642);
((GeneralPath)shape).curveTo(-30.469992, 25.776642, -26.263968, 27.540459, -26.263968, 29.716238);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_2);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_3 = g.getTransform();
g.transform(new AffineTransform(0.837548017501831f, 0.0f, 0.0f, 0.8526549935340881f, 54.17810821533203f, 11.006150245666504f));
// _0_0_3
paint = new LinearGradientPaint(new Point2D.Double(-35.12268829345703, 34.24223709106445), new Point2D.Double(-35.074745178222656, 30.962345123291016), new float[] {0.0f,1.0f}, new Color[] {new Color(255, 255, 255, 255),new Color(255, 255, 255, 0)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
stroke = new BasicStroke(1.1833371f,0,0,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(-26.263968, 29.716238);
((GeneralPath)shape).curveTo(-26.263968, 31.892017, -30.469992, 33.655834, -35.658386, 33.655834);
((GeneralPath)shape).curveTo(-40.846783, 33.655834, -45.052807, 31.892017, -45.052807, 29.716238);
((GeneralPath)shape).curveTo(-45.052807, 27.540459, -40.846783, 25.776642, -35.658386, 25.776642);
((GeneralPath)shape).curveTo(-30.469992, 25.776642, -26.263968, 27.540459, -26.263968, 29.716238);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_3);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_4 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_4
paint = new LinearGradientPaint(new Point2D.Double(12.206708908081055, 53.53514099121094), new Point2D.Double(12.127711296081543, 64.89252471923828), new float[] {0.0f,1.0f}, new Color[] {new Color(88, 89, 86, 255),new Color(187, 190, 184, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.816344976425171f, 0.0f, 0.0f, 1.278926968574524f, 2.5f, -40.245079040527344f));
shape = new Rectangle2D.Double(19.972396850585938, 31.07861328125, 9.0396728515625, 6.365038871765137);
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_4);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_5 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_5
paint = new LinearGradientPaint(new Point2D.Double(8.611623764038086, 7.229358196258545), new Point2D.Double(34.78447341918945, 33.339786529541016), new float[] {0.0f,1.0f}, new Color[] {new Color(221, 225, 217, 255),new Color(202, 205, 198, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.1298630237579346f, 0.0f, 0.0f, 0.8850629925727844f, 2.875f, 1.570628046989441f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(7.5809026, 4.570622);
((GeneralPath)shape).lineTo(41.169098, 4.570622);
((GeneralPath)shape).curveTo(42.08044, 4.570622, 42.793243, 5.1541038, 42.83585, 5.972209);
((GeneralPath)shape).lineTo(44.167892, 31.550323);
((GeneralPath)shape).curveTo(44.2261, 32.668056, 43.266838, 33.57063, 42.147587, 33.57063);
((GeneralPath)shape).lineTo(6.602412, 33.57063);
((GeneralPath)shape).curveTo(5.483163, 33.57063, 4.523898, 32.668056, 4.5821066, 31.550323);
((GeneralPath)shape).lineTo(5.9141507, 5.972209);
((GeneralPath)shape).curveTo(5.9544344, 5.1986747, 6.461653, 4.570622, 7.5809026, 4.570622);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
paint = new LinearGradientPaint(new Point2D.Double(10.390737533569336, 5.381774425506592), new Point2D.Double(32.53682327270508, 31.24605369567871), new float[] {0.0f,1.0f}, new Color[] {new Color(143, 143, 143, 255),new Color(73, 73, 73, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.1043970584869385f, 0.0f, 0.0f, 0.9054710268974304f, 4.5f, 2.875f));
stroke = new BasicStroke(1.0f,0,0,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(7.5809026, 4.570622);
((GeneralPath)shape).lineTo(41.169098, 4.570622);
((GeneralPath)shape).curveTo(42.08044, 4.570622, 42.793243, 5.1541038, 42.83585, 5.972209);
((GeneralPath)shape).lineTo(44.167892, 31.550323);
((GeneralPath)shape).curveTo(44.2261, 32.668056, 43.266838, 33.57063, 42.147587, 33.57063);
((GeneralPath)shape).lineTo(6.602412, 33.57063);
((GeneralPath)shape).curveTo(5.483163, 33.57063, 4.523898, 32.668056, 4.5821066, 31.550323);
((GeneralPath)shape).lineTo(5.9141507, 5.972209);
((GeneralPath)shape).curveTo(5.9544344, 5.1986747, 6.461653, 4.570622, 7.5809026, 4.570622);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_5);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_6 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_6
paint = new LinearGradientPaint(new Point2D.Double(19.1503963470459, 32.62223815917969), new Point2D.Double(16.315818786621094, 8.866622924804688), new float[] {0.0f,1.0f}, new Color[] {new Color(91, 91, 151, 255),new Color(27, 27, 67, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.1741390228271484f, 0.0f, 0.0f, 0.9454309940338135f, 5.221825122833252f, 1.5434759855270386f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(8.910536, 7.180827);
((GeneralPath)shape).lineTo(7.6683393, 29.226145);
((GeneralPath)shape).lineTo(39.31873, 29.226145);
((GeneralPath)shape).lineTo(37.98371, 7.274256);
((GeneralPath)shape).lineTo(8.910536, 7.180827);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 121, 255);
stroke = new BasicStroke(0.5f,0,1,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(8.910536, 7.180827);
((GeneralPath)shape).lineTo(7.6683393, 29.226145);
((GeneralPath)shape).lineTo(39.31873, 29.226145);
((GeneralPath)shape).lineTo(37.98371, 7.274256);
((GeneralPath)shape).lineTo(8.910536, 7.180827);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_6);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_7 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_7
paint = new LinearGradientPaint(new Point2D.Double(3.7069976329803467, 171.2913360595703), new Point2D.Double(3.7069973945617676, 162.4506072998047), new float[] {0.0f,1.0f}, new Color[] {new Color(0, 0, 0, 63),new Color(0, 0, 0, 0)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(5.7051591873168945f, 0.0f, 0.0f, 0.17528000473976135f, 5.5f, 2.195626974105835f));
stroke = new BasicStroke(0.9961812f,1,0,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(6.677433, 31.610788);
((GeneralPath)shape).lineTo(42.10591, 31.610788);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_7);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_8 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_8
paint = new LinearGradientPaint(new Point2D.Double(17.698339462280273, 13.004725456237793), new Point2D.Double(34.97454833984375, 55.20075607299805), new float[] {0.0f,1.0f}, new Color[] {new Color(255, 255, 255, 179),new Color(255, 255, 255, 0)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.1080689430236816f, 0.0f, 0.0f, 0.9024710059165955f, 5.5f, 3.875f));
stroke = new BasicStroke(0.99999964f,0,0,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(7.4145985, 5.58134);
((GeneralPath)shape).lineTo(41.2601, 5.543538);
((GeneralPath)shape).curveTo(41.543797, 5.5432215, 41.819405, 5.780788, 41.842205, 6.196082);
((GeneralPath)shape).lineTo(43.204098, 30.99933);
((GeneralPath)shape).curveTo(43.26214, 32.056362, 42.66435, 32.785202, 41.60573, 32.785202);
((GeneralPath)shape).lineTo(7.0817585, 32.785202);
((GeneralPath)shape).curveTo(6.0231357, 32.785202, 5.488744, 32.05641, 5.545887, 30.99933);
((GeneralPath)shape).lineTo(6.8699775, 6.505163);
((GeneralPath)shape).curveTo(6.9086733, 5.7893324, 7.0363626, 5.581762, 7.4145985, 5.58134);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_8);
g.setComposite(AlphaComposite.getInstance(3, 0.5314286f * origAlpha));
AffineTransform defaultTransform__0_0_9 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_9
paint = new LinearGradientPaint(new Point2D.Double(11.492236137390137, 1.6537576913833618), new Point2D.Double(17.199417114257812, 26.729263305664062), new float[] {0.0f,1.0f}, new Color[] {new Color(255, 255, 255, 255),new Color(252, 252, 255, 0)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.2389769554138184f, 0.0f, 0.0f, 0.8959550261497498f, 5.267331123352051f, 1.5434759855270386f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(9.388312, 7.621363);
((GeneralPath)shape).lineTo(8.585783, 25.491693);
((GeneralPath)shape).curveTo(19.63042, 23.091063, 24.007246, 14.999494, 37.739815, 12.344943);
((GeneralPath)shape).lineTo(37.578342, 7.687427);
((GeneralPath)shape).lineTo(9.388312, 7.621363);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_9);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_10 = g.getTransform();
g.transform(new AffineTransform(1.3312369585037231f, 0.0f, 0.0f, 0.6584489941596985f, -5.91933012008667f, 5.728866100311279f));
// _0_0_10
paint = new LinearGradientPaint(new Point2D.Double(34.30099105834961, 3.938408613204956), new Point2D.Double(35.52054214477539, 3.845109701156616), new float[] {0.0f,1.0f}, new Color[] {new Color(144, 144, 144, 255),new Color(190, 190, 190, 0)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(35.620502, 3.9384086);
((GeneralPath)shape).curveTo(35.62115, 4.238833, 35.46125, 4.516715, 35.201183, 4.667115);
((GeneralPath)shape).curveTo(34.941116, 4.8175154, 34.620514, 4.8175154, 34.360447, 4.667115);
((GeneralPath)shape).curveTo(34.10038, 4.516715, 33.94048, 4.238833, 33.941128, 3.9384086);
((GeneralPath)shape).curveTo(33.94048, 3.6379843, 34.10038, 3.3601022, 34.360447, 3.209702);
((GeneralPath)shape).curveTo(34.620514, 3.0593019, 34.941116, 3.0593019, 35.201183, 3.209702);
((GeneralPath)shape).curveTo(35.46125, 3.3601022, 35.62115, 3.6379843, 35.620502, 3.9384086);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_10);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_11 = g.getTransform();
g.transform(new AffineTransform(1.3312369585037231f, 0.0f, 0.0f, 0.6584489941596985f, -5.805729866027832f, 7.834650039672852f));
// _0_0_11
paint = new LinearGradientPaint(new Point2D.Double(34.30099105834961, 3.938408613204956), new Point2D.Double(35.52054214477539, 3.845109701156616), new float[] {0.0f,1.0f}, new Color[] {new Color(144, 144, 144, 255),new Color(190, 190, 190, 0)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(35.620502, 3.9384086);
((GeneralPath)shape).curveTo(35.62115, 4.238833, 35.46125, 4.516715, 35.201183, 4.667115);
((GeneralPath)shape).curveTo(34.941116, 4.8175154, 34.620514, 4.8175154, 34.360447, 4.667115);
((GeneralPath)shape).curveTo(34.10038, 4.516715, 33.94048, 4.238833, 33.941128, 3.9384086);
((GeneralPath)shape).curveTo(33.94048, 3.6379843, 34.10038, 3.3601022, 34.360447, 3.209702);
((GeneralPath)shape).curveTo(34.620514, 3.0593019, 34.941116, 3.0593019, 35.201183, 3.209702);
((GeneralPath)shape).curveTo(35.46125, 3.3601022, 35.62115, 3.6379843, 35.620502, 3.9384086);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_11);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_12 = g.getTransform();
g.transform(new AffineTransform(1.3312369585037231f, 0.0f, 0.0f, 0.6584489941596985f, -5.692130088806152f, 9.834650039672852f));
// _0_0_12
paint = new LinearGradientPaint(new Point2D.Double(34.30099105834961, 3.938408613204956), new Point2D.Double(35.52054214477539, 3.845109701156616), new float[] {0.0f,1.0f}, new Color[] {new Color(144, 144, 144, 255),new Color(190, 190, 190, 0)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(35.620502, 3.9384086);
((GeneralPath)shape).curveTo(35.62115, 4.238833, 35.46125, 4.516715, 35.201183, 4.667115);
((GeneralPath)shape).curveTo(34.941116, 4.8175154, 34.620514, 4.8175154, 34.360447, 4.667115);
((GeneralPath)shape).curveTo(34.10038, 4.516715, 33.94048, 4.238833, 33.941128, 3.9384086);
((GeneralPath)shape).curveTo(33.94048, 3.6379843, 34.10038, 3.3601022, 34.360447, 3.209702);
((GeneralPath)shape).curveTo(34.620514, 3.0593019, 34.941116, 3.0593019, 35.201183, 3.209702);
((GeneralPath)shape).curveTo(35.46125, 3.3601022, 35.62115, 3.6379843, 35.620502, 3.9384086);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_12);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_13 = g.getTransform();
g.transform(new AffineTransform(1.3312369585037231f, 0.0f, 0.0f, 0.6584489941596985f, -5.5785298347473145f, 11.834650039672852f));
// _0_0_13
paint = new LinearGradientPaint(new Point2D.Double(34.30099105834961, 3.938408613204956), new Point2D.Double(35.52054214477539, 3.845109701156616), new float[] {0.0f,1.0f}, new Color[] {new Color(144, 144, 144, 255),new Color(190, 190, 190, 0)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(35.620502, 3.9384086);
((GeneralPath)shape).curveTo(35.62115, 4.238833, 35.46125, 4.516715, 35.201183, 4.667115);
((GeneralPath)shape).curveTo(34.941116, 4.8175154, 34.620514, 4.8175154, 34.360447, 4.667115);
((GeneralPath)shape).curveTo(34.10038, 4.516715, 33.94048, 4.238833, 33.941128, 3.9384086);
((GeneralPath)shape).curveTo(33.94048, 3.6379843, 34.10038, 3.3601022, 34.360447, 3.209702);
((GeneralPath)shape).curveTo(34.620514, 3.0593019, 34.941116, 3.0593019, 35.201183, 3.209702);
((GeneralPath)shape).curveTo(35.46125, 3.3601022, 35.62115, 3.6379843, 35.620502, 3.9384086);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_13);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_14 = g.getTransform();
g.transform(new AffineTransform(1.3312369585037231f, 0.0f, 0.0f, 0.6584489941596985f, -5.464930057525635f, 13.834650039672852f));
// _0_0_14
paint = new LinearGradientPaint(new Point2D.Double(34.30099105834961, 3.938408613204956), new Point2D.Double(35.52054214477539, 3.845109701156616), new float[] {0.0f,1.0f}, new Color[] {new Color(144, 144, 144, 255),new Color(190, 190, 190, 0)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(35.620502, 3.9384086);
((GeneralPath)shape).curveTo(35.62115, 4.238833, 35.46125, 4.516715, 35.201183, 4.667115);
((GeneralPath)shape).curveTo(34.941116, 4.8175154, 34.620514, 4.8175154, 34.360447, 4.667115);
((GeneralPath)shape).curveTo(34.10038, 4.516715, 33.94048, 4.238833, 33.941128, 3.9384086);
((GeneralPath)shape).curveTo(33.94048, 3.6379843, 34.10038, 3.3601022, 34.360447, 3.209702);
((GeneralPath)shape).curveTo(34.620514, 3.0593019, 34.941116, 3.0593019, 35.201183, 3.209702);
((GeneralPath)shape).curveTo(35.46125, 3.3601022, 35.62115, 3.6379843, 35.620502, 3.9384086);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_14);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_15 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_15
paint = new Color(74, 74, 74, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(22.5, 30.192665);
((GeneralPath)shape).lineTo(22.781715, 30.192665);
((GeneralPath)shape).curveTo(22.86548, 30.192667, 22.9297, 30.21133, 22.974377, 30.248655);
((GeneralPath)shape).curveTo(23.019344, 30.28569, 23.041828, 30.338594, 23.04183, 30.40737);
((GeneralPath)shape).curveTo(23.041828, 30.47644, 23.019344, 30.529638, 22.974377, 30.566965);
((GeneralPath)shape).curveTo(22.9297, 30.603998, 22.86548, 30.622515, 22.781715, 30.622515);
((GeneralPath)shape).lineTo(22.669735, 30.622515);
((GeneralPath)shape).lineTo(22.669735, 30.850885);
((GeneralPath)shape).lineTo(22.5, 30.850885);
((GeneralPath)shape).lineTo(22.5, 30.192665);
((GeneralPath)shape).moveTo(22.669735, 30.315668);
((GeneralPath)shape).lineTo(22.669735, 30.499512);
((GeneralPath)shape).lineTo(22.76364, 30.499512);
((GeneralPath)shape).curveTo(22.796558, 30.499512, 22.821981, 30.491575, 22.83991, 30.475704);
((GeneralPath)shape).curveTo(22.85784, 30.45954, 22.866804, 30.436762, 22.866804, 30.40737);
((GeneralPath)shape).curveTo(22.866804, 30.37798, 22.85784, 30.355349, 22.83991, 30.339476);
((GeneralPath)shape).curveTo(22.821981, 30.323605, 22.796558, 30.315668, 22.76364, 30.315668);
((GeneralPath)shape).lineTo(22.669735, 30.315668);
((GeneralPath)shape).moveTo(23.461979, 30.303764);
((GeneralPath)shape).curveTo(23.41025, 30.303766, 23.37013, 30.32287, 23.341621, 30.361078);
((GeneralPath)shape).curveTo(23.313112, 30.399288, 23.298857, 30.453074, 23.298857, 30.522436);
((GeneralPath)shape).curveTo(23.298857, 30.591507, 23.313112, 30.645145, 23.341621, 30.683355);
((GeneralPath)shape).curveTo(23.37013, 30.721563, 23.41025, 30.740667, 23.461979, 30.740667);
((GeneralPath)shape).curveTo(23.514002, 30.740667, 23.554268, 30.721563, 23.582779, 30.683355);
((GeneralPath)shape).curveTo(23.611286, 30.645145, 23.625542, 30.591507, 23.625542, 30.522436);
((GeneralPath)shape).curveTo(23.625542, 30.453074, 23.611286, 30.399288, 23.582779, 30.361078);
((GeneralPath)shape).curveTo(23.554268, 30.32287, 23.514002, 30.303766, 23.461979, 30.303764);
((GeneralPath)shape).moveTo(23.461979, 30.180761);
((GeneralPath)shape).curveTo(23.567787, 30.180763, 23.650671, 30.211037, 23.71063, 30.271582);
((GeneralPath)shape).curveTo(23.770588, 30.332129, 23.800568, 30.415747, 23.800568, 30.522436);
((GeneralPath)shape).curveTo(23.800568, 30.628834, 23.770588, 30.712305, 23.71063, 30.772852);
((GeneralPath)shape).curveTo(23.650671, 30.833399, 23.567787, 30.86367, 23.461979, 30.86367);
((GeneralPath)shape).curveTo(23.356464, 30.86367, 23.27358, 30.833399, 23.213327, 30.772852);
((GeneralPath)shape).curveTo(23.15337, 30.712305, 23.12339, 30.628834, 23.12339, 30.522436);
((GeneralPath)shape).curveTo(23.12339, 30.415747, 23.15337, 30.332129, 23.213327, 30.271582);
((GeneralPath)shape).curveTo(23.27358, 30.211037, 23.356464, 30.180763, 23.461979, 30.180761);
((GeneralPath)shape).moveTo(23.92842, 30.192665);
((GeneralPath)shape).lineTo(24.117994, 30.192665);
((GeneralPath)shape).lineTo(24.357388, 30.644117);
((GeneralPath)shape).lineTo(24.357388, 30.192665);
((GeneralPath)shape).lineTo(24.518305, 30.192665);
((GeneralPath)shape).lineTo(24.518305, 30.850885);
((GeneralPath)shape).lineTo(24.32873, 30.850885);
((GeneralPath)shape).lineTo(24.089338, 30.399433);
((GeneralPath)shape).lineTo(24.089338, 30.850885);
((GeneralPath)shape).lineTo(23.92842, 30.850885);
((GeneralPath)shape).lineTo(23.92842, 30.192665);
((GeneralPath)shape).moveTo(24.59149, 30.192665);
((GeneralPath)shape).lineTo(24.777096, 30.192665);
((GeneralPath)shape).lineTo(24.92699, 30.42721);
((GeneralPath)shape).lineTo(25.076887, 30.192665);
((GeneralPath)shape).lineTo(25.262936, 30.192665);
((GeneralPath)shape).lineTo(25.01208, 30.573578);
((GeneralPath)shape).lineTo(25.01208, 30.850885);
((GeneralPath)shape).lineTo(24.842344, 30.850885);
((GeneralPath)shape).lineTo(24.842344, 30.573578);
((GeneralPath)shape).lineTo(24.59149, 30.192665);
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_15);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_16 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_16
paint = new Color(252, 233, 79, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(32.80312, 13.315819);
((GeneralPath)shape).curveTo(34.47257, 20.995363, 29.513748, 25.45455, 21.3557, 20.989296);
((GeneralPath)shape).curveTo(21.982796, 23.339367, 23.622335, 25.369877, 26.108051, 26.170364);
((GeneralPath)shape).curveTo(29.996363, 27.422537, 34.167355, 25.283571, 35.41953, 21.395262);
((GeneralPath)shape).curveTo(36.407272, 18.32807, 35.229874, 15.16364, 32.80312, 13.315819);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
paint = new Color(237, 212, 0, 255);
stroke = new BasicStroke(0.9999996f,0,0,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(32.80312, 13.315819);
((GeneralPath)shape).curveTo(34.47257, 20.995363, 29.513748, 25.45455, 21.3557, 20.989296);
((GeneralPath)shape).curveTo(21.982796, 23.339367, 23.622335, 25.369877, 26.108051, 26.170364);
((GeneralPath)shape).curveTo(29.996363, 27.422537, 34.167355, 25.283571, 35.41953, 21.395262);
((GeneralPath)shape).curveTo(36.407272, 18.32807, 35.229874, 15.16364, 32.80312, 13.315819);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_16);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_17 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_17
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_17_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, -2.4748740196228027f, -2.3864850997924805f));
// _0_0_17_0
paint = new RadialGradientPaint(new Point2D.Double(16.086679458618164, 13.97048568725586), 1.767767f, new Point2D.Double(16.086679458618164, 13.97048568725586), new float[] {0.0f,1.0f}, new Color[] {new Color(254, 233, 100, 255),new Color(254, 233, 100, 0)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(17.854446, 13.970486);
((GeneralPath)shape).curveTo(17.85491, 14.602357, 17.518078, 15.186429, 16.970938, 15.502499);
((GeneralPath)shape).curveTo(16.4238, 15.818568, 15.749561, 15.818568, 15.202422, 15.502499);
((GeneralPath)shape).curveTo(14.655282, 15.186429, 14.318449, 14.602357, 14.318913, 13.970486);
((GeneralPath)shape).curveTo(14.318449, 13.338614, 14.655282, 12.754542, 15.202422, 12.438473);
((GeneralPath)shape).curveTo(15.749561, 12.122403, 16.4238, 12.122403, 16.970938, 12.438473);
((GeneralPath)shape).curveTo(17.518078, 12.754542, 17.85491, 13.338614, 17.854446, 13.970486);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_17_0);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_17_1 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_17_1
paint = new RadialGradientPaint(new Point2D.Double(13.61180591583252, 11.584000587463379), 1.8561553f, new Point2D.Double(13.61180591583252, 11.584000587463379), new float[] {0.0f,1.0f}, new Color[] {new Color(255, 255, 255, 255),new Color(255, 255, 255, 0)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.9523810148239136f, 0.0f, 0.0f, 1.9523810148239136f, -12.96362018585205f, -11.032380104064941f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(16.970564, 11.584001);
((GeneralPath)shape).lineTo(13.930592, 11.85101);
((GeneralPath)shape).lineTo(13.611806, 14.942758);
((GeneralPath)shape).lineTo(13.344797, 11.902786);
((GeneralPath)shape).lineTo(10.253049, 11.584001);
((GeneralPath)shape).lineTo(13.29302, 11.316992);
((GeneralPath)shape).lineTo(13.611806, 8.225244);
((GeneralPath)shape).lineTo(13.878815, 11.265215);
((GeneralPath)shape).lineTo(16.970564, 11.584001);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_17_1);
g.setTransform(defaultTransform__0_0_17);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_18 = g.getTransform();
g.transform(new AffineTransform(0.6315789818763733f, 0.0f, 0.0f, 0.6315789818763733f, 12.969829559326172f, 3.737459897994995f));
// _0_0_18
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_18_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, -2.4748740196228027f, -2.3864850997924805f));
// _0_0_18_0
paint = new RadialGradientPaint(new Point2D.Double(16.086679458618164, 13.97048568725586), 1.767767f, new Point2D.Double(16.086679458618164, 13.97048568725586), new float[] {0.0f,1.0f}, new Color[] {new Color(254, 233, 100, 255),new Color(254, 233, 100, 0)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(17.854446, 13.970486);
((GeneralPath)shape).curveTo(17.85491, 14.602357, 17.518078, 15.186429, 16.970938, 15.502499);
((GeneralPath)shape).curveTo(16.4238, 15.818568, 15.749561, 15.818568, 15.202422, 15.502499);
((GeneralPath)shape).curveTo(14.655282, 15.186429, 14.318449, 14.602357, 14.318913, 13.970486);
((GeneralPath)shape).curveTo(14.318449, 13.338614, 14.655282, 12.754542, 15.202422, 12.438473);
((GeneralPath)shape).curveTo(15.749561, 12.122403, 16.4238, 12.122403, 16.970938, 12.438473);
((GeneralPath)shape).curveTo(17.518078, 12.754542, 17.85491, 13.338614, 17.854446, 13.970486);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_18_0);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_18_1 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_18_1
paint = new RadialGradientPaint(new Point2D.Double(13.61180591583252, 11.584000587463379), 1.8561553f, new Point2D.Double(13.61180591583252, 11.584000587463379), new float[] {0.0f,1.0f}, new Color[] {new Color(255, 255, 255, 255),new Color(255, 255, 255, 0)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.9523810148239136f, 0.0f, 0.0f, 1.9523810148239136f, -12.96362018585205f, -11.032380104064941f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(16.970564, 11.584001);
((GeneralPath)shape).lineTo(13.930592, 11.85101);
((GeneralPath)shape).lineTo(13.611806, 14.942758);
((GeneralPath)shape).lineTo(13.344797, 11.902786);
((GeneralPath)shape).lineTo(10.253049, 11.584001);
((GeneralPath)shape).lineTo(13.29302, 11.316992);
((GeneralPath)shape).lineTo(13.611806, 8.225244);
((GeneralPath)shape).lineTo(13.878815, 11.265215);
((GeneralPath)shape).lineTo(16.970564, 11.584001);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_18_1);
g.setTransform(defaultTransform__0_0_18);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_19 = g.getTransform();
g.transform(new AffineTransform(0.6315789818763733f, 0.0f, 0.0f, 0.6315789818763733f, 9.611074447631836f, 9.83625602722168f));
// _0_0_19
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_19_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, -2.4748740196228027f, -2.3864850997924805f));
// _0_0_19_0
paint = new RadialGradientPaint(new Point2D.Double(16.086679458618164, 13.97048568725586), 1.767767f, new Point2D.Double(16.086679458618164, 13.97048568725586), new float[] {0.0f,1.0f}, new Color[] {new Color(254, 233, 100, 255),new Color(254, 233, 100, 0)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(17.854446, 13.970486);
((GeneralPath)shape).curveTo(17.85491, 14.602357, 17.518078, 15.186429, 16.970938, 15.502499);
((GeneralPath)shape).curveTo(16.4238, 15.818568, 15.749561, 15.818568, 15.202422, 15.502499);
((GeneralPath)shape).curveTo(14.655282, 15.186429, 14.318449, 14.602357, 14.318913, 13.970486);
((GeneralPath)shape).curveTo(14.318449, 13.338614, 14.655282, 12.754542, 15.202422, 12.438473);
((GeneralPath)shape).curveTo(15.749561, 12.122403, 16.4238, 12.122403, 16.970938, 12.438473);
((GeneralPath)shape).curveTo(17.518078, 12.754542, 17.85491, 13.338614, 17.854446, 13.970486);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_19_0);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_19_1 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_19_1
paint = new RadialGradientPaint(new Point2D.Double(13.61180591583252, 11.584000587463379), 1.8561553f, new Point2D.Double(13.61180591583252, 11.584000587463379), new float[] {0.0f,1.0f}, new Color[] {new Color(255, 255, 255, 255),new Color(255, 255, 255, 0)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.9523810148239136f, 0.0f, 0.0f, 1.9523810148239136f, -12.96362018585205f, -11.032380104064941f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(16.970564, 11.584001);
((GeneralPath)shape).lineTo(13.930592, 11.85101);
((GeneralPath)shape).lineTo(13.611806, 14.942758);
((GeneralPath)shape).lineTo(13.344797, 11.902786);
((GeneralPath)shape).lineTo(10.253049, 11.584001);
((GeneralPath)shape).lineTo(13.29302, 11.316992);
((GeneralPath)shape).lineTo(13.611806, 8.225244);
((GeneralPath)shape).lineTo(13.878815, 11.265215);
((GeneralPath)shape).lineTo(16.970564, 11.584001);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_19_1);
g.setTransform(defaultTransform__0_0_19);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_20 = g.getTransform();
g.transform(new AffineTransform(0.6315789818763733f, 0.0f, 0.0f, 0.6315789818763733f, 4.484549045562744f, 11.515629768371582f));
// _0_0_20
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_20_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, -2.4748740196228027f, -2.3864850997924805f));
// _0_0_20_0
paint = new RadialGradientPaint(new Point2D.Double(16.086679458618164, 13.97048568725586), 1.767767f, new Point2D.Double(16.086679458618164, 13.97048568725586), new float[] {0.0f,1.0f}, new Color[] {new Color(254, 233, 100, 255),new Color(254, 233, 100, 0)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(17.854446, 13.970486);
((GeneralPath)shape).curveTo(17.85491, 14.602357, 17.518078, 15.186429, 16.970938, 15.502499);
((GeneralPath)shape).curveTo(16.4238, 15.818568, 15.749561, 15.818568, 15.202422, 15.502499);
((GeneralPath)shape).curveTo(14.655282, 15.186429, 14.318449, 14.602357, 14.318913, 13.970486);
((GeneralPath)shape).curveTo(14.318449, 13.338614, 14.655282, 12.754542, 15.202422, 12.438473);
((GeneralPath)shape).curveTo(15.749561, 12.122403, 16.4238, 12.122403, 16.970938, 12.438473);
((GeneralPath)shape).curveTo(17.518078, 12.754542, 17.85491, 13.338614, 17.854446, 13.970486);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_20_0);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_20_1 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_20_1
paint = new RadialGradientPaint(new Point2D.Double(13.61180591583252, 11.584000587463379), 1.8561553f, new Point2D.Double(13.61180591583252, 11.584000587463379), new float[] {0.0f,1.0f}, new Color[] {new Color(255, 255, 255, 255),new Color(255, 255, 255, 0)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.9523810148239136f, 0.0f, 0.0f, 1.9523810148239136f, -12.96362018585205f, -11.032380104064941f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(16.970564, 11.584001);
((GeneralPath)shape).lineTo(13.930592, 11.85101);
((GeneralPath)shape).lineTo(13.611806, 14.942758);
((GeneralPath)shape).lineTo(13.344797, 11.902786);
((GeneralPath)shape).lineTo(10.253049, 11.584001);
((GeneralPath)shape).lineTo(13.29302, 11.316992);
((GeneralPath)shape).lineTo(13.611806, 8.225244);
((GeneralPath)shape).lineTo(13.878815, 11.265215);
((GeneralPath)shape).lineTo(16.970564, 11.584001);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_20_1);
g.setTransform(defaultTransform__0_0_20);
g.setTransform(defaultTransform__0_0);
g.setTransform(defaultTransform__0);
g.setTransform(defaultTransform_);

	}

	/**
	 * Returns the width of the bounding box of the original SVG image.
	 * 
	 * @return The width of the bounding box of the original SVG image.
	 */
	public static int getOrigWidth() {
		return 41;
	}

	/**
	 * Returns the height of the bounding box of the original SVG image.
	 * 
	 * @return The height of the bounding box of the original SVG image.
	 */
	public static int getOrigHeight() {
		return 43;
	}

	/**
	 * The current width of this resizable icon.
	 */
	int width;

	/**
	 * The current height of this resizable icon.
	 */
	int height;

	/**
	 * Creates a new transcoded SVG image.
	 */
	public preferences_desktop_screensaver() {
        this.width = getOrigWidth();
        this.height = getOrigHeight();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see javax.swing.Icon#getIconHeight()
	 */
    @Override
	public int getIconHeight() {
		return width;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see javax.swing.Icon#getIconWidth()
	 */
    @Override
	public int getIconWidth() {
		return height;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.jvnet.flamingo.common.icon.ResizableIcon#setDimension(java.awt.Dimension
	 * )
	 */
	@Override
	public void setDimension(Dimension newDimension) {
		this.width = newDimension.width;
		this.height = newDimension.height;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see javax.swing.Icon#paintIcon(java.awt.Component, java.awt.Graphics,
	 * int, int)
	 */
    @Override
	public void paintIcon(Component c, Graphics g, int x, int y) {
		Graphics2D g2d = (Graphics2D) g.create();
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
				RenderingHints.VALUE_ANTIALIAS_ON);
		g2d.translate(x, y);

		double coef1 = (double) this.width / (double) getOrigWidth();
		double coef2 = (double) this.height / (double) getOrigHeight();
		double coef = Math.min(coef1, coef2);
		g2d.scale(coef, coef);
		paint(g2d);
		g2d.dispose();
	}
}

