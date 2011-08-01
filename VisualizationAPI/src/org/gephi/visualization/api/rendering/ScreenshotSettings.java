/*
Copyright 2008-2011 Gephi
Authors : Antonio Patriarca <antoniopatriarca@gmail.com>
Website : http://www.gephi.org

This file is part of Gephi.

Gephi is free software: you can redistribute it and/or modify
it under the terms of the GNU Affero General Public License as
published by the Free Software Foundation, either version 3 of the
License, or (at your option) any later version.

Gephi is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU Affero General Public License for more details.

You should have received a copy of the GNU Affero General Public License
along with Gephi.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.gephi.visualization.api.rendering;

/**
 * Simple immutable class representing Screenshot settings.
 * 
 * @author Antonio Patriarca <antoniopatriarca@gmail.com>
 */
public final class ScreenshotSettings {
    public final int width;
    public final int height;
    
    public final boolean autoSave;
    
    public final String folder;

    public ScreenshotSettings(int width, int height, boolean autoSave, String folder) {
        this.width = width;
        this.height = height;
        this.autoSave = autoSave;
        this.folder = folder;
    }
}
