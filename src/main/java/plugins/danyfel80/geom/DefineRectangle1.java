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

package plugins.danyfel80.geom;

import fr.icy.extension.plugin.abstract_.Plugin;
import fr.icy.extension.plugin.annotation_.IcyPluginName;
import org.jetbrains.annotations.NotNull;
import plugins.adufour.blocks.lang.Block;
import plugins.adufour.blocks.util.VarList;
import vars.geom.VarDimension;
import vars.geom.VarPoint;
import vars.geom.VarRectangle;

import java.awt.*;
import java.util.Optional;

/**
 * Defines an integer rectangle from a point and a dimension.
 *
 * @author Daniel Felipe Gonzalez Obando
 */
@IcyPluginName("Define Rectangle w/ Dimension")
public class DefineRectangle1 extends Plugin implements Block {
    VarPoint varPosition;
    VarDimension varDimension;

    VarRectangle varRectangle;

    @Override
    public void declareInput(final @NotNull VarList inputMap) {
        varPosition = new VarPoint("Position");
        varDimension = new VarDimension("Dimension");
        inputMap.add(varPosition.getName(), varPosition);
        inputMap.add(varDimension.getName(), varDimension);
    }

    @Override
    public void declareOutput(final @NotNull VarList outputMap) {
        varRectangle = new VarRectangle("Rectangle");
        outputMap.add(varRectangle.getName(), varRectangle);
    }

    @Override
    public void run() {
        final Point position = Optional.ofNullable(varPosition.getValue()).orElse(new Point());
        final Dimension dimension = varDimension.getValue(true);
        varRectangle.setValue(new Rectangle(position, dimension));
    }
}
