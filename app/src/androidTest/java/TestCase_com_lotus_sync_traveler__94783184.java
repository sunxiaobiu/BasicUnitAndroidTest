import android.content.ContentResolver;
import android.content.SyncStatusObserver;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_lotus_sync_traveler__94783184 {
   public static void testCase() throws Exception {
      Object var0 = null;
      var0 = ContentResolver.addStatusChangeListener(1, (SyncStatusObserver)var0);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
