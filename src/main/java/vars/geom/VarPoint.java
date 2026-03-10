/*
 * Copyright (c) 2010-2026. Institut Pasteur.
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

public class VarPoint extends Var<Point> {
    public VarPoint(final String name, final Point defaultValue, final VarListener<Point> defaultListener) {
        super(name, Point.class, defaultValue, defaultListener);
    }

    public VarPoint(final String name, final Point defaultValue) {
        super(name, defaultValue);
    }

    public VarPoint(final String name) {
        super(name, Point.class, null, null);
    }
}
