import android.content.ClipData;
import android.content.Intent;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_archos_athome_center_812316755 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(Intent.class);
      ClipData var1 = ClipData.newIntent("intent", (Intent)var0);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
