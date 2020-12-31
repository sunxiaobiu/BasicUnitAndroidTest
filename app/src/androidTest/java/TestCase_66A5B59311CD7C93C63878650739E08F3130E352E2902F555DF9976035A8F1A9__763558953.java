import android.util.DisplayMetrics;
import android.util.TypedValue;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_66A5B59311CD7C93C63878650739E08F3130E352E2902F555DF9976035A8F1A9__763558953 {
   public static void testCase() throws Exception {
      byte var0 = 1;
      Object var1 = EasyMock.createMock(DisplayMetrics.class);
      TypedValue.complexToDimension(var0, (DisplayMetrics)var1);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
