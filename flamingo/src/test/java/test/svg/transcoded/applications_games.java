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
import java.awt.geom.RoundRectangle2D;

/**
 * This class has been automatically generated using <a
 * href="https://flamingo.dev.java.net">Flamingo SVG transcoder</a>.
 */
public class applications_games implements
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
g.setComposite(AlphaComposite.getInstance(3, 0.38636363f * origAlpha));
AffineTransform defaultTransform__0_0_0 = g.getTransform();
g.transform(new AffineTransform(1.408115029335022f, 0.0f, 0.0f, 0.4929580092430115f, -7.856804847717285f, 28.288719177246094f));
// _0_0_0
paint = new RadialGradientPaint(new Point2D.Double(22.571428298950195, 30.85714340209961), 15.571428f, new Point2D.Double(22.571428298950195, 30.85714340209961), new float[] {0.0f,1.0f}, new Color[] {new Color(0, 0, 0, 255),new Color(0, 0, 0, 0)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 0.6513760089874268f, 3.8960779657278184E-15f, 10.757539749145508f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(38.142857, 30.857143);
((GeneralPath)shape).curveTo(38.142857, 36.45889, 31.171291, 41.0, 22.571428, 41.0);
((GeneralPath)shape).curveTo(13.971566, 41.0, 7.0, 36.45889, 7.0, 30.857143);
((GeneralPath)shape).curveTo(7.0, 25.255398, 13.971566, 20.714287, 22.571428, 20.714287);
((GeneralPath)shape).curveTo(31.171291, 20.714287, 38.142857, 25.255398, 38.142857, 30.857143);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_0);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_1 = g.getTransform();
g.transform(new AffineTransform(0.9802799820899963f, -0.19761699438095093f, 0.19761699438095093f, 0.9802799820899963f, -10.728349685668945f, 1.0851049423217773f));
// _0_0_1
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_1_0 = g.getTransform();
g.transform(new AffineTransform(0.9653639793395996f, 0.26090800762176514f, -0.26090800762176514f, 0.9653639793395996f, 11.349209785461426f, -0.5226759910583496f));
// _0_0_1_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_1_0_0 = g.getTransform();
g.transform(new AffineTransform(0.9653840065002441f, -0.2608329951763153f, 0.2608329951763153f, 0.9653840065002441f, 0.0f, 0.0f));
// _0_0_1_0_0
paint = new LinearGradientPaint(new Point2D.Double(42.15003204345703, 23.40526580810547), new Point2D.Double(50.87135696411133, 39.3181266784668), new float[] {0.0f,1.0f}, new Color[] {new Color(229, 229, 229, 255),new Color(200, 200, 200, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(0.8930889964103699f, 2.4185458797894126E-16f, -3.7011480501146997E-16f, 1.1197090148925781f, -18.45684051513672f, -0.381848007440567f));
shape = new RoundRectangle2D.Double(-1.9805312156677246, 8.210731506347656, 30.930360794067383, 39.03262710571289, 6.060927867889404, 5.656864643096924);
g.setPaint(paint);
g.fill(shape);
paint = new Color(136, 138, 133, 255);
stroke = new BasicStroke(1.0000017f,1,0,4.0f,null,0.0f);
shape = new RoundRectangle2D.Double(-1.9805312156677246, 8.210731506347656, 30.930360794067383, 39.03262710571289, 6.060927867889404, 5.656864643096924);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_1_0_0);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_1_0_1 = g.getTransform();
g.transform(new AffineTransform(0.9653760194778442f, -0.2608639895915985f, 0.2608030140399933f, 0.965391993522644f, 0.0f, 0.0f));
// _0_0_1_0_1
paint = new LinearGradientPaint(new Point2D.Double(38.897804260253906, 32.23447799682617), new Point2D.Double(69.18116760253906, 57.055389404296875), new float[] {0.0f,1.0f}, new Color[] {new Color(229, 229, 229, 255),new Color(200, 200, 200, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(0.8824639916419983f, 3.464905002471759E-16f, -8.831331208893642E-16f, 1.1232290267944336f, -18.457029342651367f, -0.30422499775886536f));
shape = new RoundRectangle2D.Double(-1.0130478143692017, 9.101876258850098, 28.99733543395996, 37.150211334228516, 4.4699506759643555, 3.8891007900238037);
g.setPaint(paint);
g.fill(shape);
paint = new Color(255, 255, 255, 255);
stroke = new BasicStroke(1.0000025f,1,0,4.0f,null,0.0f);
shape = new RoundRectangle2D.Double(-1.0130478143692017, 9.101876258850098, 28.99733543395996, 37.150211334228516, 4.4699506759643555, 3.8891007900238037);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_1_0_1);
g.setTransform(defaultTransform__0_0_1_0);
g.setComposite(AlphaComposite.getInstance(3, 0.51648355f * origAlpha));
AffineTransform defaultTransform__0_0_1_1 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.1767760068178177f, 7.24783992767334f));
// _0_0_1_1
paint = new LinearGradientPaint(new Point2D.Double(48.0, 18.534204483032227), new Point2D.Double(78.0, 18.534204483032227), new float[] {0.0f,1.0f}, new Color[] {new Color(255, 255, 255, 255),new Color(255, 255, 255, 0)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0157170295715332f, 7.557276759059008E-18f, -7.795538689879395E-18f, 1.0477399826049805f, -38.624019622802734f, -6.5425190925598145f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(10.130389, 22.794182);
((GeneralPath)shape).curveTo(22.980885, 26.961538, 29.3674, 17.052488, 40.601906, 22.794182);
((GeneralPath)shape).lineTo(38.721928, 3.5888283);
((GeneralPath)shape).curveTo(38.721928, 3.5888283, 38.11114, 1.4341087, 36.70666, 1.6919748);
((GeneralPath)shape).lineTo(12.249217, 1.922697);
((GeneralPath)shape).curveTo(10.654669, 1.781581, 10.44653, 2.8886232, 10.479394, 4.067412);
((GeneralPath)shape).lineTo(10.130389, 22.794182);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_1_1);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_1_2 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_1_2
paint = new Color(0, 0, 0, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(17.6875, 12.28125);
((GeneralPath)shape).curveTo(14.13478, 15.630644, 12.705188, 16.554443, 12.6875, 18.4375);
((GeneralPath)shape).curveTo(12.670309, 20.26803, 14.981028, 21.868397, 17.0, 20.71875);
((GeneralPath)shape).curveTo(17.064192, 21.65549, 17.094534, 23.274815, 16.53125, 23.9375);
((GeneralPath)shape).curveTo(16.61964, 23.937502, 19.0, 23.96875, 19.0, 23.96875);
((GeneralPath)shape).curveTo(18.999998, 23.968752, 18.387556, 21.93878, 18.3125, 20.59375);
((GeneralPath)shape).curveTo(20.52189, 21.985624, 22.669676, 20.474531, 22.6875, 18.34375);
((GeneralPath)shape).curveTo(22.706844, 16.109568, 21.406126, 15.397146, 17.6875, 12.28125);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_1_2);
g.setTransform(defaultTransform__0_0_1);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_2 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, -1.0f, 0.25f));
// _0_0_2
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_2_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, -1.875f));
// _0_0_2_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_2_0_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 2.5f, 2.75f));
// _0_0_2_0_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_2_0_0_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.1767760068178177f, 7.24783992767334f));
// _0_0_2_0_0_0
g.setComposite(AlphaComposite.getInstance(3, 0.51648355f * origAlpha));
AffineTransform defaultTransform__0_0_2_0_0_0_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_2_0_0_0_0
paint = new LinearGradientPaint(new Point2D.Double(48.0, 18.534204483032227), new Point2D.Double(78.0, 18.534204483032227), new float[] {0.0f,1.0f}, new Color[] {new Color(255, 255, 255, 255),new Color(255, 255, 255, 0)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(0.969323992729187f, 0.3034670054912567f, -0.3130339980125427f, 0.9998840093612671f, -26.513540267944336f, -28.877639770507812f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(11.249051, 13.68551);
((GeneralPath)shape).curveTo(22.267511, 21.50188, 31.322859, 13.953532, 40.328777, 22.789518);
((GeneralPath)shape).lineTo(45.504536, 4.778087);
((GeneralPath)shape).lineTo(44.31062, 2.2533867);
((GeneralPath)shape).lineTo(19.506897, -5.5996203);
((GeneralPath)shape).lineTo(16.789787, -4.294419);
((GeneralPath)shape).lineTo(11.249051, 13.68551);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_2_0_0_0_0);
g.setTransform(defaultTransform__0_0_2_0_0_0);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_2_0_0_1 = g.getTransform();
g.transform(new AffineTransform(0.9664639830589294f, 0.2568039894104004f, -0.2568039894104004f, 0.9664639830589294f, 0.0f, 0.0f));
// _0_0_2_0_0_1
paint = new LinearGradientPaint(new Point2D.Double(35.32130813598633, 24.98446273803711), new Point2D.Double(51.86124801635742, 41.3704719543457), new float[] {0.0f,1.0f}, new Color[] {new Color(229, 229, 229, 255),new Color(200, 200, 200, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(0.8930889964103699f, -5.9912960600914874E-18f, 7.511521263475638E-18f, 1.1197099685668945f, 0.123710997402668f, -12.572319984436035f));
shape = new RoundRectangle2D.Double(16.60003089904785, -3.979738712310791, 30.93037223815918, 39.03263854980469, 6.060929775238037, 5.656866550445557);
g.setPaint(paint);
g.fill(shape);
paint = new Color(136, 138, 133, 255);
stroke = new BasicStroke(1.0000019f,1,0,4.0f,null,0.0f);
shape = new RoundRectangle2D.Double(16.60003089904785, -3.979738712310791, 30.93037223815918, 39.03263854980469, 6.060929775238037, 5.656866550445557);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_2_0_0_1);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_2_0_0_2 = g.getTransform();
g.transform(new AffineTransform(0.9664720296859741f, 0.2567729949951172f, -0.2568340003490448f, 0.9664559960365295f, 0.0f, 0.0f));
// _0_0_2_0_0_2
paint = new LinearGradientPaint(new Point2D.Double(34.56182098388672, 17.249048233032227), new Point2D.Double(50.808902740478516, 44.76952362060547), new float[] {0.0f,1.0f}, new Color[] {new Color(229, 229, 229, 255),new Color(223, 223, 223, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(0.8824639916419983f, -2.896566144245519E-17f, -5.327444162002464E-17f, 1.1232320070266724f, 0.1231599971652031f, -12.494110107421875f));
shape = new RoundRectangle2D.Double(17.567136764526367, -3.087998390197754, 28.99733543395996, 37.1502571105957, 4.469949722290039, 3.889106273651123);
g.setPaint(paint);
g.fill(shape);
paint = new Color(255, 255, 255, 255);
stroke = new BasicStroke(1.0000031f,1,0,4.0f,null,0.0f);
shape = new RoundRectangle2D.Double(17.567136764526367, -3.087998390197754, 28.99733543395996, 37.1502571105957, 4.469949722290039, 3.889106273651123);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_2_0_0_2);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_2_0_0_3 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_2_0_0_3
paint = new Color(204, 0, 0, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(28.21921, 18.57943);
((GeneralPath)shape).curveTo(32.016663, 16.34947, 35.37125, 20.241547, 34.574306, 23.107834);
((GeneralPath)shape).curveTo(33.84576, 25.728115, 31.535908, 26.45757, 25.327822, 29.802046);
((GeneralPath)shape).curveTo(21.304976, 24.065321, 19.745802, 22.573204, 20.607912, 19.463713);
((GeneralPath)shape).curveTo(21.49938, 16.244665, 25.660599, 14.764478, 28.21921, 18.57943);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_2_0_0_3);
g.setTransform(defaultTransform__0_0_2_0_0);
g.setComposite(AlphaComposite.getInstance(3, 0.51648355f * origAlpha));
AffineTransform defaultTransform__0_0_2_0_1 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_2_0_1
paint = new LinearGradientPaint(new Point2D.Double(54.287078857421875, 9.11362075805664), new Point2D.Double(68.8434829711914, 38.11833190917969), new float[] {0.0f,1.0f}, new Color[] {new Color(255, 255, 255, 255),new Color(255, 255, 255, 0)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(0.985863983631134f, 0.24445000290870667f, -0.2521570026874542f, 1.0169450044631958f, -24.58715057373047f, -15.188389778137207f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(15.408724, 24.666098);
((GeneralPath)shape).curveTo(26.878572, 31.803663, 32.987286, 22.750612, 42.50975, 31.027325);
((GeneralPath)shape).lineTo(47.031673, 13.797161);
((GeneralPath)shape).curveTo(47.29684, 12.824889, 47.01348, 12.056174, 45.59927, 11.70262);
((GeneralPath)shape).lineTo(22.57675, 5.2715507);
((GeneralPath)shape).curveTo(21.250923, 4.9179974, 20.120085, 5.8543754, 19.943308, 6.738259);
((GeneralPath)shape).lineTo(15.408724, 24.666098);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_2_0_1);
g.setTransform(defaultTransform__0_0_2_0);
g.setTransform(defaultTransform__0_0_2);
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
	public applications_games() {
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

