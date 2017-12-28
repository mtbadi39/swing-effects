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
import java.awt.geom.RoundRectangle2D;

/**
 * This class has been automatically generated using <a
 * href="https://flamingo.dev.java.net">Flamingo SVG transcoder</a>.
 */
public class document_save_as implements
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
g.transform(new AffineTransform(0.024114049971103668f, 0.0f, 0.0f, 0.019292019307613373f, 45.48952865600586f, 41.752281188964844f));
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
paint = new Color(83, 83, 83, 255);
stroke = new BasicStroke(2.0f,1,1,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(11.28569, 13.087628);
((GeneralPath)shape).curveTo(10.66069, 13.087628, 10.254441, 13.377808, 10.004442, 13.931381);
((GeneralPath)shape).curveTo(10.004441, 13.931381, 3.5356915, 31.034939, 3.5356915, 31.034939);
((GeneralPath)shape).curveTo(3.5356915, 31.034939, 3.2856915, 31.706497, 3.2856915, 32.81619);
((GeneralPath)shape).curveTo(3.2856915, 32.81619, 3.2856915, 42.466156, 3.2856915, 42.466156);
((GeneralPath)shape).curveTo(3.2856915, 43.54877, 3.943477, 44.09116, 4.9419417, 44.091156);
((GeneralPath)shape).lineTo(43.50444, 44.091156);
((GeneralPath)shape).curveTo(44.489292, 44.091156, 45.09819, 43.372974, 45.09819, 42.247406);
((GeneralPath)shape).lineTo(45.09819, 32.59744);
((GeneralPath)shape).curveTo(45.09819, 32.59744, 45.20415, 31.827015, 45.00444, 31.284939);
((GeneralPath)shape).lineTo(38.28569, 14.087631);
((GeneralPath)shape).curveTo(38.101166, 13.575725, 37.648785, 13.099533, 37.16069, 13.087628);
((GeneralPath)shape).lineTo(11.28569, 13.087628);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_1);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_2 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_2
paint = new LinearGradientPaint(new Point2D.Double(7.604620456695557, 28.481176376342773), new Point2D.Double(36.183067321777344, 40.94393539428711), new float[] {0.0f,1.0f}, new Color[] {new Color(187, 187, 187, 255),new Color(159, 159, 159, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 5.125f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(3.2735915, 32.12181);
((GeneralPath)shape).lineTo(4.0381937, 31.429598);
((GeneralPath)shape).lineTo(41.647884, 31.492098);
((GeneralPath)shape).lineTo(45.11029, 31.809395);
((GeneralPath)shape).lineTo(45.11029, 42.24793);
((GeneralPath)shape).curveTo(45.11029, 43.373497, 44.503273, 44.09126, 43.518417, 44.09126);
((GeneralPath)shape).lineTo(4.9354315, 44.09126);
((GeneralPath)shape).curveTo(3.9369667, 44.09126, 3.2735915, 43.549206, 3.2735915, 42.466595);
((GeneralPath)shape).lineTo(3.2735915, 32.12181);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_2);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_3 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_3
paint = new RadialGradientPaint(new Point2D.Double(15.571491241455078, 2.9585189819335938), 20.935818f, new Point2D.Double(15.571491241455078, 2.9585189819335938), new float[] {0.0f,1.0f}, new Color[] {new Color(228, 228, 228, 255),new Color(211, 211, 211, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.2862420082092285f, 0.7816979885101318f, -0.710781991481781f, 1.169551968574524f, -2.3543479442596436f, 0.24814000725746155f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(3.5490842, 31.039404);
((GeneralPath)shape).curveTo(2.8347986, 32.50369, 3.5484686, 33.432262, 4.5847983, 33.432262);
((GeneralPath)shape).curveTo(4.5847983, 33.432262, 43.584797, 33.432262, 43.584797, 33.432262);
((GeneralPath)shape).curveTo(44.703842, 33.40845, 45.430035, 32.420357, 45.013367, 31.289404);
((GeneralPath)shape).lineTo(38.299084, 14.078704);
((GeneralPath)shape).curveTo(38.11456, 13.566798, 37.64432, 13.090606, 37.156223, 13.078701);
((GeneralPath)shape).lineTo(11.299083, 13.078701);
((GeneralPath)shape).curveTo(10.674083, 13.078701, 10.263369, 13.382274, 10.01337, 13.935847);
((GeneralPath)shape).curveTo(10.01337, 13.935847, 3.5490842, 31.039404, 3.5490842, 31.039404);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_3);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_4 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_4
paint = new LinearGradientPaint(new Point2D.Double(7.0625, 35.28125), new Point2D.Double(24.6875, 35.28125), new float[] {0.0f,1.0f}, new Color[] {new Color(131, 131, 131, 255),new Color(187, 187, 187, 0)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.7954930067062378f, 3.799180030822754f));
shape = new Rectangle2D.Double(7.857995986938477, 36.2991828918457, 17.625, 5.5625);
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_4);
g.setComposite(AlphaComposite.getInstance(3, 0.81142855f * origAlpha));
AffineTransform defaultTransform__0_0_5 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_5
paint = new LinearGradientPaint(new Point2D.Double(12.277412414550781, 37.205810546875), new Point2D.Double(12.221822738647461, 33.7586669921875), new float[] {0.0f,1.0f}, new Color[] {new Color(238, 238, 238, 255),new Color(238, 238, 238, 0)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 5.125f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(7.857995, 41.86168);
((GeneralPath)shape).curveTo(7.857995, 41.86168, 7.857995, 37.850197, 7.857995, 37.850197);
((GeneralPath)shape).curveTo(9.693522, 41.029423, 16.154486, 41.86168, 20.795492, 41.86168);
((GeneralPath)shape).curveTo(20.795492, 41.86168, 7.857995, 41.86168, 7.857995, 41.86168);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_5);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_6 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_6
paint = new Color(255, 255, 255, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(44.79616, 30.753689);
((GeneralPath)shape).curveTo(44.859684, 32.003662, 44.38216, 33.069527, 43.474045, 33.09744);
((GeneralPath)shape).curveTo(43.474045, 33.09744, 5.3553295, 33.09744, 5.3553295, 33.09744);
((GeneralPath)shape).curveTo(4.0660977, 33.09744, 3.4875937, 32.77249, 3.271279, 32.22938);
((GeneralPath)shape).curveTo(3.3630404, 33.173714, 4.0970964, 33.87869, 5.3553295, 33.87869);
((GeneralPath)shape).curveTo(5.3553295, 33.87869, 43.474045, 33.87869, 43.474045, 33.87869);
((GeneralPath)shape).curveTo(44.550053, 33.845615, 45.226852, 32.454662, 44.82621, 30.883898);
((GeneralPath)shape).lineTo(44.79616, 30.753689);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_6);
g.setComposite(AlphaComposite.getInstance(3, 0.69142854f * origAlpha));
AffineTransform defaultTransform__0_0_7 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_7
paint = new LinearGradientPaint(new Point2D.Double(23.688077926635742, 11.318835258483887), new Point2D.Double(23.688077926635742, 26.3571834564209), new float[] {0.0f,1.0f}, new Color[] {new Color(255, 255, 255, 65),new Color(255, 255, 255, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 5.125f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(10.96875, 15.28125);
((GeneralPath)shape).curveTo(10.922675, 15.481571, 10.78125, 15.668047, 10.78125, 15.875);
((GeneralPath)shape).curveTo(10.78125, 16.823605, 11.37223, 17.664474, 12.125, 18.46875);
((GeneralPath)shape).curveTo(12.365268, 18.314674, 12.490117, 18.114342, 12.75, 17.96875);
((GeneralPath)shape).curveTo(11.809691, 17.152746, 11.196604, 16.252169, 10.96875, 15.28125);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(37.625, 15.28125);
((GeneralPath)shape).curveTo(37.396275, 16.250866, 36.78299, 17.153675, 35.84375, 17.96875);
((GeneralPath)shape).curveTo(36.117893, 18.122332, 36.247738, 18.33699, 36.5, 18.5);
((GeneralPath)shape).curveTo(37.257263, 17.693344, 37.8125, 16.826956, 37.8125, 15.875);
((GeneralPath)shape).curveTo(37.8125, 15.668047, 37.670906, 15.481571, 37.625, 15.28125);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(39.8125, 23.71875);
((GeneralPath)shape).curveTo(39.198708, 27.758862, 32.513885, 30.96875, 24.28125, 30.96875);
((GeneralPath)shape).curveTo(16.068996, 30.968752, 9.421101, 27.775965, 8.78125, 23.75);
((GeneralPath)shape).curveTo(8.748893, 23.947132, 8.65625, 24.141882, 8.65625, 24.34375);
((GeneralPath)shape).curveTo(8.65625, 28.661697, 15.645354, 32.1875, 24.28125, 32.1875);
((GeneralPath)shape).curveTo(32.917145, 32.1875, 39.9375, 28.661697, 39.9375, 24.34375);
((GeneralPath)shape).curveTo(39.9375, 24.130827, 39.84845, 23.926394, 39.8125, 23.71875);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_7);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_8 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.08838842809200287f, 5.3017802238464355f));
// _0_0_8
paint = new Color(255, 255, 255, 117);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(8.57367, 25.593554);
((GeneralPath)shape).curveTo(8.57367, 26.154932, 7.960292, 26.61002, 7.2036505, 26.61002);
((GeneralPath)shape).curveTo(6.4470096, 26.61002, 5.833631, 26.154932, 5.833631, 25.593554);
((GeneralPath)shape).curveTo(5.833631, 25.032175, 6.4470096, 24.577087, 7.2036505, 24.577087);
((GeneralPath)shape).curveTo(7.960292, 24.577087, 8.57367, 25.032175, 8.57367, 25.593554);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_8);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_9 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 33.96704864501953f, 5.213389873504639f));
// _0_0_9
paint = new Color(255, 255, 255, 117);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(8.57367, 25.593554);
((GeneralPath)shape).curveTo(8.57367, 26.154932, 7.960292, 26.61002, 7.2036505, 26.61002);
((GeneralPath)shape).curveTo(6.4470096, 26.61002, 5.833631, 26.154932, 5.833631, 25.593554);
((GeneralPath)shape).curveTo(5.833631, 25.032175, 6.4470096, 24.577087, 7.2036505, 24.577087);
((GeneralPath)shape).curveTo(7.960292, 24.577087, 8.57367, 25.032175, 8.57367, 25.593554);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_9);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_10 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_10
paint = new LinearGradientPaint(new Point2D.Double(12.37835693359375, 4.433135986328125), new Point2D.Double(44.096099853515625, 47.620635986328125), new float[] {0.0f,1.0f}, new Color[] {new Color(255, 255, 255, 255),new Color(255, 255, 255, 0)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 5.125f));
stroke = new BasicStroke(1.0000002f,1,1,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(11.642515, 13.540723);
((GeneralPath)shape).curveTo(11.040823, 13.540723, 10.649724, 13.820081, 10.409049, 14.35301);
((GeneralPath)shape).curveTo(10.409048, 14.35301, 3.994034, 30.943731, 3.994034, 30.943731);
((GeneralPath)shape).curveTo(3.994034, 30.943731, 3.7533574, 31.590246, 3.7533574, 32.658554);
((GeneralPath)shape).curveTo(3.7533574, 32.658554, 3.7533574, 41.94865, 3.7533574, 41.94865);
((GeneralPath)shape).curveTo(3.7533574, 43.30339, 4.1974134, 43.57555, 5.3478413, 43.57555);
((GeneralPath)shape).lineTo(43.034744, 43.57555);
((GeneralPath)shape).curveTo(44.357872, 43.57555, 44.56906, 43.25915, 44.56906, 41.738056);
((GeneralPath)shape).lineTo(44.56906, 32.447964);
((GeneralPath)shape).curveTo(44.56906, 32.447964, 44.67107, 31.70627, 44.478806, 31.184408);
((GeneralPath)shape).lineTo(37.885616, 14.378434);
((GeneralPath)shape).curveTo(37.707973, 13.885617, 37.334965, 13.552184, 36.86507, 13.540723);
((GeneralPath)shape).lineTo(11.642515, 13.540723);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_10);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_11 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_11
paint = new Color(255, 255, 255, 108);
stroke = new BasicStroke(1.0000005f,2,0,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(40.5, 36.554165);
((GeneralPath)shape).lineTo(40.5, 41.5751);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_11);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_12 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_12
paint = new Color(255, 255, 255, 108);
stroke = new BasicStroke(1.0000005f,2,0,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(38.5, 36.61394);
((GeneralPath)shape).lineTo(38.5, 41.634876);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_12);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_13 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_13
paint = new Color(255, 255, 255, 108);
stroke = new BasicStroke(1.0000005f,2,0,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(36.5, 36.61394);
((GeneralPath)shape).lineTo(36.5, 41.634876);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_13);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_14 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_14
paint = new Color(255, 255, 255, 108);
stroke = new BasicStroke(1.0000005f,2,0,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(34.5, 36.61394);
((GeneralPath)shape).lineTo(34.5, 41.634876);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_14);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_15 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_15
paint = new Color(255, 255, 255, 108);
stroke = new BasicStroke(1.0000005f,2,0,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(32.5, 36.61394);
((GeneralPath)shape).lineTo(32.5, 41.634876);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_15);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_16 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_16
paint = new Color(255, 255, 255, 108);
stroke = new BasicStroke(1.0000005f,2,0,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(30.5, 36.61394);
((GeneralPath)shape).lineTo(30.5, 41.634876);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_16);
g.setComposite(AlphaComposite.getInstance(3, 0.09714284f * origAlpha));
AffineTransform defaultTransform__0_0_17 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_17
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(1.0000005f,2,0,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(39.5, 36.604065);
((GeneralPath)shape).lineTo(39.5, 41.625);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_17);
g.setComposite(AlphaComposite.getInstance(3, 0.09714284f * origAlpha));
AffineTransform defaultTransform__0_0_18 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_18
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(1.0000005f,2,0,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(37.5, 36.66384);
((GeneralPath)shape).lineTo(37.5, 41.684776);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_18);
g.setComposite(AlphaComposite.getInstance(3, 0.09714284f * origAlpha));
AffineTransform defaultTransform__0_0_19 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_19
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(1.0000005f,2,0,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(35.5, 36.66384);
((GeneralPath)shape).lineTo(35.5, 41.684776);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_19);
g.setComposite(AlphaComposite.getInstance(3, 0.09714284f * origAlpha));
AffineTransform defaultTransform__0_0_20 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_20
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(1.0000005f,2,0,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(33.5, 36.66384);
((GeneralPath)shape).lineTo(33.5, 41.684776);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_20);
g.setComposite(AlphaComposite.getInstance(3, 0.09714284f * origAlpha));
AffineTransform defaultTransform__0_0_21 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_21
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(1.0000005f,2,0,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(31.5, 36.66384);
((GeneralPath)shape).lineTo(31.5, 41.684776);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_21);
g.setComposite(AlphaComposite.getInstance(3, 0.44f * origAlpha));
AffineTransform defaultTransform__0_0_22 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_22
paint = new Color(255, 255, 255, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(7.875, 36.3125);
((GeneralPath)shape).lineTo(7.875, 41.84375);
((GeneralPath)shape).lineTo(20.4375, 41.84375);
((GeneralPath)shape).lineTo(8.21875, 41.5);
((GeneralPath)shape).lineTo(7.875, 36.3125);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_22);
g.setComposite(AlphaComposite.getInstance(3, 0.20571427f * origAlpha));
AffineTransform defaultTransform__0_0_23 = g.getTransform();
g.transform(new AffineTransform(1.037814974784851f, 0.0f, 0.0f, 1.0607470273971558f, -1.6328779458999634f, 3.030369997024536f));
// _0_0_23
paint = new LinearGradientPaint(new Point2D.Double(33.431175231933594, 31.96477699279785), new Point2D.Double(21.747974395751953, 11.780678749084473), new float[] {0.0f,0.5f,0.75f,0.84166664f,1.0f}, new Color[] {new Color(255, 255, 255, 255),new Color(230, 230, 230, 255),new Color(255, 255, 255, 255),new Color(225, 225, 225, 255),new Color(255, 255, 255, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(39.875, 19.5625);
((GeneralPath)shape).curveTo(39.875, 23.255905, 33.215237, 26.25, 25.0, 26.25);
((GeneralPath)shape).curveTo(16.784765, 26.25, 10.125, 23.255905, 10.125, 19.5625);
((GeneralPath)shape).curveTo(10.125, 15.869096, 16.784765, 12.875, 25.0, 12.875);
((GeneralPath)shape).curveTo(33.215237, 12.875, 39.875, 15.869096, 39.875, 19.5625);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_23);
g.setTransform(defaultTransform__0_0);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_1 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_1
g.setComposite(AlphaComposite.getInstance(3, 0.14117648f * origAlpha));
AffineTransform defaultTransform__0_1_0 = g.getTransform();
g.transform(new AffineTransform(1.1301900148391724f, 1.178179022145491E-16f, 7.91854375568848E-17f, -0.7596009969711304f, -3.9097249507904053f, 53.6655387878418f));
// _0_1_0
paint = new RadialGradientPaint(new Point2D.Double(24.837125778198242, 36.42112731933594), 15.644737f, new Point2D.Double(24.837125778198242, 36.42112731933594), new float[] {0.0f,1.0f}, new Color[] {new Color(0, 0, 0, 255),new Color(0, 0, 0, 0)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, -7.816466730460888E-32f, -1.1324090298499951E-32f, 0.5367230176925659f, -5.89796224012562E-14f, 16.87306022644043f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(40.48186, 36.421127);
((GeneralPath)shape).curveTo(40.483814, 39.421745, 37.50237, 42.19488, 32.66107, 43.69549);
((GeneralPath)shape).curveTo(27.81977, 45.196106, 21.854479, 45.196106, 17.01318, 43.69549);
((GeneralPath)shape).curveTo(12.17188, 42.19488, 9.190436, 39.421745, 9.192389, 36.421127);
((GeneralPath)shape).curveTo(9.190436, 33.42051, 12.17188, 30.647373, 17.01318, 29.14676);
((GeneralPath)shape).curveTo(21.854479, 27.646149, 27.81977, 27.646149, 32.66107, 29.14676);
((GeneralPath)shape).curveTo(37.50237, 30.647373, 40.483814, 33.42051, 40.48186, 36.421127);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_1_0);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_1_1 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_1_1
paint = new LinearGradientPaint(new Point2D.Double(14.751648902893066, 15.86843204498291), new Point2D.Double(8.895328521728516, 16.743431091308594), new float[] {0.0f,1.0f}, new Color[] {new Color(52, 101, 164, 255),new Color(52, 101, 164, 0)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(3.2034502, 25.835194);
((GeneralPath)shape).curveTo(2.1729476, -5.385337, 28.741615, -0.4511153, 28.582417, 15.788689);
((GeneralPath)shape).lineTo(35.89533, 15.788689);
((GeneralPath)shape).lineTo(24.517653, 28.774672);
((GeneralPath)shape).lineTo(12.585426, 15.788689);
((GeneralPath)shape).curveTo(12.585426, 15.788689, 20.12686, 15.788689, 20.12686, 15.788689);
((GeneralPath)shape).curveTo(20.583921, 4.8193226, 3.4092324, 1.6100346, 3.2034502, 25.835194);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
paint = new LinearGradientPaint(new Point2D.Double(12.25, 18.25), new Point2D.Double(7.0, 21.118431091308594), new float[] {0.0f,1.0f}, new Color[] {new Color(32, 74, 135, 255),new Color(32, 74, 135, 0)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
stroke = new BasicStroke(0.9999998f,0,0,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(3.2034502, 25.835194);
((GeneralPath)shape).curveTo(2.1729476, -5.385337, 28.741615, -0.4511153, 28.582417, 15.788689);
((GeneralPath)shape).lineTo(35.89533, 15.788689);
((GeneralPath)shape).lineTo(24.517653, 28.774672);
((GeneralPath)shape).lineTo(12.585426, 15.788689);
((GeneralPath)shape).curveTo(12.585426, 15.788689, 20.12686, 15.788689, 20.12686, 15.788689);
((GeneralPath)shape).curveTo(20.583921, 4.8193226, 3.4092324, 1.6100346, 3.2034502, 25.835194);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_1_1);
g.setComposite(AlphaComposite.getInstance(3, 0.4715909f * origAlpha));
AffineTransform defaultTransform__0_1_2 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_1_2
paint = new LinearGradientPaint(new Point2D.Double(33.059906005859375, 27.39411735534668), new Point2D.Double(12.624337196350098, 12.583768844604492), new float[] {0.0f,1.0f}, new Color[] {new Color(255, 255, 255, 255),new Color(255, 255, 255, 0)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(0.9141139984130859f, 1.412791001969375E-16f, -1.412791001969375E-16f, 0.9141139984130859f, -3.8686978816986084f, -2.706902027130127f));
stroke = new BasicStroke(0.99999934f,0,0,10.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(7.6642103, 9.104105);
((GeneralPath)shape).curveTo(12.40638, -0.0400306, 28.122335, 2.7175443, 27.761604, 16.579393);
((GeneralPath)shape).lineTo(34.078976, 16.579393);
((GeneralPath)shape).curveTo(34.078976, 16.579393, 24.513151, 27.53677, 24.513151, 27.53677);
((GeneralPath)shape).lineTo(14.41668, 16.579393);
((GeneralPath)shape).curveTo(14.41668, 16.579393, 20.87332, 16.579393, 20.87332, 16.579393);
((GeneralPath)shape).curveTo(21.144976, 5.0041614, 10.922265, 5.5345216, 7.6642103, 9.104105);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_1_2);
g.setComposite(AlphaComposite.getInstance(3, 0.49431816f * origAlpha));
AffineTransform defaultTransform__0_1_3 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_1_3
paint = new RadialGradientPaint(new Point2D.Double(23.44707679748535, 6.457674503326416), 19.0625f, new Point2D.Double(23.44707679748535, 6.457674503326416), new float[] {0.0f,1.0f}, new Color[] {new Color(255, 255, 255, 255),new Color(255, 255, 255, 0)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(-1.3144710063934326f, -0.010063120163977146f, -0.010229639708995819f, 1.3362209796905518f, 46.2210807800293f, -4.909886837005615f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(34.767155, 16.211613);
((GeneralPath)shape).lineTo(32.782978, 18.757322);
((GeneralPath)shape).curveTo(27.372948, 17.24103, 24.89683, 21.486664, 17.109283, 20.489113);
((GeneralPath)shape).lineTo(13.247998, 16.080076);
((GeneralPath)shape).lineTo(20.434467, 16.162863);
((GeneralPath)shape).curveTo(20.48322, 4.3164573, 8.34431, 4.998966, 5.0292664, 13.627829);
((GeneralPath)shape).curveTo(8.83722, -1.2611216, 27.893316, 0.8064118, 28.28332, 16.114113);
((GeneralPath)shape).lineTo(34.767155, 16.211613);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_1_3);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_1_4 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_1_4
paint = new LinearGradientPaint(new Point2D.Double(28.061466217041016, 31.43134880065918), new Point2D.Double(28.061466217041016, 36.43749237060547), new float[] {0.0f,1.0f}, new Color[] {new Color(221, 221, 221, 255),new Color(253, 253, 253, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
shape = new RoundRectangle2D.Double(4.563523769378662, 30.298381805419922, 39.24794387817383, 12.278223037719727, 3.2499992847442627, 3.2499992847442627);
g.setPaint(paint);
g.fill(shape);
paint = new Color(125, 125, 125, 255);
stroke = new BasicStroke(0.99999976f,1,0,4.0f,null,0.0f);
shape = new RoundRectangle2D.Double(4.563523769378662, 30.298381805419922, 39.24794387817383, 12.278223037719727, 3.2499992847442627, 3.2499992847442627);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_1_4);
g.setComposite(AlphaComposite.getInstance(3, 0.59659094f * origAlpha));
AffineTransform defaultTransform__0_1_5 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_1_5
paint = new Color(125, 125, 125, 255);
shape = new Rectangle2D.Double(7.0, 33.0, 16.0, 7.0);
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_1_5);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_1_6 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_1_6
paint = new Color(0, 0, 0, 255);
shape = new Rectangle2D.Double(24.0, 32.0, 1.0, 9.0);
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_1_6);
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
		return 48;
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
	public document_save_as() {
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

