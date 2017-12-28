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
public class preferences_desktop_theme implements
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
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_0 = g.getTransform();
g.transform(new AffineTransform(0.015187379904091358f, 0.0f, 0.0f, 0.02086758054792881f, 45.633201599121094f, 27.403600692749023f));
// _0_0_0
g.setComposite(AlphaComposite.getInstance(3, 0.40206185f * origAlpha));
AffineTransform defaultTransform__0_0_0_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_0_0
paint = new LinearGradientPaint(new Point2D.Double(302.8571472167969, 366.64788818359375), new Point2D.Double(302.8571472167969, 609.5050659179688), new float[] {0.0f,0.5f,1.0f}, new Color[] {new Color(0, 0, 0, 0),new Color(0, 0, 0, 255),new Color(0, 0, 0, 0)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(2.7743890285491943f, 0.0f, 0.0f, 1.9697060585021973f, -1892.178955078125f, -872.8853759765625f));
shape = new Rectangle2D.Double(-1559.2523193359375, -150.6968536376953, 1339.633544921875, 478.357177734375);
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_0_0);
g.setComposite(AlphaComposite.getInstance(3, 0.40206185f * origAlpha));
AffineTransform defaultTransform__0_0_0_1 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_0_1
paint = new RadialGradientPaint(new Point2D.Double(605.7142944335938, 486.64788818359375), 117.14286f, new Point2D.Double(605.7142944335938, 486.64788818359375), new float[] {0.0f,1.0f}, new Color[] {new Color(0, 0, 0, 255),new Color(0, 0, 0, 0)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(2.7743890285491943f, 0.0f, 0.0f, 1.9697060585021973f, -1891.633056640625f, -872.8853759765625f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(-219.61876, -150.68037);
((GeneralPath)shape).curveTo(-219.61876, -150.68037, -219.61876, 327.65042, -219.61876, 327.65042);
((GeneralPath)shape).curveTo(-76.74459, 328.55087, 125.78146, 220.48074, 125.78138, 88.45424);
((GeneralPath)shape).curveTo(125.78138, -43.572304, -33.655437, -150.68036, -219.61876, -150.68037);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_0_1);
g.setComposite(AlphaComposite.getInstance(3, 0.40206185f * origAlpha));
AffineTransform defaultTransform__0_0_0_2 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_0_2
paint = new RadialGradientPaint(new Point2D.Double(605.7142944335938, 486.64788818359375), 117.14286f, new Point2D.Double(605.7142944335938, 486.64788818359375), new float[] {0.0f,1.0f}, new Color[] {new Color(0, 0, 0, 255),new Color(0, 0, 0, 0)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(-2.7743890285491943f, 0.0f, 0.0f, 1.9697060585021973f, 112.76229858398438f, -872.8853759765625f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(-1559.2523, -150.68037);
((GeneralPath)shape).curveTo(-1559.2523, -150.68037, -1559.2523, 327.65042, -1559.2523, 327.65042);
((GeneralPath)shape).curveTo(-1702.1265, 328.55087, -1904.6525, 220.48074, -1904.6525, 88.45424);
((GeneralPath)shape).curveTo(-1904.6525, -43.572304, -1745.2157, -150.68036, -1559.2523, -150.68037);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_0_2);
g.setTransform(defaultTransform__0_0_0);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_1 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_1
paint = new LinearGradientPaint(new Point2D.Double(14.883313179016113, 27.847455978393555), new Point2D.Double(13.400960922241211, 20.06928062438965), new float[] {0.0f,1.0f}, new Color[] {new Color(214, 214, 214, 255),new Color(240, 240, 240, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 15.998330116271973f, -9.914664268493652f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(31.205997, 5.2048745);
((GeneralPath)shape).lineTo(34.908493, 5.2048745);
((GeneralPath)shape).curveTo(39.19495, 5.2048745, 44.455605, 6.5223904, 44.455605, 7.0610294);
((GeneralPath)shape).lineTo(44.455605, 29.688444);
((GeneralPath)shape).curveTo(44.455605, 30.227083, 44.018726, 30.660715, 43.476055, 30.660715);
((GeneralPath)shape).lineTo(22.638435, 30.660715);
((GeneralPath)shape).curveTo(22.095766, 30.660715, 21.65889, 30.227083, 21.65889, 29.688444);
((GeneralPath)shape).lineTo(21.65889, 7.0610294);
((GeneralPath)shape).curveTo(21.65889, 6.5223904, 26.830568, 5.2048745, 31.205997, 5.2048745);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
paint = new Color(148, 148, 148, 255);
stroke = new BasicStroke(1.0000001f,0,0,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(31.205997, 5.2048745);
((GeneralPath)shape).lineTo(34.908493, 5.2048745);
((GeneralPath)shape).curveTo(39.19495, 5.2048745, 44.455605, 6.5223904, 44.455605, 7.0610294);
((GeneralPath)shape).lineTo(44.455605, 29.688444);
((GeneralPath)shape).curveTo(44.455605, 30.227083, 44.018726, 30.660715, 43.476055, 30.660715);
((GeneralPath)shape).lineTo(22.638435, 30.660715);
((GeneralPath)shape).curveTo(22.095766, 30.660715, 21.65889, 30.227083, 21.65889, 29.688444);
((GeneralPath)shape).lineTo(21.65889, 7.0610294);
((GeneralPath)shape).curveTo(21.65889, 6.5223904, 26.830568, 5.2048745, 31.205997, 5.2048745);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_1);
g.setComposite(AlphaComposite.getInstance(3, 0.61988306f * origAlpha));
AffineTransform defaultTransform__0_0_2 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_2
paint = new Color(255, 255, 255, 255);
stroke = new BasicStroke(1.0f,0,1,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(31.363447, 6.0663853);
((GeneralPath)shape).lineTo(34.751057, 6.0663853);
((GeneralPath)shape).curveTo(38.672962, 6.0663853, 43.486214, 7.5879025, 43.486214, 7.5879025);
((GeneralPath)shape).lineTo(43.486214, 29.657421);
((GeneralPath)shape).curveTo(43.486214, 29.657421, 22.62829, 29.657421, 22.62829, 29.657421);
((GeneralPath)shape).lineTo(22.62829, 7.5879025);
((GeneralPath)shape).curveTo(22.62829, 7.5879025, 27.360134, 6.0663853, 31.363447, 6.0663853);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_2);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_3 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_3
paint = new LinearGradientPaint(new Point2D.Double(16.940231323242188, 27.853084564208984), new Point2D.Double(16.940231323242188, 24.13514518737793), new float[] {0.0f,1.0f}, new Color[] {new Color(176, 176, 176, 255),new Color(147, 147, 147, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 15.998330116271973f, -9.914664268493652f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(33.410797, 10.508173);
((GeneralPath)shape).lineTo(30.405594, 17.314075);
((GeneralPath)shape).lineTo(30.405594, 29.600058);
((GeneralPath)shape).lineTo(33.587574, 32.428486);
((GeneralPath)shape).lineTo(36.50439, 29.600058);
((GeneralPath)shape).lineTo(36.50439, 17.1373);
((GeneralPath)shape).lineTo(33.410797, 10.508173);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
paint = new Color(148, 148, 148, 255);
stroke = new BasicStroke(1.0f,0,0,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(33.410797, 10.508173);
((GeneralPath)shape).lineTo(30.405594, 17.314075);
((GeneralPath)shape).lineTo(30.405594, 29.600058);
((GeneralPath)shape).lineTo(33.587574, 32.428486);
((GeneralPath)shape).lineTo(36.50439, 29.600058);
((GeneralPath)shape).lineTo(36.50439, 17.1373);
((GeneralPath)shape).lineTo(33.410797, 10.508173);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_3);
g.setComposite(AlphaComposite.getInstance(3, 0.46783626f * origAlpha));
AffineTransform defaultTransform__0_0_4 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_4
paint = new LinearGradientPaint(new Point2D.Double(17.456695556640625, 37.66166687011719), new Point2D.Double(17.456695556640625, 27.231843948364258), new float[] {0.0f,1.0f}, new Color[] {new Color(255, 255, 255, 255),new Color(255, 255, 255, 0)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 15.998330116271973f, -9.914664268493652f));
stroke = new BasicStroke(0.99999976f,0,0,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(33.4229, 13.510439);
((GeneralPath)shape).lineTo(31.417679, 17.9217);
((GeneralPath)shape).lineTo(31.417679, 28.969769);
((GeneralPath)shape).lineTo(33.551254, 31.023417);
((GeneralPath)shape).lineTo(35.492302, 28.969769);
((GeneralPath)shape).lineTo(35.492302, 17.793346);
((GeneralPath)shape).lineTo(33.4229, 13.510439);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_4);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_5 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 15.114439964294434f, -11.15211009979248f));
// _0_0_5
paint = new RadialGradientPaint(new Point2D.Double(18.16380500793457, 22.53187370300293), 2.842291f, new Point2D.Double(18.16380500793457, 22.53187370300293), new float[] {0.0f,1.0f}, new Color[] {new Color(176, 176, 176, 255),new Color(117, 117, 117, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 0.86006098985672f, 0.0f, 3.2537600994110107f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(20.506096, 23.251263);
((GeneralPath)shape).curveTo(20.506474, 23.94619, 20.060118, 24.588463, 19.335257, 24.936018);
((GeneralPath)shape).curveTo(18.610394, 25.283573, 17.717216, 25.283573, 16.992353, 24.936018);
((GeneralPath)shape).curveTo(16.267492, 24.588463, 15.821136, 23.94619, 15.821514, 23.251263);
((GeneralPath)shape).curveTo(15.821136, 22.556335, 16.267492, 21.914062, 16.992353, 21.566507);
((GeneralPath)shape).curveTo(17.717216, 21.218952, 18.610394, 21.218952, 19.335257, 21.566507);
((GeneralPath)shape).curveTo(20.060118, 21.914062, 20.506474, 22.556335, 20.506096, 23.251263);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
paint = new Color(148, 148, 148, 255);
stroke = new BasicStroke(1.0f,0,0,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(20.506096, 23.251263);
((GeneralPath)shape).curveTo(20.506474, 23.94619, 20.060118, 24.588463, 19.335257, 24.936018);
((GeneralPath)shape).curveTo(18.610394, 25.283573, 17.717216, 25.283573, 16.992353, 24.936018);
((GeneralPath)shape).curveTo(16.267492, 24.588463, 15.821136, 23.94619, 15.821514, 23.251263);
((GeneralPath)shape).curveTo(15.821136, 22.556335, 16.267492, 21.914062, 16.992353, 21.566507);
((GeneralPath)shape).curveTo(17.717216, 21.218952, 18.610394, 21.218952, 19.335257, 21.566507);
((GeneralPath)shape).curveTo(20.060118, 21.914062, 20.506474, 22.556335, 20.506096, 23.251263);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_5);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_6 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_6
paint = new RadialGradientPaint(new Point2D.Double(12.910969734191895, 13.001997947692871), 7.488951f, new Point2D.Double(12.910969734191895, 13.001997947692871), new float[] {0.0f,1.0f}, new Color[] {new Color(240, 240, 240, 255),new Color(201, 201, 201, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.8027249574661255f, 2.307501924799594E-23f, -2.6369310276807938E-23f, 1.5033420324325562f, 5.634344100952148f, -15.57903003692627f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(33.057243, 10.331398);
((GeneralPath)shape).lineTo(28.01911, 14.132097);
((GeneralPath)shape).curveTo(28.01911, 14.132097, 26.162954, 8.565209, 26.162954, 6.0887585);
((GeneralPath)shape).curveTo(26.162954, 3.6138842, 27.48878, 2.6416132, 28.902992, 2.6416132);
((GeneralPath)shape).curveTo(28.902992, 2.6416132, 37.299885, 2.6416132, 37.299885, 2.6416132);
((GeneralPath)shape).curveTo(38.256462, 2.6416132, 39.92944, 3.0393603, 40.12831, 5.9119825);
((GeneralPath)shape).curveTo(40.327187, 8.784603, 38.095383, 14.132097, 38.095383, 14.132097);
((GeneralPath)shape).lineTo(33.057243, 10.331398);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
paint = new Color(148, 148, 148, 255);
stroke = new BasicStroke(1.0f,0,0,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(33.057243, 10.331398);
((GeneralPath)shape).lineTo(28.01911, 14.132097);
((GeneralPath)shape).curveTo(28.01911, 14.132097, 26.162954, 8.565209, 26.162954, 6.0887585);
((GeneralPath)shape).curveTo(26.162954, 3.6138842, 27.48878, 2.6416132, 28.902992, 2.6416132);
((GeneralPath)shape).curveTo(28.902992, 2.6416132, 37.299885, 2.6416132, 37.299885, 2.6416132);
((GeneralPath)shape).curveTo(38.256462, 2.6416132, 39.92944, 3.0393603, 40.12831, 5.9119825);
((GeneralPath)shape).curveTo(40.327187, 8.784603, 38.095383, 14.132097, 38.095383, 14.132097);
((GeneralPath)shape).lineTo(33.057243, 10.331398);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_6);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_7 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_7
paint = new Color(255, 255, 255, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(29.915115, 5.0280943);
((GeneralPath)shape).curveTo(29.915115, 5.0280943, 28.099472, 5.5160723, 28.41988, 6.687217);
((GeneralPath)shape).curveTo(28.740288, 7.8583636, 31.196747, 9.712676, 31.196747, 9.712676);
((GeneralPath)shape).lineTo(35.789257, 9.712676);
((GeneralPath)shape).curveTo(35.789257, 9.712676, 37.89861, 8.15115, 38.138916, 6.9800043);
((GeneralPath)shape).curveTo(38.379223, 5.8088584, 36.75048, 5.0280943, 36.75048, 5.0280943);
((GeneralPath)shape).lineTo(29.915115, 5.0280943);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_7);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_8 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_8
paint = new RadialGradientPaint(new Point2D.Double(17.09746742248535, 19.777185440063477), 4.5473714f, new Point2D.Double(17.09746742248535, 19.777185440063477), new float[] {0.0f,1.0f}, new Color[] {new Color(139, 139, 139, 255),new Color(169, 169, 169, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.2083330154418945f, 0.0f, 0.0f, 0.6364930272102356f, 12.436349868774414f, -4.23803186416626f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(29.73834, 4.055826);
((GeneralPath)shape).curveTo(29.73834, 4.055826, 27.922695, 4.543804, 28.243105, 5.714949);
((GeneralPath)shape).curveTo(28.56351, 6.8860955, 31.019972, 8.740409, 31.019972, 8.740409);
((GeneralPath)shape).lineTo(35.61248, 8.740409);
((GeneralPath)shape).curveTo(35.61248, 8.740409, 37.721832, 7.178881, 37.96214, 6.007736);
((GeneralPath)shape).curveTo(38.202446, 4.8365903, 36.573704, 4.055826, 36.573704, 4.055826);
((GeneralPath)shape).lineTo(29.73834, 4.055826);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_8);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_9 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_9
paint = new LinearGradientPaint(new Point2D.Double(14.883313179016113, 27.847455978393555), new Point2D.Double(13.400960922241211, 20.06928062438965), new float[] {0.0f,1.0f}, new Color[] {new Color(80, 121, 173, 255),new Color(114, 159, 207, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 15.998330116271973f, -9.914664268493652f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(31.205997, 5.2048745);
((GeneralPath)shape).lineTo(34.908493, 5.2048745);
((GeneralPath)shape).curveTo(39.19495, 5.2048745, 44.455605, 6.5223904, 44.455605, 7.0610294);
((GeneralPath)shape).lineTo(44.455605, 29.688444);
((GeneralPath)shape).curveTo(44.455605, 30.227083, 44.018726, 30.660715, 43.476055, 30.660715);
((GeneralPath)shape).lineTo(22.638435, 30.660715);
((GeneralPath)shape).curveTo(22.095766, 30.660715, 21.65889, 30.227083, 21.65889, 29.688444);
((GeneralPath)shape).lineTo(21.65889, 7.0610294);
((GeneralPath)shape).curveTo(21.65889, 6.5223904, 26.830568, 5.2048745, 31.205997, 5.2048745);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
paint = new Color(52, 101, 164, 255);
stroke = new BasicStroke(1.0000001f,0,0,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(31.205997, 5.2048745);
((GeneralPath)shape).lineTo(34.908493, 5.2048745);
((GeneralPath)shape).curveTo(39.19495, 5.2048745, 44.455605, 6.5223904, 44.455605, 7.0610294);
((GeneralPath)shape).lineTo(44.455605, 29.688444);
((GeneralPath)shape).curveTo(44.455605, 30.227083, 44.018726, 30.660715, 43.476055, 30.660715);
((GeneralPath)shape).lineTo(22.638435, 30.660715);
((GeneralPath)shape).curveTo(22.095766, 30.660715, 21.65889, 30.227083, 21.65889, 29.688444);
((GeneralPath)shape).lineTo(21.65889, 7.0610294);
((GeneralPath)shape).curveTo(21.65889, 6.5223904, 26.830568, 5.2048745, 31.205997, 5.2048745);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_9);
g.setComposite(AlphaComposite.getInstance(3, 0.26315793f * origAlpha));
AffineTransform defaultTransform__0_0_10 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_10
paint = new Color(255, 255, 255, 255);
stroke = new BasicStroke(1.0f,0,1,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(31.363447, 6.0663853);
((GeneralPath)shape).lineTo(34.751057, 6.0663853);
((GeneralPath)shape).curveTo(38.672962, 6.0663853, 43.486214, 7.5879025, 43.486214, 7.5879025);
((GeneralPath)shape).lineTo(43.486214, 29.657421);
((GeneralPath)shape).curveTo(43.486214, 29.657421, 22.62829, 29.657421, 22.62829, 29.657421);
((GeneralPath)shape).lineTo(22.62829, 7.5879025);
((GeneralPath)shape).curveTo(22.62829, 7.5879025, 27.360134, 6.0663853, 31.363447, 6.0663853);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_10);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_11 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_11
paint = new Color(117, 80, 123, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(33.410797, 10.508173);
((GeneralPath)shape).curveTo(33.410797, 10.508173, 30.405594, 15.439076, 30.405594, 17.314075);
((GeneralPath)shape).lineTo(30.405594, 29.600058);
((GeneralPath)shape).lineTo(33.587574, 32.428486);
((GeneralPath)shape).lineTo(36.50439, 29.600058);
((GeneralPath)shape).lineTo(36.50439, 17.1373);
((GeneralPath)shape).curveTo(36.50439, 15.3873, 33.410797, 10.508173, 33.410797, 10.508173);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
paint = new Color(92, 53, 102, 255);
stroke = new BasicStroke(1.0f,0,0,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(33.410797, 10.508173);
((GeneralPath)shape).curveTo(33.410797, 10.508173, 30.405594, 15.439076, 30.405594, 17.314075);
((GeneralPath)shape).lineTo(30.405594, 29.600058);
((GeneralPath)shape).lineTo(33.587574, 32.428486);
((GeneralPath)shape).lineTo(36.50439, 29.600058);
((GeneralPath)shape).lineTo(36.50439, 17.1373);
((GeneralPath)shape).curveTo(36.50439, 15.3873, 33.410797, 10.508173, 33.410797, 10.508173);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_11);
g.setComposite(AlphaComposite.getInstance(3, 0.25146198f * origAlpha));
AffineTransform defaultTransform__0_0_12 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_12
paint = new LinearGradientPaint(new Point2D.Double(17.456695556640625, 37.66166687011719), new Point2D.Double(17.456695556640625, 27.231843948364258), new float[] {0.0f,1.0f}, new Color[] {new Color(255, 255, 255, 255),new Color(255, 255, 255, 0)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 15.998330116271973f, -9.914664268493652f));
stroke = new BasicStroke(0.99999976f,0,0,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(33.4229, 13.510439);
((GeneralPath)shape).lineTo(31.417679, 17.9217);
((GeneralPath)shape).lineTo(31.417679, 28.969769);
((GeneralPath)shape).lineTo(33.551254, 31.023417);
((GeneralPath)shape).lineTo(35.492302, 28.969769);
((GeneralPath)shape).lineTo(35.492302, 17.793346);
((GeneralPath)shape).lineTo(33.4229, 13.510439);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_12);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_13 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 15.114439964294434f, -11.15211009979248f));
// _0_0_13
paint = new RadialGradientPaint(new Point2D.Double(18.16380500793457, 22.42910385131836), 2.842291f, new Point2D.Double(18.16380500793457, 22.42910385131836), new float[] {0.0f,1.0f}, new Color[] {new Color(117, 80, 123, 255),new Color(84, 57, 88, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.8709900379180908f, -2.4998940770107683E-15f, 2.150062058256454E-15f, 1.6091660261154175f, -15.820500373840332f, -13.547989845275879f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(20.506096, 23.251263);
((GeneralPath)shape).curveTo(20.506474, 23.94619, 20.060118, 24.588463, 19.335257, 24.936018);
((GeneralPath)shape).curveTo(18.610394, 25.283573, 17.717216, 25.283573, 16.992353, 24.936018);
((GeneralPath)shape).curveTo(16.267492, 24.588463, 15.821136, 23.94619, 15.821514, 23.251263);
((GeneralPath)shape).curveTo(15.821136, 22.556335, 16.267492, 21.914062, 16.992353, 21.566507);
((GeneralPath)shape).curveTo(17.717216, 21.218952, 18.610394, 21.218952, 19.335257, 21.566507);
((GeneralPath)shape).curveTo(20.060118, 21.914062, 20.506474, 22.556335, 20.506096, 23.251263);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
paint = new Color(92, 53, 102, 255);
stroke = new BasicStroke(1.0f,0,0,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(20.506096, 23.251263);
((GeneralPath)shape).curveTo(20.506474, 23.94619, 20.060118, 24.588463, 19.335257, 24.936018);
((GeneralPath)shape).curveTo(18.610394, 25.283573, 17.717216, 25.283573, 16.992353, 24.936018);
((GeneralPath)shape).curveTo(16.267492, 24.588463, 15.821136, 23.94619, 15.821514, 23.251263);
((GeneralPath)shape).curveTo(15.821136, 22.556335, 16.267492, 21.914062, 16.992353, 21.566507);
((GeneralPath)shape).curveTo(17.717216, 21.218952, 18.610394, 21.218952, 19.335257, 21.566507);
((GeneralPath)shape).curveTo(20.060118, 21.914062, 20.506474, 22.556335, 20.506096, 23.251263);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_13);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_14 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_14
paint = new RadialGradientPaint(new Point2D.Double(27.848600387573242, 4.607162952423096), 7.488951f, new Point2D.Double(27.848600387573242, 4.607162952423096), new float[] {0.0f,1.0f}, new Color[] {new Color(200, 213, 230, 255),new Color(66, 126, 191, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 0.8339279890060425f, 2.121324062347412f, 0.6557289958000183f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(33.057243, 10.331398);
((GeneralPath)shape).lineTo(28.01911, 14.132097);
((GeneralPath)shape).curveTo(28.01911, 14.132097, 26.162954, 8.565209, 26.162954, 6.0887585);
((GeneralPath)shape).curveTo(26.162954, 3.6138842, 27.48878, 2.6416132, 28.902992, 2.6416132);
((GeneralPath)shape).curveTo(28.902992, 2.6416132, 37.299885, 2.6416132, 37.299885, 2.6416132);
((GeneralPath)shape).curveTo(38.256462, 2.6416132, 39.92944, 3.0393603, 40.12831, 5.9119825);
((GeneralPath)shape).curveTo(40.327187, 8.784603, 38.095383, 14.132097, 38.095383, 14.132097);
((GeneralPath)shape).lineTo(33.057243, 10.331398);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
paint = new Color(52, 101, 164, 255);
stroke = new BasicStroke(1.0000001f,0,0,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(33.057243, 10.331398);
((GeneralPath)shape).lineTo(28.01911, 14.132097);
((GeneralPath)shape).curveTo(28.01911, 14.132097, 26.162954, 8.565209, 26.162954, 6.0887585);
((GeneralPath)shape).curveTo(26.162954, 3.6138842, 27.48878, 2.6416132, 28.902992, 2.6416132);
((GeneralPath)shape).curveTo(28.902992, 2.6416132, 37.299885, 2.6416132, 37.299885, 2.6416132);
((GeneralPath)shape).curveTo(38.256462, 2.6416132, 39.92944, 3.0393603, 40.12831, 5.9119825);
((GeneralPath)shape).curveTo(40.327187, 8.784603, 38.095383, 14.132097, 38.095383, 14.132097);
((GeneralPath)shape).lineTo(33.057243, 10.331398);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_14);
g.setComposite(AlphaComposite.getInstance(3, 0.33333334f * origAlpha));
AffineTransform defaultTransform__0_0_15 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_15
paint = new Color(255, 255, 255, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(29.915115, 5.0280943);
((GeneralPath)shape).curveTo(29.915115, 5.0280943, 28.099472, 5.5160723, 28.41988, 6.687217);
((GeneralPath)shape).curveTo(28.740288, 7.8583636, 30.696747, 9.712676, 31.196747, 9.712676);
((GeneralPath)shape).lineTo(35.789257, 9.712676);
((GeneralPath)shape).curveTo(36.539257, 9.650176, 37.89861, 8.15115, 38.138916, 6.9800043);
((GeneralPath)shape).curveTo(38.379223, 5.8088584, 36.75048, 5.0280943, 36.75048, 5.0280943);
((GeneralPath)shape).lineTo(29.915115, 5.0280943);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_15);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_16 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_16
paint = new RadialGradientPaint(new Point2D.Double(30.974437713623047, 12.172572135925293), 4.890574f, new Point2D.Double(30.974437713623047, 12.172572135925293), new float[] {0.0f,1.0f}, new Color[] {new Color(32, 74, 135, 255),new Color(20, 46, 85, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(2.132075071334839f, -4.7341581982461144E-15f, 2.2673780272753057E-15f, 1.0211360454559326f, -32.94403839111328f, -3.6894469261169434f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(29.73834, 4.055826);
((GeneralPath)shape).curveTo(29.23834, 4.055826, 27.922695, 4.543804, 28.243105, 5.714949);
((GeneralPath)shape).curveTo(28.56351, 6.8860955, 30.14274, 8.740409, 31.019972, 8.740409);
((GeneralPath)shape).lineTo(35.61248, 8.740409);
((GeneralPath)shape).curveTo(36.30282, 8.740409, 37.721832, 7.178881, 37.96214, 6.007736);
((GeneralPath)shape).curveTo(38.202446, 4.8365903, 37.073704, 4.055826, 36.573704, 4.055826);
((GeneralPath)shape).lineTo(29.73834, 4.055826);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_16);
g.setComposite(AlphaComposite.getInstance(3, 0.28654972f * origAlpha));
AffineTransform defaultTransform__0_0_17 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_17
paint = new LinearGradientPaint(new Point2D.Double(31.643028259277344, 13.61693286895752), new Point2D.Double(31.643028259277344, 9.63847541809082), new float[] {0.0f,1.0f}, new Color[] {new Color(255, 255, 255, 255),new Color(255, 255, 255, 0)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 2.121324062347412f, -0.8838850259780884f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(33.145634, 9.68365);
((GeneralPath)shape).lineTo(37.83022, 13.219183);
((GeneralPath)shape).lineTo(39.067654, 9.772038);
((GeneralPath)shape).lineTo(37.565052, 12.246911);
((GeneralPath)shape).lineTo(33.145634, 9.68365);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_17);
g.setComposite(AlphaComposite.getInstance(3, 0.28654972f * origAlpha));
AffineTransform defaultTransform__0_0_18 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_18
paint = new LinearGradientPaint(new Point2D.Double(31.643028259277344, 13.61693286895752), new Point2D.Double(31.643028259277344, 9.63847541809082), new float[] {0.0f,1.0f}, new Color[] {new Color(255, 255, 255, 255),new Color(255, 255, 255, 0)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 2.121324062347412f, -0.8838850259780884f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(32.79208, 9.860426);
((GeneralPath)shape).lineTo(28.372663, 13.219183);
((GeneralPath)shape).lineTo(26.870062, 6.5900598);
((GeneralPath)shape).lineTo(28.902992, 11.981746);
((GeneralPath)shape).lineTo(32.79208, 9.860426);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_18);
g.setTransform(defaultTransform__0_0);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_1 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_1
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_1_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_1_0
paint = new LinearGradientPaint(new Point2D.Double(14.883313179016113, 27.847455978393555), new Point2D.Double(13.400960922241211, 20.06928062438965), new float[] {0.0f,1.0f}, new Color[] {new Color(214, 214, 214, 255),new Color(240, 240, 240, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, -2.121319055557251f, 3.005204916000366f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(13.086385, 18.12474);
((GeneralPath)shape).lineTo(16.78888, 18.12474);
((GeneralPath)shape).curveTo(21.075336, 18.12474, 26.33599, 19.442257, 26.33599, 19.980894);
((GeneralPath)shape).lineTo(26.33599, 42.60831);
((GeneralPath)shape).curveTo(26.33599, 43.14695, 25.899113, 43.58058, 25.356443, 43.58058);
((GeneralPath)shape).lineTo(4.5188212, 43.58058);
((GeneralPath)shape).curveTo(3.9761531, 43.58058, 3.5392747, 43.14695, 3.5392747, 42.60831);
((GeneralPath)shape).lineTo(3.5392747, 19.980894);
((GeneralPath)shape).curveTo(3.5392747, 19.442257, 8.710954, 18.12474, 13.086385, 18.12474);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
paint = new Color(148, 148, 148, 255);
stroke = new BasicStroke(1.0000001f,0,0,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(13.086385, 18.12474);
((GeneralPath)shape).lineTo(16.78888, 18.12474);
((GeneralPath)shape).curveTo(21.075336, 18.12474, 26.33599, 19.442257, 26.33599, 19.980894);
((GeneralPath)shape).lineTo(26.33599, 42.60831);
((GeneralPath)shape).curveTo(26.33599, 43.14695, 25.899113, 43.58058, 25.356443, 43.58058);
((GeneralPath)shape).lineTo(4.5188212, 43.58058);
((GeneralPath)shape).curveTo(3.9761531, 43.58058, 3.5392747, 43.14695, 3.5392747, 42.60831);
((GeneralPath)shape).lineTo(3.5392747, 19.980894);
((GeneralPath)shape).curveTo(3.5392747, 19.442257, 8.710954, 18.12474, 13.086385, 18.12474);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_1_0);
g.setComposite(AlphaComposite.getInstance(3, 0.61988306f * origAlpha));
AffineTransform defaultTransform__0_1_1 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_1_1
paint = new Color(255, 255, 255, 255);
stroke = new BasicStroke(1.0f,0,1,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(13.243834, 18.986252);
((GeneralPath)shape).lineTo(16.631443, 18.986252);
((GeneralPath)shape).curveTo(20.55335, 18.986252, 25.3666, 20.507769, 25.3666, 20.507769);
((GeneralPath)shape).lineTo(25.3666, 42.57729);
((GeneralPath)shape).curveTo(25.3666, 42.57729, 4.508677, 42.57729, 4.508677, 42.57729);
((GeneralPath)shape).lineTo(4.508677, 20.507769);
((GeneralPath)shape).curveTo(4.508677, 20.507769, 9.2405205, 18.986252, 13.243834, 18.986252);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_1_1);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_1_2 = g.getTransform();
g.transform(new AffineTransform(0.015187379904091358f, 0.0f, 0.0f, 0.02086758054792881f, 28.38319969177246f, 40.02859878540039f));
// _0_1_2
g.setComposite(AlphaComposite.getInstance(3, 0.40206185f * origAlpha));
AffineTransform defaultTransform__0_1_2_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_1_2_0
paint = new LinearGradientPaint(new Point2D.Double(302.8571472167969, 366.64788818359375), new Point2D.Double(302.8571472167969, 609.5050659179688), new float[] {0.0f,0.5f,1.0f}, new Color[] {new Color(0, 0, 0, 0),new Color(0, 0, 0, 255),new Color(0, 0, 0, 0)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(2.7743890285491943f, 0.0f, 0.0f, 1.9697060585021973f, -1892.178955078125f, -872.8853759765625f));
shape = new Rectangle2D.Double(-1559.2523193359375, -150.6968536376953, 1339.633544921875, 478.357177734375);
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_1_2_0);
g.setComposite(AlphaComposite.getInstance(3, 0.40206185f * origAlpha));
AffineTransform defaultTransform__0_1_2_1 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_1_2_1
paint = new RadialGradientPaint(new Point2D.Double(605.7142944335938, 486.64788818359375), 117.14286f, new Point2D.Double(605.7142944335938, 486.64788818359375), new float[] {0.0f,1.0f}, new Color[] {new Color(0, 0, 0, 255),new Color(0, 0, 0, 0)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(2.7743890285491943f, 0.0f, 0.0f, 1.9697060585021973f, -1891.633056640625f, -872.8853759765625f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(-219.61876, -150.68037);
((GeneralPath)shape).curveTo(-219.61876, -150.68037, -219.61876, 327.65042, -219.61876, 327.65042);
((GeneralPath)shape).curveTo(-76.74459, 328.55087, 125.78146, 220.48074, 125.78138, 88.45424);
((GeneralPath)shape).curveTo(125.78138, -43.572304, -33.655437, -150.68036, -219.61876, -150.68037);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_1_2_1);
g.setComposite(AlphaComposite.getInstance(3, 0.40206185f * origAlpha));
AffineTransform defaultTransform__0_1_2_2 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_1_2_2
paint = new RadialGradientPaint(new Point2D.Double(605.7142944335938, 486.64788818359375), 117.14286f, new Point2D.Double(605.7142944335938, 486.64788818359375), new float[] {0.0f,1.0f}, new Color[] {new Color(0, 0, 0, 255),new Color(0, 0, 0, 0)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(-2.7743890285491943f, 0.0f, 0.0f, 1.9697060585021973f, 112.76229858398438f, -872.8853759765625f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(-1559.2523, -150.68037);
((GeneralPath)shape).curveTo(-1559.2523, -150.68037, -1559.2523, 327.65042, -1559.2523, 327.65042);
((GeneralPath)shape).curveTo(-1702.1265, 328.55087, -1904.6525, 220.48074, -1904.6525, 88.45424);
((GeneralPath)shape).curveTo(-1904.6525, -43.572304, -1745.2157, -150.68036, -1559.2523, -150.68037);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_1_2_2);
g.setTransform(defaultTransform__0_1_2);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_1_3 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_1_3
paint = new LinearGradientPaint(new Point2D.Double(16.940231323242188, 27.853084564208984), new Point2D.Double(16.940231323242188, 24.13514518737793), new float[] {0.0f,1.0f}, new Color[] {new Color(176, 176, 176, 255),new Color(147, 147, 147, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, -2.121319055557251f, 3.005204916000366f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(15.291184, 23.42804);
((GeneralPath)shape).lineTo(12.285981, 30.233944);
((GeneralPath)shape).lineTo(12.285981, 42.519924);
((GeneralPath)shape).lineTo(15.467961, 45.34835);
((GeneralPath)shape).lineTo(18.384777, 42.519924);
((GeneralPath)shape).lineTo(18.384777, 30.057167);
((GeneralPath)shape).lineTo(15.291184, 23.42804);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
paint = new Color(148, 148, 148, 255);
stroke = new BasicStroke(1.0f,0,0,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(15.291184, 23.42804);
((GeneralPath)shape).lineTo(12.285981, 30.233944);
((GeneralPath)shape).lineTo(12.285981, 42.519924);
((GeneralPath)shape).lineTo(15.467961, 45.34835);
((GeneralPath)shape).lineTo(18.384777, 42.519924);
((GeneralPath)shape).lineTo(18.384777, 30.057167);
((GeneralPath)shape).lineTo(15.291184, 23.42804);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_1_3);
g.setComposite(AlphaComposite.getInstance(3, 0.46783626f * origAlpha));
AffineTransform defaultTransform__0_1_4 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_1_4
paint = new LinearGradientPaint(new Point2D.Double(17.456695556640625, 37.66166687011719), new Point2D.Double(17.456695556640625, 27.231843948364258), new float[] {0.0f,1.0f}, new Color[] {new Color(255, 255, 255, 255),new Color(255, 255, 255, 0)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, -2.121319055557251f, 3.005204916000366f));
stroke = new BasicStroke(0.99999976f,0,0,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(15.303288, 26.430305);
((GeneralPath)shape).lineTo(13.298065, 30.841566);
((GeneralPath)shape).lineTo(13.298065, 41.889637);
((GeneralPath)shape).lineTo(15.431641, 43.943283);
((GeneralPath)shape).lineTo(17.372688, 41.889637);
((GeneralPath)shape).lineTo(17.372688, 30.713213);
((GeneralPath)shape).lineTo(15.303288, 26.430305);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_1_4);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_1_5 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, -3.0052080154418945f, 1.7677680253982544f));
// _0_1_5
paint = new RadialGradientPaint(new Point2D.Double(18.16380500793457, 22.53187370300293), 2.842291f, new Point2D.Double(18.16380500793457, 22.53187370300293), new float[] {0.0f,1.0f}, new Color[] {new Color(176, 176, 176, 255),new Color(117, 117, 117, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 0.86006098985672f, 0.0f, 3.2537600994110107f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(20.506096, 23.251263);
((GeneralPath)shape).curveTo(20.506474, 23.94619, 20.060118, 24.588463, 19.335257, 24.936018);
((GeneralPath)shape).curveTo(18.610394, 25.283573, 17.717216, 25.283573, 16.992353, 24.936018);
((GeneralPath)shape).curveTo(16.267492, 24.588463, 15.821136, 23.94619, 15.821514, 23.251263);
((GeneralPath)shape).curveTo(15.821136, 22.556335, 16.267492, 21.914062, 16.992353, 21.566507);
((GeneralPath)shape).curveTo(17.717216, 21.218952, 18.610394, 21.218952, 19.335257, 21.566507);
((GeneralPath)shape).curveTo(20.060118, 21.914062, 20.506474, 22.556335, 20.506096, 23.251263);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
paint = new Color(148, 148, 148, 255);
stroke = new BasicStroke(1.0f,0,0,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(20.506096, 23.251263);
((GeneralPath)shape).curveTo(20.506474, 23.94619, 20.060118, 24.588463, 19.335257, 24.936018);
((GeneralPath)shape).curveTo(18.610394, 25.283573, 17.717216, 25.283573, 16.992353, 24.936018);
((GeneralPath)shape).curveTo(16.267492, 24.588463, 15.821136, 23.94619, 15.821514, 23.251263);
((GeneralPath)shape).curveTo(15.821136, 22.556335, 16.267492, 21.914062, 16.992353, 21.566507);
((GeneralPath)shape).curveTo(17.717216, 21.218952, 18.610394, 21.218952, 19.335257, 21.566507);
((GeneralPath)shape).curveTo(20.060118, 21.914062, 20.506474, 22.556335, 20.506096, 23.251263);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_1_5);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_1_6 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_1_6
paint = new RadialGradientPaint(new Point2D.Double(12.910969734191895, 13.001997947692871), 7.488951f, new Point2D.Double(12.910969734191895, 13.001997947692871), new float[] {0.0f,1.0f}, new Color[] {new Color(240, 240, 240, 255),new Color(201, 201, 201, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.8027249574661255f, 2.307501924799594E-23f, -2.6369310276807938E-23f, 1.5033420324325562f, -12.485250473022461f, -2.6591429710388184f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(14.937632, 23.251265);
((GeneralPath)shape).lineTo(9.899495, 27.051964);
((GeneralPath)shape).curveTo(9.899495, 27.051964, 8.04334, 21.485075, 8.04334, 19.008623);
((GeneralPath)shape).curveTo(8.043341, 16.53375, 9.369165, 15.561479, 10.78338, 15.561479);
((GeneralPath)shape).curveTo(10.78338, 15.561479, 19.180273, 15.561479, 19.180273, 15.561479);
((GeneralPath)shape).curveTo(20.13685, 15.561479, 21.809826, 15.959226, 22.0087, 18.831848);
((GeneralPath)shape).curveTo(22.207575, 21.70447, 19.975767, 27.051964, 19.975767, 27.051964);
((GeneralPath)shape).lineTo(14.937632, 23.251265);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
paint = new Color(148, 148, 148, 255);
stroke = new BasicStroke(1.0f,0,0,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(14.937632, 23.251265);
((GeneralPath)shape).lineTo(9.899495, 27.051964);
((GeneralPath)shape).curveTo(9.899495, 27.051964, 8.04334, 21.485075, 8.04334, 19.008623);
((GeneralPath)shape).curveTo(8.043341, 16.53375, 9.369165, 15.561479, 10.78338, 15.561479);
((GeneralPath)shape).curveTo(10.78338, 15.561479, 19.180273, 15.561479, 19.180273, 15.561479);
((GeneralPath)shape).curveTo(20.13685, 15.561479, 21.809826, 15.959226, 22.0087, 18.831848);
((GeneralPath)shape).curveTo(22.207575, 21.70447, 19.975767, 27.051964, 19.975767, 27.051964);
((GeneralPath)shape).lineTo(14.937632, 23.251265);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_1_6);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_1_7 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_1_7
paint = new Color(255, 255, 255, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(11.795503, 17.94796);
((GeneralPath)shape).curveTo(11.795503, 17.94796, 9.979857, 18.435938, 10.300266, 19.607082);
((GeneralPath)shape).curveTo(10.620674, 20.778229, 13.077134, 22.632542, 13.077134, 22.632542);
((GeneralPath)shape).lineTo(17.669645, 22.632542);
((GeneralPath)shape).curveTo(17.669645, 22.632542, 19.778996, 21.071014, 20.019302, 19.89987);
((GeneralPath)shape).curveTo(20.259607, 18.728724, 18.630869, 17.94796, 18.630869, 17.94796);
((GeneralPath)shape).lineTo(11.795503, 17.94796);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_1_7);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_1_8 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_1_8
paint = new RadialGradientPaint(new Point2D.Double(17.09746742248535, 19.777185440063477), 4.5473714f, new Point2D.Double(17.09746742248535, 19.777185440063477), new float[] {0.0f,1.0f}, new Color[] {new Color(139, 139, 139, 255),new Color(169, 169, 169, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.2083330154418945f, 0.0f, 0.0f, 0.6364930272102356f, -5.683291912078857f, 8.681835174560547f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(11.618727, 16.975693);
((GeneralPath)shape).curveTo(11.618727, 16.975693, 9.8030815, 17.46367, 10.12349, 18.634815);
((GeneralPath)shape).curveTo(10.443897, 19.805962, 12.900358, 21.660275, 12.900358, 21.660275);
((GeneralPath)shape).lineTo(17.492868, 21.660275);
((GeneralPath)shape).curveTo(17.492868, 21.660275, 19.602219, 20.098747, 19.842525, 18.927603);
((GeneralPath)shape).curveTo(20.082832, 17.756456, 18.454092, 16.975693, 18.454092, 16.975693);
((GeneralPath)shape).lineTo(11.618727, 16.975693);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_1_8);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_1_9 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_1_9
paint = new LinearGradientPaint(new Point2D.Double(14.883313179016113, 27.847455978393555), new Point2D.Double(13.400960922241211, 20.06928062438965), new float[] {0.0f,1.0f}, new Color[] {new Color(214, 214, 214, 255),new Color(240, 240, 240, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, -2.121319055557251f, 3.005204916000366f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(13.086385, 18.12474);
((GeneralPath)shape).lineTo(16.78888, 18.12474);
((GeneralPath)shape).curveTo(21.075336, 18.12474, 26.33599, 19.442257, 26.33599, 19.980894);
((GeneralPath)shape).lineTo(26.33599, 42.60831);
((GeneralPath)shape).curveTo(26.33599, 43.14695, 25.899113, 43.58058, 25.356443, 43.58058);
((GeneralPath)shape).lineTo(4.5188212, 43.58058);
((GeneralPath)shape).curveTo(3.9761531, 43.58058, 3.5392747, 43.14695, 3.5392747, 42.60831);
((GeneralPath)shape).lineTo(3.5392747, 19.980894);
((GeneralPath)shape).curveTo(3.5392747, 19.442257, 8.710954, 18.12474, 13.086385, 18.12474);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
paint = new Color(148, 148, 148, 255);
stroke = new BasicStroke(1.0000001f,0,0,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(13.086385, 18.12474);
((GeneralPath)shape).lineTo(16.78888, 18.12474);
((GeneralPath)shape).curveTo(21.075336, 18.12474, 26.33599, 19.442257, 26.33599, 19.980894);
((GeneralPath)shape).lineTo(26.33599, 42.60831);
((GeneralPath)shape).curveTo(26.33599, 43.14695, 25.899113, 43.58058, 25.356443, 43.58058);
((GeneralPath)shape).lineTo(4.5188212, 43.58058);
((GeneralPath)shape).curveTo(3.9761531, 43.58058, 3.5392747, 43.14695, 3.5392747, 42.60831);
((GeneralPath)shape).lineTo(3.5392747, 19.980894);
((GeneralPath)shape).curveTo(3.5392747, 19.442257, 8.710954, 18.12474, 13.086385, 18.12474);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_1_9);
g.setComposite(AlphaComposite.getInstance(3, 0.61988306f * origAlpha));
AffineTransform defaultTransform__0_1_10 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_1_10
paint = new Color(255, 255, 255, 255);
stroke = new BasicStroke(1.0f,0,1,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(13.243834, 18.986252);
((GeneralPath)shape).lineTo(16.631443, 18.986252);
((GeneralPath)shape).curveTo(20.55335, 18.986252, 25.3666, 20.507769, 25.3666, 20.507769);
((GeneralPath)shape).lineTo(25.3666, 42.57729);
((GeneralPath)shape).curveTo(25.3666, 42.57729, 4.508677, 42.57729, 4.508677, 42.57729);
((GeneralPath)shape).lineTo(4.508677, 20.507769);
((GeneralPath)shape).curveTo(4.508677, 20.507769, 9.2405205, 18.986252, 13.243834, 18.986252);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_1_10);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_1_11 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_1_11
paint = new LinearGradientPaint(new Point2D.Double(15.335378646850586, 28.37778663635254), new Point2D.Double(15.335378646850586, 34.3881950378418), new float[] {0.0f,1.0f}, new Color[] {new Color(85, 87, 83, 255),new Color(124, 127, 121, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(15.291184, 23.42804);
((GeneralPath)shape).curveTo(15.291184, 23.42804, 12.285981, 27.845821, 12.285981, 30.233944);
((GeneralPath)shape).lineTo(12.285981, 42.519924);
((GeneralPath)shape).lineTo(15.467961, 45.34835);
((GeneralPath)shape).lineTo(18.384777, 42.519924);
((GeneralPath)shape).lineTo(18.384777, 30.057167);
((GeneralPath)shape).curveTo(18.384777, 28.057167, 15.291184, 23.42804, 15.291184, 23.42804);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
paint = new Color(46, 52, 54, 255);
stroke = new BasicStroke(1.0f,0,0,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(15.291184, 23.42804);
((GeneralPath)shape).curveTo(15.291184, 23.42804, 12.285981, 27.845821, 12.285981, 30.233944);
((GeneralPath)shape).lineTo(12.285981, 42.519924);
((GeneralPath)shape).lineTo(15.467961, 45.34835);
((GeneralPath)shape).lineTo(18.384777, 42.519924);
((GeneralPath)shape).lineTo(18.384777, 30.057167);
((GeneralPath)shape).curveTo(18.384777, 28.057167, 15.291184, 23.42804, 15.291184, 23.42804);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_1_11);
g.setComposite(AlphaComposite.getInstance(3, 0.46783626f * origAlpha));
AffineTransform defaultTransform__0_1_12 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_1_12
paint = new LinearGradientPaint(new Point2D.Double(17.456695556640625, 37.66166687011719), new Point2D.Double(17.456695556640625, 27.231843948364258), new float[] {0.0f,1.0f}, new Color[] {new Color(255, 255, 255, 255),new Color(255, 255, 255, 0)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, -2.121319055557251f, 3.005204916000366f));
stroke = new BasicStroke(0.99999976f,0,0,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(15.303288, 26.430305);
((GeneralPath)shape).lineTo(13.298065, 30.841566);
((GeneralPath)shape).lineTo(13.298065, 41.889637);
((GeneralPath)shape).lineTo(15.431641, 43.943283);
((GeneralPath)shape).lineTo(17.372688, 41.889637);
((GeneralPath)shape).lineTo(17.372688, 30.713213);
((GeneralPath)shape).lineTo(15.303288, 26.430305);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_1_12);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_1_13 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, -3.0052080154418945f, 1.7677680253982544f));
// _0_1_13
paint = new RadialGradientPaint(new Point2D.Double(18.16380500793457, 22.22356414794922), 2.842291f, new Point2D.Double(18.16380500793457, 22.22356414794922), new float[] {0.0f,1.0f}, new Color[] {new Color(128, 131, 125, 255),new Color(76, 77, 74, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 0.86006098985672f, 0.0f, 3.2537600994110107f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(20.506096, 23.251263);
((GeneralPath)shape).curveTo(20.506474, 23.94619, 20.060118, 24.588463, 19.335257, 24.936018);
((GeneralPath)shape).curveTo(18.610394, 25.283573, 17.717216, 25.283573, 16.992353, 24.936018);
((GeneralPath)shape).curveTo(16.267492, 24.588463, 15.821136, 23.94619, 15.821514, 23.251263);
((GeneralPath)shape).curveTo(15.821136, 22.556335, 16.267492, 21.914062, 16.992353, 21.566507);
((GeneralPath)shape).curveTo(17.717216, 21.218952, 18.610394, 21.218952, 19.335257, 21.566507);
((GeneralPath)shape).curveTo(20.060118, 21.914062, 20.506474, 22.556335, 20.506096, 23.251263);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
paint = new Color(46, 52, 54, 255);
stroke = new BasicStroke(1.0f,0,0,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(20.506096, 23.251263);
((GeneralPath)shape).curveTo(20.506474, 23.94619, 20.060118, 24.588463, 19.335257, 24.936018);
((GeneralPath)shape).curveTo(18.610394, 25.283573, 17.717216, 25.283573, 16.992353, 24.936018);
((GeneralPath)shape).curveTo(16.267492, 24.588463, 15.821136, 23.94619, 15.821514, 23.251263);
((GeneralPath)shape).curveTo(15.821136, 22.556335, 16.267492, 21.914062, 16.992353, 21.566507);
((GeneralPath)shape).curveTo(17.717216, 21.218952, 18.610394, 21.218952, 19.335257, 21.566507);
((GeneralPath)shape).curveTo(20.060118, 21.914062, 20.506474, 22.556335, 20.506096, 23.251263);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_1_13);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_1_14 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_1_14
paint = new RadialGradientPaint(new Point2D.Double(12.910969734191895, 13.001997947692871), 7.488951f, new Point2D.Double(12.910969734191895, 13.001997947692871), new float[] {0.0f,1.0f}, new Color[] {new Color(240, 240, 240, 255),new Color(201, 201, 201, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.8027249574661255f, 2.307501924799594E-23f, -2.6369310276807938E-23f, 1.5033420324325562f, -12.485250473022461f, -2.6591429710388184f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(14.937632, 23.251265);
((GeneralPath)shape).lineTo(9.899495, 27.051964);
((GeneralPath)shape).curveTo(9.899495, 27.051964, 8.04334, 21.485075, 8.04334, 19.008623);
((GeneralPath)shape).curveTo(8.043341, 16.53375, 9.369165, 15.561479, 10.78338, 15.561479);
((GeneralPath)shape).curveTo(10.78338, 15.561479, 19.180273, 15.561479, 19.180273, 15.561479);
((GeneralPath)shape).curveTo(20.13685, 15.561479, 21.809826, 15.959226, 22.0087, 18.831848);
((GeneralPath)shape).curveTo(22.207575, 21.70447, 19.975767, 27.051964, 19.975767, 27.051964);
((GeneralPath)shape).lineTo(14.937632, 23.251265);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
paint = new Color(148, 148, 148, 255);
stroke = new BasicStroke(1.0f,0,0,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(14.937632, 23.251265);
((GeneralPath)shape).lineTo(9.899495, 27.051964);
((GeneralPath)shape).curveTo(9.899495, 27.051964, 8.04334, 21.485075, 8.04334, 19.008623);
((GeneralPath)shape).curveTo(8.043341, 16.53375, 9.369165, 15.561479, 10.78338, 15.561479);
((GeneralPath)shape).curveTo(10.78338, 15.561479, 19.180273, 15.561479, 19.180273, 15.561479);
((GeneralPath)shape).curveTo(20.13685, 15.561479, 21.809826, 15.959226, 22.0087, 18.831848);
((GeneralPath)shape).curveTo(22.207575, 21.70447, 19.975767, 27.051964, 19.975767, 27.051964);
((GeneralPath)shape).lineTo(14.937632, 23.251265);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_1_14);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_1_15 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_1_15
paint = new Color(255, 255, 255, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(11.795503, 17.94796);
((GeneralPath)shape).curveTo(11.795503, 17.94796, 9.979857, 18.435938, 10.300266, 19.607082);
((GeneralPath)shape).curveTo(10.620674, 20.778229, 12.007307, 22.632542, 13.077134, 22.632542);
((GeneralPath)shape).lineTo(17.669645, 22.632542);
((GeneralPath)shape).curveTo(18.546875, 22.632542, 19.778996, 21.071014, 20.019302, 19.89987);
((GeneralPath)shape).curveTo(20.259607, 18.728724, 18.630869, 17.94796, 18.630869, 17.94796);
((GeneralPath)shape).lineTo(11.795503, 17.94796);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_1_15);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_1_16 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_1_16
paint = new RadialGradientPaint(new Point2D.Double(17.09746742248535, 19.777185440063477), 4.5473714f, new Point2D.Double(17.09746742248535, 19.777185440063477), new float[] {0.0f,1.0f}, new Color[] {new Color(139, 139, 139, 255),new Color(169, 169, 169, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.2083330154418945f, 0.0f, 0.0f, 0.6364930272102356f, -5.683291912078857f, 8.681835174560547f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(11.618727, 16.975693);
((GeneralPath)shape).curveTo(11.618727, 16.975693, 9.8030815, 17.46367, 10.12349, 18.634815);
((GeneralPath)shape).curveTo(10.443897, 19.805962, 11.775358, 21.660275, 12.900358, 21.660275);
((GeneralPath)shape).lineTo(17.492868, 21.660275);
((GeneralPath)shape).curveTo(18.242868, 21.660275, 19.602219, 20.098747, 19.842525, 18.927603);
((GeneralPath)shape).curveTo(20.082832, 17.756456, 18.454092, 16.975693, 18.454092, 16.975693);
((GeneralPath)shape).lineTo(11.618727, 16.975693);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_1_16);
g.setComposite(AlphaComposite.getInstance(3, 0.61988306f * origAlpha));
AffineTransform defaultTransform__0_1_17 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_1_17
paint = new Color(255, 255, 255, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(14.937632, 22.720934);
((GeneralPath)shape).lineTo(19.622215, 26.256468);
((GeneralPath)shape).lineTo(20.859652, 22.809322);
((GeneralPath)shape).lineTo(19.35705, 25.284197);
((GeneralPath)shape).lineTo(14.937632, 22.720934);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_1_17);
g.setComposite(AlphaComposite.getInstance(3, 0.61988306f * origAlpha));
AffineTransform defaultTransform__0_1_18 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_1_18
paint = new Color(255, 255, 255, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(14.584078, 22.89771);
((GeneralPath)shape).lineTo(10.164659, 26.256468);
((GeneralPath)shape).lineTo(8.662058, 19.627342);
((GeneralPath)shape).lineTo(10.69499, 25.019032);
((GeneralPath)shape).lineTo(14.584078, 22.89771);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_1_18);
g.setTransform(defaultTransform__0_1);
g.setTransform(defaultTransform__0);
g.setTransform(defaultTransform_);

	}

	/**
	 * Returns the width of the bounding box of the original SVG image.
	 * 
	 * @return The width of the bounding box of the original SVG image.
	 */
	public static int getOrigWidth() {
		return 48;
	}

	/**
	 * Returns the height of the bounding box of the original SVG image.
	 * 
	 * @return The height of the bounding box of the original SVG image.
	 */
	public static int getOrigHeight() {
		return 45;
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
	public preferences_desktop_theme() {
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

