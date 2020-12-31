import android.content.Context;
import androidx.core.app.AppOpsManagerCompat;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_37DA06446DF688985D6F0D51A9A6B1FF46B5C2B1DB59E21696BF0CD3FF85FD09__379207627 {
   public static void testCase() throws Exception {
      byte var0 = 1;
      Object var1 = EasyMock.createMock(Context.class);
      String var2 = "android";
      String var3 = "android";
      AppOpsManagerCompat.noteOp((Context)var1, var2, var0, var3);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
