import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_abdelrahman_photorecovery__2146101079 {
   public static void testCase() throws Exception {
      String var0 = "android";
      Object var1 = EasyMock.createMock(Options.class);
      BitmapFactory.decodeFile(var0, (Options)var1);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
