import android.content.Intent;
import android.content.IntentSender;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_bitsnapp_com_bitsnapp_2113748521 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(Intent.class);
      Object var1 = EasyMock.createMock(IntentSender.class);
      Intent.createChooser((Intent)var0, "Share via", (IntentSender)var1);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
