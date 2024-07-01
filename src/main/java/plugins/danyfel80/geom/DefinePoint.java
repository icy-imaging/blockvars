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

package plugins.danyfel80.geom;

import org.bioimageanalysis.icy.extension.plugin.abstract_.Plugin;
import org.bioimageanalysis.icy.extension.plugin.annotation_.IcyPluginIcon;
import org.bioimageanalysis.icy.extension.plugin.annotation_.IcyPluginName;
import org.jetbrains.annotations.NotNull;
import plugins.adufour.blocks.lang.Block;
import plugins.adufour.blocks.util.VarList;
import plugins.adufour.vars.lang.VarInteger;
import vars.geom.VarPoint;

import java.awt.*;

/**
 * Allows defining a 2D integer point.
 *
 * @author Daniel Felipe Gonzalez Obando
 */
@IcyPluginName("Define Point")
@IcyPluginIcon(path = "/blockvars.png")
public class DefinePoint extends Plugin implements Block {
    VarInteger varX;
    VarInteger varY;

    VarPoint varPoint;

    @Override
    public void declareInput(final @NotNull VarList inputMap) {
        varX = new VarInteger("X", 0);
        varY = new VarInteger("Y", 0);
        inputMap.add(varX.getName(), varX);
        inputMap.add(varY.getName(), varY);
    }

    @Override
    public void declareOutput(final @NotNull VarList outputMap) {
        varPoint = new VarPoint("Point");
        outputMap.add(varPoint.getName(), varPoint);
    }

    @Override
    public void run() {
        varPoint.setValue(new Point(varX.getValue(true), varY.getValue(true)));
    }
}
