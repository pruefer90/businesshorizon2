/*******************************************************************************
 * BusinessHorizon2
 *
 * Copyright (C) 
 * 2012-2013 Christian Gahlert, Florian Stier, Kai Westerholz,
 * Timo Belz, Daniel Dengler, Katharina Huber, Christian Scherer, Julius Hacker
 * 2013-2014 Marcel Rosenberger, Mirko Göpfrich, Annika Weis, Katharina Narlock, 
 * Volker Meier
 * 
 *
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 ******************************************************************************/

package dhbw.ka.mwi.businesshorizon2.tests.methods.timeseries;

import org.junit.Assert;
import org.junit.Test;

import dhbw.ka.mwi.businesshorizon2.methods.CallbackInterface;
import dhbw.ka.mwi.businesshorizon2.methods.timeseries.AnalysisTimeseries;

/**
 * Diese Klasse stellt den jUnit-Test der im Klassenname aufgeführten Methode in
 * der Klasse AnalysisTimeseries dar.
 * 
 * Anmerkung2016: Diese Klasse testet die Methode calculate() nicht vernünftig,
 * sondern überprüft lediglich, dass keine leeres Array erzeugt wurde. Die Werte
 * werden aber nicht validiert.
 * 
 * @author Volker Maier, Jonathan Janke
 * 
 */
public class TestCalculate {

	@Test
	public void testCalculate() throws Exception {
		int p = 5;
		double[] zeitreihe = new double[6];
		int zuberechnendeperioden = 5;
		int durchlaeufe = 10000;
		boolean isfremdkapital = false;
		double[][] prognosewerte = new double[zuberechnendeperioden][durchlaeufe];

		zeitreihe[0] = 7;
		zeitreihe[1] = 9;
		zeitreihe[2] = 5;
		zeitreihe[3] = 14;
		zeitreihe[4] = 6;
		zeitreihe[5] = 8;

		AnalysisTimeseries at = new AnalysisTimeseries();

		prognosewerte = at.calculate(zeitreihe, p, zuberechnendeperioden, durchlaeufe, isfremdkapital);

		Assert.assertNotNull(prognosewerte);
	}

}
