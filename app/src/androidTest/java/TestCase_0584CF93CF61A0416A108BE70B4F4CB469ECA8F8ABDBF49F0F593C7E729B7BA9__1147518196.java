import android.content.Context;
import androidx.core.content.PermissionChecker;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_0584CF93CF61A0416A108BE70B4F4CB469ECA8F8ABDBF49F0F593C7E729B7BA9__1147518196 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(Context.class);
      String var1 = "android";
      PermissionChecker.checkCallingOrSelfPermission((Context)var0, var1);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
