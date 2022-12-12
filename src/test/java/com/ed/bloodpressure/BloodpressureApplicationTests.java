package com.ed.bloodpressure;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BloodpressureApplicationTests {
	Point lowerLeft = new Point(0, 0);
	Point upperRight = new Point(100, 100);
	BloodPressureCheck check = new BloodPressureCheck();

	@Test
	void contextLoads() {
		Rectangle rectangle = new Rectangle(lowerLeft, upperRight);

		assertTrue(rectangle.getResult(new Point(10, 10)) == true);
		assertTrue(rectangle.getResult(new Point(100, 100)) == true);
		assertTrue(rectangle.getResult(new Point(100, 100)) == true);
		// assertFalse(rectangle.getResult(new Point(101,101))== false);
		System.out.println(check.getRating(new Point(70, 40)));
		//assertTrue(check.getRating(new Point(70, 40)).equals("Low"));

		// if(low.getResult(pointToCheck))result = "Low";
		// if(ideal.getResult(pointToCheck))result = "Ideal";
		// if(pre.getResult(pointToCheck))result = "Pre-high";
		// if(high.getResult(pointToCheck))result = "High";

	}

	@Test
	void testIdeal() {
		Rectangle ideal1 = new Rectangle(new Point(60, 70), new Point(79, 119));
		Rectangle ideal2 = new Rectangle(new Point(40, 90), new Point(59, 119));

		final ArrayList<Rectangle> list = new ArrayList<Rectangle>();
		list.add(ideal1);
		list.add(ideal2);
		BloodPressureArea ideal = new BloodPressureArea(list);
		Point pointToCheck = new Point(75, 100);
		
		assertTrue(ideal.getResult(pointToCheck));
	}
}
