import android.graphics.Rect;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_aero_sita_lab_resmobileweb_android_mh_2143041846 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(Rect.class);
      Object var1 = EasyMock.createMock(Rect.class);
      Rect.intersects((Rect)var0, (Rect)var1);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
