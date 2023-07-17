/*
 * Copyright (c) 2010-2023. Institut Pasteur.
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

import icy.plugin.abstract_.Plugin;
import plugins.adufour.blocks.lang.Block;
import plugins.adufour.blocks.util.VarList;
import plugins.adufour.vars.lang.VarInteger;
import vars.geom.VarRectangle;

import java.awt.*;

/**
 * Defines an integer rectangle from four integers defining position and
 * dimension.
 *
 * @author Daniel Felipe Gonzalez Obando
 */
public class DefineRectangle2 extends Plugin implements Block {

    VarInteger varX;
    VarInteger varY;
    VarInteger varW;
    VarInteger varH;

    VarRectangle varRectangle;

    @Override
    public void declareInput(final VarList inputMap) {
        varX = new VarInteger("X", 0);
        varY = new VarInteger("Y", 0);
        varW = new VarInteger("Width", 0);
        varH = new VarInteger("Height", 0);

        inputMap.add(varX.getName(), varX);
        inputMap.add(varY.getName(), varY);
        inputMap.add(varW.getName(), varW);
        inputMap.add(varH.getName(), varH);
    }

    @Override
    public void declareOutput(final VarList outputMap) {
        varRectangle = new VarRectangle("Rectangle");
        outputMap.add(varRectangle.getName(), varRectangle);
    }

    @Override
    public void run() {
        varRectangle
                .setValue(new Rectangle(varX.getValue(true), varY.getValue(true), varW.getValue(true), varH.getValue(true)));
    }

}
