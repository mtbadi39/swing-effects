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

/**
 * This class has been automatically generated using <a
 * href="https://flamingo.dev.java.net">Flamingo SVG transcoder</a>.
 */
public class format_text_bold implements
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
g.setComposite(AlphaComposite.getInstance(3, 0.2f * origAlpha));
AffineTransform defaultTransform__0_0_0 = g.getTransform();
g.transform(new AffineTransform(1.4701440334320068f, 0.0f, 0.0f, 0.5354740023612976f, -12.76416015625f, 20.915340423583984f));
// _0_0_0
paint = new RadialGradientPaint(new Point2D.Double(24.837125778198242, 36.42112731933594), 15.644737f, new Point2D.Double(24.837125778198242, 36.42112731933594), new float[] {0.0f,1.0f}, new Color[] {new Color(0, 0, 0, 255),new Color(0, 0, 0, 0)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 0.5367230176925659f, 6.419148134724885E-15f, 16.87306022644043f));
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
g.setTransform(defaultTransform__0_0_0);
g.setTransform(defaultTransform__0_0);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_1 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_1
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_1_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 4.0f));
// _0_1_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_1_0_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_1_0_0
paint = new LinearGradientPaint(new Point2D.Double(29.122220993041992, 33.43888854980469), new Point2D.Double(14.29636287689209, 6.346399307250977), new float[] {0.0f,1.0f}, new Color[] {new Color(73, 127, 198, 255),new Color(144, 179, 217, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(18.0, 0.5);
((GeneralPath)shape).lineTo(3.0, 37.5);
((GeneralPath)shape).lineTo(13.0, 37.5);
((GeneralPath)shape).lineTo(15.224112, 31.5);
((GeneralPath)shape).lineTo(32.731693, 31.5);
((GeneralPath)shape).lineTo(35.0, 37.5);
((GeneralPath)shape).lineTo(45.0, 37.5);
((GeneralPath)shape).lineTo(30.0, 0.5);
((GeneralPath)shape).lineTo(27.0, 0.5);
((GeneralPath)shape).lineTo(21.0, 0.5);
((GeneralPath)shape).lineTo(18.0, 0.5);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(24.0, 9.0);
((GeneralPath)shape).lineTo(29.59375, 23.5);
((GeneralPath)shape).lineTo(18.40625, 23.5);
((GeneralPath)shape).lineTo(24.0, 9.0);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
paint = new LinearGradientPaint(new Point2D.Double(19.988433837890625, 34.98324966430664), new Point2D.Double(19.988433837890625, 6.434155464172363), new float[] {0.0f,1.0f}, new Color[] {new Color(42, 83, 135, 255),new Color(52, 101, 164, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
stroke = new BasicStroke(1.0f,0,0,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(18.0, 0.5);
((GeneralPath)shape).lineTo(3.0, 37.5);
((GeneralPath)shape).lineTo(13.0, 37.5);
((GeneralPath)shape).lineTo(15.224112, 31.5);
((GeneralPath)shape).lineTo(32.731693, 31.5);
((GeneralPath)shape).lineTo(35.0, 37.5);
((GeneralPath)shape).lineTo(45.0, 37.5);
((GeneralPath)shape).lineTo(30.0, 0.5);
((GeneralPath)shape).lineTo(27.0, 0.5);
((GeneralPath)shape).lineTo(21.0, 0.5);
((GeneralPath)shape).lineTo(18.0, 0.5);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(24.0, 9.0);
((GeneralPath)shape).lineTo(29.59375, 23.5);
((GeneralPath)shape).lineTo(18.40625, 23.5);
((GeneralPath)shape).lineTo(24.0, 9.0);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_1_0_0);
g.setComposite(AlphaComposite.getInstance(3, 0.7f * origAlpha));
AffineTransform defaultTransform__0_1_0_1 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_1_0_1
paint = new LinearGradientPaint(new Point2D.Double(19.89179229736328, 16.114627838134766), new Point2D.Double(31.85671615600586, 72.78054809570312), new float[] {0.0f,1.0f}, new Color[] {new Color(255, 255, 255, 255),new Color(179, 179, 179, 0)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, -3.0f));
stroke = new BasicStroke(1.0f,0,0,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(4.463434, 36.5);
((GeneralPath)shape).lineTo(18.69856, 1.5);
((GeneralPath)shape).lineTo(29.345564, 1.5);
((GeneralPath)shape).lineTo(43.563927, 36.5);
((GeneralPath)shape).lineTo(35.676777, 36.5);
((GeneralPath)shape).lineTo(33.5, 30.5);
((GeneralPath)shape).lineTo(14.5, 30.5);
((GeneralPath)shape).lineTo(12.265165, 36.5);
((GeneralPath)shape).lineTo(4.463434, 36.5);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_1_0_1);
g.setComposite(AlphaComposite.getInstance(3, 0.7f * origAlpha));
AffineTransform defaultTransform__0_1_0_2 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_1_0_2
paint = new LinearGradientPaint(new Point2D.Double(25.0, 27.5), new Point2D.Double(26.673967361450195, 10.0), new float[] {0.0f,1.0f}, new Color[] {new Color(255, 255, 255, 255),new Color(255, 255, 255, 0)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, -1.0f, -4.0f));
stroke = new BasicStroke(1.0f,0,0,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(16.881283, 24.5);
((GeneralPath)shape).lineTo(31.118717, 24.5);
((GeneralPath)shape).lineTo(24.0, 6.5);
((GeneralPath)shape).lineTo(16.881283, 24.5);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_1_0_2);
g.setTransform(defaultTransform__0_1_0);
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
		return 47;
	}

	/**
	 * Returns the height of the bounding box of the original SVG image.
	 * 
	 * @return The height of the bounding box of the original SVG image.
	 */
	public static int getOrigHeight() {
		return 42;
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
	public format_text_bold() {
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

