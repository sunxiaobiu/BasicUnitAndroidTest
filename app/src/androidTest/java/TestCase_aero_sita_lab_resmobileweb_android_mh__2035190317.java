import android.content.ContentUris;
import android.net.Uri.Builder;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_aero_sita_lab_resmobileweb_android_mh__2035190317 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(Builder.class);
      long var1 = 1L;
      ContentUris.appendId((Builder)var0, var1);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
