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
public class printer implements
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
g.transform(new AffineTransform(0.0231101606041193f, 0.0f, 0.0f, 0.022715330123901367f, 44.685020446777344f, 39.36098861694336f));
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
paint = new LinearGradientPaint(new Point2D.Double(1.8456430435180664, 88.29493713378906), new Point2D.Double(18.972126007080078, 88.29493713378906), new float[] {0.0f,0.27586207f,1.0f}, new Color[] {new Color(142, 141, 135, 255),new Color(203, 201, 193, 255),new Color(142, 141, 135, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(2.302720069885254f, 0.0f, 0.0f, 0.4379180073738098f, 0.0f, 0.5840340256690979f));
shape = new RoundRectangle2D.Double(4.75, 36.004188537597656, 38.4375, 6.491594314575195, 3.4230966567993164, 3.423095464706421);
g.setPaint(paint);
g.fill(shape);
paint = new Color(89, 89, 89, 255);
stroke = new BasicStroke(0.9999998f,0,0,4.0f,null,0.0f);
shape = new RoundRectangle2D.Double(4.75, 36.004188537597656, 38.4375, 6.491594314575195, 3.4230966567993164, 3.423095464706421);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_1);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_2 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_2
paint = new LinearGradientPaint(new Point2D.Double(1.8456430435180664, 88.29492950439453), new Point2D.Double(18.972126007080078, 88.29492950439453), new float[] {0.0f,1.0f}, new Color[] {new Color(220, 220, 218, 255),new Color(186, 185, 183, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(2.2918241024017334f, 0.0f, 0.0f, 0.4342690110206604f, 0.08855178952217102f, 2.0f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(7.130896, 21.5);
((GeneralPath)shape).lineTo(40.870613, 21.5);
((GeneralPath)shape).curveTo(41.25566, 21.5, 41.747646, 21.788155, 42.05105, 22.223919);
((GeneralPath)shape).curveTo(42.35445, 22.659683, 43.787518, 24.83394, 44.109447, 25.297964);
((GeneralPath)shape).curveTo(44.431377, 25.761988, 44.502396, 26.201853, 44.502396, 26.77405);
((GeneralPath)shape).lineTo(44.502396, 38.850952);
((GeneralPath)shape).curveTo(44.502396, 39.764523, 43.7704, 40.5, 42.861153, 40.5);
((GeneralPath)shape).lineTo(5.1403594, 40.5);
((GeneralPath)shape).curveTo(4.2311096, 40.5, 3.4991138, 39.764523, 3.4991138, 38.850952);
((GeneralPath)shape).lineTo(3.4991138, 26.77405);
((GeneralPath)shape).curveTo(3.4991138, 26.280031, 3.6002798, 25.571642, 3.9455202, 25.120718);
((GeneralPath)shape).curveTo(4.3811665, 24.551714, 5.549866, 22.57277, 5.8581276, 22.153118);
((GeneralPath)shape).curveTo(6.1663885, 21.733467, 6.732446, 21.5, 7.130896, 21.5);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
paint = new Color(103, 103, 103, 255);
stroke = new BasicStroke(1.0000004f,0,0,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(7.130896, 21.5);
((GeneralPath)shape).lineTo(40.870613, 21.5);
((GeneralPath)shape).curveTo(41.25566, 21.5, 41.747646, 21.788155, 42.05105, 22.223919);
((GeneralPath)shape).curveTo(42.35445, 22.659683, 43.787518, 24.83394, 44.109447, 25.297964);
((GeneralPath)shape).curveTo(44.431377, 25.761988, 44.502396, 26.201853, 44.502396, 26.77405);
((GeneralPath)shape).lineTo(44.502396, 38.850952);
((GeneralPath)shape).curveTo(44.502396, 39.764523, 43.7704, 40.5, 42.861153, 40.5);
((GeneralPath)shape).lineTo(5.1403594, 40.5);
((GeneralPath)shape).curveTo(4.2311096, 40.5, 3.4991138, 39.764523, 3.4991138, 38.850952);
((GeneralPath)shape).lineTo(3.4991138, 26.77405);
((GeneralPath)shape).curveTo(3.4991138, 26.280031, 3.6002798, 25.571642, 3.9455202, 25.120718);
((GeneralPath)shape).curveTo(4.3811665, 24.551714, 5.549866, 22.57277, 5.8581276, 22.153118);
((GeneralPath)shape).curveTo(6.1663885, 21.733467, 6.732446, 21.5, 7.130896, 21.5);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_2);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_3 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_3
paint = new Color(251, 251, 251, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(7.424621, 21.975533);
((GeneralPath)shape).curveTo(6.921893, 21.975533, 6.3048778, 22.053783, 6.0546017, 22.46703);
((GeneralPath)shape).lineTo(4.1542525, 25.604816);
((GeneralPath)shape).curveTo(3.8721285, 26.070648, 4.1881986, 26.868141, 5.087311, 26.868141);
((GeneralPath)shape).lineTo(42.730785, 26.868141);
((GeneralPath)shape).curveTo(44.040733, 26.868141, 43.950535, 25.858072, 43.663845, 25.42804);
((GeneralPath)shape).lineTo(41.896076, 22.776388);
((GeneralPath)shape).curveTo(41.575542, 22.29559, 41.459198, 21.975533, 40.65864, 21.975533);
((GeneralPath)shape).lineTo(7.424621, 21.975533);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_3);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_4 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_4
paint = new LinearGradientPaint(new Point2D.Double(15.387969017028809, 32.53923797607422), new Point2D.Double(15.487822532653809, 58.83126449584961), new float[] {0.0f,0.10344828f,1.0f}, new Color[] {new Color(255, 255, 255, 32),new Color(255, 255, 255, 255),new Color(255, 255, 255, 0)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.4925689697265625f, 0.0f, 0.0f, 0.66874098777771f, 0.08188071846961975f, 2.0f));
stroke = new BasicStroke(0.9469671f,0,0,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(7.60536, 22.445757);
((GeneralPath)shape).lineTo(40.432674, 22.445757);
((GeneralPath)shape).curveTo(40.79835, 22.445757, 41.26559, 22.71863, 41.553734, 23.131283);
((GeneralPath)shape).curveTo(41.841873, 23.543938, 42.849964, 25.160946, 43.1557, 25.60036);
((GeneralPath)shape).curveTo(43.461437, 26.039776, 43.59127, 26.456312, 43.59127, 26.998163);
((GeneralPath)shape).lineTo(43.59127, 38.279263);
((GeneralPath)shape).curveTo(43.59127, 39.144386, 43.457546, 39.528355, 42.594032, 39.528355);
((GeneralPath)shape).lineTo(5.5322266, 39.528355);
((GeneralPath)shape).curveTo(4.6687107, 39.528355, 4.4726048, 39.144386, 4.4726048, 38.279263);
((GeneralPath)shape).lineTo(4.4726048, 26.998163);
((GeneralPath)shape).curveTo(4.4726048, 26.530346, 4.69345, 25.859524, 5.021325, 25.432514);
((GeneralPath)shape).curveTo(5.435059, 24.893684, 6.103854, 23.461634, 6.3966103, 23.064238);
((GeneralPath)shape).curveTo(6.6893663, 22.666842, 7.2269516, 22.445757, 7.60536, 22.445757);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_4);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_5 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_5
paint = new LinearGradientPaint(new Point2D.Double(25.056711196899414, 3.6785457134246826), new Point2D.Double(24.78970718383789, 25.247310638427734), new float[] {0.0f,0.4054697f,0.5344828f,1.0f}, new Color[] {new Color(224, 224, 224, 255),new Color(255, 255, 255, 255),new Color(205, 205, 205, 255),new Color(73, 73, 73, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(0.9457100033760071f, 0.0f, 0.0f, 1.076032042503357f, 0.05016683042049408f, 4.095404148101807f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(11.672962, 4.4999475);
((GeneralPath)shape).lineTo(36.325115, 4.4999475);
((GeneralPath)shape).curveTo(36.97588, 4.4999475, 37.49978, 5.0100775, 37.49978, 5.6437373);
((GeneralPath)shape).lineTo(37.49978, 24.348175);
((GeneralPath)shape).lineTo(10.498298, 24.348175);
((GeneralPath)shape).lineTo(10.498298, 5.6437373);
((GeneralPath)shape).curveTo(10.498298, 5.0100775, 11.022197, 4.4999475, 11.672962, 4.4999475);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
paint = new Color(137, 137, 137, 255);
stroke = new BasicStroke(1.0000004f,1,0,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(11.672962, 4.4999475);
((GeneralPath)shape).lineTo(36.325115, 4.4999475);
((GeneralPath)shape).curveTo(36.97588, 4.4999475, 37.49978, 5.0100775, 37.49978, 5.6437373);
((GeneralPath)shape).lineTo(37.49978, 24.348175);
((GeneralPath)shape).lineTo(10.498298, 24.348175);
((GeneralPath)shape).lineTo(10.498298, 5.6437373);
((GeneralPath)shape).curveTo(10.498298, 5.0100775, 11.022197, 4.4999475, 11.672962, 4.4999475);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_5);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_6 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_6
paint = new LinearGradientPaint(new Point2D.Double(20.771228790283203, 25.1402530670166), new Point2D.Double(20.71780014038086, 19.33746337890625), new float[] {0.0f,1.0f}, new Color[] {new Color(255, 255, 255, 0),new Color(248, 248, 248, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.198768973350525f, 0.0f, 0.0f, 0.853564977645874f, -0.1430860012769699f, 2.034512996673584f));
stroke = new BasicStroke(1.0000002f,1,1,4.0f,null,0.0f);
shape = new RoundRectangle2D.Double(11.498513221740723, 5.499246597290039, 25.00057601928711, 18.836374282836914, 0.35355344414711, 0.35355350375175476);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_6);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_7 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_7
paint = new LinearGradientPaint(new Point2D.Double(10.33823299407959, 64.65225982666016), new Point2D.Double(10.33823299407959, 54.136138916015625), new float[] {0.0f,1.0f}, new Color[] {new Color(247, 246, 245, 255),new Color(247, 246, 245, 0)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(2.3698439598083496f, 0.0f, 0.0f, 0.4219689965248108f, 0.0f, 2.0f));
shape = new RoundRectangle2D.Double(6.875, 27.375, 33.75, 5.1875, 3.4230966567993164, 3.4230966567993164);
g.setPaint(paint);
g.fill(shape);
paint = new LinearGradientPaint(new Point2D.Double(9.731653213500977, 70.7249755859375), new Point2D.Double(9.705278396606445, 62.282466888427734), new float[] {0.0f,1.0f}, new Color[] {new Color(102, 102, 102, 255),new Color(0, 0, 0, 0)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(2.3698439598083496f, 0.0f, 0.0f, 0.4219689965248108f, 0.0f, 2.0f));
stroke = new BasicStroke(1.0f,0,0,4.0f,null,0.0f);
shape = new RoundRectangle2D.Double(6.875, 27.375, 33.75, 5.1875, 3.4230966567993164, 3.4230966567993164);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_7);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_8 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 2.0f));
// _0_0_8
paint = new RadialGradientPaint(new Point2D.Double(9.129549026489258, 26.925594329833984), 2.1227016f, new Point2D.Double(9.129549026489258, 26.925594329833984), new float[] {0.0f,0.5f,1.0f}, new Color[] {new Color(255, 255, 253, 255),new Color(187, 187, 185, 255),new Color(0, 0, 0, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(10.871767, 27.626486);
((GeneralPath)shape).curveTo(10.871767, 28.33431, 10.297961, 28.908117, 9.590136, 28.908117);
((GeneralPath)shape).curveTo(8.882311, 28.908117, 8.308505, 28.33431, 8.308505, 27.626486);
((GeneralPath)shape).curveTo(8.308505, 26.918661, 8.882311, 26.344854, 9.590136, 26.344854);
((GeneralPath)shape).curveTo(10.297961, 26.344854, 10.871767, 26.918661, 10.871767, 27.626486);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_8);
g.setComposite(AlphaComposite.getInstance(3, 0.36571428f * origAlpha));
AffineTransform defaultTransform__0_0_9 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_9
paint = new LinearGradientPaint(new Point2D.Double(9.869808197021484, 57.2276496887207), new Point2D.Double(9.912813186645508, 72.06431579589844), new float[] {0.0f,1.0f}, new Color[] {new Color(0, 0, 0, 60),new Color(0, 0, 0, 0)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(2.7720859050750732f, 0.0f, 0.0f, 0.36073899269104004f, 0.6187180280685425f, 2.883882999420166f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(11.743718, 25.416054);
((GeneralPath)shape).lineTo(37.306217, 25.478554);
((GeneralPath)shape).curveTo(37.993717, 25.480234, 38.294037, 25.107557, 38.243717, 24.478554);
((GeneralPath)shape).lineTo(38.118717, 22.916054);
((GeneralPath)shape).lineTo(39.984837, 22.916054);
((GeneralPath)shape).curveTo(40.797337, 22.916054, 40.975037, 23.108616, 41.172337, 23.478554);
((GeneralPath)shape).lineTo(41.672337, 24.416054);
((GeneralPath)shape).curveTo(42.19913, 25.403793, 43.48351, 26.390165, 42.170494, 26.390165);
((GeneralPath)shape).curveTo(37.667786, 26.390165, 13.993718, 26.041054, 11.743718, 25.416054);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_9);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_10 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_10
paint = new Color(255, 255, 255, 255);
stroke = new BasicStroke(0.99999994f,1,1,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(43.488808, 26.5);
((GeneralPath)shape).lineTo(4.5111804, 26.5);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_10);
g.setComposite(AlphaComposite.getInstance(3, 0.43575415f * origAlpha));
AffineTransform defaultTransform__0_0_11 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 2.0f));
// _0_0_11
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_11_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_11_0
paint = new Color(0, 0, 0, 75);
shape = new Rectangle2D.Double(14.0, 7.0, 19.0, 1.0);
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_11_0);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_11_1 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_11_1
paint = new Color(0, 0, 0, 75);
shape = new Rectangle2D.Double(14.0, 9.0, 19.0, 1.0);
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_11_1);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_11_2 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_11_2
paint = new Color(0, 0, 0, 75);
shape = new Rectangle2D.Double(14.0, 11.0, 19.0, 1.0);
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_11_2);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_11_3 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_11_3
paint = new Color(0, 0, 0, 75);
shape = new Rectangle2D.Double(14.0, 13.0, 11.0, 1.0);
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_11_3);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_11_4 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_11_4
paint = new Color(0, 0, 0, 75);
shape = new Rectangle2D.Double(14.0, 17.0, 19.0, 1.0);
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_11_4);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_11_5 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_11_5
paint = new Color(0, 0, 0, 75);
shape = new Rectangle2D.Double(14.0, 19.0, 19.0, 1.0);
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_11_5);
g.setTransform(defaultTransform__0_0_11);
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
		return 47;
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
	public printer() {
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

