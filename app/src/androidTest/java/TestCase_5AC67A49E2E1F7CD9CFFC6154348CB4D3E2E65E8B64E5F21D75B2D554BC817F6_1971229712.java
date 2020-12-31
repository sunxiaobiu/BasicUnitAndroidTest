import android.content.ContentResolver;
import android.provider.Settings.Secure;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_5AC67A49E2E1F7CD9CFFC6154348CB4D3E2E65E8B64E5F21D75B2D554BC817F6_1971229712 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(ContentResolver.class);
      float var1 = Secure.getFloat((ContentResolver)var0, "sysui_rounded_size", 0.0F);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
