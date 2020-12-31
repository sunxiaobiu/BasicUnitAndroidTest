import android.content.ContentResolver;
import android.provider.Settings.Secure;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_desire2learn_campuslife_csulb_edu_directory__1680616276 {
   public static void testCase() throws Exception {
      Object var2 = EasyMock.createMock(ContentResolver.class);
      long var0 = Secure.getLong((ContentResolver)var2, "android_id");
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
