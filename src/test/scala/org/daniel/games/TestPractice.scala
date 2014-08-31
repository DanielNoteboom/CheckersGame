package org.daniel.games
import org.junit.Assert
import org.junit.Test
/**
 * Created by daniel on 8/31/14.
 */
class PracticeSuiteTest {
  @Test
  def testPractice {
    Assert.assertEquals(Practice.practice, "hello world")
  }

}
