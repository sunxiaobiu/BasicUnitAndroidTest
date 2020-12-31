import android.content.Context;
import android.support.v4.app.AppOpsManagerCompat;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_arthome_squareart__1892904255 {
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
