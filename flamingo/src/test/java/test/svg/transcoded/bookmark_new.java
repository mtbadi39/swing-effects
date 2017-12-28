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
public class bookmark_new implements
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
g.transform(new AffineTransform(0.02165151946246624f, 0.0f, 0.0f, 0.014857430011034012f, 43.007598876953125f, 42.68539047241211f));
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
g.setTransform(defaultTransform__0_0);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_1 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_1
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_1_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_1_0
paint = new RadialGradientPaint(new Point2D.Double(33.966678619384766, 35.736915588378906), 86.70845f, new Point2D.Double(33.966678619384766, 35.736915588378906), new float[] {0.0f,1.0f}, new Color[] {new Color(250, 250, 250, 255),new Color(187, 187, 187, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(0.9604930281639099f, 0.0f, 0.0f, 1.044769048690796f, -0.10355299711227417f, -0.15918299555778503f));
shape = new RoundRectangle2D.Double(6.5, 3.5, 34.875, 41.06343078613281, 2.2980971336364746, 2.298096179962158);
g.setPaint(paint);
g.fill(shape);
paint = new RadialGradientPaint(new Point2D.Double(8.824419021606445, 3.7561285495758057), 37.751713f, new Point2D.Double(8.824419021606445, 3.7561285495758057), new float[] {0.0f,1.0f}, new Color[] {new Color(163, 163, 163, 255),new Color(76, 76, 76, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(0.9682729840278625f, 0.0f, 0.0f, 1.0363739728927612f, 3.25f, 0.4895220100879669f));
stroke = new BasicStroke(0.9999998f,1,1,4.0f,null,0.0f);
shape = new RoundRectangle2D.Double(6.5, 3.5, 34.875, 41.06343078613281, 2.2980971336364746, 2.298096179962158);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_1_0);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_1_1 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_1_1
paint = new RadialGradientPaint(new Point2D.Double(8.143556594848633, 7.26789665222168), 38.158695f, new Point2D.Double(8.143556594848633, 7.26789665222168), new float[] {0.0f,1.0f}, new Color[] {new Color(255, 255, 255, 255),new Color(248, 248, 248, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(0.9730330109596252f, 0.0f, 0.0f, 1.0349370241165161f, 3.1687541007995605f, 0.5552769899368286f));
stroke = new BasicStroke(0.9999996f,1,1,4.0f,null,0.0f);
shape = new RoundRectangle2D.Double(7.502455234527588, 4.501048564910889, 32.93701171875, 39.0282096862793, 0.29809704422950745, 0.29809698462486267);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_1_1);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_1_2 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_1_2
paint = new Color(0, 0, 0, 4);
stroke = new BasicStroke(0.9885531f,0,0,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(11.505723, 5.4942765);
((GeneralPath)shape).lineTo(11.505723, 43.400867);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_1_2);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_1_3 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_1_3
paint = new Color(255, 255, 255, 52);
stroke = new BasicStroke(1.0f,0,0,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(12.5, 5.0205154);
((GeneralPath)shape).lineTo(12.5, 43.038227);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_1_3);
g.setTransform(defaultTransform__0_1);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_2 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_2_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_2_0_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0_0
paint = new Color(155, 155, 155, 140);
shape = new RoundRectangle2D.Double(15.999994277954102, 9.0, 20.0000057220459, 1.0, 0.27557262778282166, 0.13078175485134125);
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_2_0_0);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_2_0_1 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0_1
paint = new Color(155, 155, 155, 140);
shape = new RoundRectangle2D.Double(15.999994277954102, 11.0, 20.0000057220459, 1.0, 0.27557262778282166, 0.13078175485134125);
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_2_0_1);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_2_0_2 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0_2
paint = new Color(155, 155, 155, 140);
shape = new RoundRectangle2D.Double(15.999994277954102, 13.0, 20.0000057220459, 1.0, 0.27557262778282166, 0.13078175485134125);
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_2_0_2);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_2_0_3 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0_3
paint = new Color(155, 155, 155, 140);
shape = new RoundRectangle2D.Double(15.999994277954102, 15.0, 20.0000057220459, 1.0, 0.27557262778282166, 0.13078175485134125);
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_2_0_3);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_2_0_4 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0_4
paint = new Color(155, 155, 155, 140);
shape = new RoundRectangle2D.Double(15.999994277954102, 17.0, 20.0000057220459, 1.0, 0.27557262778282166, 0.13078175485134125);
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_2_0_4);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_2_0_5 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0_5
paint = new Color(155, 155, 155, 140);
shape = new RoundRectangle2D.Double(15.999994277954102, 19.0, 20.0000057220459, 1.0, 0.27557262778282166, 0.13078175485134125);
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_2_0_5);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_2_0_6 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0_6
paint = new Color(155, 155, 155, 140);
shape = new RoundRectangle2D.Double(15.999994277954102, 21.0, 20.0000057220459, 1.0, 0.27557262778282166, 0.13078175485134125);
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_2_0_6);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_2_0_7 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0_7
paint = new Color(155, 155, 155, 140);
shape = new RoundRectangle2D.Double(15.999994277954102, 23.0, 20.0000057220459, 1.0, 0.27557262778282166, 0.13078175485134125);
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_2_0_7);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_2_0_8 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0_8
paint = new Color(155, 155, 155, 140);
shape = new RoundRectangle2D.Double(15.999985694885254, 25.0, 9.000005722045898, 1.0, 0.12400771677494049, 0.13078175485134125);
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_2_0_8);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_2_0_9 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0_9
paint = new Color(155, 155, 155, 140);
shape = new RoundRectangle2D.Double(15.999985694885254, 29.0, 20.0000057220459, 1.0, 0.27557262778282166, 0.13078175485134125);
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_2_0_9);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_2_0_10 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0_10
paint = new Color(155, 155, 155, 140);
shape = new RoundRectangle2D.Double(15.999985694885254, 31.0, 20.0000057220459, 1.0, 0.27557262778282166, 0.13078175485134125);
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_2_0_10);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_2_0_11 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0_11
paint = new Color(155, 155, 155, 140);
shape = new RoundRectangle2D.Double(15.999985694885254, 33.0, 20.0000057220459, 1.0, 0.27557262778282166, 0.13078175485134125);
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_2_0_11);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_2_0_12 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0_12
paint = new Color(155, 155, 155, 140);
shape = new RoundRectangle2D.Double(15.999985694885254, 35.0, 20.0000057220459, 1.0, 0.27557262778282166, 0.13078175485134125);
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_2_0_12);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_2_0_13 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0_13
paint = new Color(155, 155, 155, 140);
shape = new RoundRectangle2D.Double(15.999985694885254, 37.0, 14.000014305114746, 1.0, 0.19290097057819366, 0.13078175485134125);
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_2_0_13);
g.setTransform(defaultTransform__0_2_0);
g.setComposite(AlphaComposite.getInstance(3, 0.28021976f * origAlpha));
AffineTransform defaultTransform__0_2_1 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_1
paint = new LinearGradientPaint(new Point2D.Double(19.452348709106445, 13.174174308776855), new Point2D.Double(19.685436248779297, 27.095338821411133), new float[] {0.0f,1.0f}, new Color[] {new Color(0, 0, 0, 255),new Color(0, 0, 0, 0)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.2242549657821655f, 0.0f, 0.0f, 1.2821760177612305f, 0.3715690076351166f, 0.26465699076652527f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(28.245857, 31.324905);
((GeneralPath)shape).lineTo(21.14787, 27.133701);
((GeneralPath)shape).lineTo(14.30757, 30.8838);
((GeneralPath)shape).lineTo(13.761859, 3.9475667);
((GeneralPath)shape).lineTo(28.549599, 3.9475667);
((GeneralPath)shape).lineTo(28.245857, 31.324905);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_2_1);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_2_2 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_2
paint = new LinearGradientPaint(new Point2D.Double(18.431310653686523, 19.119474411010742), new Point2D.Double(18.4024715423584, 4.270232677459717), new float[] {0.0f,1.0f}, new Color[] {new Color(133, 157, 188, 255),new Color(84, 114, 153, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.3195489645004272f, 0.0f, 0.0f, 1.2990130186080933f, -3.1061999797821045f, -1.336164951324463f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(12.427339, 3.5180202);
((GeneralPath)shape).curveTo(12.427339, 3.5180202, 12.240033, 0.6052061, 15.107867, 0.5427061);
((GeneralPath)shape).lineTo(25.119343, 0.50728625);
((GeneralPath)shape).curveTo(26.277287, 0.50728625, 26.581888, 1.1910177, 26.581888, 2.1095588);
((GeneralPath)shape).lineTo(26.581888, 29.729916);
((GeneralPath)shape).lineTo(20.545425, 24.533861);
((GeneralPath)shape).lineTo(14.674346, 29.729916);
((GeneralPath)shape).lineTo(14.591655, 3.519629);
((GeneralPath)shape).lineTo(12.427339, 3.5180202);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
paint = new Color(54, 72, 120, 255);
stroke = new BasicStroke(0.9999999f,0,0,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(12.427339, 3.5180202);
((GeneralPath)shape).curveTo(12.427339, 3.5180202, 12.240033, 0.6052061, 15.107867, 0.5427061);
((GeneralPath)shape).lineTo(25.119343, 0.50728625);
((GeneralPath)shape).curveTo(26.277287, 0.50728625, 26.581888, 1.1910177, 26.581888, 2.1095588);
((GeneralPath)shape).lineTo(26.581888, 29.729916);
((GeneralPath)shape).lineTo(20.545425, 24.533861);
((GeneralPath)shape).lineTo(14.674346, 29.729916);
((GeneralPath)shape).lineTo(14.591655, 3.519629);
((GeneralPath)shape).lineTo(12.427339, 3.5180202);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_2_2);
g.setComposite(AlphaComposite.getInstance(3, 0.4450549f * origAlpha));
AffineTransform defaultTransform__0_2_3 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_3
paint = new LinearGradientPaint(new Point2D.Double(16.8125, 1.875), new Point2D.Double(16.8125, 4.71875), new float[] {0.0f,1.0f}, new Color[] {new Color(255, 255, 255, 255),new Color(255, 255, 255, 0)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(-1.3195489645004272f, 0.0f, 0.0f, 1.3620599508285522f, 40.38853073120117f, -0.36205700039863586f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(13.030252, 3.011792);
((GeneralPath)shape).curveTo(13.011046, 2.225362, 13.312918, 1.0801307, 15.375418, 1.0176307);
((GeneralPath)shape).lineTo(25.027906, 1.0);
((GeneralPath)shape).curveTo(25.640923, 1.0, 26.090153, 1.167432, 26.090153, 1.7994802);
((GeneralPath)shape).lineTo(26.060993, 10.491851);
((GeneralPath)shape).lineTo(15.317102, 10.491851);
((GeneralPath)shape).lineTo(15.192102, 2.999325);
((GeneralPath)shape).curveTo(15.192102, 2.999325, 13.030252, 3.011792, 13.030252, 3.011792);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_2_3);
g.setComposite(AlphaComposite.getInstance(3, 0.28021976f * origAlpha));
AffineTransform defaultTransform__0_2_4 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_4
paint = new LinearGradientPaint(new Point2D.Double(19.0, 9.773824691772461), new Point2D.Double(19.0, 15.63559627532959), new float[] {0.0f,0.5f,1.0f}, new Color[] {new Color(0, 0, 0, 0),new Color(0, 0, 0, 145),new Color(0, 0, 0, 0)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.3195489645004272f, 0.0f, 0.0f, 2.1339259147644043f, -4.476132869720459f, -14.648449897766113f));
shape = new RoundRectangle2D.Double(15.317100524902344, 6.6907958984375, 10.556391716003418, 12.803556442260742, 0.12400771677494049, 0.13078175485134125);
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_2_4);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_2_5 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_5
paint = new LinearGradientPaint(new Point2D.Double(19.97037696838379, 6.116710662841797), new Point2D.Double(19.97037696838379, 2.53125), new float[] {0.0f,1.0f}, new Color[] {new Color(255, 255, 255, 49),new Color(255, 255, 255, 0)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.3195489645004272f, 0.0f, 0.0f, 1.2803560495376587f, -5.745297908782959f, 0.24900700151920319f));
stroke = new BasicStroke(1.0000001f,0,0,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(24.476831, 2.2095506);
((GeneralPath)shape).lineTo(25.575535, 3.113139);
((GeneralPath)shape).lineTo(25.547445, 27.511911);
((GeneralPath)shape).lineTo(20.497463, 23.203758);
((GeneralPath)shape).lineTo(15.704084, 27.415203);
((GeneralPath)shape).lineTo(15.699081, 2.7495618);
((GeneralPath)shape).lineTo(24.476831, 2.2095506);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_2_5);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_2_6 = g.getTransform();
g.transform(new AffineTransform(0.6111270189285278f, 0.0f, 0.0f, 0.6111270189285278f, 5.6324381828308105f, -67.28175354003906f));
// _0_2_6
paint = new RadialGradientPaint(new Point2D.Double(55.0, 125.0), 14.375f, new Point2D.Double(55.0, 125.0), new float[] {0.0f,0.5f,1.0f}, new Color[] {new Color(255, 255, 255, 255),new Color(255, 245, 32, 227),new Color(255, 243, 0, 0)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(69.375, 125.0);
((GeneralPath)shape).curveTo(69.375, 132.93909, 62.939095, 139.375, 55.0, 139.375);
((GeneralPath)shape).curveTo(47.060905, 139.375, 40.625, 132.93909, 40.625, 125.0);
((GeneralPath)shape).curveTo(40.625, 117.060905, 47.060905, 110.625, 55.0, 110.625);
((GeneralPath)shape).curveTo(62.939095, 110.625, 69.375, 117.060905, 69.375, 125.0);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_2_6);
g.setComposite(AlphaComposite.getInstance(3, 0.48295456f * origAlpha));
AffineTransform defaultTransform__0_2_7 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_7
paint = new LinearGradientPaint(new Point2D.Double(13.354310989379883, 1.4866424798965454), new Point2D.Double(14.075843811035156, 2.4017651081085205), new float[] {0.0f,1.0f}, new Color[] {new Color(255, 255, 255, 255),new Color(255, 255, 255, 0)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.1848160028457642f, 0.0f, -0.7278800010681152f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(15.158602, 3.9384084);
((GeneralPath)shape).lineTo(15.114407, 1.0335178);
((GeneralPath)shape).curveTo(12.983906, 1.0335178, 12.993087, 2.9680774, 12.993087, 3.9384084);
((GeneralPath)shape).lineTo(15.158602, 3.9384084);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_2_7);
g.setComposite(AlphaComposite.getInstance(3, 0.35795456f * origAlpha));
AffineTransform defaultTransform__0_2_8 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_8
paint = new LinearGradientPaint(new Point2D.Double(14.584076881408691, 1.6392649412155151), new Point2D.Double(14.552827835083008, 2.4912447929382324), new float[] {0.0f,1.0f}, new Color[] {new Color(0, 0, 0, 255),new Color(0, 0, 0, 0)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.5942139625549316f, 0.0f, -0.7902489900588989f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(15.158602, 3.9384086);
((GeneralPath)shape).lineTo(15.114407, 1.8247592);
((GeneralPath)shape).curveTo(12.81631, 1.8426926, 12.993087, 3.9384086, 12.993087, 3.9384086);
((GeneralPath)shape).lineTo(15.158602, 3.9384086);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_2_8);
g.setTransform(defaultTransform__0_2);
g.setTransform(defaultTransform__0);
g.setTransform(defaultTransform_);

	}

	/**
	 * Returns the width of the bounding box of the original SVG image.
	 * 
	 * @return The width of the bounding box of the original SVG image.
	 */
	public static int getOrigWidth() {
		return 47;
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
	public bookmark_new() {
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

