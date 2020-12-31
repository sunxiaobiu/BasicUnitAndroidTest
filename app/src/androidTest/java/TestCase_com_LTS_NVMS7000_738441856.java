import android.support.v4.view.ViewCompat;
import android.view.View;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_LTS_NVMS7000_738441856 {
   public static void testCase() throws Exception {
      Object var0 = null;
      byte var1 = 1;
      byte var2 = 1;
      byte var3 = 1;
      byte var4 = 1;
      ViewCompat.postInvalidateOnAnimation((View)var0, var1, var2, var3, var4);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
