import android.hardware.SensorManager;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_5B4E90A5FFCA91A68DDAD65F5414EE27DE2FFCDA8AFF02FE6DFFB1EDB073C3AA_1592853225 {
   public static void testCase() throws Exception {
      float var0 = 1.0F;
      var0 = SensorManager.getAltitude(1013.25F, var0);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
