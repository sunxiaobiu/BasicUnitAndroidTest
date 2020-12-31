import android.content.Context;
import android.support.v4.content.PermissionChecker;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_59876DC2D3B07D3028163B47E91743FB5CD3B52CBF433AAA718B44F1F7E958B9_1616743127 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(Context.class);
      String var1 = "android";
      PermissionChecker.checkSelfPermission((Context)var0, var1);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
