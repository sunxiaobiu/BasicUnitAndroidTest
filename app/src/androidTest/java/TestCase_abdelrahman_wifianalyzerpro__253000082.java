import android.content.Intent;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_abdelrahman_wifianalyzerpro__253000082 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(Intent.class);
      Intent var1 = Intent.createChooser((Intent)var0, "Share Graph");
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
