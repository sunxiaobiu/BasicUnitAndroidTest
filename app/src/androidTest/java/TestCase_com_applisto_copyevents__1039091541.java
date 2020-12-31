import android.content.ContentResolver;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_applisto_copyevents__1039091541 {
   public static void testCase() throws Exception {
      ContentResolver.setMasterSyncAutomatically(false);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
