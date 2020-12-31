import android.content.ContentResolver;
import android.content.SyncRequest;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_ch_polybox_android_49910126 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(SyncRequest.class);
      ContentResolver.requestSync((SyncRequest)var0);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
