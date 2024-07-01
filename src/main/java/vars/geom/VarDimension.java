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

public class VarDimension extends Var<Dimension> {
    public VarDimension(final String name, final Dimension defaultValue, final VarListener<Dimension> defaultListener) {
        super(name, Dimension.class, defaultValue, defaultListener);
    }

    public VarDimension(final String name, final Dimension defaultValue) {
        super(name, defaultValue);
    }

    public VarDimension(final String name) {
        super(name, Dimension.class, null, null);
    }
}
