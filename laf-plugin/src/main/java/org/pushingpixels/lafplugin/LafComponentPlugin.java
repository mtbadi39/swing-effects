/*
 * Copyright (c) 2005-2010 Laf-Plugin Kirill Grouchnikov and contributors. All Rights Reserved.
 *
 * Redistribution and use in source and binary forms, with or without 
 * modification, are permitted provided that the following conditions are met:
 * 
 *  o Redistributions of source code must retain the above copyright notice, 
 *    this list of conditions and the following disclaimer. 
 *     
 *  o Redistributions in binary form must reproduce the above copyright notice, 
 *    this list of conditions and the following disclaimer in the documentation 
 *    and/or other materials provided with the distribution. 
 *     
 *  o Neither the name of Laf-Plugin Kirill Grouchnikov nor the names of 
 *    its contributors may be used to endorse or promote products derived 
 *    from this software without specific prior written permission. 
 *     
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" 
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, 
 * THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR 
 * PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR 
 * CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, 
 * EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, 
 * PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; 
 * OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, 
 * WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE 
 * OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, 
 * EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE. 
 */
package org.pushingpixels.lafplugin;

import javax.swing.plaf.metal.MetalTheme;

/**
 * Basic interface for look-and-feel plugins.
 * 
 * @author Kirill Grouchnikov
 * @author Erik Vickroy
 * @author Robert Beeger
 * @author Frederic Lavigne
 * @author Pattrick Gotthardt
 */
public interface LafComponentPlugin extends LafPlugin {
	/**
	 * XML tag for look-and-feel plugins that specify component UI delegates.
	 */
	public static final String COMPONENT_TAG_PLUGIN_CLASS = "component-plugin-class";

	/**
	 * Initializes <code>this</code> plugin.
	 */
	public void initialize();

	/**
	 * Unitializes <code>this</code> plugin.
	 */
	public void uninitialize();

	/**
	 * Retrieves a collection of custom settings based on the specified theme.
	 * The entries in the array should be pairwise, odd being symbolic name of a
	 * setting, and even being the setting value.
	 * 
	 * @param themeInfo
	 *            Theme information object. Can be {@link MetalTheme}, for
	 *            instance or any other LAF-specific object.
	 * @return Collection of custom settings based on the specified theme. The
	 *         entries in the array should be pairwise, odd being symbolic name
	 *         of a setting, and even being the setting value.
	 */
	public Object[] getDefaults(Object themeInfo);
}
