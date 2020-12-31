import android.content.Context;
import androidx.test.runner.AndroidJUnit4;
import java.text.DateFormat;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_alexcrusher_just6weeks_508603826 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(Context.class);
      DateFormat var1 = android.text.format.DateFormat.getTimeFormat((Context)var0);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
