/*
 * #%L
 * SciJava ROI Model.
 * %%
 * Copyright © 2012 Open Microscopy Environment:
 *   - Board of Regents of the University of Wisconsin-Madison
 *   - Glencoe Software, Inc.
 *   - University of Dundee
 * %%
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as
 * published by the Free Software Foundation, either version 2 of the 
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public 
 * License along with this program.  If not, see
 * <http://www.gnu.org/licenses/gpl-2.0.html>.
 * #L%
 */


/*─────────────────────────────────────────────────────────────────────────────
 *
 * THIS IS AUTOMATICALLY GENERATED CODE.  DO NOT MODIFY.
 * Created by rleigh via genspec on 2013-01-18 17:28:28.982698
 *
 *─────────────────────────────────────────────────────────────────────────────
 */

package scijava.roi.shape;

import scijava.roi.types.HalfAxes3D;
import scijava.roi.measurement.Volume;
import scijava.roi.shape.PhysicalShape;
import scijava.roi.types.Vertex3D;

public class Ellipsoid implements PhysicalShape, Volume
{
  /*
   * Members (shape definitions)
   */

  /// Canonical representation
  HalfAxes3D rep_canonical;

  /// Generic representation
  Object rep_generic;

  /*
   * Methods (static definitions)
   */

  public boolean contains(Vertex3D position)
  {
  	return false;
  }


  // TODO: Add methods defined elsewhere.

}
