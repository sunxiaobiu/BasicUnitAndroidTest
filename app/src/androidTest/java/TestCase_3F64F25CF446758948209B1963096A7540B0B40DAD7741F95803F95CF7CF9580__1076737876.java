import android.content.Context;
import android.support.v4.os.UserManagerCompat;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_3F64F25CF446758948209B1963096A7540B0B40DAD7741F95803F95CF7CF9580__1076737876 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(Context.class);
      boolean var1 = UserManagerCompat.isUserUnlocked((Context)var0);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
