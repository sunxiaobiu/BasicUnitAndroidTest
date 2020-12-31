import android.content.Context;
import androidx.core.graphics.drawable.IconCompat;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_6407DD4C8B457A94BF19CF380D6EC56C9583BFE6DD09492695903F49ACCA9C34_597463007 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(Context.class);
      byte var1 = 1;
      IconCompat.createWithResource((Context)var0, var1);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
