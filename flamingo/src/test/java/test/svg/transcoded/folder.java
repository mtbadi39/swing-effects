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
public class folder implements
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
g.transform(new AffineTransform(0.022623829543590546f, 0.0f, 0.0f, 0.02086758054792881f, 43.38343048095703f, 36.36962127685547f));
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
paint = new RadialGradientPaint(new Point2D.Double(20.706016540527344, 37.51798629760742), 30.905205f, new Point2D.Double(20.706016540527344, 37.51798629760742), new float[] {0.0f,1.0f}, new Color[] {new Color(32, 32, 32, 255),new Color(185, 185, 185, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0550220012664795f, -0.027345040813088417f, 0.17770299315452576f, 1.1909290552139282f, -3.572176933288574f, -7.125300884246826f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(4.5217805, 38.687416);
((GeneralPath)shape).curveTo(4.5435767, 39.10372, 4.981685, 39.520027, 5.39799, 39.520027);
((GeneralPath)shape).lineTo(36.72501, 39.520027);
((GeneralPath)shape).curveTo(37.14131, 39.520027, 37.535824, 39.10372, 37.514027, 38.687416);
((GeneralPath)shape).lineTo(36.577583, 11.460682);
((GeneralPath)shape).curveTo(36.555786, 11.044379, 36.117687, 10.628066, 35.70138, 10.628066);
((GeneralPath)shape).lineTo(22.43051, 10.628066);
((GeneralPath)shape).curveTo(21.945454, 10.628066, 21.196037, 10.312477, 21.028866, 9.521434);
((GeneralPath)shape).lineTo(20.417475, 6.6283627);
((GeneralPath)shape).curveTo(20.262007, 5.8926897, 19.535261, 5.5904765, 19.118958, 5.5904765);
((GeneralPath)shape).lineTo(4.3400974, 5.5904765);
((GeneralPath)shape).curveTo(3.9237847, 5.5904765, 3.5292766, 6.0067806, 3.5510726, 6.4230847);
((GeneralPath)shape).lineTo(4.5217805, 38.687416);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
paint = new LinearGradientPaint(new Point2D.Double(18.112709045410156, 31.36775016784668), new Point2D.Double(15.514888763427734, 6.18025016784668), new float[] {0.0f,1.0f}, new Color[] {new Color(66, 66, 66, 255),new Color(119, 119, 119, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
stroke = new BasicStroke(1.0f,1,1,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(4.5217805, 38.687416);
((GeneralPath)shape).curveTo(4.5435767, 39.10372, 4.981685, 39.520027, 5.39799, 39.520027);
((GeneralPath)shape).lineTo(36.72501, 39.520027);
((GeneralPath)shape).curveTo(37.14131, 39.520027, 37.535824, 39.10372, 37.514027, 38.687416);
((GeneralPath)shape).lineTo(36.577583, 11.460682);
((GeneralPath)shape).curveTo(36.555786, 11.044379, 36.117687, 10.628066, 35.70138, 10.628066);
((GeneralPath)shape).lineTo(22.43051, 10.628066);
((GeneralPath)shape).curveTo(21.945454, 10.628066, 21.196037, 10.312477, 21.028866, 9.521434);
((GeneralPath)shape).lineTo(20.417475, 6.6283627);
((GeneralPath)shape).curveTo(20.262007, 5.8926897, 19.535261, 5.5904765, 19.118958, 5.5904765);
((GeneralPath)shape).lineTo(4.3400974, 5.5904765);
((GeneralPath)shape).curveTo(3.9237847, 5.5904765, 3.5292766, 6.0067806, 3.5510726, 6.4230847);
((GeneralPath)shape).lineTo(4.5217805, 38.687416);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_1);
g.setComposite(AlphaComposite.getInstance(3, 0.11363633f * origAlpha));
AffineTransform defaultTransform__0_0_2 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_2
paint = new Color(114, 159, 207, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(5.2265925, 22.5625);
((GeneralPath)shape).lineTo(35.492172, 22.5625);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(1.0000002f,1,1,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(5.2265925, 22.5625);
((GeneralPath)shape).lineTo(35.492172, 22.5625);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_2);
g.setComposite(AlphaComposite.getInstance(3, 0.11363633f * origAlpha));
AffineTransform defaultTransform__0_0_3 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_3
paint = new Color(114, 159, 207, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(5.0421734, 18.5625);
((GeneralPath)shape).lineTo(35.489105, 18.5625);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(1.0000004f,1,1,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(5.0421734, 18.5625);
((GeneralPath)shape).lineTo(35.489105, 18.5625);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_3);
g.setComposite(AlphaComposite.getInstance(3, 0.11363633f * origAlpha));
AffineTransform defaultTransform__0_0_4 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_4
paint = new Color(114, 159, 207, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(4.9806967, 12.5625);
((GeneralPath)shape).lineTo(35.488056, 12.5625);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(1.0f,1,1,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(4.9806967, 12.5625);
((GeneralPath)shape).lineTo(35.488056, 12.5625);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_4);
g.setComposite(AlphaComposite.getInstance(3, 0.11363633f * origAlpha));
AffineTransform defaultTransform__0_0_5 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_5
paint = new Color(114, 159, 207, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(5.3861575, 32.5625);
((GeneralPath)shape).lineTo(35.49488, 32.5625);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(1.0000004f,1,1,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(5.3861575, 32.5625);
((GeneralPath)shape).lineTo(35.49488, 32.5625);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_5);
g.setComposite(AlphaComposite.getInstance(3, 0.11363633f * origAlpha));
AffineTransform defaultTransform__0_0_6 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_6
paint = new Color(114, 159, 207, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(5.50914, 34.5625);
((GeneralPath)shape).lineTo(35.496895, 34.5625);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(1.0000002f,1,1,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(5.50914, 34.5625);
((GeneralPath)shape).lineTo(35.496895, 34.5625);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_6);
g.setComposite(AlphaComposite.getInstance(3, 0.11363633f * origAlpha));
AffineTransform defaultTransform__0_0_7 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_7
paint = new Color(114, 159, 207, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(5.0421734, 16.5625);
((GeneralPath)shape).lineTo(35.489105, 16.5625);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(1.0000004f,1,1,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(5.0421734, 16.5625);
((GeneralPath)shape).lineTo(35.489105, 16.5625);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_7);
g.setComposite(AlphaComposite.getInstance(3, 0.11363633f * origAlpha));
AffineTransform defaultTransform__0_0_8 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_8
paint = new Color(114, 159, 207, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(5.0114346, 14.5625);
((GeneralPath)shape).lineTo(35.48858, 14.5625);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(1.0000002f,1,1,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(5.0114346, 14.5625);
((GeneralPath)shape).lineTo(35.48858, 14.5625);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_8);
g.setComposite(AlphaComposite.getInstance(3, 0.11363633f * origAlpha));
AffineTransform defaultTransform__0_0_9 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_9
paint = new Color(114, 159, 207, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(4.9220967, 10.5625);
((GeneralPath)shape).lineTo(20.202911, 10.5625);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(1.0000002f,1,1,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(4.9220967, 10.5625);
((GeneralPath)shape).lineTo(20.202911, 10.5625);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_9);
g.setComposite(AlphaComposite.getInstance(3, 0.11363633f * origAlpha));
AffineTransform defaultTransform__0_0_10 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_10
paint = new Color(114, 159, 207, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(4.8737535, 8.5625);
((GeneralPath)shape).lineTo(19.657488, 8.5625);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.9999998f,1,1,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(4.8737535, 8.5625);
((GeneralPath)shape).lineTo(19.657488, 8.5625);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_10);
g.setComposite(AlphaComposite.getInstance(3, 0.11363633f * origAlpha));
AffineTransform defaultTransform__0_0_11 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_11
paint = new Color(114, 159, 207, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(5.3246665, 28.5625);
((GeneralPath)shape).lineTo(35.493877, 28.5625);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(1.0000004f,1,1,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(5.3246665, 28.5625);
((GeneralPath)shape).lineTo(35.493877, 28.5625);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_11);
g.setComposite(AlphaComposite.getInstance(3, 0.11363633f * origAlpha));
AffineTransform defaultTransform__0_0_12 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_12
paint = new Color(114, 159, 207, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(5.288064, 26.5625);
((GeneralPath)shape).lineTo(35.493183, 26.5625);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(1.0f,1,1,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(5.288064, 26.5625);
((GeneralPath)shape).lineTo(35.493183, 26.5625);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_12);
g.setComposite(AlphaComposite.getInstance(3, 0.11363633f * origAlpha));
AffineTransform defaultTransform__0_0_13 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_13
paint = new Color(114, 159, 207, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(5.2265925, 24.5625);
((GeneralPath)shape).lineTo(35.492172, 24.5625);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(1.0000002f,1,1,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(5.2265925, 24.5625);
((GeneralPath)shape).lineTo(35.492172, 24.5625);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_13);
g.setComposite(AlphaComposite.getInstance(3, 0.11363633f * origAlpha));
AffineTransform defaultTransform__0_0_14 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_14
paint = new Color(114, 159, 207, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(5.1958537, 20.5625);
((GeneralPath)shape).lineTo(35.49165, 20.5625);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(1.0000001f,1,1,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(5.1958537, 20.5625);
((GeneralPath)shape).lineTo(35.49165, 20.5625);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_14);
g.setComposite(AlphaComposite.getInstance(3, 0.11363633f * origAlpha));
AffineTransform defaultTransform__0_0_15 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_15
paint = new Color(114, 159, 207, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(5.3246665, 30.5625);
((GeneralPath)shape).lineTo(35.493877, 30.5625);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(1.0000004f,1,1,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(5.3246665, 30.5625);
((GeneralPath)shape).lineTo(35.493877, 30.5625);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_15);
g.setComposite(AlphaComposite.getInstance(3, 0.11363633f * origAlpha));
AffineTransform defaultTransform__0_0_16 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_16
paint = new Color(114, 159, 207, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(5.50914, 36.5625);
((GeneralPath)shape).lineTo(35.496895, 36.5625);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(1.0000002f,1,1,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(5.50914, 36.5625);
((GeneralPath)shape).lineTo(35.496895, 36.5625);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_16);
g.setComposite(AlphaComposite.getInstance(3, 0.45142856f * origAlpha));
AffineTransform defaultTransform__0_0_17 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_17
paint = new LinearGradientPaint(new Point2D.Double(6.229796409606934, 13.773065567016602), new Point2D.Double(9.898089408874512, 66.83405303955078), new float[] {0.0f,1.0f}, new Color[] {new Color(255, 255, 255, 223),new Color(255, 255, 254, 0)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.5168440341949463f, 0.0f, 0.0f, 0.708977997303009f, -0.8795729875564575f, -1.3181660175323486f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(6.068343, 38.86402);
((GeneralPath)shape).curveTo(6.084686, 39.17625, 5.8874316, 39.384403, 5.5697584, 39.280327);
((GeneralPath)shape).lineTo(5.5697584, 39.280327);
((GeneralPath)shape).curveTo(5.2520766, 39.17625, 5.033027, 38.968098, 5.0166755, 38.65587);
((GeneralPath)shape).lineTo(4.068956, 6.591384);
((GeneralPath)shape).curveTo(4.0526133, 6.2791557, 4.234142, 6.0906134, 4.54637, 6.0906134);
((GeneralPath)shape).lineTo(18.96842, 6.0429196);
((GeneralPath)shape).curveTo(19.280647, 6.0429196, 19.900364, 6.3433924, 20.101357, 7.3651013);
((GeneralPath)shape).lineTo(20.674845, 10.180636);
((GeneralPath)shape).curveTo(20.247791, 9.715379, 20.255651, 9.701017, 20.037287, 9.02393);
((GeneralPath)shape).lineTo(19.631191, 7.764748);
((GeneralPath)shape).curveTo(19.412142, 7.037101, 18.932991, 6.932848, 18.620764, 6.932848);
((GeneralPath)shape).lineTo(5.732989, 6.932848);
((GeneralPath)shape).curveTo(5.420761, 6.932848, 5.2235074, 7.141, 5.239858, 7.4532366);
((GeneralPath)shape).lineTo(6.1778636, 38.968098);
((GeneralPath)shape).lineTo(6.068343, 38.86402);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_17);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_18 = g.getTransform();
g.transform(new AffineTransform(1.0407639741897583f, 0.0f, 0.0544925183057785f, 1.0407639741897583f, -8.670199394226074f, 2.6705939769744873f));
// _0_0_18
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_18_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_18_0
paint = new Color(255, 255, 255, 130);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(42.417183, 8.515178);
((GeneralPath)shape).curveTo(42.422268, 8.418064, 42.28902, 8.268189, 42.182068, 8.268171);
((GeneralPath)shape).lineTo(29.150665, 8.266053);
((GeneralPath)shape).curveTo(29.150665, 8.266053, 30.06238, 8.854008, 31.352476, 8.862296);
((GeneralPath)shape).lineTo(42.405975, 8.933317);
((GeneralPath)shape).curveTo(42.41706, 8.721589, 42.408695, 8.677284, 42.417183, 8.515178);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_18_0);
g.setTransform(defaultTransform__0_0_18);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_19 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_19
paint = new LinearGradientPaint(new Point2D.Double(22.175975799560547, 36.987998962402344), new Point2D.Double(22.065330505371094, 32.050498962402344), new float[] {0.0f,1.0f}, new Color[] {new Color(97, 148, 203, 255),new Color(114, 159, 207, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(39.78353, 39.51062);
((GeneralPath)shape).curveTo(40.927425, 39.466557, 41.74661, 38.41432, 41.830566, 37.189613);
((GeneralPath)shape).curveTo(42.622353, 25.640928, 43.489925, 15.957666, 43.489925, 15.957666);
((GeneralPath)shape).curveTo(43.56208, 15.710182, 43.322018, 15.462699, 43.00979, 15.462699);
((GeneralPath)shape).lineTo(8.638631, 15.462699);
((GeneralPath)shape).curveTo(8.638631, 15.462699, 6.7883115, 37.32959, 6.7883115, 37.32959);
((GeneralPath)shape).curveTo(6.673756, 38.311657, 6.322304, 39.134308, 5.2384753, 39.513306);
((GeneralPath)shape).lineTo(39.78353, 39.51062);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
paint = new Color(52, 101, 164, 255);
stroke = new BasicStroke(1.0f,0,1,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(39.78353, 39.51062);
((GeneralPath)shape).curveTo(40.927425, 39.466557, 41.74661, 38.41432, 41.830566, 37.189613);
((GeneralPath)shape).curveTo(42.622353, 25.640928, 43.489925, 15.957666, 43.489925, 15.957666);
((GeneralPath)shape).curveTo(43.56208, 15.710182, 43.322018, 15.462699, 43.00979, 15.462699);
((GeneralPath)shape).lineTo(8.638631, 15.462699);
((GeneralPath)shape).curveTo(8.638631, 15.462699, 6.7883115, 37.32959, 6.7883115, 37.32959);
((GeneralPath)shape).curveTo(6.673756, 38.311657, 6.322304, 39.134308, 5.2384753, 39.513306);
((GeneralPath)shape).lineTo(39.78353, 39.51062);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_19);
g.setComposite(AlphaComposite.getInstance(3, 0.4659091f * origAlpha));
AffineTransform defaultTransform__0_0_20 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_20
paint = new LinearGradientPaint(new Point2D.Double(13.035696029663086, 32.56718444824219), new Point2D.Double(12.853771209716797, 46.68931198120117), new float[] {0.0f,1.0f}, new Color[] {new Color(255, 255, 255, 255),new Color(255, 255, 255, 0)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.3174890279769897f, 0.0f, 0.0f, 0.8162559866905212f, -0.8795729875564575f, -1.3181660175323486f));
stroke = new BasicStroke(0.9999997f,1,0,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(9.620244, 16.46392);
((GeneralPath)shape).lineTo(42.411343, 16.528734);
((GeneralPath)shape).lineTo(40.837296, 36.530712);
((GeneralPath)shape).curveTo(40.752975, 37.602226, 40.38662, 37.958927, 38.96464, 37.958927);
((GeneralPath)shape).curveTo(37.09314, 37.958927, 10.286673, 37.92652, 7.569899, 37.92652);
((GeneralPath)shape).curveTo(7.8034973, 37.605713, 7.9036546, 36.9379, 7.9049954, 36.92191);
((GeneralPath)shape).lineTo(9.620244, 16.46392);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_20);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_21 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_21
paint = new Color(255, 255, 255, 23);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(9.620248, 16.223183);
((GeneralPath)shape).lineTo(8.453602, 31.866453);
((GeneralPath)shape).curveTo(8.453602, 31.866453, 16.749756, 27.718374, 27.11995, 27.718374);
((GeneralPath)shape).curveTo(37.490143, 27.718374, 42.67524, 16.223183, 42.67524, 16.223183);
((GeneralPath)shape).lineTo(9.620248, 16.223183);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_21);
g.setTransform(defaultTransform__0_0);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_1 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_1
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
		return 46;
	}

	/**
	 * Returns the height of the bounding box of the original SVG image.
	 * 
	 * @return The height of the bounding box of the original SVG image.
	 */
	public static int getOrigHeight() {
		return 39;
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
	public folder() {
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

