import android.util.DisplayMetrics;
import android.util.TypedValue;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_aagym_mqdigital_com_aagymapp_265943986 {
   public static void testCase() throws Exception {
      byte var0 = 1;
      Object var1 = EasyMock.createMock(DisplayMetrics.class);
      TypedValue.complexToDimensionPixelSize(var0, (DisplayMetrics)var1);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
