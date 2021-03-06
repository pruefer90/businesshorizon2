package dhbw.ka.mwi.businesshorizon2.cf.equity;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import dhbw.ka.mwi.businesshorizen2.cf.JUnitHelper;
import dhbw.ka.mwi.businesshorizen2.cf.TestData;
import dhbw.ka.mwi.businesshorizen2.cf.TestDataProvider;

@RunWith(Parameterized.class)
public class TestEquityUeberschuss2 {

	@Parameters
	public static List<TestData[]> params() {
		return JUnitHelper.toJunitParams(TestDataProvider.getTestData());
	}

	private final TestData data;

	public TestEquityUeberschuss2(final TestData data) {
        this.data = data;
	}

	@Test
	public void testUeberschuss() throws Exception {
		assertEquals(data.getEquityUeberschuss(),
				new EquityUeberschuss2().getUberschussGroesse(data.getParameters(), 1), 0.01);
	}

}
