/*
 * Copyright (c) 2010-2024. Institut Pasteur.
 *
 * This file is part of Icy.
 * Icy is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Icy is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with Icy. If not, see <https://www.gnu.org/licenses/>.
 */

package vars.geom;

import plugins.adufour.vars.lang.Var;
import plugins.adufour.vars.util.VarListener;

import java.awt.*;

public class VarRectangle extends Var<Rectangle> {
    public VarRectangle(final String name, final Rectangle defaultValue, final VarListener<Rectangle> defaultListener) {
        super(name, Rectangle.class, defaultValue, defaultListener);
    }

    public VarRectangle(final String name, final Rectangle defaultValue) {
        super(name, defaultValue);
    }

    public VarRectangle(final String name) {
        super(name, Rectangle.class, null, null);
    }
}
