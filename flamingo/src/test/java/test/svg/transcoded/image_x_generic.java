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
public class image_x_generic implements
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
g.transform(new AffineTransform(0.021751120686531067f, 0.0f, 0.0f, 0.024932630360126495f, 42.41048812866211f, 33.8111686706543f));
// _0_0
g.setComposite(AlphaComposite.getInstance(3, 0.40206185f * origAlpha));
AffineTransform defaultTransform__0_0_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_0
paint = new LinearGradientPaint(new Point2D.Double(302.8571472167969, 366.64788818359375), new Point2D.Double(302.8571472167969, 609.5050659179688), new float[] {0.0f,0.5f,1.0f}, new Color[] {new Color(0, 0, 0, 0),new Color(0, 0, 0, 255),new Color(0, 0, 0, 0)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(2.7743890285491943f, 0.0f, 0.0f, 1.9697060585021973f, -1892.178955078125f, -872.8853759765625f));
shape = new Rectangle2D.Double(-1559.2523193359375, -150.6968536376953, 1339.633544921875, 478.357177734375);
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_0);
g.setComposite(AlphaComposite.getInstance(3, 0.40206185f * origAlpha));
AffineTransform defaultTransform__0_0_1 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_1
paint = new RadialGradientPaint(new Point2D.Double(605.7142944335938, 486.64788818359375), 117.14286f, new Point2D.Double(605.7142944335938, 486.64788818359375), new float[] {0.0f,1.0f}, new Color[] {new Color(0, 0, 0, 255),new Color(0, 0, 0, 0)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(2.7743890285491943f, 0.0f, 0.0f, 1.9697060585021973f, -1891.633056640625f, -872.8853759765625f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(-219.61876, -150.68037);
((GeneralPath)shape).curveTo(-219.61876, -150.68037, -219.61876, 327.65042, -219.61876, 327.65042);
((GeneralPath)shape).curveTo(-76.74459, 328.55087, 125.78146, 220.48074, 125.78138, 88.45424);
((GeneralPath)shape).curveTo(125.78138, -43.572304, -33.655437, -150.68036, -219.61876, -150.68037);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_1);
g.setComposite(AlphaComposite.getInstance(3, 0.40206185f * origAlpha));
AffineTransform defaultTransform__0_0_2 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_2
paint = new RadialGradientPaint(new Point2D.Double(605.7142944335938, 486.64788818359375), 117.14286f, new Point2D.Double(605.7142944335938, 486.64788818359375), new float[] {0.0f,1.0f}, new Color[] {new Color(0, 0, 0, 255),new Color(0, 0, 0, 0)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(-2.7743890285491943f, 0.0f, 0.0f, 1.9697060585021973f, 112.76229858398438f, -872.8853759765625f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(-1559.2523, -150.68037);
((GeneralPath)shape).curveTo(-1559.2523, -150.68037, -1559.2523, 327.65042, -1559.2523, 327.65042);
((GeneralPath)shape).curveTo(-1702.1265, 328.55087, -1904.6525, 220.48074, -1904.6525, 88.45424);
((GeneralPath)shape).curveTo(-1904.6525, -43.572304, -1745.2157, -150.68036, -1559.2523, -150.68037);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_2);
g.setTransform(defaultTransform__0_0);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_1 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_1
paint = new LinearGradientPaint(new Point2D.Double(12.487299919128418, 3.7318999767303467), new Point2D.Double(31.081300735473633, 36.032798767089844), new float[] {0.0f,1.0f}, new Color[] {new Color(210, 210, 210, 255),new Color(237, 237, 237, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.4340029954910278f, 0.0f, 0.0f, 0.9900869727134705f, 52.32167053222656f, 2.8389179706573486f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(2.7177715, 6.454775);
((GeneralPath)shape).lineTo(43.379543, 6.454775);
((GeneralPath)shape).curveTo(44.002792, 6.454775, 44.504543, 6.956525, 44.504543, 7.5797744);
((GeneralPath)shape).lineTo(44.504543, 31.480581);
((GeneralPath)shape).curveTo(44.504543, 32.103832, 36.04784, 39.49987, 35.424595, 39.49987);
((GeneralPath)shape).lineTo(2.7177715, 39.49987);
((GeneralPath)shape).curveTo(2.094522, 39.49987, 1.5927727, 38.998123, 1.5927727, 38.37487);
((GeneralPath)shape).lineTo(1.5927727, 7.5797744);
((GeneralPath)shape).curveTo(1.5927727, 6.956525, 2.094522, 6.454775, 2.7177715, 6.454775);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
paint = new Color(187, 191, 187, 255);
stroke = new BasicStroke(0.99999994f,0,0,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(2.7177715, 6.454775);
((GeneralPath)shape).lineTo(43.379543, 6.454775);
((GeneralPath)shape).curveTo(44.002792, 6.454775, 44.504543, 6.956525, 44.504543, 7.5797744);
((GeneralPath)shape).lineTo(44.504543, 31.480581);
((GeneralPath)shape).curveTo(44.504543, 32.103832, 36.04784, 39.49987, 35.424595, 39.49987);
((GeneralPath)shape).lineTo(2.7177715, 39.49987);
((GeneralPath)shape).curveTo(2.094522, 39.49987, 1.5927727, 38.998123, 1.5927727, 38.37487);
((GeneralPath)shape).lineTo(1.5927727, 7.5797744);
((GeneralPath)shape).curveTo(1.5927727, 6.956525, 2.094522, 6.454775, 2.7177715, 6.454775);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_1);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_2 = g.getTransform();
g.transform(new AffineTransform(1.0547740459442139f, 0.0f, 0.0f, 1.0499889850616455f, -0.8146470189094543f, 4.485012054443359f));
// _0_2
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_2_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0
paint = new LinearGradientPaint(new Point2D.Double(21.932600021362305, 24.627399444580078), new Point2D.Double(21.932600021362305, 7.109099864959717), new float[] {0.0f,1.0f}, new Color[] {new Color(133, 149, 188, 255),new Color(4, 26, 59, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0989890098571777f, 0.0f, 0.0f, -0.7977570295333862f, -1.9538650512695312f, 37.32400131225586f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(5.512695, 30.0);
((GeneralPath)shape).lineTo(39.643234, 30.0);
((GeneralPath)shape).lineTo(39.643234, 19.627375);
((GeneralPath)shape).lineTo(5.512695, 19.627375);
((GeneralPath)shape).lineTo(5.512695, 30.0);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_2_0);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_2_1 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_1
paint = new LinearGradientPaint(new Point2D.Double(21.932600021362305, 24.627399444580078), new Point2D.Double(21.932600021362305, 7.109099864959717), new float[] {0.0f,1.0f}, new Color[] {new Color(208, 214, 229, 255),new Color(9, 58, 128, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0989890098571777f, 0.0f, 0.0f, 1.1066969633102417f, -1.9538650512695312f, -4.922452926635742f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(5.512695, 5.237844);
((GeneralPath)shape).lineTo(39.643234, 5.237844);
((GeneralPath)shape).lineTo(39.643234, 19.627375);
((GeneralPath)shape).lineTo(5.512695, 19.627375);
((GeneralPath)shape).lineTo(5.512695, 5.237844);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_2_1);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_2_2 = g.getTransform();
g.transform(new AffineTransform(1.1892169713974f, 0.0f, 0.0f, 1.1892169713974f, -3.525355100631714f, -6.535408020019531f));
// _0_2_2
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_2_2_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_2_0
g.setComposite(AlphaComposite.getInstance(3, 0.04999994f * origAlpha));
AffineTransform defaultTransform__0_2_2_0_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_2_0_0
paint = new Color(232, 245, 47, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(18.4, 15.4);
((GeneralPath)shape).curveTo(18.4, 17.6, 16.6, 19.5, 14.3, 19.5);
((GeneralPath)shape).curveTo(12.1, 19.5, 10.2, 17.7, 10.2, 15.4);
((GeneralPath)shape).curveTo(10.2, 13.2, 12.0, 11.3, 14.3, 11.3);
((GeneralPath)shape).curveTo(16.5, 11.3, 18.4, 13.1, 18.4, 15.4);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_2_2_0_0);
g.setComposite(AlphaComposite.getInstance(3, 0.20829993f * origAlpha));
AffineTransform defaultTransform__0_2_2_0_1 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_2_0_1
paint = new Color(236, 247, 81, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(18.0, 15.4);
((GeneralPath)shape).curveTo(18.0, 17.4, 16.4, 19.1, 14.3, 19.1);
((GeneralPath)shape).curveTo(12.3, 19.1, 10.6, 17.5, 10.6, 15.4);
((GeneralPath)shape).curveTo(10.6, 13.4, 12.2, 11.7, 14.3, 11.7);
((GeneralPath)shape).curveTo(16.3, 11.7, 18.0, 13.3, 18.0, 15.4);
((GeneralPath)shape).lineTo(18.0, 15.4);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_2_2_0_1);
g.setComposite(AlphaComposite.getInstance(3, 0.36669993f * origAlpha));
AffineTransform defaultTransform__0_2_2_0_2 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_2_0_2
paint = new Color(240, 249, 114, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(17.6, 15.4);
((GeneralPath)shape).curveTo(17.6, 17.2, 16.1, 18.7, 14.3, 18.7);
((GeneralPath)shape).curveTo(12.5, 18.7, 11.0, 17.2, 11.0, 15.4);
((GeneralPath)shape).curveTo(11.0, 13.6, 12.5, 12.1, 14.3, 12.1);
((GeneralPath)shape).curveTo(16.1, 12.1, 17.6, 13.6, 17.6, 15.4);
((GeneralPath)shape).lineTo(17.6, 15.4);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_2_2_0_2);
g.setComposite(AlphaComposite.getInstance(3, 0.525f * origAlpha));
AffineTransform defaultTransform__0_2_2_0_3 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_2_0_3
paint = new Color(244, 250, 149, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(17.2, 15.4);
((GeneralPath)shape).curveTo(17.2, 17.0, 15.9, 18.3, 14.3, 18.3);
((GeneralPath)shape).curveTo(12.7, 18.3, 11.4, 17.0, 11.4, 15.4);
((GeneralPath)shape).curveTo(11.4, 13.8, 12.7, 12.5, 14.3, 12.5);
((GeneralPath)shape).curveTo(15.9, 12.5, 17.2, 13.8, 17.2, 15.4);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_2_2_0_3);
g.setComposite(AlphaComposite.getInstance(3, 0.6833f * origAlpha));
AffineTransform defaultTransform__0_2_2_0_4 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_2_0_4
paint = new Color(247, 252, 183, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(16.8, 15.4);
((GeneralPath)shape).curveTo(16.8, 16.8, 15.7, 17.9, 14.3, 17.9);
((GeneralPath)shape).curveTo(12.9, 17.9, 11.8, 16.8, 11.8, 15.4);
((GeneralPath)shape).curveTo(11.8, 14.0, 12.9, 12.9, 14.3, 12.9);
((GeneralPath)shape).curveTo(15.7, 12.9, 16.8, 14.0, 16.8, 15.4);
((GeneralPath)shape).lineTo(16.8, 15.4);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_2_2_0_4);
g.setComposite(AlphaComposite.getInstance(3, 0.8417f * origAlpha));
AffineTransform defaultTransform__0_2_2_0_5 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_2_0_5
paint = new Color(251, 253, 219, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(16.4, 15.4);
((GeneralPath)shape).curveTo(16.4, 16.6, 15.4, 17.5, 14.3, 17.5);
((GeneralPath)shape).curveTo(13.2, 17.5, 12.2, 16.5, 12.2, 15.4);
((GeneralPath)shape).curveTo(12.2, 14.3, 13.2, 13.3, 14.3, 13.3);
((GeneralPath)shape).curveTo(15.4, 13.3, 16.4, 14.3, 16.4, 15.4);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_2_2_0_5);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_2_2_0_6 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_2_0_6
paint = new Color(255, 255, 255, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(16.0, 15.4);
((GeneralPath)shape).curveTo(16.0, 16.4, 15.2, 17.2, 14.2, 17.2);
((GeneralPath)shape).curveTo(13.2, 17.2, 12.4, 16.4, 12.4, 15.4);
((GeneralPath)shape).curveTo(12.4, 14.4, 13.2, 13.6, 14.2, 13.6);
((GeneralPath)shape).curveTo(15.2, 13.6, 16.0, 14.4, 16.0, 15.4);
((GeneralPath)shape).lineTo(16.0, 15.4);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_2_2_0_6);
g.setTransform(defaultTransform__0_2_2_0);
g.setTransform(defaultTransform__0_2_2);
g.setComposite(AlphaComposite.getInstance(3, 0.3f * origAlpha));
AffineTransform defaultTransform__0_2_3 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_3
paint = new Color(0, 0, 0, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(25.01586, 21.649044);
((GeneralPath)shape).lineTo(33.697147, 21.649044);
((GeneralPath)shape).lineTo(35.362053, 22.124731);
((GeneralPath)shape).lineTo(32.50793, 22.124731);
((GeneralPath)shape).curveTo(32.50793, 22.124731, 35.362053, 22.362574, 36.789116, 24.1464);
((GeneralPath)shape).curveTo(38.216175, 25.811304, 35.12421, 27.832975, 35.12421, 27.832975);
((GeneralPath)shape).curveTo(35.12421, 27.832975, 35.12421, 27.832975, 35.12421, 27.832975);
((GeneralPath)shape).curveTo(35.005287, 27.47621, 34.291756, 24.622087, 32.864697, 23.43287);
((GeneralPath)shape).curveTo(31.7944, 22.481497, 30.605183, 22.243652, 30.605183, 22.243652);
((GeneralPath)shape).lineTo(25.01586, 22.243652);
((GeneralPath)shape).lineTo(25.01586, 21.767965);
((GeneralPath)shape).lineTo(25.01586, 21.649044);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_2_3);
g.setComposite(AlphaComposite.getInstance(3, 0.3f * origAlpha));
AffineTransform defaultTransform__0_2_4 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_4
paint = new Color(0, 0, 0, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(30.724106, 22.362574);
((GeneralPath)shape).lineTo(25.729391, 22.362574);
((GeneralPath)shape).lineTo(35.005287, 27.59513);
((GeneralPath)shape).lineTo(30.724106, 22.362574);
((GeneralPath)shape).lineTo(30.724106, 22.362574);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_2_4);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_2_5 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_5
paint = new Color(81, 81, 81, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(25.01586, 21.767965);
((GeneralPath)shape).lineTo(33.697147, 21.767965);
((GeneralPath)shape).lineTo(35.005287, 20.935513);
((GeneralPath)shape).lineTo(32.15117, 20.935513);
((GeneralPath)shape).curveTo(32.15117, 20.935513, 34.767445, 20.459827, 35.12421, 17.486782);
((GeneralPath)shape).curveTo(35.480972, 14.513739, 31.08087, 11.183931, 31.08087, 11.183931);
((GeneralPath)shape).curveTo(31.08087, 11.183931, 31.08087, 11.183931, 31.08087, 11.302853);
((GeneralPath)shape).curveTo(31.19979, 12.016383, 32.389008, 17.011095, 31.556557, 18.913845);
((GeneralPath)shape).curveTo(31.19979, 20.578747, 30.129496, 20.935513, 30.129496, 20.935513);
((GeneralPath)shape).lineTo(24.659094, 20.935513);
((GeneralPath)shape).lineTo(24.896938, 21.767965);
((GeneralPath)shape).lineTo(25.01586, 21.767965);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_2_5);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_2_6 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_6
paint = new Color(81, 81, 81, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(30.248419, 20.459827);
((GeneralPath)shape).lineTo(25.253704, 20.459827);
((GeneralPath)shape).lineTo(31.19979, 11.421773);
((GeneralPath)shape).lineTo(30.248419, 20.459827);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_2_6);
g.setTransform(defaultTransform__0_2);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_3 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3
paint = new Color(255, 255, 255, 255);
stroke = new BasicStroke(0.99999976f,0,0,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(2.8042316, 7.4528584);
((GeneralPath)shape).lineTo(43.233986, 7.4528584);
((GeneralPath)shape).curveTo(43.384365, 7.4528584, 43.505432, 7.5739236, 43.505432, 7.7243047);
((GeneralPath)shape).lineTo(43.505432, 31.422651);
((GeneralPath)shape).curveTo(43.505432, 32.368526, 36.401688, 38.5, 36.251305, 38.5);
((GeneralPath)shape).lineTo(2.8042316, 38.5);
((GeneralPath)shape).curveTo(2.6538508, 38.5, 2.532786, 38.378937, 2.532786, 38.228554);
((GeneralPath)shape).lineTo(2.532786, 7.7243047);
((GeneralPath)shape).curveTo(2.532786, 7.5739236, 2.6538508, 7.4528584, 2.8042316, 7.4528584);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_3);
g.setComposite(AlphaComposite.getInstance(3, 0.84659094f * origAlpha));
AffineTransform defaultTransform__0_4 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_4
paint = new Color(79, 79, 79, 255);
stroke = new BasicStroke(1.0f,0,0,4.0f,null,0.0f);
shape = new Rectangle2D.Double(5.5, 10.5, 35.0625, 25.0625);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_4);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_5 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_5
paint = new LinearGradientPaint(new Point2D.Double(35.99658203125, 40.458221435546875), new Point2D.Double(33.664920806884766, 37.770721435546875), new float[] {0.0f,1.0f}, new Color[] {new Color(124, 124, 124, 255),new Color(184, 184, 184, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 5.1475701332092285f, -3.034791946411133f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(35.206654, 39.46876);
((GeneralPath)shape).curveTo(37.23707, 39.79866, 44.795444, 34.938835, 44.491062, 30.970919);
((GeneralPath)shape).curveTo(42.9278, 33.394016, 39.73254, 32.257656, 35.623783, 32.416668);
((GeneralPath)shape).curveTo(35.623783, 32.416668, 36.019154, 38.96876, 35.206654, 39.46876);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
paint = new LinearGradientPaint(new Point2D.Double(42.1875, 31.0), new Point2D.Double(45.0, 39.98469161987305), new float[] {0.0f,1.0f}, new Color[] {new Color(187, 189, 186, 255),new Color(112, 116, 110, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
stroke = new BasicStroke(1.0000002f,0,0,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(35.206654, 39.46876);
((GeneralPath)shape).curveTo(37.23707, 39.79866, 44.795444, 34.938835, 44.491062, 30.970919);
((GeneralPath)shape).curveTo(42.9278, 33.394016, 39.73254, 32.257656, 35.623783, 32.416668);
((GeneralPath)shape).curveTo(35.623783, 32.416668, 36.019154, 38.96876, 35.206654, 39.46876);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_5);
g.setComposite(AlphaComposite.getInstance(3, 0.36931816f * origAlpha));
AffineTransform defaultTransform__0_6 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_6
paint = new LinearGradientPaint(new Point2D.Double(33.39600372314453, 36.92133331298828), new Point2D.Double(34.170047760009766, 38.07038116455078), new float[] {0.0f,1.0f}, new Color[] {new Color(255, 255, 255, 255),new Color(255, 255, 255, 0)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 5.1475701332092285f, -3.409791946411133f));
stroke = new BasicStroke(0.9999998f,0,0,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(36.65709, 37.27726);
((GeneralPath)shape).curveTo(38.026867, 36.593433, 41.08534, 35.130795, 42.38472, 33.24979);
((GeneralPath)shape).curveTo(40.788624, 33.929848, 39.43691, 33.45929, 36.682384, 33.440197);
((GeneralPath)shape).curveTo(36.682384, 33.440197, 36.844707, 36.502293, 36.65709, 37.27726);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_6);
g.setComposite(AlphaComposite.getInstance(3, 0.30113637f * origAlpha));
AffineTransform defaultTransform__0_7 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_7
paint = new RadialGradientPaint(new Point2D.Double(12.700490951538086, 10.404875755310059), 19.96875f, new Point2D.Double(12.700490951538086, 10.404875755310059), new float[] {0.0f,1.0f}, new Color[] {new Color(255, 255, 255, 255),new Color(255, 255, 255, 0)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.7105309963226318f, -5.396358033332207E-24f, 2.4703449431856023E-24f, 1.1248489618301392f, -11.568329811096191f, 1.802582025527954f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(3.0625, 8.0);
((GeneralPath)shape).lineTo(3.0625, 30.0625);
((GeneralPath)shape).curveTo(25.388578, 30.950861, 27.884634, 17.0, 43.0, 17.0);
((GeneralPath)shape).lineTo(43.0, 8.0);
((GeneralPath)shape).lineTo(3.0625, 8.0);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_7);
g.setTransform(defaultTransform__0);
g.setTransform(defaultTransform_);

	}

	/**
	 * Returns the width of the bounding box of the original SVG image.
	 * 
	 * @return The width of the bounding box of the original SVG image.
	 */
	public static int getOrigWidth() {
		return 45;
	}

	/**
	 * Returns the height of the bounding box of the original SVG image.
	 * 
	 * @return The height of the bounding box of the original SVG image.
	 */
	public static int getOrigHeight() {
		return 37;
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
	public image_x_generic() {
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

