import android.util.DisplayMetrics;
import android.util.TypedValue;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_abdelrahman_photorecovery_594531615 {
   public static void testCase() throws Exception {
      float var0 = 1.0F;
      Object var1 = EasyMock.createMock(DisplayMetrics.class);
      TypedValue.applyDimension(1, var0, (DisplayMetrics)var1);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
