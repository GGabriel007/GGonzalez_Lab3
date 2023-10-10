import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradeBookTest {
	
	private GradeBook gradebook1;
	private GradeBook gradebook2;

	@BeforeEach
	void setUp() throws Exception {
		// Creating two GradeBook objects to hold 5 scores
		gradebook1 = new GradeBook(5);
		gradebook2 = new GradeBook(5);
		
		// Adding some random scores to gradebook1
		gradebook1.addScore(85);
		gradebook1.addScore(90);
		
		// Adding some random scores to gradebook2
		gradebook2.addScore(75);
		gradebook2.addScore(95);
		gradebook2.addScore(80);
	}

	@AfterEach
	void tearDown() throws Exception {
		// Set the GradeBook objects to null
		gradebook1 = null; 
		gradebook2 = null; 
	}

	@Test
	void testAddScore() {
		assertEquals("85.0 90.0", gradebook1.toString());
		assertEquals(2, gradebook1.getScoreSize());
		
		assertEquals("75.0 95.0 80.0", gradebook2.toString());
		assertEquals(3, gradebook2.getScoreSize());
	}

	@Test
	void testSum() {
		assertEquals(175.0, gradebook1.sum(), 0.001);
		assertEquals(250.0, gradebook2.sum(), 0.001);
	}

	@Test
	void testMinimum() {
		assertEquals(85.0, gradebook1.minimum(), 0.001);
		assertEquals(75.0, gradebook2.minimum(), 0.001);
	}

	@Test
	void testFinalScore() {
		assertEquals(90.0, gradebook1.finalScore(), 0.001);
		assertEquals(175.0, gradebook2.finalScore(),0.001);
	}

	@Test
	void testGetScoreSize() {
	}

	@Test
	void testToString() {
	}

}
