import android.content.ContentResolver;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_lotus_sync_traveler_691773841 {
   public static void testCase() throws Exception {
      Object var0 = null;
      ContentResolver.removeStatusChangeListener(var0);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
