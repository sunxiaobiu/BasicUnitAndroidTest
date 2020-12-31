import android.graphics.RectF;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_app_zenly_locator__825234713 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(RectF.class);
      Object var1 = EasyMock.createMock(RectF.class);
      RectF.intersects((RectF)var0, (RectF)var1);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
