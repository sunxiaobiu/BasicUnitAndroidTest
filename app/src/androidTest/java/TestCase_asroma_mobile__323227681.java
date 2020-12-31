import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_asroma_mobile__323227681 {
   public static void testCase() throws Exception {
      Object var0 = null;
      String var1 = "android";
      Object var2 = EasyMock.createMock(Bundle.class);
      Fragment.instantiate((Context)var0, var1, (Bundle)var2);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
