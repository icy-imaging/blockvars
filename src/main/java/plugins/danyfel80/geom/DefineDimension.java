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

import org.bioimageanalysis.icy.extension.plugin.abstract_.Plugin;
import org.bioimageanalysis.icy.extension.plugin.annotation_.IcyPluginName;
import org.jetbrains.annotations.NotNull;
import plugins.adufour.blocks.lang.Block;
import plugins.adufour.blocks.util.VarList;
import plugins.adufour.vars.lang.VarInteger;
import vars.geom.VarDimension;

import java.awt.*;

/**
 * Allows to define a 2D integer dimension.
 *
 * @author Daniel Felipe Gonzalez Obando
 */
@IcyPluginName("Define Dimension")
public class DefineDimension extends Plugin implements Block {
    VarInteger varW;
    VarInteger varH;

    VarDimension varDimension;

    @Override
    public void declareInput(final @NotNull VarList inputMap) {
        varW = new VarInteger("Width", 0);
        varH = new VarInteger("Height", 0);

        inputMap.add(varW.getName(), varW);
        inputMap.add(varH.getName(), varH);
    }

    @Override
    public void declareOutput(final @NotNull VarList outputMap) {
        varDimension = new VarDimension("Dimension");
        outputMap.add(varDimension.getName(), varDimension);
    }

    @Override
    public void run() {
        varDimension.setValue(new Dimension(varW.getValue(true), varH.getValue(true)));
    }
}
